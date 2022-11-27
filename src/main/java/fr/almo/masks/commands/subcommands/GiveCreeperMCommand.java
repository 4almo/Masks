package fr.almo.masks.commands.subcommands;

import fr.almo.masks.utils.descriptions.Messages;
import fr.almo.masks.commands.SubCommand;
import fr.almo.masks.masks.CreeperMask;
import org.bukkit.entity.Player;

public class GiveCreeperMCommand extends SubCommand {

    @Override
    public String getName() {
        return "creeper";
    }

    @Override
    public String getDescription() {
        return Messages.DESCRIPTION_COMMAND_GIVE_CREEPER_MASK.getMessage();
    }

    @Override
    public String getSyntax() {
        return "/masks creeper";
    }

    @Override
    public void perform(Player player, String[] args) {

        if(player.hasPermission("masks.give")){

            CreeperMask cm = new CreeperMask();
            player.getInventory().addItem(cm.getCreeperMask());

        }

    }

}
