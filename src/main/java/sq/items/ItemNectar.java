package sq.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;
import sq.core.SpiderCore;

/**
 * Nectar is simply a food item that heals 3 food points and has little saturation.
 */
public class ItemNectar extends ItemFood
{
	public ItemNectar()
	{
		super(3, 0.4F, false);
		setAlwaysEdible();
		
		final String name = "nectar";
		setUnlocalizedName(name);
		setTextureName("sq:" + name);
		setCreativeTab(SpiderCore.getCreativeTab());
		
		GameRegistry.registerItem(this, name);
	}
}
