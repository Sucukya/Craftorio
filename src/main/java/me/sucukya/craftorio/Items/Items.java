package me.sucukya.craftorio.Items;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.HashMap;

public class Items {
    public HashMap<String,CustomItem> itemMap = new HashMap<>();
    public ArrayList<CustomItem> itemList = new ArrayList<>();

    public CustomItem strawhat;
    public CustomItem aluminiumOre;

    public void loadItems(){
        strawhat = new CustomItem("Strawhat", Material.CARVED_PUMPKIN,1,"strawhat");
        aluminiumOre = new CustomItem("Aluminium Ore", Material.RAW_COPPER_BLOCK,1,"aluminium_ore");
    }
}
