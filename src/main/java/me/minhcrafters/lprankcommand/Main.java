package me.minhcrafters.lprankcommand;

import me.minhcrafters.lprankcommand.command.RankCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getCommand("rank").setExecutor(new RankCommand(this));
    }
}
