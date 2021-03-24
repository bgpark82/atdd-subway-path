package nextstep.subway.path;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    @GetMapping("/paths")
    public ResponseEntity findShortestPath() {
        return ResponseEntity.ok().build();
    }
}