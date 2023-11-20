package cfg;

import java.util.*;

public class CFG {
    private Map<String, List<String>> rules;
    private Random random;

    public CFG(Map<String, List<String>> rules) {
        this.rules = rules;
        this.random = new Random();
    }

    public String generate() {
        return expand("S");
    }

    private String expand(String symbol) {
        List<String> expansions = rules.get(symbol);
        if (expansions == null) {
            return symbol;
        } else {
            String expansion = expansions.get(random.nextInt(expansions.size()));
            StringBuilder sb = new StringBuilder();
            for (String part : expansion.split(" ")) {
                sb.append(expand(part));
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> rules = new HashMap<>();
        while (true) {
            System.out.print("Enter a grammar rule (or enter 'done' to finish): ");
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            String[] parts = input.split(" -> ");
            String symbol = parts[0];
            String[] expansions = parts[1].split("\\|");
            rules.put(symbol, Arrays.asList(expansions));
        }
        CFG simulator = new CFG(rules);
        System.out.println(simulator.generate());
    }
}

