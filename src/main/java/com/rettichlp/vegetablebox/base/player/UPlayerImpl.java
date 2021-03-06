package com.rettichlp.vegetablebox.base.player;

import com.rettichlp.vegetablebox.VegetableBox;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.UUID;

/**
 * @author RettichLP
 * @see <a href="https://github.com/paulzhng/UCUtils/blob/master/src/main/java/de/fuzzlemann/ucutils/base/abstraction/UPlayerImpl.java">UCUtils by paulzhng</a>
 */
public class UPlayerImpl implements UPlayer {

    @Override
    public ClientPlayerEntity getPlayer() {
        return VegetableBox.MINECRAFT.player;
    }

    @Override
    public String getName() {
        return getPlayer().getDisplayName().getString();
    }

    @Override
    public UUID getUUID() {
        return getPlayer().getUUID();
    }

    @Override
    public String getStringUUID() {
        return getPlayer().getStringUUID();
    }

    @Override
    public MinecraftServer getMinecraftServer() {
        return getPlayer().getServer();
    }

    @Override
    public Scoreboard getScoreboard() {
        return getPlayer().getScoreboard();
    }

    @Override public World getWorld() {
        return getPlayer().getCommandSenderWorld();
    }

    @Override
    public void sendMessage(ITextComponent message) {
        getPlayer().sendMessage(message, getUUID());
    }

    @Override public void sendMessageAsString(String message) {
        sendMessage(ITextComponent.nullToEmpty(message));
    }

    @Override
    public void playSound(SoundEvent soundEvent, Float volume, Float pitch) {
        getPlayer().playSound(soundEvent, volume, pitch);
    }

    @Override
    public PlayerInventory getInventory() {
        return getPlayer().inventory;
    }

    @Override
    public Container getContainer() {
        return getPlayer().containerMenu;
    }

    @Override
    public ClientPlayNetHandler getConnection() {
        return getPlayer().connection;
    }
}
