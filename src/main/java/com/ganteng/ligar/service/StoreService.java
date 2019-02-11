package com.ganteng.ligar.service;


import com.ganteng.ligar.config.Constants;
import com.ganteng.ligar.repository.StoreRepository;
import com.ganteng.ligar.service.dto.UserDTO;
import com.ganteng.ligar.service.dto.store.StoreDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    private final Logger log = LoggerFactory.getLogger(StoreService.class);

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Page<StoreDTO> getAllStore(Pageable pageable) {
        return storeRepository.findAll(pageable).map(StoreDTO::new);
    }

}
