package org.vaadin.anastasia.views;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;

@Route("textArea")
@CssImport(value = "./styles/vaadin-textarea-styles.css", themeFor = "vaadin-text-area")
public class TextAreaView extends VerticalLayout {

    public TextAreaView(){
        TextArea area=new TextArea("Styled TextArea");
        area.setThemeName("custom-variant");
        add(area);
    }
}
