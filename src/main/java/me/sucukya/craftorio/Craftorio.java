package me.sucukya.craftorio;

import me.sucukya.craftorio.Util.messageSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Craftorio extends JavaPlugin {
    String version = "0.01.Pre-Alpha";
    messageSender messages = new messageSender();



    @Override
    public void onEnable() {
        messages.version = version;
        messages.info = "[CFT]";
        messages.sendStartUp();
    }

    @Override
    public void onDisable() {
        messages.sendShutdown();
    }
}
