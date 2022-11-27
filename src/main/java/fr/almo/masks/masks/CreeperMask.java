package fr.almo.masks.masks;

import fr.almo.masks.utils.descriptions.ItemsDatas;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

public class CreeperMask {

    private final ItemStack mCreeperMask;
    CustomHead ch = new CustomHead();

    public CreeperMask(){

        List<String> lores = Arrays.asList(ItemsDatas.LINE_BREAK.getItemData(), ItemsDatas.CREEPER_MASK_LORE_1.getItemData(), ItemsDatas.CREEPER_MASK_LORE_2.getItemData(), ItemsDatas.CREEPER_MASK_LORE_3.getItemData(), ItemsDatas.CREEPER_MASK_LORE_4.getItemData(), ItemsDatas.LINE_BREAK.getItemData(), ItemsDatas.LEGENDARY_ITEM.getItemData());
        String url = "54bf0c695f94c1af30dbf5039d1f5b9cd317db29fc10517e9a7baa07cba3195f";

        this.mCreeperMask = new ItemStack(ch.getCustomHead(ItemsDatas.CREEPER_MASK_DISPLAYNAME.getItemData(), lores, 1, url));
    }

    public ItemStack getCreeperMask(){
        return this.mCreeperMask;
    }
}
