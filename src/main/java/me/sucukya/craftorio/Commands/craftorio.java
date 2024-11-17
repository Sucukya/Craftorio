package me.sucukya.craftorio.Commands;

import me.sucukya.craftorio.Craftorio;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class craftorio implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        if(sender instanceof Player) {
            switch (args.length) {
                case 1:
                    Craftorio.messages.sendHelpMessage(p);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    if(args[1].equalsIgnoreCase("give")){

                    }
            }


        }


        return true;
    }
}
