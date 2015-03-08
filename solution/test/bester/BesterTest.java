package bester;

import org.junit.Test;

import java.util.Currency;

import static junit.framework.Assert.assertEquals;

public class BesterTest {
    @Test
    public void shouldFindTheBestOfManySimilarBestables() throws Exception {
        assertEquals(new Rectangle(5, 5), Bester.bestFrom(new Rectangle(2, 3), new Rectangle(1, 1), new Rectangle(5, 5)));
    }

    @Test
    public void shouldFindTheBestOfOneBestable() throws Exception {
        assertEquals(new Rectangle(2,3), Bester.bestFrom(new Rectangle(2, 3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowANullBestable() throws Exception {
        Bester.bestFrom(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowAnEmptyListOfBestables() throws Exception {
        Bester.bestFrom(new Rectangle[0]);
    }

    @Test
    public void shouldIgnoreANullBestableWhenOtherValidBestablesAreGiven() throws Exception {
        assertEquals(new Rectangle(2, 2), Bester.bestFrom(new Rectangle(2, 2), null, new Rectangle(1, 2)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void bestShouldNotAllowDisparateBestables() throws Exception {
        assertEquals(new Rectangle(2, 2), Bester.bestFrom(new Rectangle(2, 2), new Cookie(5)));
    }
}
