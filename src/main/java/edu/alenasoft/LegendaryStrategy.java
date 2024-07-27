package edu.alenasoft;

public class LegendaryStrategy implements QualityStrategy{

    @Override
    public void updateStrategy(Item item) {
        if (item.getSellIn() > 0) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }
}
