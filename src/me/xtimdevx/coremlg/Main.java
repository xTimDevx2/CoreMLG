package me.xtimdevx.coremlg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by xTimDevx on 8/12/2017.
 */
public class Main extends JavaPlugin{

    public static Main plugin;
    private Logger logger = Logger.getLogger("Minecraft");

    public void onEnable() {
        plugin = this;
        logger.info("--------------------------------------------------------------------");
        logger.info("Plugin 'CoreMLG' by xTimDevx version BETA0.1");
        logger.info("Spigot link: ...");
        logger.info("Thanks for supporting my plugins!");
        logger.info("--------------------------------------------------------------------");
    }
}
