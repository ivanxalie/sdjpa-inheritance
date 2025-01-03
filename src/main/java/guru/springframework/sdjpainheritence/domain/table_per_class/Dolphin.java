package guru.springframework.sdjpainheritence.domain.table_per_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
public class Dolphin extends Mammal {
    private Boolean hasSpots;
}