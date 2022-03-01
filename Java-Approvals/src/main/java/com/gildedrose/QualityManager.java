package com.gildedrose;

public class QualityManager {
    public QualityManager() {
    }

    void incrementQuality(Item item) {
        item.quality = Math.min(50, item.quality + 1);
    }
}
