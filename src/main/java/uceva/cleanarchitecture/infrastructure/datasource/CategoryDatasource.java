package uceva.cleanarchitecture.infrastructure.datasource;

import uceva.cleanarchitecture.domain.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDatasource {

    private final List<Category> categories = new ArrayList<>();

    public CategoryDatasource() {
        initCategories();
    }

    private void initCategories() {
        categories.add(new Category(1, "Lácteos", "Productos derivados de la leche como quesos, yogures y mantequilla", true));
        categories.add(new Category(2, "Carnes", "Cortes vacunos, porcinos, aves y embutidos frescos de primera calidad", true));
        categories.add(new Category(3, "Frutas", "Variedad de frutas frescas seleccionadas de temporada y cítricos", true));
        categories.add(new Category(4, "Verduras", "Hortalizas, legumbres y vegetales frescos directos del campo", true));
        categories.add(new Category(5, "Bebidas", "Jugos naturales, aguas minerales, refrescos y bebidas hidratantes", true));
    }

    public List<Category> getAll() {
        return new ArrayList<>(this.categories);
    }
}
