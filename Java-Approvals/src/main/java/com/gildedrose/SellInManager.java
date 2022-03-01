package com.gildedrose;

public class SellInManager {
    static void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }
}
