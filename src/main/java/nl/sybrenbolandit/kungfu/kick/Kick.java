package nl.sybrenbolandit.kungfu.kick;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Kick {

    private String name;

    public Kick(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
