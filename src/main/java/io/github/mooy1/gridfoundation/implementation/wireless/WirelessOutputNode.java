package io.github.mooy1.gridfoundation.implementation.wireless;

import io.github.mooy1.gridfoundation.setup.Categories;
import io.github.mooy1.gridfoundation.setup.Items;
import io.github.mooy1.gridfoundation.utils.WirelessUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.inventory.ItemStack;

public final class WirelessOutputNode extends SlimefunItem {
    
    public WirelessOutputNode() {
        super(Categories.MAIN, Items.WIRELESS_OUTPUT_NODE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                
        });
        
        addItemHandler(WirelessUtils.NODE_HANDLER);
        
    }
    
}