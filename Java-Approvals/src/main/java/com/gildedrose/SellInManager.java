package com.gildedrose;

public class SellInManager {
    static void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    static boolean isOutdated(Item item) {
        return item.sellIn < 0;
    }

    static boolean isSellInBeneath(Item item, int threshold) {
        return item.sellIn < threshold;
    }
}
