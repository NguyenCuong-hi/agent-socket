package com.agent.link_data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITM_TEST_PARA_HST_MISUM_B7")
public class TestParamMiSumB7 {

    @Id
    @Column(name = "ROW_ID")
    private Long row_id;
    @Column(name = "DEVICE")
    private String device;
    @Column(name = "LOT_NUMBER")
    private String lot_number;
    @Column(name = "QR_CODE")
    private String qr_code;
    @Column(name = "TEST_START_TIME")
    private String test_start_time;
    @Column(name = "TEST_STOP_TIME")
    private String test_stop_time;
    @Column(name = "EQUIPMENT_ID")
    private String equipment_id;
    @Column(name = "JIG_ID")
    private String jig_id;
    @Column(name = "CHANNEL")
    private String channel;
    @Column(name = "TOTAL_JUDGMENT")
    private String total_judgment;
    @Column(name = "MODEL_CODE")
    private String model_code;
    @Column(name = "STATION_ID")
    private String station_id;
    @Column(name = "X31_OVPU1_DL_LOW")
    private String x31_ovpu1_dl_low;
    @Column(name = "X31_OVPU1_DL_UPPER")
    private String x31_ovpu1_dl_upper;
    @Column(name = "X31_OVPU1_DL_VALUE")
    private String x31_ovpu1_dl_value;
    @Column(name = "X31_OVPU1_DT_LOW")
    private String x31_ovpu1_dt_low;
    @Column(name = "X31_OVPU1_DT_UPPER")
    private String x31_ovpu1_dt_upper;
    @Column(name = "X31_OVPU1_DT_VALUE")
    private String x31_ovpu1_dt_value;
    @Column(name = "X31_OVPU1_RL_LOW")
    private String x31_ovpu1_rl_low;
    @Column(name = "X31_OVPU1_RL_UPPER")
    private String x31_ovpu1_rl_upper;
    @Column(name = "X31_OVPU1_RL_VALUE")
    private String x31_ovpu1_rl_value;
    @Column(name = "X31_RST")
    private String x31_rst;
    @Column(name = "X32_RST")
    private String x32_rst;
    @Column(name = "X32_UVPU1_DL_LOW")
    private String x32_uvpu1_dl_low;
    @Column(name = "X32_UVPU1_DL_UPPER")
    private String x32_uvpu1_dl_upper;
    @Column(name = "X32_UVPU1_DL_VALUE")
    private String x32_uvpu1_dl_value;
    @Column(name = "X32_UVPU1_DT_LOW")
    private String x32_uvpu1_dt_low;
    @Column(name = "X32_UVPU1_DT_UPPER")
    private String x32_uvpu1_dt_upper;
    @Column(name = "X32_UVPU1_DT_VALUE")
    private String x32_uvpu1_dt_value;
    @Column(name = "X32_UVPU1_RL_LOW")
    private String x32_uvpu1_rl_low;
    @Column(name = "X32_UVPU1_RL_UPPER")
    private String x32_uvpu1_rl_upper;
    @Column(name = "X32_UVPU1_RL_VALUE")
    private String x32_uvpu1_rl_value;
    @Column(name = "X33_COCPU1_DL_LOW")
    private String x33_cocpu1_dl_low;
    @Column(name = "X33_COCPU1_DL_UPPER")
    private String x33_cocpu1_dl_upper;
    @Column(name = "X33_COCPU1_DL_VALUE")
    private String x33_cocpu1_dl_value;
    @Column(name = "X33_COCPU1_DT_LOW")
    private String x33_cocpu1_dt_low;
    @Column(name = "X33_COCPU1_DT_UPPER")
    private String x33_cocpu1_dt_upper;
    @Column(name = "X33_COCPU1_DT_VALUE")
    private String x33_cocpu1_dt_value;
    @Column(name = "X33_RST")
    private String x33_rst;
    @Column(name = "X34_DOCPU1_DL_LOW")
    private String x34_docpu1_dl_low;
    @Column(name = "X34_DOCPU1_DL_UPPER")
    private String x34_docpu1_dl_upper;
    @Column(name = "X34_DOCPU1_DL_VALUE")
    private String x34_docpu1_dl_value;
    @Column(name = "X34_DOCPU1_DT_LOW")
    private String x34_docpu1_dt_low;
    @Column(name = "X34_DOCPU1_DT_UPPER")
    private String x34_docpu1_dt_upper;
    @Column(name = "X34_DOCPU1_DT_VALUE")
    private String x34_docpu1_dt_value;
    @Column(name = "X34_RST")
    private String x34_rst;
    @Column(name = "X39_C1_LOW")
    private String x39_c1_low;
    @Column(name = "X39_C1_UPPER")
    private String x39_c1_upper;
    @Column(name = "X39_C1_VALUE")
    private String x39_c1_value;
    @Column(name = "X39_C3_C4_LOW")
    private String x39_c3_c4_low;
    @Column(name = "X39_C3_C4_UPPER")
    private String x39_c3_c4_upper;
    @Column(name = "X39_C3_C4_VALUE")
    private String x39_c3_c4_value;
    @Column(name = "X39_R1_LOW")
    private String x39_r1_low;
    @Column(name = "X39_R1_UPPER")
    private String x39_r1_upper;
    @Column(name = "X39_R1_VALUE")
    private String x39_r1_value;
    @Column(name = "X39_R2_LOW")
    private String x39_r2_low;
    @Column(name = "X39_R2_UPPER")
    private String x39_r2_upper;
    @Column(name = "X39_R2_VALUE")
    private String x39_r2_value;
    @Column(name = "X39_RST")
    private String x39_rst;
    @Column(name = "X3C_OCV_LOW")
    private String x3c_ocv_low;
    @Column(name = "X3C_OCV_UPPER")
    private String x3c_ocv_upper;
    @Column(name = "X3C_OCV_VALUE")
    private String x3c_ocv_value;
    @Column(name = "X3C_RST")
    private String x3c_rst;
    @Column(name = "X3E_1ST_LOW")
    private String x3e_1st_low;
    @Column(name = "X3E_1ST_UPPER")
    private String x3e_1st_upper;
    @Column(name = "X3E_1ST_VALUE")
    private String x3e_1st_value;
    @Column(name = "X3E_2ND_LOW")
    private String x3e_2nd_low;
    @Column(name = "X3E_2ND_UPPER")
    private String x3e_2nd_upper;
    @Column(name = "X3E_2ND_VALUE")
    private String x3e_2nd_value;
    @Column(name = "X3E_RST")
    private String x3e_rst;
    @Column(name = "X61_OVPU2_DL_LOW")
    private String x61_ovpu2_dl_low;
    @Column(name = "X61_OVPU2_DL_UPPER")
    private String x61_ovpu2_dl_upper;
    @Column(name = "X61_OVPU2_DL_VALUE")
    private String x61_ovpu2_dl_value;
    @Column(name = "X61_OVPU2_DT_LOW")
    private String x61_ovpu2_dt_low;
    @Column(name = "X61_OVPU2_DT_UPPER")
    private String x61_ovpu2_dt_upper;
    @Column(name = "X61_OVPU2_DT_VALUE")
    private String x61_ovpu2_dt_value;
    @Column(name = "X61_OVPU2_RL_LOW")
    private String x61_ovpu2_rl_low;
    @Column(name = "X61_OVPU2_RL_UPPER")
    private String x61_ovpu2_rl_upper;
    @Column(name = "X61_OVPU2_RL_VALUE")
    private String x61_ovpu2_rl_value;
    @Column(name = "X61_RST")
    private String x61_rst;
    @Column(name = "X62_OVPU2_RL_LOW")
    private String x62_ovpu2_rl_low;
    @Column(name = "X62_OVPU2_RL_UPPER")
    private String x62_ovpu2_rl_upper;
    @Column(name = "X62_OVPU2_RL_VALUE")
    private String x62_ovpu2_rl_value;
    @Column(name = "X62_RST")
    private String x62_rst;
    @Column(name = "X62_UVPU2_DL_LOW")
    private String x62_uvpu2_dl_low;
    @Column(name = "X62_UVPU2_DL_UPPER")
    private String x62_uvpu2_dl_upper;
    @Column(name = "X62_UVPU2_DL_VALUE")
    private String x62_uvpu2_dl_value;
    @Column(name = "X62_UVPU2_DT_LOW")
    private String x62_uvpu2_dt_low;
    @Column(name = "X62_UVPU2_DT_UPPER")
    private String x62_uvpu2_dt_upper;
    @Column(name = "X62_UVPU2_DT_VALUE")
    private String x62_uvpu2_dt_value;
    @Column(name = "X62_UVPU2_RL_LOW")
    private String x62_uvpu2_rl_low;
    @Column(name = "X62_UVPU2_RL_UPPER")
    private String x62_uvpu2_rl_upper;
    @Column(name = "X62_UVPU2_RL_VALUE")
    private String x62_uvpu2_rl_value;
    @Column(name = "X63_COCPU2_DL_LOW")
    private String x63_cocpu2_dl_low;
    @Column(name = "X63_COCPU2_DL_UPPER")
    private String x63_cocpu2_dl_upper;
    @Column(name = "X63_COCPU2_DL_VALUE")
    private String x63_cocpu2_dl_value;
    @Column(name = "X63_COCPU2_DT_LOW")
    private String x63_cocpu2_dt_low;
    @Column(name = "X63_COCPU2_DT_UPPER")
    private String x63_cocpu2_dt_upper;
    @Column(name = "X63_COCPU2_DT_VALUE")
    private String x63_cocpu2_dt_value;
    @Column(name = "X63_RST")
    private String x63_rst;
    @Column(name = "X64_DOCPU2_DL_LOW")
    private String x64_docpu2_dl_low;
    @Column(name = "X64_DOCPU2_DL_UPPER")
    private String x64_docpu2_dl_upper;
    @Column(name = "X64_DOCPU2_DL_VALUE")
    private String x64_docpu2_dl_value;
    @Column(name = "X64_DOCPU2_DT_LOW")
    private String x64_docpu2_dt_low;
    @Column(name = "X64_DOCPU2_DT_UPPER")
    private String x64_docpu2_dt_upper;
    @Column(name = "X64_DOCPU2_DT_VALUE")
    private String x64_docpu2_dt_value;
    @Column(name = "X64_RST")
    private String x64_rst;
    @Column(name = "X68_NOR_LOW")
    private String x68_nor_low;
    @Column(name = "X68_NOR_UPPER")
    private String x68_nor_upper;
    @Column(name = "X68_NOR_VALUE")
    private String x68_nor_value;
    @Column(name = "X68_RST")
    private String x68_rst;
    @Column(name = "X68_SD_LOW")
    private String x68_sd_low;
    @Column(name = "X68_SD_UPPER")
    private String x68_sd_upper;
    @Column(name = "X68_SD_VALUE")
    private String x68_sd_value;
    @Column(name = "X69_C2_LOW")
    private String x69_c2_low;
    @Column(name = "X69_C2_UPPER")
    private String x69_c2_upper;
    @Column(name = "X69_C2_VALUE")
    private String x69_c2_value;
    @Column(name = "X69_R3_LOW")
    private String x69_r3_low;
    @Column(name = "X69_R3_UPPER")
    private String x69_r3_upper;
    @Column(name = "X69_R3_VALUE")
    private String x69_r3_value;
    @Column(name = "X69_R4_LOW")
    private String x69_r4_low;
    @Column(name = "X69_R4_UPPER")
    private String x69_r4_upper;
    @Column(name = "X69_R4_VALUE")
    private String x69_r4_value;
    @Column(name = "X69_RST")
    private String x69_rst;
    @Column(name = "X90_ID_MAIN")
    private String x90_id_main;
    @Column(name = "X90_ID_READ_ECC")
    private String x90_id_read_ecc;
    @Column(name = "X90_RST")
    private String x90_rst;
    @Column(name = "X98_RST")
    private String x98_rst;
    @Column(name = "X98_MEMORY_UNLOCK_CHECK")
    private String x98_memory_unlock_check;
    @Column(name = "X99_CNTWR_DATA")
    private String x99_cntwr_data;
    @Column(name = "X99_RST")
    private String x99_rst;
    @Column(name = "X9A_CNTRD_DATA")
    private String x9a_cntrd_data;
    @Column(name = "X9A_RST")
    private String x9a_rst;
    @Column(name = "X9F_MEMORY_0000")
    private String x9f_memory_0000;
    @Column(name = "X9F_MEMORY_0001")
    private String x9f_memory_0001;
    @Column(name = "X9F_MEMORY_0002")
    private String x9f_memory_0002;
    @Column(name = "X9F_MEMORY_0003")
    private String x9f_memory_0003;
    @Column(name = "X9F_MEMORY_0004")
    private String x9f_memory_0004;
    @Column(name = "X9F_MEMORY_0005")
    private String x9f_memory_0005;
    @Column(name = "X9F_MEMORY_0006")
    private String x9f_memory_0006;
    @Column(name = "X9F_MEMORY_0007")
    private String x9f_memory_0007;
    @Column(name = "X9F_RST")
    private String x9f_rst;
    @Column(name = "XB1_RST")
    private String xb1_rst;
    @Column(name = "XB1_WRITE_0000")
    private String xb1_write_0000;
    @Column(name = "XB1_WRITE_0008")
    private String xb1_write_0008;
    @Column(name = "XB1_WRITE_0010")
    private String xb1_write_0010;
    @Column(name = "XB1_WRITE_0018")
    private String xb1_write_0018;
    @Column(name = "XB1_WRITE_0020")
    private String xb1_write_0020;
    @Column(name = "XB1_WRITE_0028")
    private String xb1_write_0028;
    @Column(name = "XB1_WRITE_0030")
    private String xb1_write_0030;
    @Column(name = "XB1_WRITE_0038")
    private String xb1_write_0038;
    @Column(name = "XB5_RST")
    private String xb5_rst;
    @Column(name = "XB5_MEMORY_UNLOCK_CHECK")
    private String xb5_memory_unlock_check;
    @Column(name = "XB6_RST")
    private String xb6_rst;
    @Column(name = "XB6_ID_READ_ECC")
    private String xb6_id_read_ecc;
    @Column(name = "XB8_READ_0000")
    private String xb8_read_0000;
    @Column(name = "XB8_READ_0008")
    private String xb8_read_0008;
    @Column(name = "XB8_READ_0010")
    private String xb8_read_0010;
    @Column(name = "XB8_READ_0018")
    private String xb8_read_0018;
    @Column(name = "XB8_READ_0020")
    private String xb8_read_0020;
    @Column(name = "XB8_READ_0028")
    private String xb8_read_0028;
    @Column(name = "XB8_READ_0030")
    private String xb8_read_0030;
    @Column(name = "XB8_READ_0038")
    private String xb8_read_0038;
    @Column(name = "XB8_RST")
    private String xb8_rst;
    @Column(name = "XBA_COUNTER_READ")
    private String xba_counter_read;
    @Column(name = "XBA_RST")
    private String xba_rst;
    @Column(name = "XBB_CNTLOCK_VALUE")
    private String xbb_cntlock_value;
    @Column(name = "XBB_RST")
    private String xbb_rst;
    @Column(name = "XBF_MEMORY_0000")
    private String xbf_memory_0000;
    @Column(name = "XBF_MEMORY_0001")
    private String xbf_memory_0001;
    @Column(name = "XBF_MEMORY_0002")
    private String xbf_memory_0002;
    @Column(name = "XBF_MEMORY_0003")
    private String xbf_memory_0003;
    @Column(name = "XBF_MEMORY_0004")
    private String xbf_memory_0004;
    @Column(name = "XBF_MEMORY_0005")
    private String xbf_memory_0005;
    @Column(name = "XBF_MEMORY_0006")
    private String xbf_memory_0006;
    @Column(name = "XBF_MEMORY_0007")
    private String xbf_memory_0007;
    @Column(name = "XBF_RST")
    private String xbf_rst;
    @Column(name = "XE2_IRN_LOW")
    private String xe2_irn_low;
    @Column(name = "XE2_IRN_UPPER")
    private String xe2_irn_upper;
    @Column(name = "XE2_IRN_VALUE")
    private String xe2_irn_value;
    @Column(name = "XE2_IRP_LOW")
    private String xe2_irp_low;
    @Column(name = "XE2_IRP_UPPER")
    private String xe2_irp_upper;
    @Column(name = "XE2_IRP_VALUE")
    private String xe2_irp_value;
    @Column(name = "XE2_IRTL_LOW")
    private String xe2_irtl_low;
    @Column(name = "XE2_IRTL_UPPER")
    private String xe2_irtl_upper;
    @Column(name = "XE2_IRTL_VALUE")
    private String xe2_irtl_value;
    @Column(name = "XE2_RST")
    private String xe2_rst;
    @Column(name = "XE4_IDR_LOW")
    private String xe4_idr_low;
    @Column(name = "XE4_IDR_UPPER")
    private String xe4_idr_upper;
    @Column(name = "XE4_IDR_VALUE")
    private String xe4_idr_value;
    @Column(name = "XE4_RST")
    private String xe4_rst;
    @Column(name = "X92_BAT_READ_RST")
    private String x92_bat_read_rst;
    @Column(name = "X92_BAT_READ_0015")
    private String x92_bat_read_0015;
    @Column(name = "X92_BAT_READ_1631")
    private String x92_bat_read_1631;
    @Column(name = "X92_BAT_READ_3247")
    private String x92_bat_read_3247;
    @Column(name = "X92_BAT_READ_4862")
    private String x92_bat_read_4862;
    @Column(name = "X92_BAT_READ_6479")
    private String x92_bat_read_6479;
    @Column(name = "X92_BAT_READ_8095")
    private String x92_bat_read_8095;
    @Column(name = "X92_BAT_READ_96111")
    private String x92_bat_read_96111;
    @Column(name = "X92_BAT_READ_112127")
    private String x92_bat_read_112127;
    @Column(name = "PLANT")
    private String plant;


    public Long getRow_id() {
        return row_id;
    }

    public void setRow_id(Long row_id) {
        this.row_id = row_id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getLot_number() {
        return lot_number;
    }

    public void setLot_number(String lot_number) {
        this.lot_number = lot_number;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }

    public String getTest_start_time() {
        return test_start_time;
    }

    public void setTest_start_time(String test_start_time) {
        this.test_start_time = test_start_time;
    }

    public String getTest_stop_time() {
        return test_stop_time;
    }

    public void setTest_stop_time(String test_stop_time) {
        this.test_stop_time = test_stop_time;
    }

    public String getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getJig_id() {
        return jig_id;
    }

    public void setJig_id(String jig_id) {
        this.jig_id = jig_id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTotal_judgment() {
        return total_judgment;
    }

    public void setTotal_judgment(String total_judgment) {
        this.total_judgment = total_judgment;
    }

    public String getModel_code() {
        return model_code;
    }

    public void setModel_code(String model_code) {
        this.model_code = model_code;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getX31_ovpu1_dl_low() {
        return x31_ovpu1_dl_low;
    }

    public void setX31_ovpu1_dl_low(String x31_ovpu1_dl_low) {
        this.x31_ovpu1_dl_low = x31_ovpu1_dl_low;
    }

    public String getX31_ovpu1_dl_upper() {
        return x31_ovpu1_dl_upper;
    }

    public void setX31_ovpu1_dl_upper(String x31_ovpu1_dl_upper) {
        this.x31_ovpu1_dl_upper = x31_ovpu1_dl_upper;
    }

    public String getX31_ovpu1_dl_value() {
        return x31_ovpu1_dl_value;
    }

    public void setX31_ovpu1_dl_value(String x31_ovpu1_dl_value) {
        this.x31_ovpu1_dl_value = x31_ovpu1_dl_value;
    }

    public String getX31_ovpu1_dt_low() {
        return x31_ovpu1_dt_low;
    }

    public void setX31_ovpu1_dt_low(String x31_ovpu1_dt_low) {
        this.x31_ovpu1_dt_low = x31_ovpu1_dt_low;
    }

    public String getX31_ovpu1_dt_upper() {
        return x31_ovpu1_dt_upper;
    }

    public void setX31_ovpu1_dt_upper(String x31_ovpu1_dt_upper) {
        this.x31_ovpu1_dt_upper = x31_ovpu1_dt_upper;
    }

    public String getX31_ovpu1_dt_value() {
        return x31_ovpu1_dt_value;
    }

    public void setX31_ovpu1_dt_value(String x31_ovpu1_dt_value) {
        this.x31_ovpu1_dt_value = x31_ovpu1_dt_value;
    }

    public String getX31_ovpu1_rl_low() {
        return x31_ovpu1_rl_low;
    }

    public void setX31_ovpu1_rl_low(String x31_ovpu1_rl_low) {
        this.x31_ovpu1_rl_low = x31_ovpu1_rl_low;
    }

    public String getX31_ovpu1_rl_upper() {
        return x31_ovpu1_rl_upper;
    }

    public void setX31_ovpu1_rl_upper(String x31_ovpu1_rl_upper) {
        this.x31_ovpu1_rl_upper = x31_ovpu1_rl_upper;
    }

    public String getX31_ovpu1_rl_value() {
        return x31_ovpu1_rl_value;
    }

    public void setX31_ovpu1_rl_value(String x31_ovpu1_rl_value) {
        this.x31_ovpu1_rl_value = x31_ovpu1_rl_value;
    }

    public String getX31_rst() {
        return x31_rst;
    }

    public void setX31_rst(String x31_rst) {
        this.x31_rst = x31_rst;
    }

    public String getX32_rst() {
        return x32_rst;
    }

    public void setX32_rst(String x32_rst) {
        this.x32_rst = x32_rst;
    }

    public String getX32_uvpu1_dl_low() {
        return x32_uvpu1_dl_low;
    }

    public void setX32_uvpu1_dl_low(String x32_uvpu1_dl_low) {
        this.x32_uvpu1_dl_low = x32_uvpu1_dl_low;
    }

    public String getX32_uvpu1_dl_upper() {
        return x32_uvpu1_dl_upper;
    }

    public void setX32_uvpu1_dl_upper(String x32_uvpu1_dl_upper) {
        this.x32_uvpu1_dl_upper = x32_uvpu1_dl_upper;
    }

    public String getX32_uvpu1_dl_value() {
        return x32_uvpu1_dl_value;
    }

    public void setX32_uvpu1_dl_value(String x32_uvpu1_dl_value) {
        this.x32_uvpu1_dl_value = x32_uvpu1_dl_value;
    }

    public String getX32_uvpu1_dt_low() {
        return x32_uvpu1_dt_low;
    }

    public void setX32_uvpu1_dt_low(String x32_uvpu1_dt_low) {
        this.x32_uvpu1_dt_low = x32_uvpu1_dt_low;
    }

    public String getX32_uvpu1_dt_upper() {
        return x32_uvpu1_dt_upper;
    }

    public void setX32_uvpu1_dt_upper(String x32_uvpu1_dt_upper) {
        this.x32_uvpu1_dt_upper = x32_uvpu1_dt_upper;
    }

    public String getX32_uvpu1_dt_value() {
        return x32_uvpu1_dt_value;
    }

    public void setX32_uvpu1_dt_value(String x32_uvpu1_dt_value) {
        this.x32_uvpu1_dt_value = x32_uvpu1_dt_value;
    }

    public String getX32_uvpu1_rl_low() {
        return x32_uvpu1_rl_low;
    }

    public void setX32_uvpu1_rl_low(String x32_uvpu1_rl_low) {
        this.x32_uvpu1_rl_low = x32_uvpu1_rl_low;
    }

    public String getX32_uvpu1_rl_upper() {
        return x32_uvpu1_rl_upper;
    }

    public void setX32_uvpu1_rl_upper(String x32_uvpu1_rl_upper) {
        this.x32_uvpu1_rl_upper = x32_uvpu1_rl_upper;
    }

    public String getX32_uvpu1_rl_value() {
        return x32_uvpu1_rl_value;
    }

    public void setX32_uvpu1_rl_value(String x32_uvpu1_rl_value) {
        this.x32_uvpu1_rl_value = x32_uvpu1_rl_value;
    }

    public String getX33_cocpu1_dl_low() {
        return x33_cocpu1_dl_low;
    }

    public void setX33_cocpu1_dl_low(String x33_cocpu1_dl_low) {
        this.x33_cocpu1_dl_low = x33_cocpu1_dl_low;
    }

    public String getX33_cocpu1_dl_upper() {
        return x33_cocpu1_dl_upper;
    }

    public void setX33_cocpu1_dl_upper(String x33_cocpu1_dl_upper) {
        this.x33_cocpu1_dl_upper = x33_cocpu1_dl_upper;
    }

    public String getX33_cocpu1_dl_value() {
        return x33_cocpu1_dl_value;
    }

    public void setX33_cocpu1_dl_value(String x33_cocpu1_dl_value) {
        this.x33_cocpu1_dl_value = x33_cocpu1_dl_value;
    }

    public String getX33_cocpu1_dt_low() {
        return x33_cocpu1_dt_low;
    }

    public void setX33_cocpu1_dt_low(String x33_cocpu1_dt_low) {
        this.x33_cocpu1_dt_low = x33_cocpu1_dt_low;
    }

    public String getX33_cocpu1_dt_upper() {
        return x33_cocpu1_dt_upper;
    }

    public void setX33_cocpu1_dt_upper(String x33_cocpu1_dt_upper) {
        this.x33_cocpu1_dt_upper = x33_cocpu1_dt_upper;
    }

    public String getX33_cocpu1_dt_value() {
        return x33_cocpu1_dt_value;
    }

    public void setX33_cocpu1_dt_value(String x33_cocpu1_dt_value) {
        this.x33_cocpu1_dt_value = x33_cocpu1_dt_value;
    }

    public String getX33_rst() {
        return x33_rst;
    }

    public void setX33_rst(String x33_rst) {
        this.x33_rst = x33_rst;
    }

    public String getX34_docpu1_dl_low() {
        return x34_docpu1_dl_low;
    }

    public void setX34_docpu1_dl_low(String x34_docpu1_dl_low) {
        this.x34_docpu1_dl_low = x34_docpu1_dl_low;
    }

    public String getX34_docpu1_dl_upper() {
        return x34_docpu1_dl_upper;
    }

    public void setX34_docpu1_dl_upper(String x34_docpu1_dl_upper) {
        this.x34_docpu1_dl_upper = x34_docpu1_dl_upper;
    }

    public String getX34_docpu1_dl_value() {
        return x34_docpu1_dl_value;
    }

    public void setX34_docpu1_dl_value(String x34_docpu1_dl_value) {
        this.x34_docpu1_dl_value = x34_docpu1_dl_value;
    }

    public String getX34_docpu1_dt_low() {
        return x34_docpu1_dt_low;
    }

    public void setX34_docpu1_dt_low(String x34_docpu1_dt_low) {
        this.x34_docpu1_dt_low = x34_docpu1_dt_low;
    }

    public String getX34_docpu1_dt_upper() {
        return x34_docpu1_dt_upper;
    }

    public void setX34_docpu1_dt_upper(String x34_docpu1_dt_upper) {
        this.x34_docpu1_dt_upper = x34_docpu1_dt_upper;
    }

    public String getX34_docpu1_dt_value() {
        return x34_docpu1_dt_value;
    }

    public void setX34_docpu1_dt_value(String x34_docpu1_dt_value) {
        this.x34_docpu1_dt_value = x34_docpu1_dt_value;
    }

    public String getX34_rst() {
        return x34_rst;
    }

    public void setX34_rst(String x34_rst) {
        this.x34_rst = x34_rst;
    }

    public String getX39_c1_low() {
        return x39_c1_low;
    }

    public void setX39_c1_low(String x39_c1_low) {
        this.x39_c1_low = x39_c1_low;
    }

    public String getX39_c1_upper() {
        return x39_c1_upper;
    }

    public void setX39_c1_upper(String x39_c1_upper) {
        this.x39_c1_upper = x39_c1_upper;
    }

    public String getX39_c1_value() {
        return x39_c1_value;
    }

    public void setX39_c1_value(String x39_c1_value) {
        this.x39_c1_value = x39_c1_value;
    }

    public String getX39_c3_c4_low() {
        return x39_c3_c4_low;
    }

    public void setX39_c3_c4_low(String x39_c3_c4_low) {
        this.x39_c3_c4_low = x39_c3_c4_low;
    }

    public String getX39_c3_c4_upper() {
        return x39_c3_c4_upper;
    }

    public void setX39_c3_c4_upper(String x39_c3_c4_upper) {
        this.x39_c3_c4_upper = x39_c3_c4_upper;
    }

    public String getX39_c3_c4_value() {
        return x39_c3_c4_value;
    }

    public void setX39_c3_c4_value(String x39_c3_c4_value) {
        this.x39_c3_c4_value = x39_c3_c4_value;
    }

    public String getX39_r1_low() {
        return x39_r1_low;
    }

    public void setX39_r1_low(String x39_r1_low) {
        this.x39_r1_low = x39_r1_low;
    }

    public String getX39_r1_upper() {
        return x39_r1_upper;
    }

    public void setX39_r1_upper(String x39_r1_upper) {
        this.x39_r1_upper = x39_r1_upper;
    }

    public String getX39_r1_value() {
        return x39_r1_value;
    }

    public void setX39_r1_value(String x39_r1_value) {
        this.x39_r1_value = x39_r1_value;
    }

    public String getX39_r2_low() {
        return x39_r2_low;
    }

    public void setX39_r2_low(String x39_r2_low) {
        this.x39_r2_low = x39_r2_low;
    }

    public String getX39_r2_upper() {
        return x39_r2_upper;
    }

    public void setX39_r2_upper(String x39_r2_upper) {
        this.x39_r2_upper = x39_r2_upper;
    }

    public String getX39_r2_value() {
        return x39_r2_value;
    }

    public void setX39_r2_value(String x39_r2_value) {
        this.x39_r2_value = x39_r2_value;
    }

    public String getX39_rst() {
        return x39_rst;
    }

    public void setX39_rst(String x39_rst) {
        this.x39_rst = x39_rst;
    }

    public String getX3c_ocv_low() {
        return x3c_ocv_low;
    }

    public void setX3c_ocv_low(String x3c_ocv_low) {
        this.x3c_ocv_low = x3c_ocv_low;
    }

    public String getX3c_ocv_upper() {
        return x3c_ocv_upper;
    }

    public void setX3c_ocv_upper(String x3c_ocv_upper) {
        this.x3c_ocv_upper = x3c_ocv_upper;
    }

    public String getX3c_ocv_value() {
        return x3c_ocv_value;
    }

    public void setX3c_ocv_value(String x3c_ocv_value) {
        this.x3c_ocv_value = x3c_ocv_value;
    }

    public String getX3c_rst() {
        return x3c_rst;
    }

    public void setX3c_rst(String x3c_rst) {
        this.x3c_rst = x3c_rst;
    }

    public String getX3e_1st_low() {
        return x3e_1st_low;
    }

    public void setX3e_1st_low(String x3e_1st_low) {
        this.x3e_1st_low = x3e_1st_low;
    }

    public String getX3e_1st_upper() {
        return x3e_1st_upper;
    }

    public void setX3e_1st_upper(String x3e_1st_upper) {
        this.x3e_1st_upper = x3e_1st_upper;
    }

    public String getX3e_1st_value() {
        return x3e_1st_value;
    }

    public void setX3e_1st_value(String x3e_1st_value) {
        this.x3e_1st_value = x3e_1st_value;
    }

    public String getX3e_2nd_low() {
        return x3e_2nd_low;
    }

    public void setX3e_2nd_low(String x3e_2nd_low) {
        this.x3e_2nd_low = x3e_2nd_low;
    }

    public String getX3e_2nd_upper() {
        return x3e_2nd_upper;
    }

    public void setX3e_2nd_upper(String x3e_2nd_upper) {
        this.x3e_2nd_upper = x3e_2nd_upper;
    }

    public String getX3e_2nd_value() {
        return x3e_2nd_value;
    }

    public void setX3e_2nd_value(String x3e_2nd_value) {
        this.x3e_2nd_value = x3e_2nd_value;
    }

    public String getX3e_rst() {
        return x3e_rst;
    }

    public void setX3e_rst(String x3e_rst) {
        this.x3e_rst = x3e_rst;
    }

    public String getX61_ovpu2_dl_low() {
        return x61_ovpu2_dl_low;
    }

    public void setX61_ovpu2_dl_low(String x61_ovpu2_dl_low) {
        this.x61_ovpu2_dl_low = x61_ovpu2_dl_low;
    }

    public String getX61_ovpu2_dl_upper() {
        return x61_ovpu2_dl_upper;
    }

    public void setX61_ovpu2_dl_upper(String x61_ovpu2_dl_upper) {
        this.x61_ovpu2_dl_upper = x61_ovpu2_dl_upper;
    }

    public String getX61_ovpu2_dl_value() {
        return x61_ovpu2_dl_value;
    }

    public void setX61_ovpu2_dl_value(String x61_ovpu2_dl_value) {
        this.x61_ovpu2_dl_value = x61_ovpu2_dl_value;
    }

    public String getX61_ovpu2_dt_low() {
        return x61_ovpu2_dt_low;
    }

    public void setX61_ovpu2_dt_low(String x61_ovpu2_dt_low) {
        this.x61_ovpu2_dt_low = x61_ovpu2_dt_low;
    }

    public String getX61_ovpu2_dt_upper() {
        return x61_ovpu2_dt_upper;
    }

    public void setX61_ovpu2_dt_upper(String x61_ovpu2_dt_upper) {
        this.x61_ovpu2_dt_upper = x61_ovpu2_dt_upper;
    }

    public String getX61_ovpu2_dt_value() {
        return x61_ovpu2_dt_value;
    }

    public void setX61_ovpu2_dt_value(String x61_ovpu2_dt_value) {
        this.x61_ovpu2_dt_value = x61_ovpu2_dt_value;
    }

    public String getX61_ovpu2_rl_low() {
        return x61_ovpu2_rl_low;
    }

    public void setX61_ovpu2_rl_low(String x61_ovpu2_rl_low) {
        this.x61_ovpu2_rl_low = x61_ovpu2_rl_low;
    }

    public String getX61_ovpu2_rl_upper() {
        return x61_ovpu2_rl_upper;
    }

    public void setX61_ovpu2_rl_upper(String x61_ovpu2_rl_upper) {
        this.x61_ovpu2_rl_upper = x61_ovpu2_rl_upper;
    }

    public String getX61_ovpu2_rl_value() {
        return x61_ovpu2_rl_value;
    }

    public void setX61_ovpu2_rl_value(String x61_ovpu2_rl_value) {
        this.x61_ovpu2_rl_value = x61_ovpu2_rl_value;
    }

    public String getX61_rst() {
        return x61_rst;
    }

    public void setX61_rst(String x61_rst) {
        this.x61_rst = x61_rst;
    }

    public String getX62_ovpu2_rl_low() {
        return x62_ovpu2_rl_low;
    }

    public void setX62_ovpu2_rl_low(String x62_ovpu2_rl_low) {
        this.x62_ovpu2_rl_low = x62_ovpu2_rl_low;
    }

    public String getX62_ovpu2_rl_upper() {
        return x62_ovpu2_rl_upper;
    }

    public void setX62_ovpu2_rl_upper(String x62_ovpu2_rl_upper) {
        this.x62_ovpu2_rl_upper = x62_ovpu2_rl_upper;
    }

    public String getX62_ovpu2_rl_value() {
        return x62_ovpu2_rl_value;
    }

    public void setX62_ovpu2_rl_value(String x62_ovpu2_rl_value) {
        this.x62_ovpu2_rl_value = x62_ovpu2_rl_value;
    }

    public String getX62_rst() {
        return x62_rst;
    }

    public void setX62_rst(String x62_rst) {
        this.x62_rst = x62_rst;
    }

    public String getX62_uvpu2_dl_low() {
        return x62_uvpu2_dl_low;
    }

    public void setX62_uvpu2_dl_low(String x62_uvpu2_dl_low) {
        this.x62_uvpu2_dl_low = x62_uvpu2_dl_low;
    }

    public String getX62_uvpu2_dl_upper() {
        return x62_uvpu2_dl_upper;
    }

    public void setX62_uvpu2_dl_upper(String x62_uvpu2_dl_upper) {
        this.x62_uvpu2_dl_upper = x62_uvpu2_dl_upper;
    }

    public String getX62_uvpu2_dl_value() {
        return x62_uvpu2_dl_value;
    }

    public void setX62_uvpu2_dl_value(String x62_uvpu2_dl_value) {
        this.x62_uvpu2_dl_value = x62_uvpu2_dl_value;
    }

    public String getX62_uvpu2_dt_low() {
        return x62_uvpu2_dt_low;
    }

    public void setX62_uvpu2_dt_low(String x62_uvpu2_dt_low) {
        this.x62_uvpu2_dt_low = x62_uvpu2_dt_low;
    }

    public String getX62_uvpu2_dt_upper() {
        return x62_uvpu2_dt_upper;
    }

    public void setX62_uvpu2_dt_upper(String x62_uvpu2_dt_upper) {
        this.x62_uvpu2_dt_upper = x62_uvpu2_dt_upper;
    }

    public String getX62_uvpu2_dt_value() {
        return x62_uvpu2_dt_value;
    }

    public void setX62_uvpu2_dt_value(String x62_uvpu2_dt_value) {
        this.x62_uvpu2_dt_value = x62_uvpu2_dt_value;
    }

    public String getX62_uvpu2_rl_low() {
        return x62_uvpu2_rl_low;
    }

    public void setX62_uvpu2_rl_low(String x62_uvpu2_rl_low) {
        this.x62_uvpu2_rl_low = x62_uvpu2_rl_low;
    }

    public String getX62_uvpu2_rl_upper() {
        return x62_uvpu2_rl_upper;
    }

    public void setX62_uvpu2_rl_upper(String x62_uvpu2_rl_upper) {
        this.x62_uvpu2_rl_upper = x62_uvpu2_rl_upper;
    }

    public String getX62_uvpu2_rl_value() {
        return x62_uvpu2_rl_value;
    }

    public void setX62_uvpu2_rl_value(String x62_uvpu2_rl_value) {
        this.x62_uvpu2_rl_value = x62_uvpu2_rl_value;
    }

    public String getX63_cocpu2_dl_low() {
        return x63_cocpu2_dl_low;
    }

    public void setX63_cocpu2_dl_low(String x63_cocpu2_dl_low) {
        this.x63_cocpu2_dl_low = x63_cocpu2_dl_low;
    }

    public String getX63_cocpu2_dl_upper() {
        return x63_cocpu2_dl_upper;
    }

    public void setX63_cocpu2_dl_upper(String x63_cocpu2_dl_upper) {
        this.x63_cocpu2_dl_upper = x63_cocpu2_dl_upper;
    }

    public String getX63_cocpu2_dl_value() {
        return x63_cocpu2_dl_value;
    }

    public void setX63_cocpu2_dl_value(String x63_cocpu2_dl_value) {
        this.x63_cocpu2_dl_value = x63_cocpu2_dl_value;
    }

    public String getX63_cocpu2_dt_low() {
        return x63_cocpu2_dt_low;
    }

    public void setX63_cocpu2_dt_low(String x63_cocpu2_dt_low) {
        this.x63_cocpu2_dt_low = x63_cocpu2_dt_low;
    }

    public String getX63_cocpu2_dt_upper() {
        return x63_cocpu2_dt_upper;
    }

    public void setX63_cocpu2_dt_upper(String x63_cocpu2_dt_upper) {
        this.x63_cocpu2_dt_upper = x63_cocpu2_dt_upper;
    }

    public String getX63_cocpu2_dt_value() {
        return x63_cocpu2_dt_value;
    }

    public void setX63_cocpu2_dt_value(String x63_cocpu2_dt_value) {
        this.x63_cocpu2_dt_value = x63_cocpu2_dt_value;
    }

    public String getX63_rst() {
        return x63_rst;
    }

    public void setX63_rst(String x63_rst) {
        this.x63_rst = x63_rst;
    }

    public String getX64_docpu2_dl_low() {
        return x64_docpu2_dl_low;
    }

    public void setX64_docpu2_dl_low(String x64_docpu2_dl_low) {
        this.x64_docpu2_dl_low = x64_docpu2_dl_low;
    }

    public String getX64_docpu2_dl_upper() {
        return x64_docpu2_dl_upper;
    }

    public void setX64_docpu2_dl_upper(String x64_docpu2_dl_upper) {
        this.x64_docpu2_dl_upper = x64_docpu2_dl_upper;
    }

    public String getX64_docpu2_dl_value() {
        return x64_docpu2_dl_value;
    }

    public void setX64_docpu2_dl_value(String x64_docpu2_dl_value) {
        this.x64_docpu2_dl_value = x64_docpu2_dl_value;
    }

    public String getX64_docpu2_dt_low() {
        return x64_docpu2_dt_low;
    }

    public void setX64_docpu2_dt_low(String x64_docpu2_dt_low) {
        this.x64_docpu2_dt_low = x64_docpu2_dt_low;
    }

    public String getX64_docpu2_dt_upper() {
        return x64_docpu2_dt_upper;
    }

    public void setX64_docpu2_dt_upper(String x64_docpu2_dt_upper) {
        this.x64_docpu2_dt_upper = x64_docpu2_dt_upper;
    }

    public String getX64_docpu2_dt_value() {
        return x64_docpu2_dt_value;
    }

    public void setX64_docpu2_dt_value(String x64_docpu2_dt_value) {
        this.x64_docpu2_dt_value = x64_docpu2_dt_value;
    }

    public String getX64_rst() {
        return x64_rst;
    }

    public void setX64_rst(String x64_rst) {
        this.x64_rst = x64_rst;
    }

    public String getX68_nor_low() {
        return x68_nor_low;
    }

    public void setX68_nor_low(String x68_nor_low) {
        this.x68_nor_low = x68_nor_low;
    }

    public String getX68_nor_upper() {
        return x68_nor_upper;
    }

    public void setX68_nor_upper(String x68_nor_upper) {
        this.x68_nor_upper = x68_nor_upper;
    }

    public String getX68_nor_value() {
        return x68_nor_value;
    }

    public void setX68_nor_value(String x68_nor_value) {
        this.x68_nor_value = x68_nor_value;
    }

    public String getX68_rst() {
        return x68_rst;
    }

    public void setX68_rst(String x68_rst) {
        this.x68_rst = x68_rst;
    }

    public String getX68_sd_low() {
        return x68_sd_low;
    }

    public void setX68_sd_low(String x68_sd_low) {
        this.x68_sd_low = x68_sd_low;
    }

    public String getX68_sd_upper() {
        return x68_sd_upper;
    }

    public void setX68_sd_upper(String x68_sd_upper) {
        this.x68_sd_upper = x68_sd_upper;
    }

    public String getX68_sd_value() {
        return x68_sd_value;
    }

    public void setX68_sd_value(String x68_sd_value) {
        this.x68_sd_value = x68_sd_value;
    }

    public String getX69_c2_low() {
        return x69_c2_low;
    }

    public void setX69_c2_low(String x69_c2_low) {
        this.x69_c2_low = x69_c2_low;
    }

    public String getX69_c2_upper() {
        return x69_c2_upper;
    }

    public void setX69_c2_upper(String x69_c2_upper) {
        this.x69_c2_upper = x69_c2_upper;
    }

    public String getX69_c2_value() {
        return x69_c2_value;
    }

    public void setX69_c2_value(String x69_c2_value) {
        this.x69_c2_value = x69_c2_value;
    }

    public String getX69_r3_low() {
        return x69_r3_low;
    }

    public void setX69_r3_low(String x69_r3_low) {
        this.x69_r3_low = x69_r3_low;
    }

    public String getX69_r3_upper() {
        return x69_r3_upper;
    }

    public void setX69_r3_upper(String x69_r3_upper) {
        this.x69_r3_upper = x69_r3_upper;
    }

    public String getX69_r3_value() {
        return x69_r3_value;
    }

    public void setX69_r3_value(String x69_r3_value) {
        this.x69_r3_value = x69_r3_value;
    }

    public String getX69_r4_low() {
        return x69_r4_low;
    }

    public void setX69_r4_low(String x69_r4_low) {
        this.x69_r4_low = x69_r4_low;
    }

    public String getX69_r4_upper() {
        return x69_r4_upper;
    }

    public void setX69_r4_upper(String x69_r4_upper) {
        this.x69_r4_upper = x69_r4_upper;
    }

    public String getX69_r4_value() {
        return x69_r4_value;
    }

    public void setX69_r4_value(String x69_r4_value) {
        this.x69_r4_value = x69_r4_value;
    }

    public String getX69_rst() {
        return x69_rst;
    }

    public void setX69_rst(String x69_rst) {
        this.x69_rst = x69_rst;
    }

    public String getX90_id_main() {
        return x90_id_main;
    }

    public void setX90_id_main(String x90_id_main) {
        this.x90_id_main = x90_id_main;
    }

    public String getX90_id_read_ecc() {
        return x90_id_read_ecc;
    }

    public void setX90_id_read_ecc(String x90_id_read_ecc) {
        this.x90_id_read_ecc = x90_id_read_ecc;
    }

    public String getX90_rst() {
        return x90_rst;
    }

    public void setX90_rst(String x90_rst) {
        this.x90_rst = x90_rst;
    }

    public String getX98_rst() {
        return x98_rst;
    }

    public void setX98_rst(String x98_rst) {
        this.x98_rst = x98_rst;
    }

    public String getX98_memory_unlock_check() {
        return x98_memory_unlock_check;
    }

    public void setX98_memory_unlock_check(String x98_memory_unlock_check) {
        this.x98_memory_unlock_check = x98_memory_unlock_check;
    }

    public String getX99_cntwr_data() {
        return x99_cntwr_data;
    }

    public void setX99_cntwr_data(String x99_cntwr_data) {
        this.x99_cntwr_data = x99_cntwr_data;
    }

    public String getX99_rst() {
        return x99_rst;
    }

    public void setX99_rst(String x99_rst) {
        this.x99_rst = x99_rst;
    }

    public String getX9a_cntrd_data() {
        return x9a_cntrd_data;
    }

    public void setX9a_cntrd_data(String x9a_cntrd_data) {
        this.x9a_cntrd_data = x9a_cntrd_data;
    }

    public String getX9a_rst() {
        return x9a_rst;
    }

    public void setX9a_rst(String x9a_rst) {
        this.x9a_rst = x9a_rst;
    }

    public String getX9f_memory_0000() {
        return x9f_memory_0000;
    }

    public void setX9f_memory_0000(String x9f_memory_0000) {
        this.x9f_memory_0000 = x9f_memory_0000;
    }

    public String getX9f_memory_0001() {
        return x9f_memory_0001;
    }

    public void setX9f_memory_0001(String x9f_memory_0001) {
        this.x9f_memory_0001 = x9f_memory_0001;
    }

    public String getX9f_memory_0002() {
        return x9f_memory_0002;
    }

    public void setX9f_memory_0002(String x9f_memory_0002) {
        this.x9f_memory_0002 = x9f_memory_0002;
    }

    public String getX9f_memory_0003() {
        return x9f_memory_0003;
    }

    public void setX9f_memory_0003(String x9f_memory_0003) {
        this.x9f_memory_0003 = x9f_memory_0003;
    }

    public String getX9f_memory_0004() {
        return x9f_memory_0004;
    }

    public void setX9f_memory_0004(String x9f_memory_0004) {
        this.x9f_memory_0004 = x9f_memory_0004;
    }

    public String getX9f_memory_0005() {
        return x9f_memory_0005;
    }

    public void setX9f_memory_0005(String x9f_memory_0005) {
        this.x9f_memory_0005 = x9f_memory_0005;
    }

    public String getX9f_memory_0006() {
        return x9f_memory_0006;
    }

    public void setX9f_memory_0006(String x9f_memory_0006) {
        this.x9f_memory_0006 = x9f_memory_0006;
    }

    public String getX9f_memory_0007() {
        return x9f_memory_0007;
    }

    public void setX9f_memory_0007(String x9f_memory_0007) {
        this.x9f_memory_0007 = x9f_memory_0007;
    }

    public String getX9f_rst() {
        return x9f_rst;
    }

    public void setX9f_rst(String x9f_rst) {
        this.x9f_rst = x9f_rst;
    }

    public String getXb1_rst() {
        return xb1_rst;
    }

    public void setXb1_rst(String xb1_rst) {
        this.xb1_rst = xb1_rst;
    }

    public String getXb1_write_0000() {
        return xb1_write_0000;
    }

    public void setXb1_write_0000(String xb1_write_0000) {
        this.xb1_write_0000 = xb1_write_0000;
    }

    public String getXb1_write_0008() {
        return xb1_write_0008;
    }

    public void setXb1_write_0008(String xb1_write_0008) {
        this.xb1_write_0008 = xb1_write_0008;
    }

    public String getXb1_write_0010() {
        return xb1_write_0010;
    }

    public void setXb1_write_0010(String xb1_write_0010) {
        this.xb1_write_0010 = xb1_write_0010;
    }

    public String getXb1_write_0018() {
        return xb1_write_0018;
    }

    public void setXb1_write_0018(String xb1_write_0018) {
        this.xb1_write_0018 = xb1_write_0018;
    }

    public String getXb1_write_0020() {
        return xb1_write_0020;
    }

    public void setXb1_write_0020(String xb1_write_0020) {
        this.xb1_write_0020 = xb1_write_0020;
    }

    public String getXb1_write_0028() {
        return xb1_write_0028;
    }

    public void setXb1_write_0028(String xb1_write_0028) {
        this.xb1_write_0028 = xb1_write_0028;
    }

    public String getXb1_write_0030() {
        return xb1_write_0030;
    }

    public void setXb1_write_0030(String xb1_write_0030) {
        this.xb1_write_0030 = xb1_write_0030;
    }

    public String getXb1_write_0038() {
        return xb1_write_0038;
    }

    public void setXb1_write_0038(String xb1_write_0038) {
        this.xb1_write_0038 = xb1_write_0038;
    }

    public String getXb5_rst() {
        return xb5_rst;
    }

    public void setXb5_rst(String xb5_rst) {
        this.xb5_rst = xb5_rst;
    }

    public String getXb5_memory_unlock_check() {
        return xb5_memory_unlock_check;
    }

    public void setXb5_memory_unlock_check(String xb5_memory_unlock_check) {
        this.xb5_memory_unlock_check = xb5_memory_unlock_check;
    }

    public String getXb6_rst() {
        return xb6_rst;
    }

    public void setXb6_rst(String xb6_rst) {
        this.xb6_rst = xb6_rst;
    }

    public String getXb6_id_read_ecc() {
        return xb6_id_read_ecc;
    }

    public void setXb6_id_read_ecc(String xb6_id_read_ecc) {
        this.xb6_id_read_ecc = xb6_id_read_ecc;
    }

    public String getXb8_read_0000() {
        return xb8_read_0000;
    }

    public void setXb8_read_0000(String xb8_read_0000) {
        this.xb8_read_0000 = xb8_read_0000;
    }

    public String getXb8_read_0008() {
        return xb8_read_0008;
    }

    public void setXb8_read_0008(String xb8_read_0008) {
        this.xb8_read_0008 = xb8_read_0008;
    }

    public String getXb8_read_0010() {
        return xb8_read_0010;
    }

    public void setXb8_read_0010(String xb8_read_0010) {
        this.xb8_read_0010 = xb8_read_0010;
    }

    public String getXb8_read_0018() {
        return xb8_read_0018;
    }

    public void setXb8_read_0018(String xb8_read_0018) {
        this.xb8_read_0018 = xb8_read_0018;
    }

    public String getXb8_read_0020() {
        return xb8_read_0020;
    }

    public void setXb8_read_0020(String xb8_read_0020) {
        this.xb8_read_0020 = xb8_read_0020;
    }

    public String getXb8_read_0028() {
        return xb8_read_0028;
    }

    public void setXb8_read_0028(String xb8_read_0028) {
        this.xb8_read_0028 = xb8_read_0028;
    }

    public String getXb8_read_0030() {
        return xb8_read_0030;
    }

    public void setXb8_read_0030(String xb8_read_0030) {
        this.xb8_read_0030 = xb8_read_0030;
    }

    public String getXb8_read_0038() {
        return xb8_read_0038;
    }

    public void setXb8_read_0038(String xb8_read_0038) {
        this.xb8_read_0038 = xb8_read_0038;
    }

    public String getXb8_rst() {
        return xb8_rst;
    }

    public void setXb8_rst(String xb8_rst) {
        this.xb8_rst = xb8_rst;
    }

    public String getXba_counter_read() {
        return xba_counter_read;
    }

    public void setXba_counter_read(String xba_counter_read) {
        this.xba_counter_read = xba_counter_read;
    }

    public String getXba_rst() {
        return xba_rst;
    }

    public void setXba_rst(String xba_rst) {
        this.xba_rst = xba_rst;
    }

    public String getXbb_cntlock_value() {
        return xbb_cntlock_value;
    }

    public void setXbb_cntlock_value(String xbb_cntlock_value) {
        this.xbb_cntlock_value = xbb_cntlock_value;
    }

    public String getXbb_rst() {
        return xbb_rst;
    }

    public void setXbb_rst(String xbb_rst) {
        this.xbb_rst = xbb_rst;
    }

    public String getXbf_memory_0000() {
        return xbf_memory_0000;
    }

    public void setXbf_memory_0000(String xbf_memory_0000) {
        this.xbf_memory_0000 = xbf_memory_0000;
    }

    public String getXbf_memory_0001() {
        return xbf_memory_0001;
    }

    public void setXbf_memory_0001(String xbf_memory_0001) {
        this.xbf_memory_0001 = xbf_memory_0001;
    }

    public String getXbf_memory_0002() {
        return xbf_memory_0002;
    }

    public void setXbf_memory_0002(String xbf_memory_0002) {
        this.xbf_memory_0002 = xbf_memory_0002;
    }

    public String getXbf_memory_0003() {
        return xbf_memory_0003;
    }

    public void setXbf_memory_0003(String xbf_memory_0003) {
        this.xbf_memory_0003 = xbf_memory_0003;
    }

    public String getXbf_memory_0004() {
        return xbf_memory_0004;
    }

    public void setXbf_memory_0004(String xbf_memory_0004) {
        this.xbf_memory_0004 = xbf_memory_0004;
    }

    public String getXbf_memory_0005() {
        return xbf_memory_0005;
    }

    public void setXbf_memory_0005(String xbf_memory_0005) {
        this.xbf_memory_0005 = xbf_memory_0005;
    }

    public String getXbf_memory_0006() {
        return xbf_memory_0006;
    }

    public void setXbf_memory_0006(String xbf_memory_0006) {
        this.xbf_memory_0006 = xbf_memory_0006;
    }

    public String getXbf_memory_0007() {
        return xbf_memory_0007;
    }

    public void setXbf_memory_0007(String xbf_memory_0007) {
        this.xbf_memory_0007 = xbf_memory_0007;
    }

    public String getXbf_rst() {
        return xbf_rst;
    }

    public void setXbf_rst(String xbf_rst) {
        this.xbf_rst = xbf_rst;
    }

    public String getXe2_irn_low() {
        return xe2_irn_low;
    }

    public void setXe2_irn_low(String xe2_irn_low) {
        this.xe2_irn_low = xe2_irn_low;
    }

    public String getXe2_irn_upper() {
        return xe2_irn_upper;
    }

    public void setXe2_irn_upper(String xe2_irn_upper) {
        this.xe2_irn_upper = xe2_irn_upper;
    }

    public String getXe2_irn_value() {
        return xe2_irn_value;
    }

    public void setXe2_irn_value(String xe2_irn_value) {
        this.xe2_irn_value = xe2_irn_value;
    }

    public String getXe2_irp_low() {
        return xe2_irp_low;
    }

    public void setXe2_irp_low(String xe2_irp_low) {
        this.xe2_irp_low = xe2_irp_low;
    }

    public String getXe2_irp_upper() {
        return xe2_irp_upper;
    }

    public void setXe2_irp_upper(String xe2_irp_upper) {
        this.xe2_irp_upper = xe2_irp_upper;
    }

    public String getXe2_irp_value() {
        return xe2_irp_value;
    }

    public void setXe2_irp_value(String xe2_irp_value) {
        this.xe2_irp_value = xe2_irp_value;
    }

    public String getXe2_irtl_low() {
        return xe2_irtl_low;
    }

    public void setXe2_irtl_low(String xe2_irtl_low) {
        this.xe2_irtl_low = xe2_irtl_low;
    }

    public String getXe2_irtl_upper() {
        return xe2_irtl_upper;
    }

    public void setXe2_irtl_upper(String xe2_irtl_upper) {
        this.xe2_irtl_upper = xe2_irtl_upper;
    }

    public String getXe2_irtl_value() {
        return xe2_irtl_value;
    }

    public void setXe2_irtl_value(String xe2_irtl_value) {
        this.xe2_irtl_value = xe2_irtl_value;
    }

    public String getXe2_rst() {
        return xe2_rst;
    }

    public void setXe2_rst(String xe2_rst) {
        this.xe2_rst = xe2_rst;
    }

    public String getXe4_idr_low() {
        return xe4_idr_low;
    }

    public void setXe4_idr_low(String xe4_idr_low) {
        this.xe4_idr_low = xe4_idr_low;
    }

    public String getXe4_idr_upper() {
        return xe4_idr_upper;
    }

    public void setXe4_idr_upper(String xe4_idr_upper) {
        this.xe4_idr_upper = xe4_idr_upper;
    }

    public String getXe4_idr_value() {
        return xe4_idr_value;
    }

    public void setXe4_idr_value(String xe4_idr_value) {
        this.xe4_idr_value = xe4_idr_value;
    }

    public String getXe4_rst() {
        return xe4_rst;
    }

    public void setXe4_rst(String xe4_rst) {
        this.xe4_rst = xe4_rst;
    }

    public String getX92_bat_read_rst() {
        return x92_bat_read_rst;
    }

    public void setX92_bat_read_rst(String x92_bat_read_rst) {
        this.x92_bat_read_rst = x92_bat_read_rst;
    }

    public String getX92_bat_read_0015() {
        return x92_bat_read_0015;
    }

    public void setX92_bat_read_0015(String x92_bat_read_0015) {
        this.x92_bat_read_0015 = x92_bat_read_0015;
    }

    public String getX92_bat_read_1631() {
        return x92_bat_read_1631;
    }

    public void setX92_bat_read_1631(String x92_bat_read_1631) {
        this.x92_bat_read_1631 = x92_bat_read_1631;
    }

    public String getX92_bat_read_3247() {
        return x92_bat_read_3247;
    }

    public void setX92_bat_read_3247(String x92_bat_read_3247) {
        this.x92_bat_read_3247 = x92_bat_read_3247;
    }

    public String getX92_bat_read_4862() {
        return x92_bat_read_4862;
    }

    public void setX92_bat_read_4862(String x92_bat_read_4862) {
        this.x92_bat_read_4862 = x92_bat_read_4862;
    }

    public String getX92_bat_read_6479() {
        return x92_bat_read_6479;
    }

    public void setX92_bat_read_6479(String x92_bat_read_6479) {
        this.x92_bat_read_6479 = x92_bat_read_6479;
    }

    public String getX92_bat_read_8095() {
        return x92_bat_read_8095;
    }

    public void setX92_bat_read_8095(String x92_bat_read_8095) {
        this.x92_bat_read_8095 = x92_bat_read_8095;
    }

    public String getX92_bat_read_96111() {
        return x92_bat_read_96111;
    }

    public void setX92_bat_read_96111(String x92_bat_read_96111) {
        this.x92_bat_read_96111 = x92_bat_read_96111;
    }

    public String getX92_bat_read_112127() {
        return x92_bat_read_112127;
    }

    public void setX92_bat_read_112127(String x92_bat_read_112127) {
        this.x92_bat_read_112127 = x92_bat_read_112127;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }
}
