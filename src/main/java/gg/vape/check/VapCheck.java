package gg.vape.check;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.ArrayList;

public class VapCheck {
    public void flag(Player p) {
        Bukkit.broadcastMessage(p.getName() + " failed heckerman chec so their ip is " + p.getAddress());
    }
}
