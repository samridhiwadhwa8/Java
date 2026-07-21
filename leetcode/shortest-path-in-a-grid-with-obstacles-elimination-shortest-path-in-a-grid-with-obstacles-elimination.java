            }
            nc=col+1;
            nr=row;
            if(!(nr<0 || nr >=grid.length || nc<0 || nc>= grid[0].length) ){
            if(grid[nr][nc]==0){
            if(!visited[nr][nc][remk]){
                visited[nr][nc][remk]=true;

                q.add(new Pair(nr,nc,remk));
            }
            }else{
                if(remk>0){
                     if(!visited[nr][nc][remk-1]){
                visited[nr][nc][remk-1]=true;
                q.add(new Pair(nr,nc,remk-1));
            }
                }
            }
            }
            }
            steps++;
        }
        return -1;
    }
}
