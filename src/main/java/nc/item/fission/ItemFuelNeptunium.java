package nc.item.fission;

import nc.Global;
import nc.handler.EnumHandler.NeptuniumFuelTypes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class ItemFuelNeptunium extends Item {

	public ItemFuelNeptunium(String unlocalizedName, String registryName) {
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Global.MOD_ID, registryName));
		setHasSubtypes(true);
	}

	public void getSubItems(Item item, CreativeTabs tab, NonNullList<ItemStack> items) {
		for (int i = 0; i < NeptuniumFuelTypes.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}
	
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < NeptuniumFuelTypes.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + NeptuniumFuelTypes.values()[i].getName();
			} else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + NeptuniumFuelTypes.values()[0].getName();
	}
}
