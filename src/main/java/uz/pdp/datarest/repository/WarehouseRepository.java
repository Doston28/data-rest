package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.entity.Warehouse;
import uz.pdp.datarest.projection.WarehouseCustom;

@RepositoryRestResource(path = "warehouse",excerptProjection = WarehouseCustom.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
}
