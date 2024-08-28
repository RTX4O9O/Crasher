package org.redthsgayclub.crasher;

import org.redthsgayclub.crasher.command.CrashCommand;
import org.redthsgayclub.crasher.config.PolyConfig;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import net.minecraftforge.fml.common.Mod;
import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * The entrypoint of the Example Mod that initializes it.
 *
 * @see Mod
 * @see InitializationEvent
 */
@Mod(modid = Crasher.MODID, name = Crasher.NAME, version = Crasher.VERSION)
public class Crasher {

    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    @Mod.Instance(MODID)
    public static Crasher INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static PolyConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new PolyConfig();
        CommandManager.INSTANCE.registerCommand(new CrashCommand());
    }
}
