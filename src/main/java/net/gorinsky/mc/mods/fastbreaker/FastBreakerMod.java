package net.gorinsky.mc.mods.fastbreaker;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = FastBreakerMod.MODID, version = FastBreakerMod.VERSION)
public class FastBreakerMod
{
    public static final String MODID = "fastbreaker";
    public static final String VERSION = "1.0";
    private static final net.minecraft.block.Block[] blocks = new net.minecraft.block.Block[]{
            Blocks.dirt,
            Blocks.grass,
            Blocks.stone,
            Blocks.sand,
            Blocks.clay,
            Blocks.coal_ore,
            Blocks.cobblestone,
            Blocks.cobblestone_wall,
            Blocks.diamond_ore,
            Blocks.emerald_ore,
            Blocks.end_bricks,
            Blocks.end_stone,
            Blocks.gold_ore,
            Blocks.grass,
            Blocks.gravel,
            Blocks.hardened_clay,
            Blocks.iron_ore,
            Blocks.lapis_ore,
            Blocks.leaves,
            Blocks.leaves2,
            Blocks.log,
            Blocks.log2,
            Blocks.melon_block,
            Blocks.melon_stem,
            Blocks.mossy_cobblestone,
            Blocks.nether_brick,
            Blocks.obsidian,
            Blocks.pumpkin,
            Blocks.quartz_ore,
            Blocks.red_mushroom,
            Blocks.red_mushroom_block,
            Blocks.red_sandstone,
            Blocks.redstone_ore,
            Blocks.sand,
            Blocks.sandstone,
            Blocks.stone,
            Blocks.stonebrick,
    };
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        for(net.minecraft.block.Block block : blocks) {
            block.setHardness(0.25f);
        }
    }
}
