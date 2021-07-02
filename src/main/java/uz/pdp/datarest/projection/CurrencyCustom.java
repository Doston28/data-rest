package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyCustom {
    Integer getId();

    String getName();

    boolean isActive();


}
