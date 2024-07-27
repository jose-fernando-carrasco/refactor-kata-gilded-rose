package edu.alenasoft;

public class AgedStrategy implements QualityStrategy{


    @Override
    public void updateStrategy(Item item) {
        if (item.getSellIn() > 0 && item.getQuality() < 50) {
            item.setSellIn(item.getSellIn() - 1);
            item.setQuality(item.getQuality() + 1);
        }

        if (item.getSellIn() == 0) {
            item.setQuality(item.getQuality() - 2);
        }

    }
}
