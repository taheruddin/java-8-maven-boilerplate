import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ZeroTest {
    @Test
    public void justTest() {

        log.info("Test number {} is started.", 0);
        assertEquals(0, 0);
    }

}