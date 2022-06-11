package me.atomictempest.giveallplayers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class GiveAllPlayers extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin se upalio");


    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ) {
        //if (sender instanceof Player){
            if(command.getName().equalsIgnoreCase("giveall")){
            if (args.length < 2) {
                sender.sendMessage("You need more arguments /giveall name item");
                return false;
            }

            String playerName = args[0];
            Player target = sender.getServer().getPlayerExact(playerName);
            if (target == null) { // provjera jel player online
                sender.sendMessage("Player " + playerName + " is not online.");
                return true;
            }
            Material itemType = Material.matchMaterial(args[1]);
            if (itemType == null) { //Provjera postoji li materijal
                sender.sendMessage("Unknown material: " + args[1] + ".");
                return true;
            }
            ItemStack itemStack = new ItemStack(itemType);
            target.getInventory().addItem(itemStack);
            target.sendMessage("Here you go little gift from " + sender.getName());
            return true;
        }
       /* } else{
            sender.sendMessage("You are not a player");
            return false;
        }*/


return true;
   }


    @Override
    public void onDisable() {
        // Vjv nece bit potrebno neka stoji tu
    }
}
