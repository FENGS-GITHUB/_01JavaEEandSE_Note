# 类加载器

## **概述:**

负责将.class文件加载到虚拟机内存中,这个过程就是类加载.

**目的是将程序所需的*.class文件加载到内存中以维持程序运行**

类加载时机如下:

- 创建实例对象时
- 调用类方法(静态方法)
- 调用类变量(静态变量)
- 创建Class类对象时(反射相关概念)
- 子类创建时,父类也会加载

## **类加载的过程:**

**加载:arrow_right:验证:arrow_right:准备:arrow_right:解析:arrow_right:初始化**

**A加载过程:**

1. 通过包名.字节码文件名找到字节码文件(*.class)

2. 以流的方式将字节码文件加载到内存中

3. 将内存中*.class文件转化为Class对象

   [^Class]: java中所有的类都可以看作是一个Class类对象

**B连接:验证+准备+解析**

1. 验证:确定符合虚拟机运行需求
2. 准备:静态变量创建
3. 验证:如果本类中用到了其他类,就要找到其他的类

**C初始化**

包括给静态变量赋值和初始化其他资源

## Class类对象

类加载器将类文件加载至内存中,存储为一个Class类对象.

**Class对象包含了类的所有信息**

**包括:**

- 所有构造方法信息
- 所有成员方法信息
- 所有成员变量信息
- 注解信息

**Class对象加载时机:**

当涉及到使用类中信息时,就会加载Class对象.

- new对象
- 访问静态成员
- 创建子类对象

# 反射reflect

反射就是在编译前定义对象,而是在运行时动态创建对象.

就是手动将类加载至内存.

> 通过反射加载进内存的是存储类所有信息的Class对象,在运行时,通过Class对象内的构造方法来创建一个对象;
## Class类对象

### 加载方式:获取一个Class类对象

- Class.forName("包名+类名");//通过类名+包名方式将java文件以Class对象方法加入至内存形成Class对象
- 类名.class;//直接获取
- 实例对象.getClass();

Class对象可以访问该类的所有构造方法,成员变量和成员方法

### **意义:**

绕过编译,修改代码后无需重新编译.

可以灵活修改:Class.forName(包名+类名);参数路径灵活可变,参数可以设置为读取配置文件,通过修改配置文件来修改类对象.

## 获取Constructor构造器对象

### **Class类的成员方法:**

- Constructor<?>[] getConstructors()  获取当前Class类对象中，所有的公共的构造方法

- Constructor<?>[] getDeclaredConstructors() 获取当前Class类对象中，所有的构造方法

- Constructor<T> getConstructor(Class<?>... parameterTypes)  获取一个单个的公共的构造方法对象

- Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)  获取一个单个的，任意权限修饰符的构造方法对象

### **通过Constructor构造器对象创建对象,等效于new对象:**

-   T newInstance(Object...initargs)	根据指定的构造方法创建对象,参数为参数类的class对象 如int.class.
-   setAccessible(boolean flag)	设置为true,表示取消访问检查

## 获取Field成员变量对象

### Class类的成员方法:

-   Field[] getFields()  返回所有公共成员变量对象的数组
-   Field[] getDeclaredFields()   返回所有成员变量对象的数组  
-   Field getField(String name)  返回单个公共成员变量对象   
-   Field getDeclaredField(String name)  返回单个成员变量对象     

### Field对象的成员方法:

- setAccessible(boolean flag)	设置为true,表示取消访问检查

- void set(Object obj, Object value)	赋值 ,通过指定对象和指定值进行赋值
- Object get(Object obj)	获取值,通过指定对象获取

## 获取Method成员方法对象

### Class类成员方法:

- Method[] getMethods()	返回所有公共成员方法对象的数组，包括继承的
- Method[] getDeclaredMethods()	返回所有成员方法对象的数组，不包括继承的 
- Method getMethod(String name, Class<?>... parameterTypes)	返回单个公共成员方法对象         
- Method getDeclaredMethod(String name, Class<?>... parameterTypes)	返回单个成员方法对象        

### Method对象的成员方法:

- setAccessible(boolean flag)	设置为true,表示取消访问检查

- Object invoke(Object obj, Object... args)  运行方法,通过指定对象和参数来调用方法
