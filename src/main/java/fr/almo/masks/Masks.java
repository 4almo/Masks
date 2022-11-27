package fr.almo.masks;

import fr.almo.masks.commands.CommandManager;
import fr.almo.masks.files.CustomConfig;
import fr.almo.masks.listeners.DeathListener;
import fr.almo.masks.listeners.MaskClickListener;
import fr.almo.masks.listeners.MobsDeathsListener;
import fr.almo.masks.core.MasksGUI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Masks extends JavaPlugin {

    private static Masks plugin;

    @Override
    public void onEnable() {

        plugin = this;

        //setup config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        CustomConfig.setup();
        CustomConfig.get().addDefault("powerExplosion", "1");
        CustomConfig.get().options().copyDefaults(true);
        CustomConfig.save();

        //commands
        getCommand("masks").setExecutor(new CommandManager());

        //listeners
        Bukkit.getServer().getPluginManager().registerEvents(new DeathListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new MobsDeathsListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new MaskClickListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new MasksGUI(), this);
    }

    public static Masks getPlugin() {
        return plugin;
    }

}
