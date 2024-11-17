package me.sucukya.craftorio.Items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItem {
    String name;
    Material material;
    int customModelData;
    String itemID;


    public ItemStack buildItem() {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setItemName(name);
        meta.setCustomModelData(customModelData);
        item.setItemMeta(meta);

        return item;
    }

}
