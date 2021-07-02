package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest.entity.User;
import uz.pdp.datarest.projection.UserCustum;

@RepositoryRestResource(path = "users",excerptProjection = UserCustum.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
