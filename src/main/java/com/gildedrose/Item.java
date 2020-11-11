package com.gildedrose;

import com.gildedrose.items.BacktagePass;

public class Item {

    public String name;
    public int sellIn;
    public int quality;


    static public Item createBackstagePass(int sellIn,int quality){
       return new BacktagePass(sellIn, quality);
    }



    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected boolean isBackstagePass() {
        /*
            https://blog.csdn.net/qq_42499188/article/details/85193886 迪米特法则
            return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
            item.name 违反了迪米特法则
         */
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    protected boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    protected boolean isAgedbrie() {
        return name.equals("Aged Brie");
    }

    protected void passOneDay() {
        updateSellInDays();
        upadeQulity();

        if (isExpired()) {
            updateQulityAfterExpiration();
        }
    }

    private void upadeQulity() {
        if (!isAgedbrie()
                && !isBackstagePass()) {
            if (quality > 0) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;
                if (isBackstagePass()) {
                    if (sellIn < 10) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < 5) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        }
    }

    private void updateQulityAfterExpiration() {
        if (!isAgedbrie()) {
            if (!isBackstagePass()) {
                if (quality > 0) {
                    if (!isSulfuras()) {
                        quality = quality - 1;
                    }
                }
            } else {
                quality = 0;
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    private void updateSellInDays() {
        if (!isSulfuras()) {
            sellIn = sellIn - 1;
        }
    }
}
