package net.zanges.industrialenergistics.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.zanges.industrialenergistics.creativetab.CreativeTabIndustrialEnergisics;
import net.zanges.industrialenergistics.reference.Reference;

public class BlockIndustrialEnergistics extends Block
{
    public BlockIndustrialEnergistics(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabIndustrialEnergisics.IndustrialEnergisicsTab);
    }

    public BlockIndustrialEnergistics()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabIndustrialEnergisics.IndustrialEnergisicsTab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.LC_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
