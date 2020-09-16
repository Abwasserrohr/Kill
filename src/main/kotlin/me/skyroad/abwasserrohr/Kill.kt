package me.skyroad.abwasserrohr

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class Kill: JavaPlugin() {
    override fun onEnable() {
        this.getCommand("kill").executor = KillCommand
    }
}
