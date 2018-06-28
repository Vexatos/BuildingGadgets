package com.direwolf20.buildinggadgets;

import com.direwolf20.buildinggadgets.Network.PacketChangeRange;
import com.direwolf20.buildinggadgets.Network.PacketHandler;
import com.direwolf20.buildinggadgets.Network.PacketToggleMode;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputHandler {

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (KeyBindings.modeSwitch.isPressed()) {
            PacketHandler.INSTANCE.sendToServer(new PacketToggleMode());
            System.out.println("Mode Switch");
        } else if (KeyBindings.rangeChange.isPressed()) {
            PacketHandler.INSTANCE.sendToServer(new PacketChangeRange());
            System.out.println("Range Change");
        }
    }
}