package abstractExample;

/**
 * 抽象类&抽象方法
 * 1.一定程度上避免了无意义父类是实例化。
 * 2.抽象类不允许直接实例化,抽象类不能创建对象,只能作为其他类的父类。可以通过向上转型。
 * 3.类中存在抽象方法,类必须为抽象类，抽象类中可以没有抽象方法。
 * 4.一个类继承抽象类中必须实现其抽象方法,除非它是抽象类。
 * 5.抽象方法不能用private和static修饰。
 * 6.抽象类不能用final和abstract修饰。
 */


public abstract class Shape {
    public abstract void area();

}
