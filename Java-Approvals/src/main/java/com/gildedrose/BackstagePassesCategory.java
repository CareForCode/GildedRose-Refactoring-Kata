package com.gildedrose;

public class BackstagePassesCategory implements Category {

    @Override
    public void handle(Item item) {
        QualityManager.incrementQuality(item);

        if (item.sellIn < 11) {
            QualityManager.incrementQuality(item);
        }

        if (item.sellIn < 6) {
            QualityManager.incrementQuality(item);
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

}
