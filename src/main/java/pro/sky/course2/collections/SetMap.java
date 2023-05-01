package pro.sky.course2.collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


public class SetMap {

	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();
	}

	public static void task1() {
		System.out.println(" Задача 1");
		List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
		for (Integer num : nums) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	public static void task2() {
		System.out.println(" Задача 2");
		List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
		Set<Integer> set2 = new TreeSet<>();
		for (Integer num : nums2) {
			if (num % 2 != 0) {
				set2.add(num);
			}
		}
		System.out.println(set2);
	}
	public static void task3() {
		System.out.println(" Задача 3");
		List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
		Set<String> word = new HashSet<>(strings);
		for (String i : word) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	public static void task4() {
		System.out.println(" Задача 4");
		List<String> strings2 = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
		Map<String, Integer> map = new HashMap<>();
		for (String list : strings2) {
			if (!map.containsKey(list)) {
				map.put(list, 0);
			}
			if (map.containsKey(list)) {
				map.put(list, map.get(list) + 1);
			}
		}
		System.out.println(map);
	}
}

