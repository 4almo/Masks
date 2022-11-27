package fr.almo.masks.commands.subcommands;

import fr.almo.masks.commands.SubCommand;
import fr.almo.masks.files.CustomConfig;
import fr.almo.masks.utils.descriptions.Messages;
import org.bukkit.entity.Player;

public class ReloadCommand extends SubCommand {
    @Override
    public String getName() {
        return "reload";
    }

    @Override
    public String getDescription() {
        return Messages.DESCRIPTION_COMMAND_RELOAD.getMessage();
    }

    @Override
    public String getSyntax() {
        return "/masks reload";
    }

    @Override
    public void perform(Player player, String[] args) {

        if(player.hasPermission("masks.reload")){
            CustomConfig.reload();
        }

    }
}
