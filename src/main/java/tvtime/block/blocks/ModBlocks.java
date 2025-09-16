package tvtime.block.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tvtime.ItsTvTime;

public class ModBlocks {
    public static final Block STAGE_LIGHT = registerBlock("STAGE BLOCK",
        new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,new Identifier(ItsTvTime.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(ItsTvTime.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ItsTvTime.LOGGER.info("Registering ModBlocks for " + ItsTvTime.MOD_ID);
    }
}
//come on the floor and the wall on your door