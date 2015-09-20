package net.zanges.industrialenergistics.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.zanges.industrialenergistics.reference.Reference;

public class CreativeTabIndustrialEnergisics
{
    public static final CreativeTabs IndustrialEnergisicsTab = new CreativeTabs(Reference.LC_MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}
