package gregtech.common.tools;

import net.minecraft.item.ItemStack;

public class ToolWrenchMV extends ToolWrenchLV {

    @Override
    public int getToolDamagePerBlockBreak(ItemStack stack) {
        return 2;
    }

    @Override
    public int getToolDamagePerDropConversion(ItemStack stack) {
        return 4;
    }

    @Override
    public int getToolDamagePerContainerCraft(ItemStack stack) {
        return 32;
    }

    @Override
    public int getToolDamagePerEntityAttack(ItemStack stack) {
        return 8;
    }

    @Override
    public int getBaseQuality(ItemStack stack) {
        return 1;
    }

    @Override
    public float getBaseDamage(ItemStack stack) {
        return 1.5F;
    }

    @Override
    public float getDigSpeedMultiplier(ItemStack stack) {
        return 3.0F;
    }

    @Override
    public float getMaxDurabilityMultiplier(ItemStack stack) {
        return 2.0F;
    }
}
