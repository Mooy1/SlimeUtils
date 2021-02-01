package io.github.mooy1.gridutils.implementation.containers.consumers.crafters;

import io.github.mooy1.infinitylib.filter.FilterType;
import io.github.mooy1.infinitylib.filter.MultiFilter;
import io.github.mooy1.gridutils.utils.GridLorePreset;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.collections.Pair;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class AutoSmeltery extends AbstractAutoCrafter {

    public static final SlimefunItemStack ITEM = new SlimefunItemStack(
            "SMELTERY_AUTO_CRAFTER",
            Material.FURNACE,
            "&eAutomatic Smeltery",
            "&7Automatically smelts dusts and ingots using GP",
            "",
            GridLorePreset.consumesGridPower(4)
    );

    public AutoSmeltery() {
        super(ITEM, 4, new ItemStack[] {
                
        });
    }

    @Override
    Pair<MultiFilter, ItemStack> getRecipe(@Nonnull ItemStack item) {
        SlimefunItem slimefunItem = SlimefunItem.getByItem(item);
        if (slimefunItem != null && slimefunItem.getRecipe().length == 9 && slimefunItem.getRecipeType() == RecipeType.SMELTERY) {
            return new Pair<>(new MultiFilter(FilterType.MIN_AMOUNT, slimefunItem.getRecipe()), slimefunItem.getRecipeOutput());
        }
        return null;
    }

}