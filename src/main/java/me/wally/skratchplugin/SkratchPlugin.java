package me.wally.skratchplugin;

import me.wally.skratchplugin.listeners.ClientPacketListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkratchPlugin extends JavaPlugin {

    private static SkratchPlugin instance;

    public static SkratchPlugin get() {
        return  instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getMessenger().registerIncomingPluginChannel(this, "skratch:generic-handshake-packet", new ClientPacketListener(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
