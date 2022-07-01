package fr.undercraft.tab.Managers;

import fr.undercraft.tab.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.List;
import java.util.Map;

public class Managers {
    public Main instance;
    public TabManager tabManager;
    public EventsManager eventsManager;

    public Managers(Main instance)
    {
        this.instance = instance;

        this.tabManager = new TabManager(this);
        this.eventsManager = new EventsManager(this);
    }
}
