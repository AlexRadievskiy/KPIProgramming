package company;

import java.util.Collection;
import java.util.LinkedList;

public class Service {
    private final Collection<Store> stores = new LinkedList<>();

    public boolean addStore(String name) {
        return stores.add(new Store(name));
    }

    public boolean removeProduct() {

    }
}
