/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.sheettosql;

/**
 *
 * @author sandi
 */
public class NewClass {
    
}



//package com.api.sheettosql;
//
//import java.io.FileInputStream;
//import org.apache.poi.ss.usermodel.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//public class SheetToSQL {
//
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        String jdbcUrl = "jdbc:mysql://localhost:3306/user";
//        String username = "root";
//        String password = "";
//
//        String filePath = "f:\\user.csv";
//
//        int batchSize = 20;
//
//        Connection con = null;
//
//        try {
//            con = DriverManager.getConnection(jdbcUrl, username, password);
//            con.setAutoCommit(false);
//            
//            FileInputStream excelFile = new FileInputStream("f:\\user.xlsx");
//            Workbook workbook = WorkbookFactory.create(excelFile);
//            Sheet sheet = workbook.getSheetAt(0);
//
//            String sql = "INSERT INTO usertable(fullName, mobNumber, emailAddress) VALUES (?, ?, ?)";
//
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
//            lineReader.readLine(); // Skip header line
//            String lineText;
//            int count = 0;
//            while ((lineText = lineReader.readLine()) != null) {
//                String[] data = lineText.split(",");
//                String fullName = data[0];
//                String mobNumber = data[1];
//                String emailAddress = data[2];
//
//                System.out.println(fullName + " " + mobNumber + " " + emailAddress);
//
//                ps.setString(1, fullName);
//                ps.setString(2, mobNumber);
//                ps.setString(3, emailAddress);
//                ps.addBatch();
//
//                if (++count % batchSize == 0) {
//                    ps.executeBatch();
//                }
//            }
//
//            // Execute the remaining batch and commit the transaction
//            ps.executeBatch();
//            con.commit();
//
//            // Close resources
//            ps.close();
//            con.close();
//
//            System.out.println("Data has been inserted into SQL");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
