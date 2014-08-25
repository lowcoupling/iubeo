package com.lowcoupling.charthelper;

import java.io.File;

import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;

/**
 * The canvas to show chart.
 * 
 * @author Qi Liang
 */
public class ChartToPngRenderer { 

    /**
     * The device render for rendering chart.
     */
    protected IDeviceRenderer render = null;

    /**
     * The chart instantce.
     */
    protected Chart chart = null;

    /**
     * The chart state.
     */
    protected GeneratedChartState state = null;

    /**
     * The image which caches the chart image to improve drawing performance.
     */
    private Image cachedImage = null;
    private File outChart = null;


    public ChartToPngRenderer(int style, File outChart) {
       // super(parent, style);
    	this.outChart = outChart;
    	//System.out.println("Trying to export png in "+outChart.getAbsolutePath().toString());
        try {
            PluginSettings ps = PluginSettings.instance();
            render = ps.getDevice("dv.PNG");
            render.setProperty(IDeviceRenderer.FILE_IDENTIFIER, outChart);
        } catch (ChartException ex) {
           // DefaultLoggerImpl.instance().log(ex);
        }

    }
    
    public void buildChart() {
        Bounds bo = BoundsImpl.create(0, 0, 640.0, 480.0);
        int resolution = render.getDisplayServer().getDpiResolution();
        bo.scale(72d / resolution);
        try {
            Generator gr = Generator.instance();
            state = gr.build(render.getDisplayServer(),
                    chart,
                    bo,
                    null,
                    null,
                    null);
        } catch (ChartException ex) {
            ex.printStackTrace();
        }
    }


    public void drawToCachedImage(Rectangle size) {
        GC gc = null;
        try {
            if (cachedImage != null)
                cachedImage.dispose();
            cachedImage = new Image(Display.getCurrent(), size.width,
                    size.height);

            gc = new GC(cachedImage);
            render.setProperty(IDeviceRenderer.FILE_IDENTIFIER, outChart);
          
            Generator gr = Generator.instance();

            gr.render(render, state);
        } catch (ChartException ex) {
            ex.printStackTrace();
        } finally {
            if (gc != null)
                gc.dispose();
        }
    }


    public Chart getChart() {
        return chart;
    }

  
    public void setChart(Chart chart) {
        if (cachedImage != null)
            cachedImage.dispose();

        cachedImage = null;
        this.chart = chart;
    }


    
}


