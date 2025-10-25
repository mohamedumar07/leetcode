class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int rem = 0;

        for(int i = left; i <= right; i++){
            int temp = i;
            while(temp > 0){
                rem = temp % 10;
                if((rem == 0) || (i % rem != 0))
                    break;
                temp = temp / 10;
            }
            if(temp == 0)
                list.add(i);
        }
        return list;
    }
}