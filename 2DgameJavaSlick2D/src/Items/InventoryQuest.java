package Items;
/*
 * quest item in the inventory
 * author: weiqian wang<wangw>
 * */


import java.util.ArrayList;


import org.newdawn.slick.Image;

import project2.Bonus;
import project2.Item;
import project2.Unit;
import project2.Item.Type;

public class InventoryQuest extends InventoryItem
{
	/**
	 * Create a new consumable item
	 * 
	 * @param name
	 *            The name of the item
	 * @param avatar
	 *            The graphical representation of the item
	 */
	public InventoryQuest(String name, Image avatar, ArrayList<Bonus> bonuses)
	{
		super(name, Item.Type.QUEST, avatar, bonuses);
	}

	/**
	 * A quest item is used by an NPC (unit) and taken FROM the player
	 * 
	 * @param target
	 *            The unit who is having the item used
	 * @param unit
	 *            The unit using the item
	 */
	public void use(Unit target, Unit unit)
	{
		// Consume the item
		target.getInventory().getItems().remove(this);
		System.out.println(unit.getName() + " removed " + this.getName() + "!");
	}
}
