package guru.springframework.sdjpainheritence.repositories;

import guru.springframework.sdjpainheritence.domain.table_per_class.Mammal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MammalRepository extends JpaRepository<Mammal, Long> {
}