package me.sucukya.craftorio.Util;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Lists {
    private ArrayList<Player> onlinePlayers = new ArrayList<>();

    public void onlineAdd(Player p) {
        onlinePlayers.add(p);
    }
    public void onlineRemove(Player p) {
        onlinePlayers.remove(p);
    }

    public ArrayList<Player> getOnlinePlayers() {
        return onlinePlayers;
    }
}


