package pw.stellaric.unquarriedstone.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import pw.stellaric.unquarriedstone.UnquarriedStone;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UnquarriedStone.MODID);

    public static final RegistryObject<Block> UNQUARRIED_STONE = BLOCKS.register("unquarried_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    // public static final RegistryObject<Block> UNQUARRIED_STONE = BLOCKS.register("unquarried_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ABYSSAL_STONE = BLOCKS.register("abyssal_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_STONE = BLOCKS.register("pink_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_STONE = BLOCKS.register("red_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_STONE = BLOCKS.register("purple_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_STONE = BLOCKS.register("blue_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_STONE = BLOCKS.register("green_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_STONE = BLOCKS.register("orange_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));

    @SubscribeEvent
    public static void onRegisterItems(final RegisterEvent event) {
        if (event.getRegistryKey().equals(ForgeRegistries.Keys.ITEMS)) {
            BLOCKS.getEntries().forEach( (blockRegistryObject) -> {
                Block block = blockRegistryObject.get();
                Item.Properties properties = new Item.Properties().tab(ItemInit.ModCreativeTab.instance);
                Supplier<Item> blockItemFactory = () -> new BlockItem(block, properties);
                event.register(ForgeRegistries.Keys.ITEMS, blockRegistryObject.getId(), blockItemFactory);
            });
        }
    }

}
