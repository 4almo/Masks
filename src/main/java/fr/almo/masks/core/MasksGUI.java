package fr.almo.masks.core;

import fr.almo.masks.masks.CreeperMask;
import fr.almo.masks.masks.ZombieMask;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class MasksGUI implements Listener {

    private final Inventory inv;
    private final String inventoryName = "Mask's Menu";

    public MasksGUI() {

        inv = Bukkit.createInventory(null, 27, inventoryName);
        initializeItems();
    }

    public void initializeItems() {

        CreeperMask cm = new CreeperMask();
        ZombieMask zm = new ZombieMask();

        inv.setItem(1, createGuiItem(Material.DIAMOND_SWORD, "Example Sword", "§aFirst line of the lore", "§bSecond line of the lore"));
        inv.addItem(cm.getCreeperMask());
        inv.addItem(zm.getZombieMask());

    }

    protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        // Set the name of the item
        meta.setDisplayName(name);

        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }

    // You can open the inventory with this
    public void openInventory(final HumanEntity ent) {
        ent.openInventory(inv);
    }

    // Check for clicks on items
    @EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {
        if (!e.getInventory().getName().equals(inventoryName)) return;

        e.setCancelled(true);

        final ItemStack clickedItem = e.getCursor();
        ItemStack air = new ItemStack(Material.AIR, 1);

        if (clickedItem == null || clickedItem.isSimilar(air)) return;

        final Player p = (Player) e.getWhoClicked();

        // Using slots click is a best option for your inventory click's
        p.sendMessage("You clicked at slot " + e.getRawSlot());
    }

    // Cancel dragging in our inventory
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        Bukkit.broadcastMessage("ok2");
        if (e.getInventory().equals(inv)) {
            e.setCancelled(true);
        }
    }
}