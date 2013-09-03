
package com.kendoui.taglib.chart;


import com.kendoui.taglib.BaseTag;



import com.kendoui.taglib.ChartTag;




import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class LegendTag extends  BaseTag  /* interfaces *//* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag


        ChartTag parent = (ChartTag)findParentWithClass(ChartTag.class);


        parent.setLegend(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "chart-legend";
    }

    public void setBorder(com.kendoui.taglib.chart.LegendBorderTag value) {
        setProperty("border", value);
    }

    public void setInactiveItems(com.kendoui.taglib.chart.LegendInactiveItemsTag value) {
        setProperty("inactiveItems", value);
    }

    public void setLabels(com.kendoui.taglib.chart.LegendLabelsTag value) {
        setProperty("labels", value);
    }

    public void setMargin(com.kendoui.taglib.chart.LegendMarginTag value) {
        setProperty("margin", value);
    }

    public java.lang.String getBackground() {
        return (java.lang.String)getProperty("background");
    }

    public void setBackground(java.lang.String value) {
        setProperty("background", value);
    }

    public float getMargin() {
        return (float)getProperty("margin");
    }

    public void setMargin(float value) {
        setProperty("margin", value);
    }

    public float getOffsetX() {
        return (float)getProperty("offsetX");
    }

    public void setOffsetX(float value) {
        setProperty("offsetX", value);
    }

    public float getOffsetY() {
        return (float)getProperty("offsetY");
    }

    public void setOffsetY(float value) {
        setProperty("offsetY", value);
    }

    public java.lang.String getPosition() {
        return (java.lang.String)getProperty("position");
    }

    public void setPosition(java.lang.String value) {
        setProperty("position", value);
    }

    public boolean getVisible() {
        return (boolean)getProperty("visible");
    }

    public void setVisible(boolean value) {
        setProperty("visible", value);
    }

//<< Attributes

}
