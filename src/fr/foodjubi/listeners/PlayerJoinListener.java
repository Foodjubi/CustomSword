package fr.foodjubi.listeners;

import fr.foodjubi.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;

public class PlayerJoinListener implements Listener {

    private Main main;

    public PlayerJoinListener(Main main)
    {
        this.main = main;
    }



    @EventHandler
    public void onJoin(PlayerJoinEvent event)
    {

        Player player = event.getPlayer();
        ItemStack customsword = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta customM = customsword.getItemMeta();
        customM.setDisplayName("§cSpeed Sword");
        customM.setLore(Arrays.asList("§1------------------","§6SRight-Click for speed","§1------------------"));
        customsword.setItemMeta(customM);
        player.getInventory().addItem(customsword);

        ItemStack tp_sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta mtp_sword = tp_sword.getItemMeta();
        mtp_sword.setDisplayName("§cTP sword");
        mtp_sword.setLore(Arrays.asList("§1------------------","§6SRight-Click for tp","§1------------------"));
        tp_sword.setItemMeta(mtp_sword);
        player.getInventory().addItem(tp_sword);


    }

}
