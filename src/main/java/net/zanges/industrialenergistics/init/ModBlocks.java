package net.zanges.industrialenergistics.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.zanges.industrialenergistics.block.BlockIndustrialEnergistics;
import net.zanges.industrialenergistics.block.IndustrialPackager;
import net.zanges.industrialenergistics.reference.Names;
import net.zanges.industrialenergistics.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockIndustrialEnergistics industrialpackager = new IndustrialPackager();

    public static void init()
    {
        GameRegistry.registerBlock(industrialpackager, Names.Blocks.INDUSTRIALPACKAGER);
    }
}
