package fr.almo.masks.utils;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class MasksList {

    private static ArrayList<Player> creeperList;
    private static ArrayList<Player> zombieList;
    private static ArrayList<Player> ghastList;

    public MasksList(){

        creeperList = new ArrayList<>();
        zombieList = new ArrayList<>();
        ghastList = new ArrayList<>();

    }

    //CREEPER

    public void creeperAddList(Player player){
        creeperList.add(player);
    }

    public ArrayList<Player> getCreeperList(){
        return creeperList;
    }

    //ZOMBIE

    public void zombieAddList(Player player){
        zombieList.add(player);
    }

    public ArrayList<Player> getZombieList(){
        return zombieList;
    }

    //GHAST

    public void ghastAddList(Player player){
        ghastList.add(player);
    }

    public ArrayList<Player> getGhastList(){
        return ghastList;
    }

}


