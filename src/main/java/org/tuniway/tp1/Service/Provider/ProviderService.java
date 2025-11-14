package org.tuniway.tp1.Service.Provider;

import org.tuniway.tp1.Models.Provider;

import java.util.List;

public interface ProviderService {
    Provider findProviderByMatricule(String matricule);
    List<Provider> findProviderByService(String service);
    List<Provider> findProviderByCompany(String company);

    // standard crud
    List<Provider> getAllUsers() ;
    Provider createProvider(Provider prod);
    Provider updateProvider(Provider prod);
    void deleteProvider(String mat);
}
