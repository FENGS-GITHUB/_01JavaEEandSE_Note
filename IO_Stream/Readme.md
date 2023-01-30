# File

## File类对象:

**概述:**

封装了硬盘文件的路径

功能:依据封装路径创建,删除,修改文件及文件夹等操作.

**方法:**

**构造方法:**

- File(String pathname)  参数为相对路径或者绝对路径,来构造File对象
- File(File parent, String child) 参数为父路径File和子路径,路径为父路径子路径拼接,构造File对象
- File(String parent, String child) 参数为父路径和子路径,原理同上

**实例方法:**

创建:

- boolean mkdirs() 依据封装路径创建多级目录
- boolean mkdir() 依据封装路径创建单级目录
- boolean createNewFile() 依据封装路径创建一个空文件,不支持覆盖

删除:

- delete() 删除该封装路径下的文件或文件夹

判断:

- boolean exists() 判断该封装路径是否存在

- boolean isDirectory() 判断该封装路径是否为文件夹

- boolean isFile()  判断该封装路径是否为文件
- boolean canExecute() 判断该封装路径是否可以执行
- boolean canRead() 判断该封装路径是否可以读取
- boolean canWrite()  判断该封装路径是否可以写入

# 字节流

## FileInputStream 字节输入流

**概述:**

节点流,该类实例对象是架在硬盘和内存之间的单向通道,数据流通方向为硬盘到内存

封装了被读取文件位置,光标在文件的位置.

含有一个光标,该光标最开始指向文件的第一个字节

每执行一次read()等操作,光标后移一位

**构造方法:**

**实例对象方法:**

构造方法:

FileInputStream(File file) 通过File流搭建流对象;

FileInputStream(String name) 通过相对路径或者绝对路径创建流对象

光标:

- int available() 从光标处开始之后剩余字节数,不推荐大文件使用;
- long skip(long n)  光标后移n个字节;
- boolean markSupported() 测试该流是否支持mark&reset方法,该类实例对象不支持

读取:

- int read()  读取该光标处字节,返回值为该字节ASCII码,当无字节时返回-1
- int read(byte[] b) 将读取的字节存入数组b 返回值为存储进字节数组b的字节数
- int read(byte[] b, int off, int len)  将读取字节存入字节数组b,从b[off]处开始存储,存储len个字节; 返回值为存储进字节数组b的字节数

> (byte[] b)和read(byte[] b, int off, int len) 存入字节数组是采用覆盖的方法的,未覆盖处内容保持原样.

释放:

- void close()  关闭此流断开通路



## FileOuputStream 字节输出流

**概述:**

节点流,该类实例对象从内存到硬盘目标位置的单向管道

也就是从内存写入到硬盘

封装了数据输出的目标位置

**构造方法:**

- FileOutputStream(File file) 以File类建立输出管道,覆盖写入
- FileOutputStream(File file, boolean append) 同上,append为true追加写入
- FileOutputStream(String name) 以相对/绝对路径字符串为输出位置建立输出管道,覆盖写入
- FileOutputStream(String name, boolean append)  同上,append为true采取追加写入 

**实例方法:**

写入:

- void write(byte[] b) 将字节数组b的所有非空元素写入到目标位置
- void write(byte[] b, int off, int len)  从字节数组b的off出索引写入,写入len个字节 
- void write(int b) 将指定字节写入此文件输出流

刷新与关闭:

- void flush() 保存被写入的文件
- void close() 关闭该输出管道并且保存被写入的文件

## 字节流包装:BufferedInputStream 缓冲字节输入流

**概述:**

InputStream包装流,可以看作是InputStream和内存程序的一个转换器

该包装流在内存中创建了一个缓冲区数组,硬盘上的数据充满在该缓冲区中

实际执行read操作是在缓冲区执行,而不是在硬盘中执行.

封装了被读取文件位置,缓冲区大小

含有一个光标

**包装效果:**

将读取位置从硬盘变为内存

**构造方法:**

- BufferedInputStream(InputStream in) 包装已有字节输入流in,在内存中创建默认大小缓冲区
- BufferedInputStream(InputStream in, int size)  包装已有字节输入流in,手动设定缓冲区数组大小为size

**实例方法:**

光标:

int available() 查看光标后还有多少字节数据

long skip(long n) 光标后跳n个字节,返回值是实际跳过字节数

void mark(int readlimit) 在当前光标位置做个标记,后续执行reset()方法时光标会跳至该位置,光标后移readlimit个字节后标记失效

void reset() 跳至光标标记位置

读取:

 int read() 在光标处读取一个字节,返回该位置字节,光标后移一个字节

 int read(byte[] b, int off, int len) 从光标处开始读取len个字节,从字符数组b的off处索引存储,存至b中,返回值为存入字节数组的个数

关闭:

void close() 关闭该包装流,其包装的节点流也一起关闭

## 字节流包装:BufferedOutputStream缓冲字节输出流

**概述:**

OutputStream字节输出流进行write操作是将数据写入到硬盘中.

BufferedOutputStream缓冲字节输出流进行write操作是将数据写入到缓冲区中,缓冲区再将数据写入到硬盘.

提高了数据写入速度.

BufferedOutputStream是OutputStream的包装流



构造方法:

- BufferedOutputStream(OutputStream out) 创建一个包装out的缓冲区字节流输出流 缓冲区大小默认
- BufferedOutputStream(OutputStream out, int size) 创建一个包装out的缓冲区字节流输出流 缓冲区为size
  

**实例方法** 

- void flush() 刷新此缓冲的输出流。 

- void close() 关闭该流
- void write(byte[] b, int off, int len) 将指定 byte 数组中从off索引处开始的 len 个字节写入此缓冲的输出流。 
- void write(int b) 将指定的字节写入此缓冲的输出流。 



# 字符流

## 字节包装:InputStreamReader字节流转字符流输入流

是一个将字节流转换为字符流的转换器,也是其包装流.

可以以特定文本解码方式如UTF-8,读取文本文件.

**构造方法:**

- InputStreamReader(InputStream in) 以字节流为节点流创建一个字符输入流,默认字符集解码 
- InputStreamReader(InputStream in, Charset cs) 同上,手动设置解码方式
- InputStreamReader(InputStream in, String charsetName)  同上,手动设置解码方式

**实例方法:** 

- void close() 关闭该流并释放与之关联的所有资源。 
- String getEncoding()  返回此流使用的字符编码的名称。 
- int read() 读取单个字符。 
- int read(char[] cbuf, int offset, int length) 将字符读入数组 



## 字节包装:OutputStreamWriter字节流转字符流输入流

是一个将字节流转换为字符流的转换器,也是其包装流.

输出可以以特定的编码方式输出,可选定字符集

注意:在搭配InputStreamWriter使用时,要注意编码相同.

**构造方法:**

- OutputStreamWriter(OutputStream out) 包装一个字节流,以默认编码方式,来创建字符
- OutputStreamWriter(OutputStream out, Charset cs)  包装一个字节流,以特定编码方式来创建字符流
- OutputStreamWriter(OutputStream out, String charsetName)   同上

**实例方法:** 

-  void close()  关闭此流
-  void flush()  刷新该流的缓冲。 
-  String getEncoding() 获取该流的编码
-  void write(char[] cbuf, int off, int len)  同字节输出流
-  void write(int c) 写入单个字符
-  void write(String str, int off, int len) 同字节输入流
           

## FileReader字符输入流

字符输入流,与字节输入流不同的是字符输入流只能输入纯文本文件

是InputStreamReader的子类,与其父类相比,自动设置字符集编码

**构造方法:**

- FileReader(File file) 根据File对象file建立字符读取通道
- FileReader(String fileName) 根据绝对路径或相对路径建立字符读取通道

**实例方法:**

- int read() 读取的字符，如果已到达流的末尾，则返回 -1 
- int read(char[] cbuf,int offset,int length) 将字符读入数组 
- void close() 关闭该流并释放与之关联的所有资源。 
- String getEncoding() 获取该流的字符集

## FileWriter字符输出流

字符输出流,与字节输出流不同的是字符输入流只能输入纯文本文件

是InputStreamReader的子类,与其父类相比,自动设置字符集编码

**构造方法:**

- FileWriter(File file)           根据给定的 File 对象构造一个 FileWriter 对象。 
- FileWriter(File file, boolean append)  同上,append为true为追加
- FileWriter(String fileName)  根据给定的文件名构造一个 FileWriter 对象。 
- FileWriter(String fileName, boolean append)  同上,append为true为追加

**实例方法:** 

-  void close()  关闭此流
-  void flush()  刷新该流的缓冲。 
-  String getEncoding() 获取该流的编码
-  void write(char[] cbuf, int off, int len)  同字节输出流
-  void write(int c) 写入单个字符
-  void write(String str, int off, int len) 同字节输入流

## 字符流包装:BufferedReader字符缓冲输入流

带有缓冲区的FileReader字符输入流,是FileReader的包装流.

**构造方法:**

- BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。 
- BufferedReader(Reader in, int sz)  创建一个使用指定大小输入缓冲区的缓冲字符输入流。 

**实例方法:**

参考FileWriter

## 字符流包装:BufferedWriter字符缓冲输出流

带有缓冲区的FileReader字符输入流,是FileReader的包装流

**构造方法:**

- BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流
- BufferedWriter(Writer out, int sz)  创建一个使用给定大小输出缓冲区的新缓冲字符输出流。 

**实例方法:**

参考FileWriter



# 高级输出打印流

包括PrintStream和PrintWrtier两种流,二者之间的区别就在于PrintStream可以输出所有文件,PrintWriter只能输出文本文件.

他们既可以作为节点流,也可以作为包装流.

**PrintStream构造方法:**

- PrintStream(File file)  依据File类对象创建一个PrintStream输出打印流
- PrintStream(File file, String csn) 同上,并且手动设定字符集csn
- PrintStream(OutputStream out)  包装一个输出流,PS:当输出流为追加时,打印流也时追加模式
- PrintStream(String fileName) 根据路径创建打印流
- PrintStream(String fileName, String csn) 同上,并手动设定字符集

**PrintWriter构造方法:**

 **实例方法:**

写入:

- PrintStream/PrintWriter append(char c) 在尾部打印流追加一个字符c,返回值为本身; 功能与
- void println() 带回车的写入
- void print() 不带回车的写入
- void write(byte[] buf, int off, int len) 参考FileOutStream
- void write(int b) 同上

关闭刷新:

- void close() 关闭流
- void flush() 刷新该流的缓冲。 

# 序列化与反序列化

序列化就是将内存中对象脱离内存保存至硬盘的过程,该过程实现了对象信息的脱机保存,反序列化就是将保存在硬盘的对象文件重新传输到内存中,通过序列化版本号确定是哪个类的对象.

可序列化类的定义:

- 1需要实现Serializable接口,声明自己可以被序列化
- 2设定serialVersionUID版本号为不可变值防止类代码改动,以至于无法反序列化
- 3如果有不想被序列化的成员,可在对该成员进行triasnt修饰

序列化和反序列化的实现是通过ObjectOutputStream和ObjectInputStream实现的,他们是字节输入输出流的包装流.

## ObjectOutputStream:序列化

构造方法:

- ObjectOutputStream(OutputStream out)  创建写入指定 OutputStream 的 ObjectOutputStream。

序列化:

- void writeObject(Object obj) 将对象序列化



## ObjectInputStream:反序列化

构造方法:

- ObjectInputStream(InputStream in) 创建写入指定 InputStream的ObjectInputStream

反序列化:

- readObject() 从 ObjectInputStream 读取对象。
