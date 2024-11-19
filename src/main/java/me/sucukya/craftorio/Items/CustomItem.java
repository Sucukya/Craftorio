package me.sucukya.craftorio.Items;

import de.tr7zw.changeme.nbtapi.NBTCompound;
import de.tr7zw.changeme.nbtapi.NBTItem;
import me.sucukya.craftorio.Craftorio;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItem {
    private String name;
    private Material material;
    private int customModelData;
    private String itemID;
    private Boolean isPlaceable;
    private Boolean isSmeltable;

    public CustomItem(String name, Material material, int customModelData, String itemID, Boolean isPlaceable) {
        this.name = name;
        this.material = material;
        this.customModelData = customModelData;
        this.itemID = itemID;
        this.isPlaceable = isPlaceable;

        System.out.println("Initializing Item: " + name);
        Craftorio.itemManager.addToMap(itemID,this);
        Craftorio.itemManager.addtoList(this);
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

    public ItemStack buildStackItems(int amount) {
        ItemStack item = new ItemStack(material);
        if(amount > 64) {
            amount = 64;
        }
        item.setAmount(amount);
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

    public Boolean getPlaceable(){
        return isPlaceable;
    }

    public Boolean getSmeltable(){
        return isSmeltable;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setMaterial(Material newMaterial) {
        this.material = newMaterial;
    }
    public void setCustomModelData(int newCustomModelData) {
        this.customModelData = newCustomModelData;
    }
    public void setItemID(String newItemID) {
        this.itemID = newItemID;
    }
    public void setSmeltable(Boolean isSmeltable) {
        this.isSmeltable = isSmeltable;
    }

}
