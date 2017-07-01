package generics;

import java.util.Collection;

/**
 * Created by f.taleb on 7/1/2017.
 */
public class FruitHelper {
    public void eatAll(Collection<? extends Fruit> fruits) {}

    public void addApple(Collection<? super Apple> apples) {}
}
