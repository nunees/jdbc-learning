package com.felipe.lil.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {
    public static void main(String[] args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost","hplussport",
                "postgres","password");

        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = customerDAO.findById(1000);
            System.out.println(customer.getFirstName() + " " + customer.getLastName());

//            Customer customer = new Customer();
//            customer.setFirstName("Amanda");
//            customer.setLastName("Silva");
//            customer.setEmail("amandavieira.i@hotmail.com");
//            customer.setPhone("(555) 555-5555");
//            customer.setAddress("1234 Main st");
//            customer.setCity("Sao Paulo");
//            customer.setState("SP");
//            customer.setZipCode("2222");
//            customerDAO.create(customer);


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
