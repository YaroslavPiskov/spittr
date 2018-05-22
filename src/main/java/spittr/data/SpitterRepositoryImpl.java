package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class SpitterRepositoryImpl implements SpitterRepository {
    private List<Spitter> spitterList = new ArrayList<>();

    @Override
    public Spitter save(Spitter spitter) {
        spitterList.add(spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        Optional<Spitter> spitter = spitterList.stream().filter(v -> username.equals(v.getUsername())).findAny();
        return spitter.get();
    }
}
