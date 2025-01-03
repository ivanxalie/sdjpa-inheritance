package guru.springframework.sdjpainheritence.bootstrap;

import guru.springframework.sdjpainheritence.domain.joins.ElectricGuitar;
import guru.springframework.sdjpainheritence.domain.joins.ElectricGuitarRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Bootstrap {
    private final ElectricGuitarRepository repository;

    @PostConstruct
    void loadData() {
        ElectricGuitar guitar = new ElectricGuitar();
        guitar.setNumberOfStrings(6);
        guitar.setNumberOfPickups(2);
        repository.save(guitar);
    }
}
