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

        SellInManager.decreaseSellIn(item);

        if (item.sellIn < 0) {
            QualityManager.invalidateQuality(item);
        }
    }

}
