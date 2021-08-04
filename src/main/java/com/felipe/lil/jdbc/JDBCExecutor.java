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

            OrderDAO orderDAO = new OrderDAO(connection);
            Order order = orderDAO.findById(1000);
            System.out.println(order);



//            Customer customer = customerDAO.findById(1001);
//            System.out.println(customer.getId());
//
//            customerDAO.delete(customer.getId());
//            System.out.println("The user " + customer.getLastName() + " was deleted!");

//
//            Customer customer = customerDAO.findById(10000);
//            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());
//
//            customer.setEmail("gwashington@wh.gov");
//            customer = customerDAO.update(customer);
//            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());

//            Customer customer = customerDAO.findById(1000);
//            System.out.println(customer.getFirstName() + " " + customer.getLastName());

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
