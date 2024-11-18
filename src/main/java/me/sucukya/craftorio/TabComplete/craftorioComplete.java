package me.sucukya.craftorio.TabComplete;

import me.sucukya.craftorio.Craftorio;
import me.sucukya.craftorio.Items.CustomItem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class craftorioComplete implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("craftorio") || command.getName().equalsIgnoreCase("cft")) {
            List<String> list = new ArrayList<>();

            if(args.length == 1) {
                list.add("give");
            }

            if(args.length == 2) {
                for (Player p : Craftorio.lists.getOnlinePlayers()) {
                    list.add(p.getName());
                }
            }
            if(args.length == 3) {
                for(CustomItem item : Craftorio.itemManager.itemList){
                    list.add(item.getItemID());
                }
            }
            return list;
        }
        return null;

    }
}
