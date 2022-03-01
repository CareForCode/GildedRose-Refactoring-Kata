package com.gildedrose;

public class QualityManager {
    public QualityManager() {
    }

    static void increment(Item item) {
        item.quality = Math.min(50, item.quality + 1);
    }
}
