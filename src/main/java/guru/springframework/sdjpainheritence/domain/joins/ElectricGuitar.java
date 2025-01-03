package guru.springframework.sdjpainheritence.domain.joins;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ElectricGuitar extends Guitar {
    private Integer numberOfPickups;
}
