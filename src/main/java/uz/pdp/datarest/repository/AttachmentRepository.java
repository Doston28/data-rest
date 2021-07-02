package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.projection.AttachmentCustom;

@RepositoryRestResource(path = "attachment",excerptProjection = AttachmentCustom.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
