package com.warehouse.repository;

import com.warehouse.entity.Supplier;
import com.warehouse.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
