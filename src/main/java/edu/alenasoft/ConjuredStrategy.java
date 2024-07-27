package edu.alenasoft;

public class ConjuredStrategy implements QualityStrategy {
    private int singleQualityFactor = 2;
    private int doubleQualityFactor = 4;

    @Override
    public void updateQualityStrategy(Item item) {
        if (item.getSellIn() > 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - singleQualityFactor);
        }

        if (item.getSellIn() <= 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - doubleQualityFactor);
        }

        if (item.getQuality() < 0) {
            item.setQuality(0);
        }
    }

    @Override
    public void updateSellInStrategy(Item item) {
        item.setSellIn((item.getSellIn() - 1));
    }
}
