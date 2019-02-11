package com.ganteng.ligar.service.dto.store;

import com.ganteng.ligar.domain.store.Store;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Size;

public class StoreDTO {

    private String id;

    @Size(max = 50)
    @Field("name")
    private String storeName;

    @Size(max = 50)
    @Field("user_id")
    private String storeOwner;

    public StoreDTO() {
        // Empty constructor needed for Jackson.
    }
    public StoreDTO(Store store) {
        this.id = store.getId();
        this.storeName = store.getStoreName();
        this.storeOwner = store.getStoreOwner();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(String storeOwner) {
        this.storeOwner = storeOwner;
    }
}
