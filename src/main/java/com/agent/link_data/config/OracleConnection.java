//package com.agent.link_data.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//
//@Component
//public class OracleConnection implements CommandLineRunner {
//
//    @Autowired
//    private DataSource dataSource;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        try (Connection conn = this.dataSource.getConnection()) {
//            System.out.println("✅ Oracle connection successful!");
//            System.out.println("URL: " + conn.getMetaData().getURL());
//            System.out.println("User: " + conn.getMetaData().getUserName());
//        } catch (Exception e) {
//            System.err.println("❌ Oracle connection failed:");
//            e.printStackTrace();
//        }
//    }
//}
