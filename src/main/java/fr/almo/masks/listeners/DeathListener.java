package fr.almo.masks.listeners;

import fr.almo.masks.Masks;
import fr.almo.masks.files.CustomConfig;
import fr.almo.masks.utils.descriptions.ItemsDatas;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class DeathListener implements Listener {

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e){

        if(e.getEntity() instanceof Player){
            Player p = (Player) e.getEntity();

            double x = p.getLocation().getX();
            double y = p.getLocation().getY();
            double z = p.getLocation().getZ();

            if(p.getHealth() <= e.getDamage()){

                //Creeper's Mask
                if(p.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ItemsDatas.CREEPER_MASK_DISPLAYNAME.getItemData())){

                    /*
                    Cancel player death.
                    Remove player mask.
                    Create explosion at player death location.
                    The power of the explosion depends on the power chosen in the configuration file.
                    Then kill the player.
                    */

                    e.setCancelled(true);
                    p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET, 1));
                    p.getWorld().createExplosion(x, y, z, (float) CustomConfig.get().getDouble("powerExplosion"), false, false);
                    p.setHealth(0);


                    //Zombie's Mask
                }else if(p.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ItemsDatas.ZOMBIE_MASK_DISPLAYNAME.getItemData())){

                    e.setCancelled(true);
                    p.setGameMode(GameMode.SPECTATOR);
                    p.setFlySpeed(0);
                    p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET, 1));
                    p.sendMessage(ChatColor.DARK_GREEN + "Zombie's Mask activé " + ChatColor.WHITE + "- Vous avez été infecté !");
                    p.sendMessage("Respawn dans 5 secondes");

                    new BukkitRunnable(){

                        int timer = 15;

                        @Override
                        public void run(){

                            if(timer == 10){
                                p.setGameMode(GameMode.SURVIVAL);
                                p.setFlySpeed((float)0.1);
                                p.getWorld().playEffect(p.getLocation(), Effect.CLOUD, 1);
                                p.getWorld().playSound(p.getLocation(), Sound.ZOMBIE_INFECT, 1, 0);
                                p.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(200, 1));

                            }if(timer == 10 || timer == 9 ||  timer == 8 || timer == 7 || timer == 6 || timer == 5 || timer == 4 || timer == 3 || timer == 2 || timer == 1){
                                p.sendMessage("Vous allez succombé de votre infection dans " + ChatColor.BOLD + timer + ChatColor.RESET + " !");

                            }if(timer == 0){
                                p.setHealth(0);
                                cancel();
                            }
                            if(p.isDead()){
                                cancel();
                            }
                            timer --;
                        }

                    }.runTaskTimer(Masks.getPlugin(), 0, 20);

                }else if(p.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ItemsDatas.GHAST_MASK_DISPLAYNAME.getItemData())){
                    p.setAllowFlight(false);
                    p.sendMessage("mort, plus de fly");
                }

            }


        }

    }

}
