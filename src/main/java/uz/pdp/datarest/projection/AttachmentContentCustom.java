package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentCustom {
    Integer getId();
    byte[] getBytes();
    Attachment getAttachment();
}
