package BattleArena;
//Арена это Посредник для битвы между игроками, хотя зачем это пишу если вы это не увидете
import BattleArena.arena.ArenaMediator;
import BattleArena.characters.Character;
import BattleArena.elements.Element;

public class Main {
    public static void main(String[] args) {
        ArenaMediator arena = new ArenaMediator();

        Character alice = new Character("Алиса", Element.FIRE, arena);
        Character bob = new Character("Боб", Element.WATER, arena);
        Character clara = new Character("Клара", Element.EARTH, arena);
        Character dima = new Character("Дима", Element.WIND, arena);
        Character eva = new Character("Ева", Element.LIGHT, arena);
        Character fred = new Character("Фред", Element.DARK, arena);

        alice.attack(bob);   // Вода бьёт огонь
        clara.attack(bob);   // Земля бьёт воду
        dima.attack(clara);  // Ветер бьёт землю
        eva.attack(fred);    // Свет бьёт тьму
        fred.attack(eva);    // Тьма бьёт свет
        alice.attack(dima);  // Огонь бьёт ветер
        fred.attack(fred); // Тьма против тьмы — одинаковая стихия
        bob.attack(clara); // Вода атакует Землю — слабее
    }
}
