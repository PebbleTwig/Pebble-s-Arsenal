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

//The Item class for my GreatAxe
public class ItemAxe extends net.minecraft.item.ItemAxe {
    //Name of BattleAxe
    private String name;
    //Constructor for the BattleAxe
    public ItemAxe(ToolMaterial material, String name){
        super(material,11f ,-1f);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name=name;
        setCreativeTab(PebblesArsenal.creativeTab);
    }
    //This adds a tooltip to the weapon
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
       tooltip.add("This battleaxe is meant to be used as a weapon, not as a wood chopping axe.");
       super.addInformation(stack, worldIn, tooltip, flagIn);
    }
    //I was a little on the stupid side and couldn't figure out how to make a weapon without the sweep,
    //so I just made the weapon an axe, made its mining speed 1, and changed the item damage from
    //hitting a mob from 2 to 1
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
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, 3.2);
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