package fr.almo.masks.masks;

import fr.almo.masks.utils.descriptions.ItemsDatas;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

public class GhastMask {

    private final ItemStack mGhastMask;
    CustomHead ch = new CustomHead();

    public GhastMask(){

        List<String> lores = Arrays.asList(ItemsDatas.LINE_BREAK.getItemData(), ItemsDatas.GHAST_MASK_LORE_1.getItemData(), ItemsDatas.GHAST_MASK_LORE_2.getItemData(), ItemsDatas.GHAST_MASK_LORE_3.getItemData(), ItemsDatas.LINE_BREAK.getItemData(), ItemsDatas.LEGENDARY_ITEM.getItemData());
        String url = "92e6b5e9b5e6ba60d78381460fd9d2788ab340ce3cc81e8c47014df7f6e35";

        this.mGhastMask = new ItemStack(ch.getCustomHead(ItemsDatas.GHAST_MASK_DISPLAYNAME.getItemData(), lores, 1, url));
    }

    public ItemStack getGhastMask(){
        return this.mGhastMask;
    }
}