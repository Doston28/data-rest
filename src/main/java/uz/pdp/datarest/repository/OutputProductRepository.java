package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.entity.OutputProduct;

public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
