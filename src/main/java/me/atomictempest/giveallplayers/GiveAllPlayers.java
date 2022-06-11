package me.atomictempest.giveallplayers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

import static java.lang.Integer.parseInt;

public final class GiveAllPlayers extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin se upalio");


    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ) {
        //if (sender instanceof Player){
            if(command.getName().equalsIgnoreCase("giveall")){
            if (args.length < 3) {
                sender.sendMessage("You need more arguments /giveall <name> <item> <amount>");
                return false;
            }

            String playerName = args[0];
            String itemAmount = args[2];

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
                try
                {
                    Integer itemAmountTest = Integer.parseInt(args[2]);
                    if (itemAmountTest <= 0) {
                        sender.sendMessage("Amount can't be less than 0");
                    }else{
                        ItemStack itemStack = new ItemStack(itemType, parseInt(itemAmount));
                        target.getInventory().addItem(itemStack);
                        target.sendMessage(ChatColor.YELLOW + "Recieved " + itemAmount + " " +  itemType.toString().toLowerCase() + " from:  " + ChatColor.AQUA +sender.getName());

                    }

                }catch(NumberFormatException e)
                {
                    sender.sendMessage("Amount can only be number");
                    e.printStackTrace();
                    //args[3] is not an int
                }

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
