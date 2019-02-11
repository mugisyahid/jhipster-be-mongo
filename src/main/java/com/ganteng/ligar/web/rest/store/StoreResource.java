package com.ganteng.ligar.web.rest.store;


import com.ganteng.ligar.service.StoreService;
import com.ganteng.ligar.service.dto.store.StoreDTO;
import com.ganteng.ligar.web.rest.util.PaginationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/store")
public class StoreResource {

    private final Logger log = LoggerFactory.getLogger(StoreResource.class);

    private StoreService storeService;

    // why needed consturctor/
    public StoreResource(StoreService storeService) {
        this.storeService = storeService;
    }

    /**
     *  get All store
     */
    @GetMapping("/")
    public ResponseEntity<List<StoreDTO>> getAllStore(Pageable pageable) {
        final Page<StoreDTO> page = storeService.getAllStore(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/store");
        log.info("TEST");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }



}
