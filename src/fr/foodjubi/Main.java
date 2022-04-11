package fr.foodjubi;

import fr.foodjubi.command.CommandeTest;
import fr.foodjubi.listeners.PlayerInteractEventListener;
import fr.foodjubi.listeners.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin
{

    //******************************COULEURS***************************//
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String PLUGIN_NAME = "[CustomSword] : ";
    public static final String FINAL_PLUGIN_NAME = ANSI_RED + PLUGIN_NAME + ANSI_WHITE;


    //*******************************QUAND*LE*PLUGIN*S'ALLUME***************************//
    @Override
    public void onEnable() {

        System.out.println(FINAL_PLUGIN_NAME + "Le plugin s'allume !!");
        System.out.println(FINAL_PLUGIN_NAME + "Le plugin vien de s'allumer !!");
        System.out.println(FINAL_PLUGIN_NAME + "Le plugin allumé !!");

        //*********************************COMMANDES***********************//
        getCommand("test").setExecutor(new CommandeTest(this));



        //******************************LISTENERS*************************//
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractEventListener(this), this);



    }




    //*******************************QUAND*LE*PLUGIN*S'ETEIN***************************//
    @Override
    public void onDisable() {
        System.out.println(FINAL_PLUGIN_NAME + "Le plugin viens de s'étindre");
    }
}
