package com.thorfusion.titanpower;


import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class TitanpowerOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider hunckProvider) {
		switch (world.provider.dimensionId) {
			case 1:
				generateEnd(world, random, chunkX, chunkZ);
				break;
			case 0:
				generateOverworld(world, random, chunkX, chunkZ);
				break;
			case -1:
				generateNether(world, random, chunkX, chunkZ);
				break;
		}
	}
	public void generateEnd(World world, Random rand, int x, int z) {
		if(TitanpowerConfig.Blueradiengenerationend) {
			generateOre(TitanpowerOreBlocks.bluradienend, world, rand, x, z, TitanpowerConfig.Blueradiengenerationendminveinsize, TitanpowerConfig.Blueradiengenerationendmaxveinsize, TitanpowerConfig.Blueradiengenerationendchanceveinsize, TitanpowerConfig.Blueradiengenerationendminy, TitanpowerConfig.Blueradiengenerationendmaxy, Blocks.end_stone);
		}
	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		if(TitanpowerConfig.Blueradiengeneration) {
			generateOre(TitanpowerOreBlocks.bluradien, world, rand, x, z, TitanpowerConfig.Blueradiengenerationminveinsize, TitanpowerConfig.Blueradiengenerationmaxveinsize, TitanpowerConfig.Blueradiengenerationchanceveinsize, TitanpowerConfig.Blueradiengenerationminy, TitanpowerConfig.Blueradiengenerationmaxy, Blocks.stone);
		}
	}

	public void generateNether(World world, Random rand, int x, int z) {
		if(TitanpowerConfig.Blueradiengenerationnether) {
			generateOre(TitanpowerOreBlocks.bluradiennether, world, rand, x, z, TitanpowerConfig.Blueradiengenerationnetherminveinsize, TitanpowerConfig.Blueradiengenerationnethermaxveinsize, TitanpowerConfig.Blueradiengenerationnetherchanceveinsize, TitanpowerConfig.Blueradiengenerationnetherminy, TitanpowerConfig.Blueradiengenerationnethermaxy, Blocks.netherrack);
		}
	}

	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generatIn) {
		int viensize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightrange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, viensize, generatIn);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightrange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}
}

