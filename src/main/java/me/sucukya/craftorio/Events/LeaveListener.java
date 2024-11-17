package me.sucukya.craftorio.Events;

import me.sucukya.craftorio.Craftorio;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveListener implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Craftorio.lists.onlineRemove(player);
    }
}
