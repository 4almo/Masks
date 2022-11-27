package fr.almo.masks.utils.descriptions;

import org.bukkit.ChatColor;

public enum Messages {

    ERROR_SAVE("La sauvegarde de la configuration du plugin Masks à échouée!"),

    DESCRIPTION_COMMAND_RELOAD("Reload la configuration du plugin Masks."),
    DESCRIPTION_COMMAND_GIVE_CREEPER_MASK("Cette commande vous donne le Creeper's Mask."),
    DESCRIPTION_COMMAND_GIVE_ZOMBIE_MASK("Cette commande vous donne le Zombie's Mask."),
    DESCRIPTION_COMMAND_GIVE_GHAST_MASK("Cette commande vous donne le Ghast's Mask."),

    NO_PERMISSION(ChatColor.RED + "Vous n'avez pas la permission pour exécuter cette commande."),
    NO_PLAYER(ChatColor.YELLOW + "Veuillez exécuter cette commande en jeu.");

    private final String mMessage;

    Messages (String message){
        this.mMessage = message;
    }

    public String getMessage(){
        return mMessage;
    }
}
