package ru.itis.inf304.dz5.map;
import java.util.*;

public class MapInf304<K, V> implements IMapInf304<K, V> {

    private ArrayList<Node<K, V>> map = new ArrayList<>();

    @Override
    public V put(K key, V value) {
        if (containsKey(key)) {
            for (int i = 0; i < map.size(); i++){
                if (map.get(i).getKey().equals(key)){
                    map.set(i, new Node<>(key, value));
                }
            }
        } else {
            map.add(new Node<>(key,value));
        }
        return get(key);
    }

    @Override
    public V get(K key){
        V element = null;
        if (containsKey(key)){
            for (Node<K, V> node: map) {
                if (node.getKey().equals(key)) {
                    element = node.getValue();
                    break;
                }
            }
        }
        return element;
    }

    @Override
    public V remove(K key){
        if (!containsKey(key)){
            System.out.println("Key is not found");
        } else {
            for (Node<K, V> node: map) {
                if (node.getKey().equals(key)){
                    map.remove(node);
                    break;
                }
            }
        }
        return get(key);
    }

    @Override
    public boolean containsKey(K key){
        boolean contain = false;
        for (Node<K, V> node: map) {
            if (node.getKey().equals(key)) {
                contain = true;
            }
        }
        return contain;
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = new ArrayList<>();
        for (Node<K, V> node: map) {
            collection.add((V) node.getValue());
        }
        return collection;
    }

    @Override
    public Set<K> keySet(){
        Set<K> set = new HashSet<>();
        for (Node node: map) {
            set.add((K) node.getKey());
        }
        return set;
    }
}
