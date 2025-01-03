package guru.springframework.sdjpainheritence.domain.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("truck")
public class Truck extends Vehicle {
    private Integer payload;
}
