package com.finallion.graveyard.init;

import com.finallion.graveyard.TheGraveyard;
import com.finallion.graveyard.blockentities.BrazierBlockEntity;
import com.finallion.graveyard.blockentities.GravestoneBlockEntity;
import com.finallion.graveyard.blockentities.SarcophagusBlockEntity;
import com.finallion.graveyard.blockentities.UrnBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class TGTileEntities {

    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, TheGraveyard.MOD_ID);

    public static final RegistryObject<BlockEntityType<GravestoneBlockEntity>> GRAVESTONE_BLOCK_ENTITY = register("gravestone_block_entity", () -> BlockEntityType.Builder.of(GravestoneBlockEntity::new,
            TGBlocks.GRAVESTONE,
            TGBlocks.DEEPSLATE_GRAVESTONE,
            TGBlocks.MOSSY_COBBLESTONE_GRAVESTONE,
            TGBlocks.COBBLESTONE_GRAVESTONE
    ).build(null));

    public static final RegistryObject<BlockEntityType<UrnBlockEntity>> URN_BLOCK_ENTITY = register("urn_block_entity", () -> BlockEntityType.Builder.of(UrnBlockEntity::new,  TGBlocks.BLACK_URN,
            TGBlocks.BLUE_URN,
            TGBlocks.LIGHT_BLUE_URN,
            TGBlocks.CYAN_URN,
            TGBlocks.BROWN_URN,
            TGBlocks.GRAY_URN,
            TGBlocks.LIGHT_GRAY_URN,
            TGBlocks.PURPLE_URN,
            TGBlocks.MAGENTA_URN,
            TGBlocks.PINK_URN,
            TGBlocks.RED_URN,
            TGBlocks.YELLOW_URN,
            TGBlocks.ORANGE_URN,
            TGBlocks.GREEN_URN,
            TGBlocks.LIME_URN,
            TGBlocks.WHITE_URN).build(null));

    public static final RegistryObject<BlockEntityType<SarcophagusBlockEntity>> SARCOPHAGUS_BLOCK_ENTITY = register("sarcophagus_block_entity", () -> BlockEntityType.Builder.of(SarcophagusBlockEntity::new,
            TGBlocks.SARCOPHAGUS,
            TGBlocks.OAK_COFFIN,
            TGBlocks.DARK_OAK_COFFIN,
            TGBlocks.ACACIA_COFFIN,
            TGBlocks.JUNGLE_COFFIN,
            TGBlocks.BIRCH_COFFIN,
            TGBlocks.CRIMSON_COFFIN,
            TGBlocks.WARPED_COFFIN,
            TGBlocks.SPRUCE_COFFIN
    ).build(null));

    public static final RegistryObject<BlockEntityType<BrazierBlockEntity>> BRAZIER_BLOCK_ENTITY = register("brazier_block_entity", () -> BlockEntityType.Builder.of(BrazierBlockEntity::new,
            TGBlocks.SOUL_FIRE_BRAZIER,
            TGBlocks.FIRE_BRAZIER).build(null));

    private static <T extends BlockEntityType<?>> RegistryObject<T> register(String name, Supplier<T> tileEntity) {
        return TILE_ENTITIES.register(name, tileEntity);
    }



}
