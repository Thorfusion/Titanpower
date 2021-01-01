package com.thorfusion.titanpower.gen;

import com.thorfusion.titanpower.TitanpowerConfig;
import com.thorfusion.titanpower.TitanpowerOreBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class BluradienEndGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkx, int chunkz, World world, IChunkProvider chunkGenerator, IChunkProvider hunckProvider) {
        switch (world.provider.dimensionId) {
            case 1:
                generateEnd(world, random, chunkx, chunkz);
                break;
        }
    }

    public void generateEnd(World world, Random rand, int x, int z) {
        generateOre(TitanpowerOreBlocks.bluradienend, world, rand, x, z, TitanpowerConfig.Blueradiengenerationendminveinsize, TitanpowerConfig.Blueradiengenerationendmaxveinsize, TitanpowerConfig.Blueradiengenerationendchanceveinsize, TitanpowerConfig.Blueradiengenerationendminy, TitanpowerConfig.Blueradiengenerationendmaxy, Blocks.end_stone);
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