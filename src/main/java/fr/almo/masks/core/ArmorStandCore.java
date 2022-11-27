package fr.almo.masks.core;

import fr.almo.masks.masks.CreeperMask;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class ArmorStandCore{

    private static ArmorStand as;

    public ArmorStandCore() {

    }

    public void spawnArmorStand(final Player player){
        as = (ArmorStand) player.getLocation().getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
        CreeperMask cm = new CreeperMask();
        as.setHelmet(cm.getCreeperMask());
        as.setCustomName("Masque de " + player.getName());
        as.setCustomNameVisible(true);
        as.setVisible(false);
        as.setGravity(true);
    }


}