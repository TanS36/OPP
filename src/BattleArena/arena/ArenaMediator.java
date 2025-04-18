package BattleArena.arena;

import java.util.ArrayList;
import java.util.List;
import BattleArena.characters.Character;

public class ArenaMediator {
    private List<Character> fighters = new ArrayList<>();

    public void register(Character character) {
        fighters.add(character);
    }

    public void fight(Character a, Character b) {
        System.out.println(a.getName() + " (" + a.getElement() + ") атакует " + b.getName() + " (" + b.getElement() + ")");

        if (a.getElement() == b.getElement()) {
            System.out.println("Обе стихии одинаковы — ничья!");
        } else if (a.getElement().beats(b.getElement())) {
            System.out.println("Победил: " + a.getName() + " — его стихия сильнее!");
        } else if (b.getElement().beats(a.getElement())) {
            System.out.println("Победил: " + b.getName() + " — стихия атакующего слабее!");
        } else {
            System.out.println("Неожиданная ничья — элементы не взаимодействуют напрямую.");
        }

        System.out.println("-------------");
    }
}

