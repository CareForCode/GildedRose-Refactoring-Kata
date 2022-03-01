package com.gildedrose;

public class QualityManager {
    public QualityManager() {
    }

    static void incrementQuality(Item item) {
        item.quality = Math.min(50, item.quality + 1);
    }

    static void decreaseQuality(Item item) {
        item.quality = Math.max(0, item.quality - 1);
    }

    static void invalidateQuality(Item item) {
        item.quality = 0;
    }
}
