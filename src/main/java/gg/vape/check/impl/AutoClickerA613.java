package gg.vape.check.impl;

import gg.vape.check.VapCheck;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class AutoClickerA613 extends VapCheck implements Listener{
    @EventHandler
    public void onClic(PlayerInteractEvent event) {
        event.setCancelled(true);
        flag(event.getPlayer());
    }
}
