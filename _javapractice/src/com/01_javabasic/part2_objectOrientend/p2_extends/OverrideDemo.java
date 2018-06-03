package com.javaBasic.part2_objectOrientend.p2_extends;
/**
    方法的覆盖：
        1.父类中的某一个行为不适用于子类时，子类可以覆写父类的该方法的方法体；
        2.只有方法存在覆盖的概念，字段没有；
        3.方法名、数列表必须相同；
        4.子类的访问权限必须大于等于父类；返回类型需相同或比父类更具体；
 */
public class OverrideDemo {
    public static void main(String[] args){
        Penguin penguin = new Penguin();
        //会优先在子类中寻找，找不到再去父类中寻找，最后找到Object中都没有会报错；
        penguin.fly();
    }
}
class Birds{
    void fly(){
        System.out.println("不会飞的鸟不是好鸟");
    }
}
class Penguin extends Birds{
    @Override   //用于判断当前子类的方法是否覆盖了父类中的方法；
    void fly(){
        System.out.println("企鹅不需要飞");
    }
}

/** 方法的重载与方法的重写：二者本身没有任何联系；
    Overload:
        作用：解决的是同一个类中相同功能的方法名不同；
        规则：两同一不同（同类、方法名相同；方法的< 参数类型、参数个数、参数顺序 >不同）
    Override:
        作用：解决子类继承父类后，可能父类的某一个方法不满足子类的具体特征，此时需要在子类中重新定义该方法，重写其方法体；
        规则：一同两小一大
             一同：父类和子类的方法签名相同，建议直接copy父类中方法定义，重写方法体；
 */