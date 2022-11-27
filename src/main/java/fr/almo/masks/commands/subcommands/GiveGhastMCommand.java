package fr.almo.masks.commands.subcommands;

import fr.almo.masks.commands.SubCommand;
import fr.almo.masks.masks.CustomHead;
import fr.almo.masks.utils.descriptions.Messages;
import fr.almo.masks.masks.GhastMask;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveGhastMCommand extends SubCommand {

    private ItemStack mGhastMask;
    CustomHead ch = new CustomHead();

    @Override
    public String getName() {
        return "ghast";
    }

    @Override
    public String getDescription() {
        return Messages.DESCRIPTION_COMMAND_GIVE_GHAST_MASK.getMessage();
    }

    @Override
    public String getSyntax() {
        return "/masks ghast";
    }

    @Override
    public void perform(Player player, String[] args) {

        if(player.hasPermission("masks.give")){

            GhastMask gm = new GhastMask();
            player.getInventory().addItem(gm.getGhastMask());

        }

    }

}
