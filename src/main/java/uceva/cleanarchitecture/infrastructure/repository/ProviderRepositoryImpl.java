package uceva.cleanarchitecture.infrastructure.repository;

import uceva.cleanarchitecture.domain.entity.Provider;
import uceva.cleanarchitecture.domain.repository.ProviderRepository;
import uceva.cleanarchitecture.infrastructure.datasource.ProviderDatasource;

import java.util.List;

public class ProviderRepositoryImpl implements ProviderRepository {

    private final ProviderDatasource providerDatasource;

    public ProviderRepositoryImpl(ProviderDatasource providerDatasource) {
        this.providerDatasource = providerDatasource;
    }

    @Override
    public List<Provider> getAll() {
        return providerDatasource.getAll();
    }
}
