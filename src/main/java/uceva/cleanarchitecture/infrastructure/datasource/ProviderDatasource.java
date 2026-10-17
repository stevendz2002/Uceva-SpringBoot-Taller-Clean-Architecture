package uceva.cleanarchitecture.infrastructure.datasource;

import uceva.cleanarchitecture.domain.entity.Provider;

import java.util.ArrayList;
import java.util.List;

public class ProviderDatasource {

    private final List<Provider> providers = new ArrayList<>();

    public ProviderDatasource() {
        initProviders();
    }

    private void initProviders() {
        providers.add(new Provider(1, "Distribuidora Andina S.A.S.", "contacto@distribuidoraandina.com", "+57 315 789 4512", "Cali"));
        providers.add(new Provider(2, "Lácteos del Valle Ltda.", "ventas@lacteosdelvalle.co", "+57 310 456 7890", "Tuluá"));
        providers.add(new Provider(3, "Avícola y Carnes Santa Cruz", "pedidos@carnessantacruz.com", "+57 320 654 9871", "Buga"));
        providers.add(new Provider(4, "Agrícola San Fernando E.U.", "comercial@sanfernandoagricola.com", "+57 318 234 5678", "Palmira"));
        providers.add(new Provider(5, "Logística y Suministros del Café", "servicio@suministroscafe.com", "+57 312 987 6543", "Armenia"));
    }

    public List<Provider> getAll() {
        return new ArrayList<>(this.providers);
    }
}
