package nc.block.tile.energy.storage;

import nc.tile.energyStorage.Batteries;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockVoltaicPileBasic extends BlockBattery {

	public BlockVoltaicPileBasic(String unlocalizedName, String registryName) {
		super(unlocalizedName, registryName);
	}
	
	public TileEntity createNewTileEntity(World world, int meta) {
		return new Batteries.VoltaicPileBasic();
	}
}
