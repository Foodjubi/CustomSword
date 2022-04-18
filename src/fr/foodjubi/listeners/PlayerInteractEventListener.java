package fr.foodjubi.listeners;

import fr.foodjubi.Main;
import fr.foodjubi.utils.Function;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.ArrayList;

import static org.bukkit.Bukkit.getServer;


public class PlayerInteractEventListener implements Listener {

    private ArrayList<String> cooldown = new ArrayList<String>();

    private Main main;

    public PlayerInteractEventListener(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        Action action = e.getAction();
        ItemStack itemStack = e.getItem();

        player.sendMessage(itemStack.getItemMeta().getDisplayName());

        if (itemStack.getItemMeta().getDisplayName().equals("§cSpeed Sword")) {
            if (action == Action.RIGHT_CLICK_AIR || action==Action.RIGHT_CLICK_BLOCK) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 5*20, 1));
            }
        }
        if (itemStack.getItemMeta().getDisplayName().equals("§cTP sword")) {
            if (action == Action.RIGHT_CLICK_AIR || action==Action.RIGHT_CLICK_BLOCK) {

                Location ploc = player.getLocation();
                Vector playerDirection = ploc.getDirection();
                playerDirection.multiply(5);


                Location newloc = ploc.add(playerDirection);
                int highesty = newloc.getWorld().getHighestBlockYAt(newloc);

                if(newloc.getY() < highesty){
                    int y = newloc.getWorld().getHighestBlockYAt(newloc);
                    newloc = player.getLocation();
                }

                player.teleport(newloc);
                player.playSound(newloc, Sound.ENTITY_ENDERMAN_TELEPORT, 2, 2);
            }

        }
    }

}
