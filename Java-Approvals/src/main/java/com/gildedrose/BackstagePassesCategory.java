package com.gildedrose;

public class BackstagePassesCategory implements Category {

    private final QualityManager qualityManager = new QualityManager();

    @Override
    public void handle(Item item) {
        qualityManager.incrementQuality(item);

        if (item.sellIn < 11) {
            qualityManager.incrementQuality(item);
        }

        if (item.sellIn < 6) {
            qualityManager.incrementQuality(item);
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

}
