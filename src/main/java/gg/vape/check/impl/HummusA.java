package gg.vape.check.impl;

import gg.vape.check.VapCheck;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class HummusA extends VapCheck implements Listener{
    @EventHandler
        public void onClic(PlayerItemHeldEvent event) {
        event.setCancelled(true);
        flag(event.getPlayer());
    }
}
