package pw.stellaric.unquarriedstone.util;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import pw.stellaric.unquarriedstone.init.ItemInit;

public class UnquarriedArmorItem extends ArmorItem {
    public UnquarriedArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }


    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        // TODO this is ticking for every piece they wear but it works.... they won't wear the armor for very long :)

        if (!world.isClientSide()){

            // calculate number of pieces they are wearing
            int pieceCount = 0;
            if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ItemInit.UNQUARRIED_HELMET.get()){
                pieceCount++;
            }
            if (player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ItemInit.UNQUARRIED_CHESTPLATE.get()){
                pieceCount++;
            }
            if (player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ItemInit.UNQUARRIED_LEGGINGS.get()){
                pieceCount++;
            }
            if (player.getItemBySlot(EquipmentSlot.FEET).getItem() == ItemInit.UNQUARRIED_BOOTS.get()){
                pieceCount++;
            }

            // if they are wearing any armor pieces
            if(pieceCount > 0){
                // add a slowness effect that scales with # of pieces equipped
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, pieceCount));
            }
        }
    }
}
