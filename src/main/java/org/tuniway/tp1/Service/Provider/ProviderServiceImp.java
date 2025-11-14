package org.tuniway.tp1.Service.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tuniway.tp1.Models.Provider;
import org.tuniway.tp1.Repository.ProviderRepository;

import java.util.List;

@Service
public class ProviderServiceImp implements ProviderService {
    @Autowired
    private ProviderRepository providerRepository ;

    @Override
    public Provider findProviderByMatricule(String matricule){return providerRepository.find(matricule);}

    @Override
    public List<Provider> findProviderByService(String service){return providerRepository.find(service);}

    @Override
    public List<Provider> findProviderByCompany(String company){return providerRepository.find(company);}

    @Override
    public List<Provider> getAllUsers(){return providerRepository.findAll();}

    @Override
    public Provider createProvider(Provider prod){return providerRepository.save(prod);}

    @Override
    public Provider updateProvider(Provider prod) {return providerRepository.saveAndFlush(prod);}

    @Override
    public void deleteProvider(String mat) {providerRepository.delete(mat);}
}
