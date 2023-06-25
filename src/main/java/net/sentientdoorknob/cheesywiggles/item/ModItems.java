package net.sentientdoorknob.cheesywiggles.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sentientdoorknob.cheesywiggles.CheesyWiggles;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CheesyWiggles.MOD_ID);

    public static final RegistryObject<Item> GRIZZLY_CHUNGUS = ITEMS.register("grizzly_chungus",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
