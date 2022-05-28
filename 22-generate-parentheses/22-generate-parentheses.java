class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) return result;
        generate(result, new StringBuilder(), n, n);
        return result;
    }

    public void generate(List<String> result, StringBuilder sb, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(sb.toString());
            return;
        }

        if (left < 0 || right < 0) return;
        if (left > right) return;
        sb.append("(");
        generate(result, sb, left - 1, right);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        generate(result, sb, left, right - 1);
        sb.deleteCharAt(sb.length() - 1);
        
    }
}
