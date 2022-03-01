package com.gildedrose;

public class AgedBrieCategory implements Category {

    @Override
    public void handle(Item item) {
        QualityManager.increment(item);

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            QualityManager.increment(item);
        }
    }
}
