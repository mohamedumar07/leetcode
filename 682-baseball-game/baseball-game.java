class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        List<Integer> list = new ArrayList<>();
        int last = 0;

        for(String op: operations){
            if(op.equals("+")){
                list.add(list.get(last) + list.get(last - 1));
            }else if(op.equals("D")){
                list.add(2 * list.get(last));
            }else if(op.equals("C")){
                list.remove(last);
            }else{
                list.add(Integer.parseInt(op));
            }
            last = list.size() - 1;
        }

        for(int li: list){
            score += li;
        }

        return score;
    }
}