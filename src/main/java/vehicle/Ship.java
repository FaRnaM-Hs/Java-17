package vehicle;

import creatures.Bird;
import creatures.Creature;
import creatures.Mammal;
import creatures.Plant;

// public class Ship extends Creature { <- Creature is a sealed class
// public class Ship extends Plant { <- Plant is a sealed class
// public class Ship extends Mammal { <- Mammal is a final class
public class Ship extends Bird { // <- Bird is a non-sealed class but this inherits is not good...

}
