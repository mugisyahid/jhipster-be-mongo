package com.ganteng.ligar.domain.store;


import com.ganteng.ligar.domain.AbstractAuditingEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;

@org.springframework.data.mongodb.core.mapping.Document(collection = "store")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "store")
public class Store extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    @Size(max = 50)
    @Field("name")
    private String storeName;

    @Size(max = 50)
    @Field("user_id")
    private String storeOwner;


    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Store store = (Store) o;

        if (id != null ? !id.equals(store.id) : store.id != null) return false;
        return storeName != null ? storeName.equals(store.storeName) : store.storeName == null;
    }

    @Override
    public String toString() {
        return "Store{" +
            "id='" + id + '\'' +
            ", storeName='" + storeName + '\'' +
            '}';
    }
}
