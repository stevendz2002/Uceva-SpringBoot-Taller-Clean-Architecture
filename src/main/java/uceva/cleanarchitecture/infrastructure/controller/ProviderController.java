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
import uceva.cleanarchitecture.application.usecase.GetAllProvidersUseCase;
import uceva.cleanarchitecture.domain.entity.Provider;

import java.util.List;

@RestController
@RequestMapping("/providers")
@Tag(name = "Proveedores", description = "Endpoints para la gestión y consulta de proveedores de productos y servicios")
public class ProviderController {

    private final GetAllProvidersUseCase getAllProvidersUseCase;

    public ProviderController(GetAllProvidersUseCase getAllProvidersUseCase) {
        this.getAllProvidersUseCase = getAllProvidersUseCase;
    }

    @GetMapping
    @Operation(
        summary = "Obtener todos los proveedores",
        description = "Retorna la lista completa de proveedores registrados en el sistema"
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "Lista de proveedores obtenida exitosamente",
            content = @Content(
                mediaType = "application/json",
                array = @ArraySchema(schema = @Schema(implementation = Provider.class))
            )
        )
    })
    public List<Provider> getAll() {
        return getAllProvidersUseCase.execute();
    }
}
