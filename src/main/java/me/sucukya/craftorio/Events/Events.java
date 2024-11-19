package me.sucukya.craftorio.Events;

import de.tr7zw.changeme.nbtapi.NBTCompound;
import de.tr7zw.changeme.nbtapi.NBTItem;
import me.sucukya.craftorio.Craftorio;
import me.sucukya.craftorio.Items.CustomItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Craftorio.lists.onlineAdd(player);
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Craftorio.lists.onlineRemove(player);
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        ItemStack item = event.getItemInHand();
        if(item.hasItemMeta()) {
            NBTItem nbtItem = new NBTItem(item);
            if(nbtItem.hasNBTData()) {
                if(nbtItem.hasTag("cft")) {
                    NBTCompound cft = nbtItem.getCompound("cft");
                    String id = cft.getString("id");
                    CustomItem citem = Craftorio.itemManager.getItemMap().get(id);
                    if(citem != null) {
                        if(!citem.getPlaceable()) {
                            event.setCancelled(true);
                        }
                    }
                }
            }
        }
    }

}
