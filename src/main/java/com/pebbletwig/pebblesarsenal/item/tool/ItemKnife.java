package com.pebbletwig.pebblesarsenal.item.tool;

import com.google.common.collect.Multimap;
import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


//The Knife is like the BattleAxe, I couldn't figure out how to remove the sweep attack.
public class ItemKnife extends  net.minecraft.item.ItemSword{
    //Name of Knife
    private String name;
    //Constructor of the Knife
    public ItemKnife(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name=name;
        setCreativeTab(PebblesArsenal.creativeTab);
    }
    //Adds a tooltip to the Knife
    @Override
    public void addInformation (ItemStack stack, @Nullable World worldIn, List < String > tooltip, ITooltipFlag
        flagIn){
        tooltip.add("A quick, low damage knife.");
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
    //Override the 2 point damage to 1
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }
    //Register the Item Model
    public void registerItemModel() {
        PebblesArsenal.proxy.registerItemRenderer(this, 0, name);
    }

    //These methods are what allows the mod to function. They are what allows me to fine tune the attack damage and speed
    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

        if (slot == EntityEquipmentSlot.MAINHAND) {
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_DAMAGE, ATTACK_DAMAGE_MODIFIER, .6);
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, .835);
        }
        return modifiers;
    }

    private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap, IAttribute attribute, UUID id, double multiplier) {
        final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getName());

        final Optional<AttributeModifier> modifierOptional = modifiers.stream().filter(attributeModifier -> attributeModifier.getID().equals(id)).findFirst();

        if (modifierOptional.isPresent()) {
            final AttributeModifier modifier = modifierOptional.get();
            modifiers.remove(modifier);
            modifiers.add(new AttributeModifier(modifier.getID(), modifier.getName(), modifier.getAmount() * multiplier, modifier.getOperation())); // Add the new modifier
        }
    }
}