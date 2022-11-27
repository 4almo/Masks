package fr.almo.masks.listeners;

import fr.almo.masks.masks.CreeperMask;
import fr.almo.masks.masks.GhastMask;
import fr.almo.masks.masks.ZombieMask;
import fr.almo.masks.utils.MasksList;
import fr.almo.masks.utils.descriptions.ItemsDatas;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MaskClickListener implements Listener {

    MasksList maskList = new MasksList();

    CreeperMask cm;
    ZombieMask zm;
    GhastMask gm;

    @EventHandler
    public void onClick(PlayerInteractEvent e){

        Player p = e.getPlayer();
        ItemStack handItem = p.getItemInHand();

        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){

            if(handItem.getItemMeta().getDisplayName().equals(ItemsDatas.CREEPER_MASK_DISPLAYNAME.getItemData())){
                e.setCancelled(true);
                if(maskList.getCreeperList().contains(p)){
                    p.sendMessage(ChatColor.RED + "Vous avez déjà ce masque!");
                }else{
                    maskList.creeperAddList(p);
                    p.sendMessage(ChatColor.RED + "Vous avez ajouté ce masque à votre menu!");

                }

            }

            if(p.getItemInHand().getItemMeta().getDisplayName().equals(ItemsDatas.ZOMBIE_MASK_DISPLAYNAME.getItemData())){
                e.setCancelled(true);
                p.sendMessage("ok");
            }

            if(p.getItemInHand().getItemMeta().getDisplayName().equals(ItemsDatas.GHAST_MASK_DISPLAYNAME.getItemData())){
                e.setCancelled(true);
                p.sendMessage("ok");
            }

        }

    }

}
