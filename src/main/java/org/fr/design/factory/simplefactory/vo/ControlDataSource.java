package org.fr.design.factory.simplefactory.vo;

/**
 * 控制数据源
 * @author furao
 * @desc
 * @date 2021/5/21
 * @package org.fr.design.factory.simplefactory
 */
public class ControlDataSource implements DataSource{

    @Override
    public void printDeviceName() {
        System.out.println("我是控制点位数据源");
    }
    /**
     * 启停控制点位
     */
    private int statusControl;
    /**
     * 温度控制点位
     */
    private double temperatureControl;
    /**
     * 节流阀控制点位
     */
    private int gatePercent;

    public int getStatusControl() {
        return statusControl;
    }

    public void setStatusControl(int statusControl) {
        this.statusControl = statusControl;
    }

    public double getTemperatureControl() {
        return temperatureControl;
    }

    public void setTemperatureControl(double temperatureControl) {
        this.temperatureControl = temperatureControl;
    }

    public int getGatePercent() {
        return gatePercent;
    }

    public void setGatePercent(int gatePercent) {
        this.gatePercent = gatePercent;
    }


}
