function log(message) {
        const logBox = document.getElementById("logBox");
        const logLine = document.createElement("div");
        logLine.textContent = message;
        logBox.appendChild(logLine);
        logBox.scrollTop = logBox.scrollHeight;
    }



    document.getElementById("addForm").addEventListener("submit", function(event) {
        event.preventDefault();

        const formData = new FormData(this);
        const name = formData.get("name");
        const email = formData.get("email");
        const age = formData.get("age");

        closeModal();
        this.reset();
    });


    function btnSetting() {
            document.getElementById("addModal").style.display = "block";
        }

        function closeModal() {
            document.getElementById("addModal").style.display = "none";
        }

        window.onclick = function(event) {
            const modal = document.getElementById("addModal");
            if (event.target === modal) {
                modal.style.display = "none";
            }
        }



let stompClient = null;

    function btnStart() {
        if (stompClient && stompClient.connected) {
            console.log("STOMP is already connected.");
            return;
        }

        const socket = new SockJS('/ws');
        stompClient = Stomp.over(socket);

        stompClient.connect({}, connectSocket, onError);
    }

    function btnStop() {
        if (stompClient && stompClient.connected) {
            stompClient.disconnect(() => {
                console.log("🔌 Disconnected from WebSocket server.");
            });
        } else {
            console.log("⚠️ Not connected.");
        }
    }

    function onConnected() {
        console.log("✅ Connected to WebSocket server via STOMP");

        // Ví dụ: đăng ký nhận thông báo từ server (nếu có)
        stompClient.subscribe('/topic/agent-status', (message) => {
            console.log("📥 Received message:", message.body);
        });

        // Ví dụ: gửi thông điệp đến server (nếu cần)
        stompClient.send("/app/agent/start", {}, JSON.stringify({ command: 'start' }));
    }

    function onError(error) {
        console.error("❌ Error during connection:", error);
    }


    function appendLogRow(data) {
      const logBoxTable = document.getElementById("logBoxTable");
      const row = document.createElement("div");
      row.className = "log-row";
      row.innerHTML = `
        <div class="log-col wide">${data.local}</div>
        <div class="log-col">${data.direction}</div>
        <div class="log-col wide">${data.remote}</div>
        <div class="log-col">${data.size}</div>
        <div class="log-col">${data.priority}</div>
        <div class="log-col">${new Date().toLocaleString()}</div>
      `;
      logBoxTable.appendChild(row);
    }


    function connectSocket() {
      socket = new SockJS('/ws');
      stompClient = Stomp.over(socket);

      stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        appendLogRow({
          local: 'WebSocket',
          direction: '>>',
          remote: 'Connected',
          size: '-',
          priority: 'Info',
        });

        stompClient.subscribe('/topic/data', function (message) {
          const data = JSON.parse(message.body);
          appendLogRow({
            local: 'Server Push',
            direction: '>>',
            remote: JSON.stringify(data),
            size: JSON.stringify(message.body.length),
            priority: 'Data'
          });
        });
      }, function (error) {
        console.error('Connection error:', error);
        appendLogRow({
          local: 'WebSocket',
          direction: 'xx',
          remote: 'Connection failed',
          size: '-',
          priority: 'Error',
        });
      });

      socket.onclose = function () {
        appendLogRow({
          local: 'WebSocket',
          direction: '--',
          remote: 'Disconnected',
          size: '-',
          priority: 'Warn',
        });
      };
    }