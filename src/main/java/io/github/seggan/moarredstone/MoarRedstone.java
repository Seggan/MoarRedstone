package io.github.seggan.moarredstone;

import io.github.mooy1.infinitylib.AbstractAddon;
import io.github.mooy1.infinitylib.bstats.bukkit.Metrics;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MoarRedstone extends AbstractAddon {

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Nullable
    @Override
    protected Metrics setupMetrics() {
        return null;
    }

    @Nonnull
    @Override
    protected String getGithubPath() {
        return "Seggan/MoarRedstone/master";
    }
}
