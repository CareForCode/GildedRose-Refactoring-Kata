package com.gildedrose;

public class QualityManager {
    public QualityManager() {
    }

    static void increment(Item item) {
        item.quality = Math.min(50, item.quality + 1);
    }

    static void decrease(Item item) {
        item.quality = Math.max(0, item.quality - 1);
    }
}
