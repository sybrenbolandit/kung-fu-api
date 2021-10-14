package nl.sybrenbolandit.kungfu.kick;

import jakarta.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class KickService {

    private static final List<Kick> KICKS = Arrays.asList(
            new Kick("Front Kick"),
            new Kick("Side Kick"),
            new Kick("Roundhouse Kick"),
            new Kick("Crescent Kick"),
            new Kick("Axe Kick")
    );

    public Kick randomKick() {
        return KICKS.get(new Random().nextInt(KICKS.size()));
    }
}
