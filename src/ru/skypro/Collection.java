package ru.skypro;

import java.util.*;

public class Collection {
    private static final List<String> words = Arrays.asList(
            "я ", "свободен ", "словно ", "птица ", "в ", "небесах ",
            "я ", "свободен ", "я ", "забыл ", "что ", "значит ", "страх ");

    static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(nums);

    }

    public static void task2() {
        Set<Integer> nums = new HashSet<>(List.of(1, 8, 1, 2, 3, 4, 10, 4, 5, 5, 6, 7));
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(nums);
    }

    public static void task3_1() {
        List<String> duplicateWords = new ArrayList<>(words);
        Set<String> uniqWords = new HashSet<>((duplicateWords));
        for (String uniqWord : uniqWords) {
            duplicateWords.remove(uniqWord);
        }
        uniqWords.removeAll(duplicateWords);
        System.out.println(uniqWords);
    }

    public static void task3_2() {
        Set<String> uniqWords = new LinkedHashSet<>(words);
        System.out.println(uniqWords);
    }

    public static void task4() {
        Set<String> uniqWords = new HashSet<>((words));
        System.out.println(words.size() - uniqWords.size());
    }
}