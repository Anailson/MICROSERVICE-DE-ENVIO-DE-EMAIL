package msapi.microserviceemail.repositories;

import msapi.microserviceemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{
}
