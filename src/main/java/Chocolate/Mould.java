/*模具基类
* 它的子类：BigMould,MiddleMould,SmallMould*/
public abstract class Mould extends TheObject{
    protected MouldShape shape;//模具形状
    protected Color color;//巧克力颜色
    public static enum Size{big,middle,small};//三种模具型号
    public abstract Size getSize();//获取模具型号
    public abstract void getInfo();//获取模具信息
    public Mould(MouldShape s,Color c){//构造函数
        this.shape=s;
        this.color=c;
        System.out.println("======== 使用桥接 Bridge 模式 ========");
    }
    public MouldShape.Shapes getShape(){//获取模具形状
        return shape.getShape();
    }
    public Color.Colors getColor(){//获取巧克力颜色
        return color.getColor();
    }

}
