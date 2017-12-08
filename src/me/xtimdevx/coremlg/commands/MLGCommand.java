package me.xtimdevx.coremlg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by xTimDevx on 8/12/2017.
 */
public class MLGCommand implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("mlg")) {
            sender.sendMessage("hi");
        }
        return true;
    }
}
