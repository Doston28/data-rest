package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierCustom {

    Integer getId();
    String getName();
    boolean isActive();
    String getPhoneNumber();
}
