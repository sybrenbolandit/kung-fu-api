package nl.sybrenbolandit.kungfu.kick;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/kicks")
public class KickController {

    private final KickService kickService;

    public KickController(KickService kickService) {
        this.kickService = kickService;
    }

    @Get("/random")
    public Single<Kick> randomKick() {
        return Single.just(kickService.randomKick());
    }
}
