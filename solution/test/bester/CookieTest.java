package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CookieTest {
    @Test
    public void bestShouldReturnTheBestOfTwoCookies() throws Exception {
        assertEquals(new Cookie(10), Bester.bestFrom(new Cookie(9), new Cookie(10)));
    }
}
