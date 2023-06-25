package net.sentientdoorknob.cheesywiggles.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sentientdoorknob.cheesywiggles.CheesyWiggles;

@Mod.EventBusSubscriber(modid = CheesyWiggles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab TESTMOD;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TESTMOD = event.registerCreativeModeTab(new ResourceLocation(CheesyWiggles.MOD_ID,"tutorial_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.GRIZZLY_CHUNGUS.get()))
                        .title(Component.translatable("creativemodetab.tutorial_tab")));
    }
}
