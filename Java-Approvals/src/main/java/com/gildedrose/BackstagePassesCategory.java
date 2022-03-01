package com.gildedrose;

public class BackstagePassesCategory implements Category {

    @Override
    public void handle(Item item) {
        item.incrementQuality();

        if (item.sellIn < 11) {
            item.incrementQuality();
        }

        if (item.sellIn < 6) {
            item.incrementQuality();
        }

        item.decreaseSellIn();

        if (item.sellIn < 0) {
            item.invalidateQuality();
        }
    }

}
