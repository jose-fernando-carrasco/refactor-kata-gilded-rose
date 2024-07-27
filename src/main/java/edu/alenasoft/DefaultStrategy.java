package edu.alenasoft;

public class DefaultStrategy implements QualityStrategy {

    private int singleQualityFactor = 1;
    private int doubleQualityFactor = 2;

    @Override
    public void updateQualityStrategy(Item item) {
        if (item.getSellIn() > 0 && item.getQuality() < 50) {
            item.setQuality(item.getQuality() - singleQualityFactor);
        }

        if (item.getSellIn() <= 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - doubleQualityFactor);
        }
    }

    @Override
    public void updateSellInStrategy(Item item) {
        item.setSellIn(item.getSellIn() - singleQualityFactor);
    }
}
