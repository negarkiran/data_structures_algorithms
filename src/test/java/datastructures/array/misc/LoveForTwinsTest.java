package datastructures.array.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoveForTwinsTest {

    private LoveForTwins loveForTwins = new LoveForTwins();

    @Test
    public void shouldReturnNumberOfArticlesToBuy() {
       int[] articles = {4,78,16,6,78,16,7,78,16,3,78,16};
       assertEquals(8, loveForTwins.numberOfArticles(articles));
    }

}