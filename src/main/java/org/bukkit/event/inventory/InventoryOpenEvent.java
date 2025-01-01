package org.bukkit.event.inventory;

import org.bukkit.event.Cancellable;
import org.bukkit.inventory.InventoryView;

/**
 * Called when a player opens an inventory
 */
public class InventoryOpenEvent extends InventoryEvent implements Cancellable {
    private boolean cancelled = false;

    public InventoryOpenEvent(InventoryView transaction) {
        super(Type.INVENTORY_OPEN, transaction);
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }
}
