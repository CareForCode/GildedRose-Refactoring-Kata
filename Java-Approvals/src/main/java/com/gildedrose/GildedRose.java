package com.gildedrose;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case BACKSTAGE_PASSES:
                    new BackstagePassesCategory().handle(item);
                    break;
                case SULFURAS:
                    new SulfurasCategory().handle(item);
                    break;
                case AGED_BRIE:
                    new AgedBrieCategory().handle(item);
                    break;
                default:
                    handleOrdinary(item);
                    break;
            }

        }
    }

    private void handleOrdinary(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

}
