package ru.shirk.fullwheelanimation;

import dev.by1337.bc.addon.AbstractAddon;
import dev.by1337.bc.animation.AnimationRegistry;
import org.bukkit.plugin.Plugin;
import org.by1337.blib.util.SpacedNameKey;

import java.io.File;

public final class FullWheelAnimation extends AbstractAddon {

    @Override
    protected void onEnable() {
        AnimationRegistry.INSTANCE.register("shirkqqe:fullwheel", Animation::new);
        Plugin plugin = getPlugin();
        saveResourceToFile("full_wheel.yml", new File(plugin.getDataFolder(), "animations/full_wheel.yml"));
    }

    @Override
    protected void onDisable() {
        AnimationRegistry.INSTANCE.unregister(new SpacedNameKey("shirkqqe:fullwheel"));
    }
}
