package org.tuniway.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tuniway.tp1.Models.Provider;

import java.util.List;

@Repository
 public interface ProviderRepository extends JpaRepository<Provider , Long> {
   Provider findProviderByMatricule(String matricule);
   List<Provider> findProviderByService(String service);
   List<Provider> findProviderByCompany(String company);

    // standard crud
    List<Provider> getAllUsers() ;
    Provider createProvider(Provider prod);
    Provider updateProvider(Provider prod);
    void deleteProvider(String mat);
}
