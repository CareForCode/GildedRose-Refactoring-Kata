package com.gildedrose;

public class BackstagePassesCategory implements Category {

    @Override
    public void handle(Item item) {
        QualityManager.incrementQuality(item);

        if (SellInManager.isSellInBeneath(item, 11)) {
            QualityManager.incrementQuality(item);
        }

        if (SellInManager.isSellInBeneath(item, 6)) {
            QualityManager.incrementQuality(item);
        }

        SellInManager.decreaseSellIn(item);

        if (SellInManager.isOutdated(item)) {
            QualityManager.invalidateQuality(item);
        }
    }

}
