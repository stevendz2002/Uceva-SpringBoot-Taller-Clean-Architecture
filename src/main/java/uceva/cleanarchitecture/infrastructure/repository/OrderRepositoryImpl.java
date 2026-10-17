package uceva.cleanarchitecture.infrastructure.repository;

import uceva.cleanarchitecture.domain.entity.Order;
import uceva.cleanarchitecture.domain.repository.OrderRepository;
import uceva.cleanarchitecture.infrastructure.datasource.OrderDatasource;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    private final OrderDatasource orderDatasource;

    public OrderRepositoryImpl(OrderDatasource orderDatasource) {
        this.orderDatasource = orderDatasource;
    }

    @Override
    public List<Order> getAll() {
        return orderDatasource.getAll();
    }
}
