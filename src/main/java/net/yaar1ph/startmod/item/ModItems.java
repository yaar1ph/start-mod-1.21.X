package net.yaar1ph.startmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.yaar1ph.startmod.StartMod;

public class ModItems {

    public static final RegistryKey<Item> PINK_GARNET_KEY =
            RegistryKey.of(RegistryKeys.ITEM,
                    Identifier.of(StartMod.MOD_ID, "pink_garnet"));

    public static final Item PINK_GARNET = Registry.register(
            Registries.ITEM,
            PINK_GARNET_KEY,
            new Item(new Item.Settings().registryKey(PINK_GARNET_KEY))
    );

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(entries -> entries.add(PINK_GARNET));
    }
}
