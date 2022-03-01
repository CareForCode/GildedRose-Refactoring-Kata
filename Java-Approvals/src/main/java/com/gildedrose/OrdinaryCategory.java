package com.gildedrose;

public class OrdinaryCategory implements Category {

    @Override
    public void handle(Item item) {
        QualityManager.decreaseQuality(item);

        SellInManager.decreaseSellIn(item);

        if (SellInManager.isOutdated(item)) {
            QualityManager.decreaseQuality(item);
        }
    }

}
