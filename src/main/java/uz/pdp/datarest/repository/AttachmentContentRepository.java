package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest.entity.AttachmentContent;
import uz.pdp.datarest.projection.AttachmentContentCustom;

@RepositoryRestResource(path = "attachmentContent",excerptProjection = AttachmentContentCustom.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
