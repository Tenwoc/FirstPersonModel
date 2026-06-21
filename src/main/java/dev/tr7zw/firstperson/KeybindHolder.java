package dev.tr7zw.firstperson;

import dev.tr7zw.transition.loader.*;
import dev.tr7zw.transition.mc.*;
import lombok.*;
import net.minecraft.client.*;

public final class KeybindHolder {
    public static final KeybindHolder INSTANCE = new KeybindHolder();
    private boolean initialized = false;
    @Getter
    private KeyMapping keyBinding = GeneralUtil.createKeyMapping("key.firstperson.toggle", 295, "firstperson:keybind");

    private KeybindHolder() {
    }

    public void registerKeybinds() {
        if (initialized)
            return;
        initialized = true;
        ModLoaderUtil.registerKeybind(keyBinding);
    }

}
