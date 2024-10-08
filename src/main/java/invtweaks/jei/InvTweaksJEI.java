package invtweaks.jei;

import invtweaks.InvTweaksMod;
import invtweaks.events.ClientEvents;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("unused")
@JeiPlugin
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class InvTweaksJEI implements IModPlugin {
    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(InvTweaksMod.MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {
        ClientEvents.setJEIKeyboardActiveFn(() -> jeiRuntime.getIngredientListOverlay().hasKeyboardFocus());
    }
}
