package com.rettichlp.vegetablebox.base.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;

public interface UnicacityCommand {

    LiteralArgumentBuilder<CommandSource> onCommand();
}
