package my.learning.database.connection;

import oracle.jdbc.OracleDriver;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OracleDBConnection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List<Employee> resultList = new ArrayList<>();
        Class.forName("oracle.jdbc.OracleDriver");
        // DriverManager.registerDriver(new OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@database-1.cs7npspg4dlj.us-west-2.rds.amazonaws.com:1521:ORCL","admin","welcome123");
        if(con != null){
            System.out.println("connection successful");
            String sqlQuery = "select * from employee";
           Statement statement = con.createStatement();
           System.out.println("getting the result from database from the employee table :");
           ResultSet rs = statement.executeQuery(sqlQuery);
           while(rs.next()) {
              Integer emplId = rs.getInt("ID");
              String firstName = rs.getString("FIRST_NAME");
              String lastName = rs.getString("LAST_NAME");
              String department = rs.getString("DEPARTMENT");
              Employee employee = new Employee();
              employee.setId(emplId);
              employee.setFirstName(firstName);
              employee.setLastName(lastName);
              employee.setDepartment(department);
              resultList.add(employee);
           }
           String insertQuery = "INSERT INTO EMPLOYEE(ID,FIRST_NAME,LAST_NAME,DEPARTMENT) VALUES (4,'ALICE','MAXWELL','ACCOUNTING')";
           statement.executeQuery(insertQuery);
           /* String deleteQuery = "delete from employee where id=4";
           statement.executeQuery(deleteQuery);*/
           statement.close();
           con.close();

           for(Employee emp : resultList){
               System.out.println(emp.getFirstName());
               System.out.println(emp.getLastName());
           }

       }else{
           System.out.println("connection was not successful");
       }

    }
}
