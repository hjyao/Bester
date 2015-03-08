package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 08/03/15.
 */
public class CookieTest {
    @Test
    public void shouldReturnBestCookieGivenThreeCookies() {
        assertEquals(new Cookie(4), new Bester().bestFrom(new Cookie(1), new Cookie(4), new Cookie(2)));
    }
}
