package uceva.cleanarchitecture.domain.entity;

public class Order {
    public Integer id;
    public String orderNumber;
    public String customerName;
    public Double total;
    public String status;

    public Order() {
    }

    public Order(Integer id, String orderNumber, String customerName, Double total, String status) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.total = total;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
