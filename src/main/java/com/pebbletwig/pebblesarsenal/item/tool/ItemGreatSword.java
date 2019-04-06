package com.pebbletwig.pebblesarsenal.item.tool;

import com.google.common.collect.Multimap;
import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public class ItemGreatSword extends net.minecraft.item.ItemSword {
    //Name of Greatsword
    private String name;
    //Constructor for Greatsword
    public ItemGreatSword(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name=name;
        setCreativeTab(PebblesArsenal.creativeTab);
    }
    //Register the Item Model

    public void registerItemModel() {
        PebblesArsenal.proxy.registerItemRenderer(this, 0, name);
    }
    //These methods are what allows the mod to function. They are what allows me to fine tune the attack damage and speed
        @Override
        public Multimap<String, AttributeModifier> getAttributeModifiers (EntityEquipmentSlot slot, ItemStack stack){
            final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

            if (slot == EntityEquipmentSlot.MAINHAND) {
                replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_DAMAGE, ATTACK_DAMAGE_MODIFIER, 1.4);
                replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, 1.168);
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