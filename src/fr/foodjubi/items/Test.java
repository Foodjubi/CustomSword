package fr.foodjubi.items;

import fr.foodjubi.utils.Function;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Test {

    public static ItemStack testblovk;

    public static void init(){
        createTest();
    };

    private static void createTest(){
        ItemStack test = new ItemStack(Material.COBBLESTONE, 1);
        testblovk = test;

        NamespacedKey key = new NamespacedKey(this, "cobblex");
        ShapedRecipe sr = new ShapedRecipe(key, test);
        sr.shape("S  ",
                 " S ",
                 "  S");
        sr.setIngredient('S', Material.COBBLESTONE);
        Bukkit.getServer().addRecipe(sr);

    }

}
