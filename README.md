# ModelDemo
图解设计模式一书demo

## 面向对象6大原则
1.单一职责原则

2.开闭原则(封闭修改，开放扩展,通过抽象实现)

3.里氏替换原则(在父类型的变量中保存任何一个子类的对象。程序都可以正常工作)

4.依赖倒置原则(面向接口编程，面向抽象类编程)

5.接口隔离原则(接口最小化,单一职责)

6.迪米特原则(only talk to your immediate friends)

## 心得体会
1.不要只使用具体类来编程，优先使用接口和抽象类

2.设计模式的作用之一：编写可复用，可维护的代码，低耦合

3.一旦在类中使用到了别的类名，就意味着该类与其他类紧密地耦合在了一起

## 设计模式
#### 1.Iterator模式
解决集合中，遍历元素的问题。

#### 2.Adapter模式
填补“现有程序”和“所需程序”间的差异。

类适配器模式（继承实现）/对象适配器模式（聚合实现）

Adapter模式可以在不改变现有代码的情况下，实现新的Api，符合开闭原则

#### 3.TemplateMethod(模板方法)模式
抽取出共用逻辑或者需要遵循的规则。易维护

如何实现：父类（抽象类）定义模板方法，注意用final修饰

#### 4.FactoryMethod(工厂方法)模式
TemplateMethod模式用来生产实例，就变成了FactoryMethod模式

#### 5.Prototype(原型)模式
通过对象来生产实例。使用Object的clone()实现
* clone()是浅拷贝，field_to_field_copy，只复制字段的引用
* clone()不会调用构造方法
* 深拷贝需要自己实现