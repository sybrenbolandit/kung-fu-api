package nl.sybrenbolandit.kungfu.kick;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/kicks")
public class KickController {

    private final KickService kickService;

    public KickController(KickService kickService) {
        this.kickService = kickService;
    }

    @Get("/random")
    public Kick randomKick() {
        return kickService.randomKick();
    }
}
