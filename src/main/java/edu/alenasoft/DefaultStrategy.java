package edu.alenasoft;

public class DefaultStrategy implements QualityStrategy {
    @Override
    public void updateQualityStrategy(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }

        if (item.getSellIn() <= 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    @Override
    public void updateSellInStrategy(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }
}
