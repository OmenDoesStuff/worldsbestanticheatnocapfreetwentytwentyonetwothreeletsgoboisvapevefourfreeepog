package gg.vape.check.impl;

import gg.vape.check.VapCheck;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class SpeedA extends VapCheck implements Listener{
    @EventHandler
    public void onClic(PlayerMoveEvent event) {
        event.setCancelled(true);
        flag(event.getPlayer());
    }
}
