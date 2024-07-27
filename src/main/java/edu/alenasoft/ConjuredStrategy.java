package edu.alenasoft;

public class ConjuredStrategy implements QualityStrategy{
    @Override
    public void updateStrategy(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() -2);
            if(item.getQuality() < 0){
                item.setQuality(0);
            }
        }
        item.setSellIn((item.getSellIn() -1));
        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() -2);
            if(item.getQuality() < 0){
                item.setQuality(0);
            }
        }
    }
}
