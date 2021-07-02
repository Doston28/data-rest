package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest.entity.Attachment;
import uz.pdp.datarest.entity.Currency;
import uz.pdp.datarest.projection.CurrencyCustom;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyCustom.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
