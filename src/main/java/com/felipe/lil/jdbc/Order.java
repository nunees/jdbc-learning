package com.felipe.lil.jdbc;

import com.felipe.lil.jdbc.util.DataTransferObject;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order implements DataTransferObject {
    private long id;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private Date creationDate;
    private BigDecimal totalDue;
    private String status;
    private String salespersonFirstName;
    private String salesPersonLastName;
    private String salesPersonEmail;
    private List<OrderLine> orderLines;

    @Override
    public long getId() {
        return 0;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSalespersonFirstName() {
        return salespersonFirstName;
    }

    public void setSalespersonFirstName(String salespersonFirstName) {
        this.salespersonFirstName = salespersonFirstName;
    }

    public String getSalesPersonLastName() {
        return salesPersonLastName;
    }

    public void setSalesPersonLastName(String salesPersonLastName) {
        this.salesPersonLastName = salesPersonLastName;
    }

    public String getSalesPersonEmail() {
        return salesPersonEmail;
    }

    public void setSalesPersonEmail(String salesPersonEmail) {
        this.salesPersonEmail = salesPersonEmail;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", creationDate=" + creationDate +
                ", total_due=" + totalDue +
                ", status='" + status + '\'' +
                ", salespersonFirstName='" + salespersonFirstName + '\'' +
                ", salesPersonLastName='" + salesPersonLastName + '\'' +
                ", salesPersonEmail='" + salesPersonEmail + '\'' +
                ", orderLines=" + orderLines +
                '}';
    }
}
