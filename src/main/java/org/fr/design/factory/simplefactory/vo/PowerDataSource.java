package org.fr.design.factory.simplefactory.vo;

/**
 * 用电数据源
 * @author furao
 * @desc
 * @date 2021/5/21
 * @package org.fr.design.factory.simplefactory
 */
public class PowerDataSource implements DataSource{
    /**
     * 电流
     */
    private double i;
    /**
     * 电压
     */
    private double u;
    /**
     * 功率
     */
    private double p;

    @Override
    public void printDeviceName(){
        System.out.println("我是用电点位数据源");
    }


    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

}
