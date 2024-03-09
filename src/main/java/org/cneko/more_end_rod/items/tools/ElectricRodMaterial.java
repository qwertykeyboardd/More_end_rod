package org.cneko.more_end_rod.items.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ElectricRodMaterial implements ToolMaterial {
    public static normalRodMaterial INSTANCE = new normalRodMaterial();
    @Override
    public int getDurability() {
        return 50000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 3.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0F;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.END_ROD);
    }
}
