package pw.stellaric.unquarriedstone.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pw.stellaric.unquarriedstone.util.UnquarriedArmorItem;
import pw.stellaric.unquarriedstone.util.UnquarriedArmorMaterial;
import pw.stellaric.unquarriedstone.UnquarriedStone;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnquarriedStone.MODID);

    public static final RegistryObject<Item> WHITE_CLAY_BALL = ITEMS.register("clay_ball_white", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> BLACK_CLAY_BALL = ITEMS.register("clay_ball_black", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> RED_CLAY_BALL = ITEMS.register("clay_ball_red", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> BLUE_CLAY_BALL = ITEMS.register("clay_ball_blue", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> GREEN_CLAY_BALL = ITEMS.register("clay_ball_green", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> ORANGE_CLAY_BALL = ITEMS.register("clay_ball_orange", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> PINK_CLAY_BALL = ITEMS.register("clay_ball_pink", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> PURPLE_CLAY_BALL = ITEMS.register("clay_ball_purple", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));

    // white, black, red, blue, green, orange, pink, purple

    // armor
    public static final RegistryObject<Item> UNQUARRIED_HELMET = ITEMS.register("unquarried_helmet", () -> new UnquarriedArmorItem(UnquarriedArmorMaterial.UNQUARRIED_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> UNQUARRIED_CHESTPLATE = ITEMS.register("unquarried_chestplate", () -> new UnquarriedArmorItem(UnquarriedArmorMaterial.UNQUARRIED_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> UNQUARRIED_LEGGINGS = ITEMS.register("unquarried_leggings", () -> new UnquarriedArmorItem(UnquarriedArmorMaterial.UNQUARRIED_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTab.instance)));
    public static final RegistryObject<Item> UNQUARRIED_BOOTS = ITEMS.register("unquarried_boots", () -> new UnquarriedArmorItem(UnquarriedArmorMaterial.UNQUARRIED_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTab.instance)));

    public static class ModCreativeTab extends CreativeModeTab {
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.UNQUARRIED_STONE.get());
        }

        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "unquarriedstone"); // name for creative tab group
    }
}

