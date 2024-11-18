package me.sucukya.craftorio;


import de.tr7zw.changeme.nbtapi.NBT;
import me.sucukya.craftorio.Commands.craftorio;
import me.sucukya.craftorio.Commands.gameMode;
import me.sucukya.craftorio.Events.JoinListener;
import me.sucukya.craftorio.Events.LeaveListener;
import me.sucukya.craftorio.Items.Items;
import me.sucukya.craftorio.TabComplete.craftorioComplete;
import me.sucukya.craftorio.Util.Lists;
import me.sucukya.craftorio.Util.messageSender;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Craftorio extends JavaPlugin {
    String version = "0.01.Pre-Alpha";
    public static messageSender messages = new messageSender();
    public static Items itemManager = new Items();
    public static Lists lists = new Lists();

    static Craftorio craftorio;
    public Craftorio() {
        craftorio = this;
    }
    public static Craftorio getCraftorio() {
        return craftorio;
    }

    @Override
    public void onEnable() {
        messages.version = version;
        messages.info = "[CFT]";
        messages.prefix = "§b[CFT] §f";
        messages.sendStartUp();
        itemManager.loadItems();
        registerCommands();
        registerEvents();
        NBT.preloadApi();
        if(!Bukkit.getServer().getOnlinePlayers().isEmpty()) {
            for(Player player : Bukkit.getServer().getOnlinePlayers()) {
                lists.onlineAdd(player);
            }
        }

    }

    @Override
    public void onDisable() {
        messages.sendShutdown();
    }



    public void registerCommands() {
        getCommand("gm").setExecutor(new gameMode());
        getCommand("craftorio").setExecutor(new craftorio());
        getCommand("craftorio").setTabCompleter(new craftorioComplete());
    }
    public void registerEvents(){
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new JoinListener(), craftorio);
        pm.registerEvents(new LeaveListener(), craftorio);
    }
}
