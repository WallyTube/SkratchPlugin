package me.wally.skratchplugin;

import me.wally.skratchplugin.listeners.ClientPacketListener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.Messenger;

public final class SkratchPlugin extends JavaPlugin {

    private static SkratchPlugin instance;

    public static SkratchPlugin get() {
        return  instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        //var genericHandshakePacket = Messenger.registerIncomingPluginChannel(this, "skratch:generic-handshake-packet", new ClientPacketListener());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
