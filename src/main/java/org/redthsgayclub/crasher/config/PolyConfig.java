package org.redthsgayclub.crasher.config;

import cc.polyfrost.oneconfig.config.annotations.*;
import cc.polyfrost.oneconfig.config.annotations.Number;
import net.minecraft.client.Minecraft;
import org.redthsgayclub.crasher.Crasher;
import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

/**
 * The main Config entrypoint that extends the Config type and inits the config options.
 * See <a href="https://docs.polyfrost.cc/oneconfig/config/adding-options">this link</a> for more config Options
 */
public class PolyConfig extends Config {

    @Number(
            name = "Packets Amount",    // name of the component
            min = 1000, max = 1000000,        // min and max values (anything above/below is set to the max/min
            step = 10000    // each time the arrow is clicked it will increase/decrease by this amount
    )
    public static int packets = 10000; // default value

    @Button(
            name = "Crash the Server",    // name beside the button
            text = "Start"        // text on the button itself
    )
    Runnable crash = () -> Minecraft.getMinecraft().thePlayer.sendChatMessage("/crash");

    public PolyConfig() {
        super(new Mod(Crasher.NAME, ModType.UTIL_QOL), Crasher.MODID + ".json");
        initialize();
    }
}

