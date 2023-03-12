package me.wally.skratchplugin.listeners;

import me.wally.skratchplugin.SkratchPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.jetbrains.annotations.NotNull;

public class ClientPacketListener implements PluginMessageListener {

    public SkratchPlugin instance;

    public ClientPacketListener(SkratchPlugin plugin) {
        instance = plugin;
    }

    @Override
    public void onPluginMessageReceived(@NotNull String channel, @NotNull Player player, byte @NotNull [] message) {
        switch (channel) {
            case "skratch:generic-handshake-packet" -> {
                Bukkit.getMessenger().registerOutgoingPluginChannel(instance, channel);
                player.sendPluginMessage(instance, channel, "received".getBytes());
            }
        }
    }

}
