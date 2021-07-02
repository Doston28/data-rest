package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Client;
import uz.pdp.datarest.entity.Currency;
import uz.pdp.datarest.entity.Output;
import uz.pdp.datarest.entity.Warehouse;

import java.sql.Date;

@Projection(types = Output.class)
public interface OutputCustom {

    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Currency getCurrency();
    String getFactureNumber();
    int getCode();
    Client getClient();

}
