# Clean Architecture en SpringBoot - Taller 6

**UCEVA - Arquitectura de Software**  
**Docente:** Jesús David Mejía Vergara  
**Integrante 1:** Jhon Edward Steven Loaiza Diaz (Módulo: `categories`)  

---

## Estructura General del Proyecto

```
src/main/java/uceva/cleanarchitecture
│
├── domain
│   ├── entity/
│   │   ├── User.java
│   │   ├── Product.java
│   │   └── Category.java
│   │
│   └── repository/
│       ├── UserRepository.java
│       ├── ProductRepository.java
│       └── CategoryRepository.java
│
├── application
│   └── usecase/
│       ├── GetAllUsersUseCase.java
│       ├── GetAllProductsUseCase.java
│       └── GetAllCategoriesUseCase.java
│
├── infrastructure
│   ├── controller/
│   │   ├── UserController.java
│   │   ├── ProductController.java
│   │   └── CategoryController.java
│   │
│   ├── repository/
│   │   ├── UserRepositoryImpl.java
│   │   ├── ProductRepositoryImpl.java
│   │   └── CategoryRepositoryImpl.java
│   │
│   └── datasource/
│       ├── UserDatasource.java
│       ├── ProductDatasource.java
│       └── CategoryDatasource.java
│
├── config
│   ├── AppConfig.java
│   └── CorsConfig.java
│
└── UcevaSpringBootTallerCleanArchitectureApplication.java
```

---

## Módulo `categories`

1. **Dominio:** Entidad `Category` con identificador `Integer id`, campos de negocio `{ name, description, active }` y la interfaz `CategoryRepository` con método `List<Category> getAll();`.
2. **Aplicación:** `GetAllCategoriesUseCase` orquestando la regla de negocio y delegando la obtención de datos a `CategoryRepository`.
3. **Infraestructura:**
   - `CategoryDatasource`: Provee un conjunto estático de 5 categorías realistas en memoria.
   - `CategoryRepositoryImpl`: Implementa `CategoryRepository` e inyecta `CategoryDatasource`.
4. **Controlador REST y Swagger:**
   - `CategoryController`: Mapeado en `@RequestMapping("/categories")` con anotaciones OpenAPI `@Tag`, `@Operation` y `@ApiResponses`.
5. **Inyección de Dependencias (`AppConfig.java`):**
   - Beans registrados de forma aditiva: `categoryDatasource`, `categoryRepository`, `getAllCategoriesUseCase` y `customOpenAPI`.

---

## Funcionamiento del Backend

### Ejecutar Backend
```bash
./gradlew bootRun
```

### URLs de Consumo y Swagger UI
```
http://localhost:8080/api/swagger-ui/index.html
http://localhost:8080/api/users/{countUsers}
http://localhost:8080/api/products/{countProducts}
http://localhost:8080/api/categories
```