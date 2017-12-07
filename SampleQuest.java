package de.alkhemeia.necromancy.Map.Quests;

import de.alkhemeia.necromancy.Fragments.MapFragment;
import de.alkhemeia.necromancy.Fragments.Places.ExploreFragment;

/**
 * Created by alkhemeia on 04.12.17.
 *
 * This is a sample quest, use the following actions to design your quest:
 *
 * addExp(int exp); <- Gives this player [exp] Experience
 * getHP();  <- Returns Hitpoints of player as int
 * getMaxHP();  <- Returns maximum Hitpoints of player as int
 * changeHP(int new_hp) <- Set players Hitpoints to [new_hp]
 * getMana();  <- Returns Mana of player as [int]
 * getMaxMana();  <- Returns maximum Mana of player as [int]
 * changeMana(int new_mana) <- Set players Mana to [new_mana]
 * kill(); <- Kills the player
 *
 * getItemAmount(int item_id); <- Returns amount of items in inventory in [int]
 * addItem(int item_id, int amount); <- Add [amount] of [item_id] to players inventory
 * removeItem(int item_id, int amount); <- Remove [amount] of [item_id] to players inventory
 *
 * Item IDs:
 *  1 > Bone
 *  2 > Holz
 *  3 > Stone
 *  4 > Corpse
 *  5 > Silver
 *  6 > Dog corpse
 *  7 > Mana potion
 *  8 > Heal potion
 *  9 > Gold
 *  10 > Iron
 *  11 > Silver coin
 *  12 > Gold coin
 *  13 > Sword
 *  14 > Plate Armor
 *  15 > Shield
 *  16 > Bandage
 *  17 > Used bandages
 *  18 > Empty Bottle
 *  19 > Camping kit
 *
 * If you need more actions, contact me at admin@alkhemeia.de
 */

public class SampleQuest extends Quest {

    // Quest begins here
    public void start() {
        exploreFragment.setQuestText("Welcome to the test Quest! Chose 1, 2 or 3");
        exploreFragment.setButton1("1 ...", 1);
        exploreFragment.setButton2("... 2 ...", 2);
        exploreFragment.setButton3("... 3", 3);
    }

    // Add new pages for this quest here
    public void next(int page) {
        switch (page) {
            case 1:
                exploreFragment.setQuestText("Wow, page 1. Time to leave.");
                exploreFragment.setButton1("Leave", 0);
                break;

            case 2:
                exploreFragment.setQuestText("This is page 2, do you want go to page 1 or 3?");
                exploreFragment.setButton1("1 ...", 1);
                exploreFragment.setButton2("... 3", 3);
                break;

            case 3:
                exploreFragment.setQuestText("This is page 3, do you want to go to page 2 or leave?");
                exploreFragment.setButton1("2 ...", 2);
                exploreFragment.setButton2("Leave", 0);
                break;

            case 0:
                MapFragment.go();
                break;
        }
    }

    // Ignore all other below here!
    ExploreFragment exploreFragment;

    public SampleQuest(ExploreFragment exploreFragment, String adID) {
        super(exploreFragment, adID);
    }

    @Override
    public void setExploreFragment(ExploreFragment exploreFragment) {
        this.exploreFragment = exploreFragment;
    }

    public String getAdID() {
        return adID;
    }
}
