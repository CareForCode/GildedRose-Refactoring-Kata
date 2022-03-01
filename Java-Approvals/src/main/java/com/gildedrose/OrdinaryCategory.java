package com.gildedrose;

public class OrdinaryCategory implements Category {

    @Override
    public void handle(Item item) {
        QualityManager.decreaseQuality(item);

        SellInManager.decreaseSellIn(item);

        if (item.sellIn < 0) {
            QualityManager.decreaseQuality(item);
        }
    }

}
