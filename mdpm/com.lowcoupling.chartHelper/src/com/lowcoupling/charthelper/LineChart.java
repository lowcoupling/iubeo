package com.lowcoupling.charthelper;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.MarkerType;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;


public class LineChart  extends  AbstractChartWithAxisBuilder {


	public LineChart(Map<String,LinkedHashMap<String,Double>> dataset, String title, String xLabel, String yLabel) {
		super(dataset);
		this.title =  title;
		this.xTitle = xLabel;
		this.yTitle = yLabel;
	}


	protected void createChart() {
		chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildLegend()
	 */
	protected void buildLegend() {
		chart.getLegend().setItemType(LegendItemType.SERIES_LITERAL);
		//chart.getLegend().
		chart.getLegend().setVisible(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildXAxis()
	 */
	protected void buildXAxis() {
		xAxis = ((ChartWithAxes) chart).getPrimaryBaseAxes()[0];

		xAxis.getTitle().setVisible(true);
		xAxis.getMajorGrid().getLineAttributes().setVisible(false);
		xAxis.getTitle().getCaption().setValue(xTitle);
		xAxis.setType(AxisType.TEXT_LITERAL);
		xAxis.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
		xAxis.getMajorGrid().getLineAttributes().setStyle(LineStyle.DOTTED_LITERAL);
		xAxis.getOrigin().setType(IntersectionType.VALUE_LITERAL);
		xAxis.getLabel().getCaption().getFont().setSize(8);
		xAxis.getTitle().getCaption().getFont().setSize(10);;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildYAxis()
	 */
	protected void buildYAxis() {
		yAxis = ((ChartWithAxes) chart).getPrimaryOrthogonalAxis(xAxis);

		yAxis.getTitle().setVisible(true);
		yAxis.getTitle().getCaption().setValue(yTitle);

		yAxis.getMajorGrid().getLineAttributes().setVisible(false);
		yAxis.getMajorGrid().getLineAttributes().setColor(ColorDefinitionImpl
				.GREY());
		yAxis.getMajorGrid().getLineAttributes().setStyle(LineStyle.DASHED_LITERAL);
		yAxis.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);

		yAxis.setType(AxisType.LINEAR_LITERAL);
		yAxis.getOrigin().setType(IntersectionType.VALUE_LITERAL);
		yAxis.getLabel().getCaption().getFont().setSize(8);	
		yAxis.getTitle().getCaption().getFont().setSize(10);;
		//yAxis.getScale().setStep(1.0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildXSeries()
	 */
	@SuppressWarnings("deprecation")
	protected void buildXSeries() {
		String []names =null;
		Iterator<LinkedHashMap<String,Double>> valIt = dataSet.values().iterator();
		int pos=0;
		while(valIt.hasNext()){
			LinkedHashMap<String,Double> innerValues = valIt.next();
			names =  new String[innerValues.keySet().size()];
			Iterator<String> vals = innerValues.keySet().iterator();
			while (vals.hasNext()){
				names[pos] = vals.next();
				pos++;
			}
			break;
		}

		TextDataSet categoryValues = TextDataSetImpl
				.create(names);

		Series seCategory = SeriesImpl.create();
		seCategory.setDataSet(categoryValues);

		// Apply the color palette

		SeriesDefinition sdX = SeriesDefinitionImpl.create();
		sdX.getSeriesPalette().update(0); // SET THE COLORS IN THE PALETTE
		xAxis.getSeriesDefinitions().add(sdX);
		sdX.getSeries().add(seCategory);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildYSeries()
	 */
	protected void buildYSeries() {
		Iterator<LinkedHashMap<String,Double>> valIt = dataSet.values().iterator();
		int index =0;
		while(valIt.hasNext()){
			int pos=0;
			LinkedHashMap<String,Double> innerValues = valIt.next();
			double []values = new double[innerValues.values().size()];
			Iterator<Double> vals = innerValues.values().iterator();
			while (vals.hasNext()){
				values[pos] = vals.next();
				pos++;
			}
			NumberDataSet orthoValuesDataSet1 = NumberDataSetImpl.create(values);
			LineSeries ls = (LineSeries) LineSeriesImpl.create();
			//BarSeries bs1 = (BarSeries) BarSeriesImpl.create();
			ls.setDataSet(orthoValuesDataSet1);
			ls.getLineAttributes().setColor(ColorDefinitionImpl.BLUE());
			 
			//ls.getMarker().setType(MarkerType.CIRCLE_LITERAL);
			ls.getMarkers().get(0).setType(MarkerType.CIRCLE_LITERAL); //MarkerType.CROSS_LITERAL);
			ls.getMarkers().get(0).setSize(0);
			ls.getLabel().setVisible(false);
			//ls.setStacked(true);
			//bs1.setRiserOutline(null);

			ls.setSeriesIdentifier(dataSet.keySet().toArray()[index]);
			SeriesDefinition sdY = SeriesDefinitionImpl.create();
			yAxis.getSeriesDefinitions().add(sdY);
			sdY.getSeries().add(ls);
			index++;
		}

	}



}
