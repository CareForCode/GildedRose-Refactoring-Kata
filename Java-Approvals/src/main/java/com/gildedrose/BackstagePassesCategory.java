package com.gildedrose;

public class BackstagePassesCategory implements Category {

    @Override
    public void handle(Item item) {
        QualityManager.increment(item);

        if (item.sellIn < 11) {
            QualityManager.increment(item);
        }

        if (item.sellIn < 6) {
            QualityManager.increment(item);
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

}
