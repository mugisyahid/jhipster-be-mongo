package com.ganteng.ligar.repository;

import com.ganteng.ligar.domain.store.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StoreRepository extends MongoRepository<Store, String> {

    Optional<Store> findByStoreName(String storeName);
    Optional<Store> findByStoreOwner(String storeOwner);

    Page<Store> findAll(Pageable pageable);
}
