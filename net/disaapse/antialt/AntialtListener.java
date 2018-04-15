package net.disaapse.antialt;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class AntialtListener implements Listener {
	@EventHandler
	public void onplayerJoinEvent(PlayerLoginEvent event) {
		Antialt.banCheck(event);
	}
}
