package com.api.sheettosql;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;

public class SheetToSQL {
    public static void main(String[] args) {
        //Connection
        String jdbcUrl = "jdbc:mysql://localhost:3306/user";
        String username = "root";
        String password = "";

        Connection con = null;

        try {
            con = DriverManager.getConnection(jdbcUrl, username, password);

            FileInputStream excelFile = new FileInputStream("g:\\user.xlsx");
            Workbook workbook = WorkbookFactory.create(excelFile);
            Sheet sheet = workbook.getSheetAt(0);

            String sql = "INSERT INTO usertable(fullName, mobNumber, emailAddress) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            DataFormatter formatter = new DataFormatter();
            int batchSize = 20;
            int count = 0;
            for (Row row : sheet) {
                Iterator<Cell> cellIterator = row.cellIterator();
                if (cellIterator.hasNext()) {
                    Cell cell1 = cellIterator.next();
                    ps.setString(1, formatter.formatCellValue(cell1));
                    if (cellIterator.hasNext()) {
                        Cell cell2 = cellIterator.next();
                        ps.setString(2, formatter.formatCellValue(cell2));
                        if (cellIterator.hasNext()) {
                            Cell cell3 = cellIterator.next();
                            ps.setString(3, formatter.formatCellValue(cell3));
                        }
                    }
                    ps.addBatch();
                    count++;
                    if (count % batchSize == 0) {
                        ps.executeBatch();
                        ps.clearBatch();
                    }
                }
            }
            ps.executeBatch();
            ps.close();
            workbook.close();
            excelFile.close();
            System.out.println("Data has been inserted into SQL");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}