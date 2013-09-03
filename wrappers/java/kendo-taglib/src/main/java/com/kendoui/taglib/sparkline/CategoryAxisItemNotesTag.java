
package com.kendoui.taglib.sparkline;


import com.kendoui.taglib.BaseTag;






import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class CategoryAxisItemNotesTag extends  BaseTag  /* interfaces */ /* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag


        CategoryAxisItemTag parent = (CategoryAxisItemTag)findParentWithClass(CategoryAxisItemTag.class);


        parent.setNotes(this);

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
        return "sparkline-categoryAxisItem-notes";
    }

    public void setData(CategoryAxisItemNotesDataTag value) {

        setProperty("data", value.data());

    }

    public void setIcon(com.kendoui.taglib.sparkline.CategoryAxisItemNotesIconTag value) {
        setProperty("icon", value);
    }

    public void setLabel(com.kendoui.taglib.sparkline.CategoryAxisItemNotesLabelTag value) {
        setProperty("label", value);
    }

    public void setLine(com.kendoui.taglib.sparkline.CategoryAxisItemNotesLineTag value) {
        setProperty("line", value);
    }

    public java.lang.String getPosition() {
        return (java.lang.String)getProperty("position");
    }

    public void setPosition(java.lang.String value) {
        setProperty("position", value);
    }

//<< Attributes

}
