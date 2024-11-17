package me.sucukya.craftorio.Events;

import me.sucukya.craftorio.Craftorio;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Craftorio.lists.onlineAdd(player);
    }

}
