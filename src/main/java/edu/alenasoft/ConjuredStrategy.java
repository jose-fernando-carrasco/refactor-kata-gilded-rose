package edu.alenasoft;

public class ConjuredStrategy implements QualityStrategy {
    @Override
    public void updateQualityStrategy(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 2);
            if (item.getQuality() < 0) {
                item.setQuality(0);
            }
        }

        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 2);
            if (item.getQuality() < 0) {
                item.setQuality(0);
            }
        }
    }

    @Override
    public void updateSellInStrategy(Item item) {
        item.setSellIn((item.getSellIn() - 1));
    }
}
