package companies.amazon;

import java.util.*;

public class TopKFrequentlyMentionedKeywords {
	/*
	 * Given a list of reviews, a list of keywords and an integer k. Find the most
	 * popular k keywords in order of most to least frequently mentioned.
	 * 
	 * The comparison of strings is case-insensitive. If keywords are mentioned an
	 * equal number of times in reviews, sort alphabetically.
	 */

	public static void main(String[] args) {

		int k = 5;
		String[] keywords = { "anacell", "cetracular", "betacellular", "fuck" };
		String[] reviews = { "Anacell provides the best services in the  city", "betacellular has awesome services",
				"Best services provided by anacell, everyone should use anacell", "" };

		TopKFrequentlyMentionedKeywords top = new TopKFrequentlyMentionedKeywords();
		System.out.println(top.solve(k, keywords, reviews));
		System.out.println(top.getFrequent(k, keywords, reviews));

	}

	private static List<String> solve(int k, String[] keywords, String[] reviews) {
		List<String> res = new ArrayList<>();
		Set<String> set = new HashSet<String>(Arrays.asList(keywords));
		Map<String, Integer> map = new HashMap<>();

		for (String r : reviews) {
			String[] strs = r.split("\\W", -1); // blank space between words
			Set<String> added = new HashSet<>();
			for (String s : strs) {
				s = s.toLowerCase();
				if (set.contains(s) && !added.contains(s)) {
					map.put(s, map.getOrDefault(s, 0) + 1);
					added.add(s);
				}
			}
		}

		Queue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>((a,
				b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
		maxHeap.addAll(map.entrySet());

		while (!maxHeap.isEmpty() && k-- > 0) {
			res.add(maxHeap.poll().getKey());
		}

		return res;
	}

	public static List<String> getFrequent(int k, String[] keywords, String[] words) {
		Map<String, Integer> count = new HashMap<>();
		List<String> keywordsList = Arrays.asList(keywords);
		for (String word : words) {
			for (String s : word.split("\\s+")) {
				if (keywordsList.contains(s)) {
					count.put(s, count.getOrDefault(s, 0) + 1);
				}
			}
		}

		List<String> ls = new ArrayList<>(count.keySet());
		Collections.sort(ls,
				(a, b) -> (count.get(a)).equals(count.get(b)) ? a.compareTo(b) : count.get(b) - count.get(a));
		
		int cut = Math.min(k, ls.size());
		
		List<String> ret = ls.subList(0, cut);
		return ret;
	}

}
