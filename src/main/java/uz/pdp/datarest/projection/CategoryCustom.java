package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Category;

@Projection(types = Category.class)
public interface CategoryCustom {
    Integer getId();

    String getName();

    Category getParentCategory();

    boolean isActive();


}
