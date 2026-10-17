package uceva.cleanarchitecture.infrastructure.datasource;

import uceva.cleanarchitecture.domain.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDatasource {

    private final List<Order> orders = new ArrayList<>();

    public OrderDatasource() {
        orders.add(new Order(1, "ORD-2026-001", "Andres Felipe Saavedra", 155000.0, "COMPLETED"));
        orders.add(new Order(2, "ORD-2026-002", "Jhon Edward Loaiza", 320000.0, "PROCESSING"));
        orders.add(new Order(3, "ORD-2026-003", "Jose Sebastian Arenas", 89500.0, "PENDING"));
        orders.add(new Order(4, "ORD-2026-004", "Jesus David Mejia", 450000.0, "DELIVERED"));
        orders.add(new Order(5, "ORD-2026-005", "Maria Camila Restrepo", 210000.0, "CANCELLED"));
    }

    public List<Order> getAll() {
        return new ArrayList<>(this.orders);
    }
}
