package net.zanges.industrialenergistics.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
        return String.format("item.%s%s", Reference.LC_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.LC_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
