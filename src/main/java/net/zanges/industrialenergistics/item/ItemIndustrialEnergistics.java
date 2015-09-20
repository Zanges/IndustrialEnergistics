package net.zanges.industrialenergistics.item;

import net.minecraft.item.Item;
import net.zanges.industrialenergistics.creativetab.CreativeTabIndustrialEnergisics;
import net.zanges.industrialenergistics.reference.Reference;

public class ItemIndustrialEnergistics extends Item
{
    public ItemIndustrialEnergistics()
    {
        super();
        this.setCreativeTab(CreativeTabIndustrialEnergisics.IndustrialEnergisicsTab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", )
        //todo continue {https://github.com/pahimar/LetsModReboot/blob/master/src/main/java/com/pahimar/letsmodreboot/item/ItemLMRB.java}
        //todo add Unwrapper!
    }
}
