package edu.alenasoft;

public class LegendaryStrategy implements QualityStrategy {

    @Override
    public void updateQualityStrategy(Item item) { }

    @Override
    public void updateSellInStrategy(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }
}
