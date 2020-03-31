package me.aberdeener.ezdev;

import me.aberdeener.ezdev.listeners.CommandListener;

public class Registry {

    public static ezDev ezDev = me.aberdeener.ezdev.ezDev.getInstance();

    public static void registerCommands() {

    }

    public static void registerListeners() {
        ezDev.getServer().getPluginManager().registerEvents(new CommandListener(null), ezDev);
    }
}
