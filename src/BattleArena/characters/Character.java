package BattleArena.characters;

import BattleArena.arena.ArenaMediator;
import BattleArena.elements.Element;

public class Character {
    private String name;
    private Element element;
    private ArenaMediator mediator;

    public Character(String name, Element element, ArenaMediator mediator) {
        this.name = name;
        this.element = element;
        this.mediator = mediator;
        mediator.register(this);
    }

    public String getName() {
        return name;
    }

    public Element getElement() {
        return element;
    }

    public void attack(Character enemy) {
        mediator.fight(this, enemy);
    }
}

