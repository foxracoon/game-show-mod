package tvtime.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tvtime.ItsTvTime;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ItsTvTime.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItsTvTime.LOGGER.info("Registering Mod Items for " + ItsTvTime.MOD_ID);
    }
}
