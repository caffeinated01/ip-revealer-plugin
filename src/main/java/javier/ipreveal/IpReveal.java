package javier.ipreveal;

import javier.ipreveal.Listener.OnPlayerDeath;
import org.bukkit.plugin.java.JavaPlugin;

public final class IpReveal extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnPlayerDeath(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
