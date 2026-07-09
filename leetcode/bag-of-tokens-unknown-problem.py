        max=Math.max(score,max);
        if(score>=1 && i<=j){
            score--;
            power+=tokens[j];
            j--;
        }else if(i<=j && power<tokens[i])break;
        }
        return max;
    }
}

