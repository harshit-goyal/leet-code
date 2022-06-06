class Solution {
    public int openLock(String[] deadends, String target) {
        int minNumOfTurns = 0;
        HashSet<String> visited = new HashSet<>();
        HashSet<String> deadendsSet = new HashSet<>();
        for (String deadend : deadends) {
            deadendsSet.add(deadend);
        }
        // init lock wheels
        char[] wheels = new char[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = '0';
        }
        Queue<String> queue = new LinkedList<String>();
        // init BFS
        queue.offer("0000");

        while (!queue.isEmpty()) {
            int layerSize = queue.size();
            while (layerSize > 0) {
                String str = queue.poll();
                if (deadendsSet.contains(str)) {
                    layerSize--;
                    continue;
                }

                if (str.equals(target)) { 
                    return minNumOfTurns;
                }
                char[] chs = str.toCharArray();
                for (int i = 0; i < chs.length; i++) {
                    char chTmp = chs[i];
                    for (int d = -1; d <= 1; d += 2) {
                        chs[i] = (char)((chTmp - '0' + d + 10) % 10 + '0');
                        String newStr = new String(chs);
                        if (!visited.contains(newStr) && !deadendsSet.contains(newStr)) {
                            queue.offer(newStr);
                            visited.add(newStr);
                        }
                    }
                    chs[i] = chTmp;
                }
                layerSize--;
            }
            minNumOfTurns++;
        }
        return  -1;
    }
}