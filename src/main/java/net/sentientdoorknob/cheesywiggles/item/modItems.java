package net.sentientdoorknob.cheesywiggles.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sentientdoorknob.cheesywiggles.CheesyWiggles;
import org.apache.commons.lang3.math.IEEE754rUtils;

public class modItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CheesyWiggles.MOD_ID);

    public static final RegistryObject<Item> CHEESY_WIGGLES = ITEMS.register("cheesy_wiggles",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
