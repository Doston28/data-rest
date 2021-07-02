package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementCustom {

    Integer getId();

    String getName();

    boolean isActive();
}
