import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    Product product1 = new Product(111, "Борьба за огонь", 400);
    Product product2 = new Product(222, "Пещерный лев", 415);
    Product product3 = new Product(333, "Туба Вете", 500);

    @Test
    public void remove() {
    ShopRepository repo = new ShopRepository();

    repo.add(product1);
    repo.add(product2);
    repo.add(product3);
    repo.remove(111);
    repo.remove(222);

    Product[] expected = {product3};
    Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void generate() {
        ShopRepository repo = new ShopRepository();

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class, () -> {repo.remove(444);});
    }
}
