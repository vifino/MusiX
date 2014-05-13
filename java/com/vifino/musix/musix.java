package com.vifino.musix;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;



@Mod(modid = musix.MODID, version = musix.VERSION)
public class musix
{
    public static final String MODID = "MusiX";
    public static final String VERSION = "0.1";
    
    public Block blockTest;
    
    // Initialisation
    public static CreativeTabs musixTab = new CreativeTabs("musix"){
		@Override
		public Item getTabIconItem() {
			return Items.record_13;
		}
    };
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	blockTest = new BlockTest(Material.ground).setBlockName("Test Block");
    	blockTest.setCreativeTab(musixTab);
    	GameRegistry.registerBlock(blockTest, "Test Block");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
