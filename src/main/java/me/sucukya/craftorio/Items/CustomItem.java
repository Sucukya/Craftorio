package me.sucukya.craftorio.Items;

import de.tr7zw.changeme.nbtapi.NBTCompound;
import de.tr7zw.changeme.nbtapi.NBTItem;
import me.sucukya.craftorio.Craftorio;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItem {
    String name;
    Material material;
    int customModelData;
    String itemID;

    public CustomItem(String name, Material material, int customModelData, String itemID) {
        this.name = name;
        this.material = material;
        this.customModelData = customModelData;
        this.itemID = itemID;

        System.out.println("Initializing Item: " + name);
        Craftorio.itemManager.itemMap.put(itemID, this);
        Craftorio.itemManager.itemList.add(this);
    }

    public ItemStack buildItem() {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setItemName(name);
        meta.setCustomModelData(customModelData);
        item.setItemMeta(meta);

        NBTItem nbtItem = new NBTItem(item);
        NBTCompound mainCompound = nbtItem.addCompound("cft");
        mainCompound.setString("id", itemID);

        return nbtItem.getItem();
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    public int getCustomModelData() {
        return customModelData;
    }

    public String getItemID() {
        return itemID;
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setMaterial(Material newMaterial) {
        material = newMaterial;
    }
    public void setCustomModelData(int newCustomModelData) {
        customModelData = newCustomModelData;
    }
    public void setItemID(String newItemID) {
        itemID = newItemID;
    }

}
