package gg.vape.check;

import gg.vape.Worldsbestanticheatnocapfreetwentytwentyonetwothreeletsgoboisvapevefourfreeepog;
import gg.vape.check.impl.*;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import java.util.ArrayList;

public class Check {
    public ArrayList<Listener> checks = new ArrayList<>();

    public Check() {
        checks.add(new AuraA());
        checks.add(new AuraA1());
        checks.add(new AuraA2());
        checks.add(new AuraA7());
        checks.add(new AuraAB());
        checks.add(new AuraA69());
        checks.add(new AuraAZ());

        checks.add(new HummusA());
        checks.add(new PerdictA());
        checks.add(new PerdictA1());
        checks.add(new SpeedA());
        checks.add(new AutoClickerA());
        checks.add(new AutoClickerA1());
        checks.add(new AutoClickerA2());
        checks.add(new AutoClickerXAE21());
        checks.add(new AutoClickerA6());
        checks.add(new AutoClickerXAE21());
        checks.add(new AutoClickerA613());
        checks.add(new AutoClickerXAEAXII());

        for (Listener l : checks) {
            Bukkit.getPluginManager().registerEvents(l, Worldsbestanticheatnocapfreetwentytwentyonetwothreeletsgoboisvapevefourfreeepog.instance);
        }
    }
}
