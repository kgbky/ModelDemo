# ModelDemo
图解设计模式一书demo

## 面向对象6大原则
1.单一职责原则

2.开闭原则(不修改现有代码前提下进行扩展)

3.里氏替换原则(在父类型的变量中保存任何一个子类的对象。程序都可以正常工作)

4.依赖倒置原则(面向接口编程，面向抽象类编程)

5.接口隔离原则(接口最小化,单一职责)

6.迪米特原则(only talk to your immediate friends)

## 心得体会
1.不要只使用具体类来编程，优先使用接口和抽象类

2.设计模式的作用之一：编写可复用，可维护的代码，低耦合

3.一旦在类中使用到了别的类名，就意味着该类与其他类紧密地耦合在了一起

4.抽象：不考虑具体实现，仅关注api的状态

5.继承是强耦合，委托低耦合

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

#### 6.Builder模式
组装具有复杂结构的实例
* 设计类时，需要考虑扩展性（灵活应对近期可能发生的变化）

* 阅读和修改代码时，需要从整体考虑

#### 7.AbstractFactory(抽象工厂)模式
将关联零件组装成产品

抽象工厂 将 抽象零件 组装成 抽象产品

#### 8.Singleton模式
该类只有一个实例

#### 9.Bridge模式(分开考虑)
将类的功能层次结构 与 实现层次结构分离
* 类的功能层次结构：子类继承父类，添加新的方法。

* 类的实现层次结构：继承抽象类或实现接口，并实现其中的抽象方法

* 分开后更容易扩展

#### 10.Strategy(策略)模式
替换策略或算法的模式。

通过委托、和算法替换、实现了动态替换

#### 11.Composite(组合)模式
容器与内容的一致性（一致性：把不同的东西看做同一种东西）
多个和单个的一致性(把多个对象结合在一起，当作一个对象处理)
* 将内容和容器作为同一种东西，形成递归结构。方便处理问题

* 递归结构和Composite模式很常见

* 数结构的数据结构都适用Composite模式

#### 12.Decorator(装饰)模式
装饰边框与被装饰物的一致性
添加装饰边框来增加对象的功能
* 递归结构

* 添加装饰物可以添加许多新功能

#### 13.Visitor模式
访问数据结构并处理数据，数据结构与处理被分离开来

* 方便扩展处理，扩展数据结构较难

#### 14.Chain of Responsibility（责任链）模式
自己能处理就处理，不能处理就转给下一个人

* 避免出现一个上帝角色知道“谁应该处理什么请求”

* 可以动态的改变责任链

* 会导致处理延迟

#### 15.Facade（外观）模式
向系统外部提供高层接口(API)，系统内部不使用Facade角色

Facade角色封装了复杂的具体操作，系统外部只调用一个api

减少了复杂系统与调用该系统的类的耦合