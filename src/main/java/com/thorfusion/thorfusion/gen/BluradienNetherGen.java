package com.thorfusion.thorfusion.gen;

import com.thorfusion.thorfusion.ThorfusionConfig;
import com.thorfusion.thorfusion.ThorfusionOreBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class BluradienNetherGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkx, int chunkz, World world, IChunkProvider chunkGenerator, IChunkProvider hunckProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkx, chunkz);
                break;
        }
    }

    public void generateNether(World world, Random rand, int x, int z) {
        generateOre(ThorfusionOreBlocks.bluradiennether, world, rand, x, z, ThorfusionConfig.Blueradiengenerationnetherminveinsize, ThorfusionConfig.Blueradiengenerationnethermaxveinsize, ThorfusionConfig.Blueradiengenerationnetherchanceveinsize, ThorfusionConfig.Blueradiengenerationnetherminy, ThorfusionConfig.Blueradiengenerationnethermaxy, Blocks.netherrack);
    }

    public void generateOre(Block block, World world, Random random, int chunkx, int chunkz, int minviensize, int maxviensize, int chance, int minY, int maxY, Block generatin) {
        int viensize = minviensize + random.nextInt(maxviensize - minviensize);
        int heightrange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, viensize, generatin);
        for (int i = 0; i < chance; i++) {
            int xrand = chunkx * 16 + random.nextInt(16);
            int yrand = random.nextInt(heightrange) + minY;
            int zrand = chunkz * 16 + random.nextInt(16);
            gen.generate(world, random, xrand, yrand, zrand);
        }
    }
}