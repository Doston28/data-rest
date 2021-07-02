package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.entity.Output;
import uz.pdp.datarest.projection.OutputCustom;

@RepositoryRestResource(path = "output",excerptProjection = OutputCustom.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
