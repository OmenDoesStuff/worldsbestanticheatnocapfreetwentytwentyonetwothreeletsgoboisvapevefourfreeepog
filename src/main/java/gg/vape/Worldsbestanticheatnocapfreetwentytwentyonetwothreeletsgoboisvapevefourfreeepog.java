package gg.vape;

import gg.vape.check.Check;
import org.bukkit.plugin.java.JavaPlugin;

public final class Worldsbestanticheatnocapfreetwentytwentyonetwothreeletsgoboisvapevefourfreeepog extends JavaPlugin {

    public static Worldsbestanticheatnocapfreetwentytwentyonetwothreeletsgoboisvapevefourfreeepog instance;
    @Override
    public void onEnable() {
       instance = this;
        new Check();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
