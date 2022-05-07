package gg.vape.check.impl;

import gg.vape.check.VapCheck;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class AuraA2 extends VapCheck implements Listener{
    @EventHandler
    public void onClic(PlayerInteractEvent event) {
        if(event.getAction() == Action.PHYSICAL) {
            event.setCancelled(true);
            flag(event.getPlayer());
        }
    }
}
