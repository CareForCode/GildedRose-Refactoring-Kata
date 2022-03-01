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
            Category category = getCategory(item);
            category.handle(item);
        }
    }

    private Category getCategory(Item item) {
        switch (item.name) {
            case BACKSTAGE_PASSES:
                return new BackstagePassesCategory();
            case SULFURAS:
                return new SulfurasCategory();
            case AGED_BRIE:
                return new AgedBrieCategory();
            default:
                return new OrdinaryCategory();
        }
    }

}
