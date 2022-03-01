package com.gildedrose;

public class OrdinaryCategory implements Category {

    @Override
    public void handle(Item item) {
        item.decreaseQuality();

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.decreaseQuality();
        }
    }

}
