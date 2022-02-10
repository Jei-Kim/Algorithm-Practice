import java.util.HashMap;

class Marathoner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> playerMap = new HashMap<>();
        for(String player : participant) playerMap.put(player, playerMap.getOrDefault(player, 0) + 1);
        for(String player : completion) playerMap.put(player, playerMap.get(player) -1);
        for(String key : playerMap.keySet()) {
            if(playerMap.get(key) != 0) {
                answer = key;
                System.out.println(answer);
                break;
            }
        }
        return answer;
    }
}
