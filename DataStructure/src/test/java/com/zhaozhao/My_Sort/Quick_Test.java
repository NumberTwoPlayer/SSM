package com.zhaozhao.My_Sort;

import com.zhaozhao.Sort.Quick_Sort;
import org.junit.Test;

/**
 * @author 刘梹晨
 * @Classname Quick_Test
 * @Date 2023/9/12 9:19
 */

public class Quick_Test {
    @Test
    public void quickTest(){
        Quick_Sort sort = new Quick_Sort();
        int[] arr = {1,3,5,7,9,2,4,6,8,0,10};
        sort.Sort(arr,0,arr.length - 1);
        sort.print(arr);
    }
}
