# Clean Architecture en SpringBoot - Taller 6

**UCEVA - Arquitectura de Software**  
**Docente:** Jesús David Mejía Vergara  
**Integrante 1:** Jhon Edward Steven Loaiza Diaz (Módulo: `categories`)  
**Integrante 2:** Andrés Felipe Saavedra (Módulo: `orders`)  

---

## Estructura General del Proyecto

```
src/main/java/uceva/cleanarchitecture
│
├── domain
│   ├── entity/
│   │   ├── User.java
│   │   ├── Product.java
│   │   ├── Category.java
│   │   └── Order.java
│   │
│   └── repository/
│       ├── UserRepository.java
│       ├── ProductRepository.java
│       ├── CategoryRepository.java
│       └── OrderRepository.java
│
├── application
│   └── usecase/
│       ├── GetAllUsersUseCase.java
│       ├── GetAllProductsUseCase.java
│       ├── GetAllCategoriesUseCase.java
│       └── GetAllOrdersUseCase.java
│
├── infrastructure
│   ├── controller/
│   │   ├── UserController.java
│   │   ├── ProductController.java
│   │   ├── CategoryController.java
│   │   └── OrderController.java
│   │
│   ├── repository/
│   │   ├── UserRepositoryImpl.java
│   │   ├── ProductRepositoryImpl.java
│   │   ├── CategoryRepositoryImpl.java
│   │   └── OrderRepositoryImpl.java
│   │
│   └── datasource/
│       ├── UserDatasource.java
│       ├── ProductDatasource.java
│       ├── CategoryDatasource.java
│       └── OrderDatasource.java
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

## Módulo `orders`

1. **Dominio:** Entidad `Order` con identificador `Integer id`, campos de negocio `{ orderNumber, customerName, total, status }` y la interfaz `OrderRepository` con método `List<Order> getAll();`.
2. **Aplicación:** `GetAllOrdersUseCase` orquestando la regla de negocio y delegando la obtención de datos a `OrderRepository`.
3. **Infraestructura:**
   - `OrderDatasource`: Provee un conjunto estático de 5 órdenes realistas en memoria.
   - `OrderRepositoryImpl`: Implementa `OrderRepository` e inyecta `OrderDatasource`.
4. **Controlador REST y Swagger:**
   - `OrderController`: Mapeado en `@RequestMapping("/orders")` con anotaciones OpenAPI `@Tag`, `@Operation` y `@ApiResponses`.
5. **Inyección de Dependencias (`AppConfig.java`):**
   - Beans registrados de forma aditiva: `orderDatasource`, `orderRepository` y `getAllOrdersUseCase`.

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
http://localhost:8080/api/orders
```