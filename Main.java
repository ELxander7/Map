package ru.itis.inf304.dz5.map;

public class Main {
    public static void main(String[] args) {
        MapInf304<Integer, String> map = new MapInf304<>();
        map.put(1, "Elina");
        map.put(5,"Altan");
        map.put(3, "Temir");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove(3));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(5));

        map.put(5, "Eldar");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove(4));
    }
}
