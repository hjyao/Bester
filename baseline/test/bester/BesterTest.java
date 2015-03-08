package bester;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 08/03/15.
 */
public class BesterTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowNull() throws Exception{
        new Bester().bestFrom(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowEmptyRectangle() {
        new Bester().bestFrom(new Rectangle[0]);
    }

    @Test
    public void shouldIgnoreANullBestableWhenOtherValidBestablesAreGiven() {
        assertEquals(new Rectangle(3, 4), new Bester().bestFrom(new Rectangle(1, 2), null, new Rectangle(3, 4)));
    }
}
