package interpreter;

import org.junit.Test;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:56
 * @Version: 1.0
 * @Modified: IsableeCur
 */
public class InterpreterTest {
    @Test
    public void test() throws MatchException {
        System.out.println("---------------- [Pattern] Interpreter ----------------");
        System.out.println("欢迎光临动物竞赛园餐厅！");
        System.out.println("您已完成点单，内容如下：");
        System.out.println("2份炒米饭，10份鲜草食，3份虫宴");
        String exp = "2 * "+ Const.FOOD_FRIEDRISE+" + 10 * "+Const.FOOD_GRASS+" + 3 * "+Const.FOOD_WORM;
        System.out.println("您应当付款：");
        System.out.println(MatchExpression.match(exp).interpret());
        System.out.println("------------------------ END ------------------------");
    }
}
