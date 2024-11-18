package me.sucukya.craftorio.Commands;

import me.sucukya.craftorio.Craftorio;
import me.sucukya.craftorio.Items.CustomItem;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class craftorio implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

            switch (args.length) {
                case 1:
                    Craftorio.messages.sendHelpMessage(p);
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                case 3:
                    if(!(args[0] == null|| args[0].isEmpty())) {
                        if(args[0].equalsIgnoreCase("give")){
                            if(!(args[1] == null|| args[1].isEmpty())) {
                                Player receiver = Bukkit.getPlayer(args[1]);
                                if(Craftorio.lists.getOnlinePlayers().contains(receiver)) {
                                    if(!(args[2] == null|| args[2].isEmpty())) {
                                        String id = args[2].toLowerCase();
                                        CustomItem item = Craftorio.itemManager.itemMap.get(id);
                                        receiver.getInventory().addItem(item.buildItem());
                                        p.sendMessage(Craftorio.messages.prefix + "Gave 1 [" + item.getName() + "] to " + receiver.getName());
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Case 4");
            }
        return true;
    }
}

