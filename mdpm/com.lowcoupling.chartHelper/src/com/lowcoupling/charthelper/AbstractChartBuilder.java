/*******************************************************************************
 * Copyright (c) 2006, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Qi Liang (IBM Corporation)
*******************************************************************************/
package com.lowcoupling.charthelper;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.birt.chart.model.Chart;
 
class KeyCoparator implements Comparator<String> {

	Map<String,LinkedHashMap<String,Double>>  base;
    public KeyCoparator(Map<String,LinkedHashMap<String,Double>>  base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(String a, String b) {
    	if (a.compareTo(b)>0){       
            return 1;
        } else {
            return -1;
        } // returning 0 would merge keys
    }
}

/**
 * Provides the common members and the framework to build one chart.
 * 
 * @author Qi Liang
 */
public abstract class AbstractChartBuilder {

    /**
     * Font name for all titles, labels, and values.
     */
    protected final static String FONT_NAME = "MS Sans Serif";

    /**
     * Provides data for chart.
     */
    protected TreeMap<String, LinkedHashMap<String,Double>> dataSet = null;

    /**
     * Chart instance.
     */
    protected Chart chart = null;

    /**
     * Chart title.
     */
    protected String title = null;

    /**
     * Constructs one chart builder and associate it to one data set.
     * 
     * @param dataSet
     *            data set
     */
    public AbstractChartBuilder(Map<String,LinkedHashMap<String,Double>> dataSet) {
    	KeyCoparator orderedDataSet = new KeyCoparator(dataSet);
        this.dataSet = new TreeMap<String, LinkedHashMap<String,Double>>(orderedDataSet);
        this.dataSet.putAll(dataSet);

    }

    /**
     * Builds one chart.
     */
    public void build() {
        createChart();
        buildPlot();
        buildLegend();
        buildTitle();
        buildXAxis();
        buildYAxis();
        buildXSeries();
        buildYSeries();
    }

    /**
     * Creates chart instance.
     */
    protected abstract void createChart();

    /**
     * Builds plot.
     */
    protected void buildPlot() {

    }

    /**
     * Builds X axis.
     */
    protected void buildXAxis() {

    }

    /**
     * Builds Y axis.
     */
    protected void buildYAxis() {

    }

    /**
     * Builds X series.
     */
    protected void buildXSeries() {

    }

    /**
     * Builds Y series.
     */
    protected void buildYSeries() {

    }

    /**
     * Builds legend.
     * 
     */
    protected void buildLegend() {

    }

    /**
     * Builds the chart title.
     */
    protected void buildTitle() {
    	chart.getTitle().getLabel().getCaption().setValue(title);
        chart.getTitle().getLabel().getCaption().getFont().setSize(14);
        chart.getTitle().getLabel().getCaption().getFont().setName(FONT_NAME);
    }

    /**
     * Returns the chart instance.
     * 
     * @return the chart instance
     */
    public Chart getChart() {
        return chart;
    }

}
