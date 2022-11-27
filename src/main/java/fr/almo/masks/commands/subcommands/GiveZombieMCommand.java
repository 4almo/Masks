package fr.almo.masks.commands.subcommands;

import fr.almo.masks.commands.SubCommand;
import fr.almo.masks.masks.CustomHead;
import fr.almo.masks.utils.descriptions.Messages;
import fr.almo.masks.masks.ZombieMask;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveZombieMCommand extends SubCommand {

    private ItemStack mZombieMask;
    CustomHead ch = new CustomHead();

    @Override
    public String getName() {
        return "zombie";
    }

    @Override
    public String getDescription() {
        return Messages.DESCRIPTION_COMMAND_GIVE_ZOMBIE_MASK.getMessage();
    }

    @Override
    public String getSyntax() {
        return "/masks zombie";
    }

    @Override
    public void perform(Player player, String[] args) {

        if(player.hasPermission("masks.give")){

            ZombieMask zm = new ZombieMask();
            player.getInventory().addItem(zm.getZombieMask());

        }

    }

}
