package me.Plugins.AdvancedGunpowder;

import org.bukkit.command.CommandSender;

public class Permissions
{
    public static String Permission_Admin;
    
    static {
        Permissions.Permission_Admin = "advancedgunpowder.admin";
    }
    
    public static boolean isAdmin(final CommandSender commandSender) {
        return commandSender.hasPermission(Permissions.Permission_Admin);
    }
}