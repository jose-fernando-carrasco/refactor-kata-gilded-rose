package edu.alenasoft;

public class BackstageStrategy implements QualityStrategy {
    private int singleQualityFactor = 1;
    private int doubleQualityFactor = 2;
    private int tripleQualityFactor = 3;

    @Override
    public void updateQualityStrategy(Item item) {
        int factor = 0;
        if (item.getSellIn() > 0 && item.getQuality() < 50) {
            factor = singleQualityFactor;

            if (item.getSellIn() < 11) {
                factor = doubleQualityFactor;
            }

            if (item.getSellIn() < 6) {
                factor = tripleQualityFactor;
            }

            item.setQuality(item.getQuality() + factor);
        }

        if (item.getSellIn() <= 0) {
            item.setQuality(0);
        }
    }

    @Override
    public void updateSellInStrategy(Item item) {
        item.setSellIn(item.getSellIn() - singleQualityFactor);
    }
}
