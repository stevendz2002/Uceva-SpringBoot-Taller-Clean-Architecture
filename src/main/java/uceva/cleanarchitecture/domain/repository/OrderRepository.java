package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> getAll();
}
