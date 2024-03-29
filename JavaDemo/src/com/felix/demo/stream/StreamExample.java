package com.felix.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with Intellij IDEA.
 * Description 使用Stream API过滤和转换一个整数列表的例子
 * @date 2024/1/13 16:19
 *
 * @author Felix
 **/
public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                // 过滤出偶数
                .filter(n -> n % 2 == 0)
                // 将每个元素平方
                .map(n -> n * n)
                // 将结果收集到列表中
                .collect(Collectors.toList());

        // 输出 [4, 16, 36, 64]
        System.out.println(evenNumbers);
    }
}
