package fr.almo.masks.listeners;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class MobsDeathsListener implements Listener {

    @EventHandler
    public void onMobsDeaths(EntityDeathEvent event){

        if(event.getEntityType() == EntityType.ZOMBIE){
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.STONE, 1));
        }

    }

}
