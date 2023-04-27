# 内存区域
Code：在这个区域中，应用程序的可执行代码被加载和存储。这里存储着应用程序的二进制指令，也就是应用程序的代码段。
Java Heap：Java 堆是用来存储对象的内存区域。当你创建一个新的对象时，它将被存储在 Java 堆中，并占用一定的内存空间。Java 堆由用于垃圾回收的 GC 管理。
Native Heap：Native Heap 是用来存储 C/C++ 代码中的动态内存分配的内存区域。与 Java 堆不同的是，Native Heap 不会被 GC 进行管理，因此需要手动释放内存。
Stack：每个线程都有自己的栈，用于存储方法调用时的局部变量、参数以及返回地址等信息。Stack 的大小由虚拟机预先分配。
Graphics：在这个区域中，存储了应用程序的图片、位图等图形资源。
Private Other：这个区域用来存储应用程序的私有数据，如 SQLite 数据库文件、SharedPreferences 等。
System：在这个区域中，存储着 Android 系统的代码和数据。

# MAT使用 
需要结合AS，
先用AS生成aa.hprof内存文件。
然后通过platforms-tools文件下的hprof-conv工具转换成 bbb.hprof，让mat能够识别
```
 ./hprof-conv memory-20230427T162402.hprof bbb.hprof 
```
用mat打开 bbb.hprof 。


```
GCRoot--->              
activityContainer(arraylist)--> 
```


