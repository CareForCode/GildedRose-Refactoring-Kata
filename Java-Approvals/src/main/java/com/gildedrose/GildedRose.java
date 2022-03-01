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
            Category category;
            switch (item.name) {
                case BACKSTAGE_PASSES:
                    category = new BackstagePassesCategory();
                    break;
                case SULFURAS:
                    category = new SulfurasCategory();
                    break;
                case AGED_BRIE:
                    category = new AgedBrieCategory();
                    break;
                default:
                    category = new OrdinaryCategory();
                    break;
            }
            category.handle(item);
        }
    }

}
