package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> getAll();
}
