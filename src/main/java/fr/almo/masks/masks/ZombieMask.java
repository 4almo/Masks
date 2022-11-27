package fr.almo.masks.masks;

import fr.almo.masks.utils.descriptions.ItemsDatas;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

public class ZombieMask {

    private final ItemStack mZombieMask;
    CustomHead ch = new CustomHead();

    public ZombieMask(){

        List<String> lores = Arrays.asList(ItemsDatas.LINE_BREAK.getItemData(), ItemsDatas.ZOMBIE_MASK_LORE_1.getItemData(), ItemsDatas.ZOMBIE_MASK_LORE_2.getItemData(), ItemsDatas.ZOMBIE_MASK_LORE_3.getItemData(), ItemsDatas.LINE_BREAK.getItemData(), ItemsDatas.EPIC_ITEM.getItemData());
        String url = "143679688d6266a9679b38e5b5e3c60aac644f61eef2750b0605418342682c9";

        this.mZombieMask = new ItemStack(ch.getCustomHead(ItemsDatas.ZOMBIE_MASK_DISPLAYNAME.getItemData(), lores, 1, url));
    }

    public ItemStack getZombieMask(){
        return this.mZombieMask;
    }
}
