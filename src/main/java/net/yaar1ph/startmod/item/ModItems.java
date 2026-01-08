package net.yaar1ph.startmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yaar1ph.startmod.StartMod;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(StartMod.MOD_ID, name), item);
    }


    public static  void registerModItems() {
        StartMod.LOGGER.info("Registering Mod Items for " + StartMod.MOD_ID);
    }

}
