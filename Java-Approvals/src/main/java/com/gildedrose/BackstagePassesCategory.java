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

        decreaseSellIn(item);

        if (item.sellIn < 0) {
            QualityManager.invalidateQuality(item);
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

}
