package eyeq.burninggrass.event;

import eyeq.util.event.world.BlockFiredEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BurningGrassEventHandler {
    @SubscribeEvent
    public void onBlockFired(BlockFiredEvent event) {
        if(event.getState().getBlock() == Blocks.GRASS) {
            event.getWorld().setBlockState(event.getPos(), Blocks.DIRT.getDefaultState());
        }
    }
}
