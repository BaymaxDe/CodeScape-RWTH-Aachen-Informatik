   for(int i=1;i<unorderedArr.length;i++)
        for(int j=0;j<i;j++)
            if(unorderedArr[j]>unorderedArr[i]){
            int c=unorderedArr[i];
               unorderedArr[i]=unorderedArr[j];
               unorderedArr[j]=c;
                
            }
    return unorderedArr;