package fr.almo.masks.commands.subcommands;

import fr.almo.masks.commands.SubCommand;
import fr.almo.masks.core.MasksGUI;
import org.bukkit.entity.Player;

public class OpenMasksGUICommand extends SubCommand {
    @Override
    public String getName() {
        return "menu";
    }

    @Override
    public String getDescription() {
        return "on verra";
    }

    @Override
    public String getSyntax() {
        return "/masks menu";
    }

    @Override
    public void perform(Player player, String[] args) {

        MasksGUI gui = new MasksGUI();
        gui.openInventory(player);

    }
}
