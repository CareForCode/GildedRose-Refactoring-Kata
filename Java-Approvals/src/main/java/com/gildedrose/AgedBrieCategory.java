package com.gildedrose;

public class AgedBrieCategory implements Category {

    @Override
    public void handle(Item item) {

        item.sellIn = item.sellIn - 1;

        item.incrementQuality();

        if (item.sellIn < 0) {
            item.incrementQuality();
        }
    }
}
