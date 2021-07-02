package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.entity.Category;
import uz.pdp.datarest.entity.Measurement;
import uz.pdp.datarest.entity.Product;

@Projection(types = Product.class)
public interface ProductCustom {

    Integer getId();
    String getName();
    Category getCategory();
    Attachment getPhoto();
    int getCode();
    Measurement getMeasurement();
    boolean isActive();



}
