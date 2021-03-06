package com.pebbletwig.pebblesarsenal.world;

import com.pebbletwig.pebblesarsenal.block.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;
//This class causes the Ore Blocks to spawn in the World
public class ModWorldGen implements IWorldGenerator{
    //The following methods are what generate the Ores in the World
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        generateOre(ModBlocks.oreCopper.getDefaultState(), world, random, chunkX * 16,chunkZ*16, 16, 64, 4 + random.nextInt(4), 6);
        generateOre(ModBlocks.orePebble.getDefaultState(), world, random, chunkX * 16,chunkZ*16, 12, 72, 3 + random.nextInt(4), 6);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;

        for (int i = 0; i< chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }

}
