package javier.ipreveal.Listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.entity.Player;

import java.util.Objects;

public class OnPlayerDeath implements Listener {

    @EventHandler
    public void PlayerDeath(PlayerDeathEvent event){
        Player p = event.getEntity();
        String username = p.getDisplayName();
        Bukkit.broadcastMessage(username + "'s ip: "+GetIp(p));
    }
    public String GetIp(Player p){
        return Objects.requireNonNull(p.getAddress()).getAddress().toString().split("/")[1];
    }
}
