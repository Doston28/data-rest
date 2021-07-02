package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentCustom {
    Integer getId();
    String getName();
    long getSize();
    String getContentType();

}
