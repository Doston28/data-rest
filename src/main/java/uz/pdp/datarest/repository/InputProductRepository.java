package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.entity.InputProduct;

public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
