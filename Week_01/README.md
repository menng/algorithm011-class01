### 分析Queue和Priority Queue的源码

#### Queue（Java版）

队列，先进先出，FIFO。

Interface，继承Collection，Iterable接口。

两组方法：

|                     | throw Exception | Return special value |
| ------------------- | --------------- | -------------------- |
| Insert              | add(e)          | offer(e)             |
| Remove              | remove()        | poll()               |
| Examine(检查，搜索) | element()       | peek()               |



#### PriorityQueue (Java版)

优先队列，Class，实现Collection，Queue等接口，非线程安全的。

构造器：初始容量11

元素可以是自然序，也可以根据指定的排序规则。

**如何遍历？**

```java
	Queue<String> queue = new PriorityQueue<>();
    queue.add("a");
    queue.add("e");
    queue.add("c");

	queue.forEach(a -> System.out.println(a));

    Iterator<String> iterator = queue.iterator();
    while (iterator.hasNext()) {
    	System.out.println(iterator.next());
    }
 
	while(!queue.isEmpty()) {
		System.out.println(queue.poll());
	}
```



### 用add first或add last这套新的API改写Deque的代码

```java
    Deque<String> deque = new LinkedList<>();
    deque.push("a");
    deque.push("b");
    deque.push("c");
    deque.push("d");

    System.out.println(deque.peek());
    System.out.println(deque);

    while (deque.size() > 0) {
        System.out.println(deque.pop());
    }
    System.out.println(deque);
```

```java
	Deque<String> newDepue = new LinkedList<>();
    newDepue.addFirst("a");
    newDepue.addFirst("b");
    newDepue.addFirst("c");
    newDepue.addFirst("d");

    System.out.println(newDepue.peekFirst());
    System.out.println(newDepue);

    while (newDepue.size() > 0) {
    System.out.println(newDepue.pollFirst());
    }

    System.out.println(newDepue);
```

