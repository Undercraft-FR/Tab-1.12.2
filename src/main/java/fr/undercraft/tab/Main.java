package fr.undercraft.tab;

import fr.undercraft.tab.Managers.Managers;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static Managers managers;

    @Override
    public void onEnable() {
        // Plugin startup logic

        managers = new Managers(this);
    }

    @Override
    public void onDisable() {
        managers.tabManager.clear();
    }
}
