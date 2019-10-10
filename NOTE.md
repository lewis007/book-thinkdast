# 读书笔记

## 第一部分：基础

第1章 - 第2章

* 面向接口编程
* 性能分析：时间复杂度、空间复杂度
* 选择排序
* 大 O 表示法

> **延申阅读**：
>
> * 九种排序算法
> * 复杂度排序：1、n、n<sup>2</sup>、log n、n * log n

## 第二部分：表

第3章 - 第5章

* 性能对比：ArrayList、LinkedList
* 表的两种实现：数组、链表
* 链表：单链表、双向链表

| 性能对比 | 数组 | 单链表 | 双向链表 |
| :----- | :-----: | :-----: | :-----: |
| add（在末尾） | 1 | n | 1 |
| add（在开始） | n | 1 | 1 |
| add（一般情况） | n | n | n |
| get / set | 1 | n | n |
| indexOf / lastIndexOf | n | n | n |
| isEmpty / size | 1 | 1 | 1 |
| remove（在末尾） | 1 | n | 1 |
| remove（在开始） | n | 1 | 1 |
| remove（一般情况） | n | n | n |

> *对比结果：*
>
> | PK | ArrayList | LinkedList |
> | :----------: | :----------: | :----------: |
> | add / remove（在开始） | - | Win |
> | add / remove（在末尾） | Draw | Draw |
> | get / set | Win | - |

## 第三部分：搜索引擎

### 爬虫

第6章 - 第7章

* 搜索引擎（爬虫 & 索引 & 检索）
* 一个简单 HTML 页面的 DOM 树
* DOM 树的解析
* 深度优先搜索 DFS
* 递归 & 迭代
* 前序遍历 & 后序遍历 & 中序遍历
* LIFO 后进先出 & FIFO 先进先出
* Map: HashMap & TreeMap

## 第三部分：索引器

第8章 - 第13章