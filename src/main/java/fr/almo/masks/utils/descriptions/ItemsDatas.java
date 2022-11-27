package fr.almo.masks.utils.descriptions;

import org.bukkit.ChatColor;

public enum ItemsDatas {

    LEGENDARY_ITEM(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY ITEM"),
    EPIC_ITEM(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "EPIC ITEM"),
    RARE_ITEM(ChatColor.GREEN + "" + ChatColor.BOLD + "RARE ITEM"),

    CREEPER_MASK_DISPLAYNAME(ChatColor.GREEN + "Creeper's " + ChatColor.BOLD + "Mask"),
    CREEPER_MASK_LORE_1(ChatColor.YELLOW + "Propriété active:"),
    CREEPER_MASK_LORE_2(ChatColor.GRAY + "Dans un dernier élan à votre mort,"),
    CREEPER_MASK_LORE_3(ChatColor.GRAY + "vous provoquez une explosion qui"),
    CREEPER_MASK_LORE_4(ChatColor.GRAY + "peut entraîner la mort de vos ennemis."),

    ZOMBIE_MASK_DISPLAYNAME(ChatColor.DARK_GREEN + "Zombie's " + ChatColor.BOLD + "Mask"),
    ZOMBIE_MASK_LORE_1("1"),
    ZOMBIE_MASK_LORE_2("2"),
    ZOMBIE_MASK_LORE_3("3"),

    GHAST_MASK_DISPLAYNAME(ChatColor.WHITE + "Ghast's " + ChatColor.BOLD + "Mask"),
    GHAST_MASK_LORE_1("1"),
    GHAST_MASK_LORE_2("2"),
    GHAST_MASK_LORE_3("3"),

    LINE_BREAK(" ");

    private final String mItemData;

    ItemsDatas (String message){
        this.mItemData = message;
    }

    public String getItemData(){
        return mItemData;
    }

}
