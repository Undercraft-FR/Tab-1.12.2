package fr.undercraft.tab.Events;

import fr.undercraft.tab.Main;
import fr.undercraft.tab.Managers.TabManager;
import fr.undercraft.tab.Util.PlayerList;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEvents implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        TabManager manager = Main.managers.tabManager;

        PlayerList playerList = new PlayerList(player, PlayerList.SIZE_TWO);
        manager.register(player.getName(), playerList);

        playerList.initTable();

        playerList.updateSlot(0,"Top left");
        playerList.updateSlot(19,"Bottom left");
        playerList.updateSlot(60,"Top right");
        playerList.updateSlot(79,"Bottom right");

        playerList.setHeaderFooter(ChatColor.GOLD+"Welcome","Test Message");
    }

    @EventHandler
    void onPlayerQuit(PlayerQuitEvent event)
    {
        Player player = event.getPlayer();
        TabManager manager = Main.managers.tabManager;

        manager.playerLists.remove(player.getName());
    }
}
