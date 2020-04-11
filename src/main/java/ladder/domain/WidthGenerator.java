package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class WidthGenerator {
    private final int personCount;

    public WidthGenerator(int personCount) {
        this.personCount = personCount;
    }

    public List<Boolean> generate() {
        List<Boolean> lines = new ArrayList<>();
        for (int line = 0, maxLine = personCount - 1; line < maxLine; line++) {
            lines.add(Math.round(Math.random()) < 0.5);
        }
        return lines;
    }
}
