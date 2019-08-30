

### 第1章 接口

面向接口编程，尽量避免改变接口，其测试用例应该关注接口是否满足需求，而不是取决于实现的细节。

ArrayList 和 LinkedList 各有优缺点，哪个操作更好取决于其执行的最频繁的操作是什么。

源码清单：
* ListClientExample.java
* ListClientExampleTest.java

### 第2章 算法分析

源码清单：


### 第3章 ArrayList 类

平摊分析：通过计算一系列调用的平均时间来分类算法的方法。

问题规模：O(nm)，如果 m 是常数，那么 O(nm) 是线性变化的，如果 m 与 n 成正比，那么 O(nm) 是平方级的。

链接：由节点组成，每个节点包含对其他节点的引用。
* 链接列表：每个节点包含对下一个节点的引用。
* 其他链接结构：树和图，节点可以包含对多个其他节点的引用。

垃圾回收：
* MyArrayList：在必要时增长，不会收缩，数组从不被垃圾回收
* MyLinkedList：clear() 删除对第一个节点的引用。没有其他对该节点的引用，都将呗垃圾回收。

源码清单：


### 第4章 LinkdedList 类

通过前面两章分析，总结下 MyArrayList 和 MyLinkedList 的性能区别，1 表示 O(1)，n 表示 O(n)。

| 比较 | MyArrayList | MyLinkedList |
| :----- | :-----: | :-----: |
| add (at the end) | 1 | n |
| add (at the beginning) | n | 1 |
| add (in general) | n | n |
| get / set | 1 | n |
| indexOf / lastIndexOf | n | n |
| isEmpty / size | 1 | 1 |
| remove (from the end) | 1 | n |
| remove (from the beginning) | n | 1 |
| remove (in general) | n | n |

* MyArrayList：在尾部插入/删除、get / set 有优势
* MyLinkdList：在头部插入/删除有优势

源码清单（测试 ArrayList / LinkedList 从头部/尾部添加新节点的耗时情况）：


### 第5章 双向链表

在上一章的基础上，进一步总结：

| 比较 | MyArrayList | MyLinkedList | LinkedList |
| :----- | :-----: | :-----: | :-----: |
| add (at the end) | 1 | n | 1 |
| add (at the beginning) | n | 1 | 1 |
| add (in general) | n | n | n |
| get / set | 1 | n | n |
| indexOf / lastIndexOf | n | n | n |
| isEmpty / size | 1 | 1 | 1 |
| remove (from the end) | 1 | n | 1 |
| remove (from the beginning) | n | 1 | 1 |
| remove (in general) | n | n | n |

LinkdedList 从尾部添加的性能分析为常数时间，而非线性时间，这个主要是因为 MyLinkedList 是单链表，LinkedList 是双向链表。

LinkedList 双向链表：
* 每个节点包含：下一个节点的链接、上一个节点的链接
* LinkedList 对象包含：第一个元素的链接、最后一个元素的链接

总结 ArrayList 和 LinkedList：
* ArrayList 的唯一优势是 get 和 set
* 头部插入/删除：LinkedList 比 ArrayList 好
* 尾部插入/删除：LinkedList 和 ArrayList 一样好

如果你的程序，频繁的：
* get / set：请选择 ArrayList
* 插入/删除：请选择 LinkedList

以上对比，仅为时间复杂度的对比，未涉及空间复杂度。

### 第6章 树的遍历

### 第7章 到达哲学

### 第8章 索引器

### 第9章 Map 接口

### 第10章 哈希方法

### 第11章 HashMap

### 第12章 TreeMap

### 第13章 二叉搜索树

### 第14章 持久性

### 第15章 爬行维基百科

### 第16章 布尔搜索

### 第17章 排序
