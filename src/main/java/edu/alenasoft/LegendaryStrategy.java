package edu.alenasoft;

public class LegendaryStrategy implements QualityStrategy {

    @Override
    public void updateQualityStrategy(Item item) {
        // nada
    }

    @Override
    public void updateSellInStrategy(Item item) {
        if (item.getSellIn() > 0) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }
}
