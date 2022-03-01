package com.gildedrose;

public class AgedBrieCategory implements Category {

    @Override
    public void handle(Item item) {

        SellInManager.decreaseSellIn(item);

        QualityManager.incrementQuality(item);

        if (SellInManager.isOutdated(item)) {
            QualityManager.incrementQuality(item);
        }
    }
}
