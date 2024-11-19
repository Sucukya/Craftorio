package me.sucukya.craftorio.Items;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemManager {
    private HashMap<String,CustomItem> itemMap = new HashMap<>();
    private ArrayList<CustomItem> itemList = new ArrayList<>();

    public void loadItems(){
        CustomItem strawhat = new CustomItem("Strawhat", Material.CARVED_PUMPKIN,1,"strawhat",false);
        CustomItem aluminiumOre = new CustomItem("Aluminium Ore", Material.RAW_COPPER_BLOCK,1,"aluminium_ore",true);
        CustomItem basicCircuit = new CustomItem("Basic Circuit", Material.RAW_IRON,1,"basic_circuit",false);
    }

    public ArrayList<CustomItem> getItemList(){
        return itemList;
    }

    public HashMap<String,CustomItem> getItemMap(){
        return itemMap;
    }

    public void addtoList(CustomItem item){
        itemList.add(item);
    }

    public void addToMap(String id, CustomItem item){
        itemMap.put(id,item);
    }
}
