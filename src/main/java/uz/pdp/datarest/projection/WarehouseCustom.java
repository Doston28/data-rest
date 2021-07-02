package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseCustom {

    Integer getId();

    String getName();

    boolean isActive();

}
