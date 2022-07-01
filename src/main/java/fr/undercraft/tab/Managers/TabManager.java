package fr.undercraft.tab.Managers;

import fr.undercraft.tab.Util.PlayerList;

import java.util.*;

public class TabManager extends Manager {
    public Map<String, PlayerList> playerLists;

    public TabManager(Managers instance) {
        super(instance);
        this.playerLists = new HashMap<>();
    }

    public void register(String name, PlayerList playerList)
    {
        this.playerLists.put(name, playerList);
    }

    public PlayerList get(String name)
    {
        return this.playerLists.get(name);
    }

    public void remove(String name)
    {
        PlayerList pl = this.playerLists.get(name);
        if (pl != null)
            pl.clearCustomTabs();
        this.playerLists.remove(name);
    }

    public void clear()
    {
        this.playerLists.clear();
    }
}