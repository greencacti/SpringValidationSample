package com.greencacti;

import java.beans.PropertyEditorSupport;

/**
 * Created by baominw on 4/26/17.
 */
public class ExoticTypeEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        String[] array = text.split(" ");
        setValue(new ExoticType(array[0], Integer.parseInt(array[1])));
    }
}
