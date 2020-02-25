package org.vaadin.anastasia.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("button")
@CssImport(value = "./styles/vaadin-button-styles.css", themeFor = "vaadin-button")
public class ButtonView extends VerticalLayout {

    public ButtonView(){
        Button button=new Button("Styled button");
        button.setThemeName("styledButton");
        add(button);
    }
}
