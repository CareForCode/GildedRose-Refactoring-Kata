package com.gildedrose;

public class OrdinaryCategory implements Category {

    @Override
    public void handle(Item item) {
        decreaseQuality(item);

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    private void decreaseQuality(Item item) {
        item.quality = Math.max(0, item.quality - 1);
    }
}
