package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.User;
import uz.pdp.datarest.entity.Warehouse;

import java.util.List;

@Projection(types = User.class)
public interface UserCustum {

    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    int getCode();
    String getPassword();
    boolean isActive();
    List<Warehouse> getWarehouse();

}
