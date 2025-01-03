package guru.springframework.sdjpainheritence.domain.table_per_class;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString
public class Mammal {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private Integer bodyTemp;
    private String species;
}
