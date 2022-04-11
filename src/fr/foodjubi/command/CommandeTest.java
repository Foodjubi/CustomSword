package fr.foodjubi.command;

import fr.foodjubi.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandeTest implements CommandExecutor {

    private Main main;

    public CommandeTest(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] arg){
        Player player = (Player) sender;
        player.sendMessage("Le plugin bien !!");

        return false;
    }
}
