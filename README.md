# GiveAllPlayers Plugin

The GiveAllPlayers plugin for Bukkit/Spigot allows server administrators to give items to individual players or all online players with a simple command.

## Commands

- `/giveall <player> <item> <amount>`: Gives a specified player a certain amount of an item.
- `/giveallplayers <item> <amount>`: Gives all online players a certain amount of an item.

## Usage

### Single Player Give

To give an item to a specific player:

/giveall <player> <item> <amount>

Example:

/giveall Notch diamond_sword 1

### Give to All Players

To give an item to all online players:

/giveallplayers <item> <amount>

Example:

/giveallplayers diamond 64


## Permissions

- `giveallplayers.give`: Allows the use of `/giveall` and `/giveallplayers` commands.

## Features

- Supports giving any item available in Minecraft.
- Validates player and item names to prevent errors.
- Handles various scenarios, such as full inventories or invalid inputs.

## Configuration

Ensure the plugin is correctly installed on your Bukkit/Spigot server. No additional configuration is required.

## Contributing

Contributions are welcome! If you have suggestions, improvements, or encounter any issues, please create a pull request or issue on GitHub.

## Author

- **Marin Spudić** (GitHub: [fogracvxy](https://github.com/fogracvxy))

---

*This plugin was developed to simplify item distribution on Bukkit/Spigot servers and is intended for educational and personal use.*

