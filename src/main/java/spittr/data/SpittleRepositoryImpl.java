package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    private List<Spittle> spittles;

    public List<Spittle> findSpittles (long max,int count) {
        spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }

    @Override
    public Spittle findOne(long id) {
        return new Spittle("Hellow", new Date());
    }

    public SpittleRepositoryImpl() {
        findSpittles(Long.MAX_VALUE, 20);
        }
}
