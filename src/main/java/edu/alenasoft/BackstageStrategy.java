package edu.alenasoft;

public class BackstageStrategy implements QualityStrategy{
    @Override
    public void updateStrategy(Item item) {
        int factor = 0;
        if (item.getQuality() < 50) {
            factor++;

            if (item.getSellIn() < 11 ) {
                factor++;
            }

            if (item.getSellIn() < 6 ) {
                factor++;
            }

            item.setQuality(item.getQuality() + factor);

            if (item.getSellIn() == 0 ) {
                item.setQuality(0);
            }
        }
    }
}
