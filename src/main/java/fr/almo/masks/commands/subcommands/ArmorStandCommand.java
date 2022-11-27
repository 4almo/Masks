package fr.almo.masks.commands.subcommands;

import fr.almo.masks.commands.SubCommand;
import fr.almo.masks.core.ArmorStandCore;
import org.bukkit.entity.*;

public class ArmorStandCommand extends SubCommand {

    private ArmorStand mAs;

    @Override
    public String getName() {
        return "armorstand";
    }

    @Override
    public String getDescription() {
        return "summon un armor stand";
    }

    @Override
    public String getSyntax() {
        return "/masks armorstand";
    }

    @Override
    public void perform(Player player, String[] args) {

        ArmorStandCore as = new ArmorStandCore();

        as.spawnArmorStand(player);

    }

}
