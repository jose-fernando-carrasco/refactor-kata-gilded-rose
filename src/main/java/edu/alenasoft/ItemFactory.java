package edu.alenasoft;

public class ItemFactory {
    public static QualityStrategy getItemStrategy(Item item) {
        QualityStrategy qualityStrategy = new DefaultStrategy();

        if(item.getName().equals("Aged Brie"))
        {
            qualityStrategy = new AgedStrategy();
        }

        if(item.getName().equals("Sulfuras, Hand of Ragnaros"))
        {
            qualityStrategy = new LegendaryStrategy();
        }

        if(item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))
        {
            qualityStrategy = new BackstageStrategy();
        }

        if(item.getName().equals("Conjured Mana Cake"))
        {
            qualityStrategy = new ConjuredStrategy();
        }

        return  qualityStrategy;
    }
}
