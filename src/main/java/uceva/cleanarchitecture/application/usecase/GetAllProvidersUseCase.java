package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Provider;
import uceva.cleanarchitecture.domain.repository.ProviderRepository;

import java.util.List;

public class GetAllProvidersUseCase {

    private final ProviderRepository providerRepository;

    public GetAllProvidersUseCase(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public List<Provider> execute() {
        return providerRepository.getAll();
    }
}
