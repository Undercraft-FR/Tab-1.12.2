package fr.undercraft.tab.Managers;

import fr.undercraft.tab.Events.PlayerEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventsManager extends Manager {
    public EventsManager(Managers instance) {
        super(instance);

        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new PlayerEvents(), this.managers.instance);
    }
}
