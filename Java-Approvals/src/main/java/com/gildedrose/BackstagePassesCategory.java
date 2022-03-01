package com.gildedrose;

public class BackstagePassesCategory implements Category {

    @Override
    public void handle(Item item) {
        if (item.quality < 50) {
            incrementQuality(item);

            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void incrementQuality(Item item) {
        item.quality = Math.min(50, item.quality + 1);
    }
}
