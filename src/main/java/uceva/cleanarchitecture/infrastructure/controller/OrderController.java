package uceva.cleanarchitecture.infrastructure.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllOrdersUseCase;
import uceva.cleanarchitecture.domain.entity.Order;

import java.util.List;

@RestController
@RequestMapping("/orders")
@Tag(name = "Orders", description = "Operaciones relacionadas con las órdenes de compra")
public class OrderController {

    private final GetAllOrdersUseCase getAllOrdersUseCase;

    public OrderController(GetAllOrdersUseCase getAllOrdersUseCase) {
        this.getAllOrdersUseCase = getAllOrdersUseCase;
    }

    @GetMapping
    @Operation(summary = "Obtener todas las órdenes", description = "Retorna el listado completo de órdenes registradas en el sistema")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listado de órdenes obtenido exitosamente",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Order.class)))),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = @Content)
    })
    public List<Order> getAll() {
        return getAllOrdersUseCase.execute();
    }
}
