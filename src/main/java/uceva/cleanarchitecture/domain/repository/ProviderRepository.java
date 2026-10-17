package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Provider;

import java.util.List;

public interface ProviderRepository {
    List<Provider> getAll();
}
