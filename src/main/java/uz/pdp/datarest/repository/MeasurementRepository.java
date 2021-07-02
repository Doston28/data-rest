package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.entity.Measurement;
import uz.pdp.datarest.projection.MeasurementCustom;

@RepositoryRestResource(path = "measurement",excerptProjection = MeasurementCustom.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
}
