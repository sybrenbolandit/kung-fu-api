package nl.sybrenbolandit.kungfu.kick;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Mono;

@Controller("/kicks")
public class KickController {

    private final KickService kickService;

    public KickController(KickService kickService) {
        this.kickService = kickService;
    }

    @Get("/random")
    public Mono<Kick> randomKick() {
        return Mono.just(kickService.randomKick());
    }
}
