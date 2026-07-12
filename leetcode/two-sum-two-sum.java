        ();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
            
            if(map.containsKey(target-nums[i])){
                return new int[] {i, map.get
                (target-nums[i])};
            }
        return new int[] {-1,-1};
    }
}
