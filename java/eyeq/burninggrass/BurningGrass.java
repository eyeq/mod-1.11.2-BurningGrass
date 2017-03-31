package eyeq.burninggrass;

import eyeq.burninggrass.event.BurningGrassEventHandler;
import eyeq.util.common.Utils;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.burninggrass.BurningGrass.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class BurningGrass {
    public static final String MOD_ID = "eyeq_burninggrass";

    @Mod.Instance(MOD_ID)
    public static BurningGrass instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Utils.EVENT_BUS.register(new BurningGrassEventHandler());
        Blocks.FIRE.setFireInfo(Blocks.GRASS, 60, 20);
    }
}
