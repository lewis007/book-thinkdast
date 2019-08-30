[返回资源库](../) [返回读书笔记](/README.md)

# 大 O 表示法

大 O 表示法：算法是常数时间的用 O(1) 表示，线性算法用 O(n) 表示，平方级算法用 O(n<sup>2</sup>) 表示。

* 如果 f∈O(n) 和 g∈O(1)，则 f+g∈O(n)
* 如果 f∈O(n) 和 g∈O(n)，则 f+g∈O(n)
* 如果 f∈O(n) 且 k 是常数，则 kf∈O(n)
* 如果 f∈O(n)，则 nf∈O(n<sup>2</sup>)
* 只关心 n 的最大指数，例如 2n-1 属于 O(n)，n<sup>2</sup>+100n+1000 属于 O(n<sup>2</sup>)

选择排序：用到 swapElements 交换元素（常数时间）、indexLowest 查找最小元素的索引（线性时间）、selectionSort 对数组进行排序（平方级）。