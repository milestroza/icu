package com.ibm.icu.impl.data;
import java.util.ListResourceBundle;

// Arabic, Bahrain
public class CalendarData_ar_BH extends ListResourceBundle {
    /**
     * Overrides ListResourceBundle
     */
    public Object[][] getContents() {
        return new Object[][] {
            { "Weekend",
                new String[] { // Thursday:Friday
                    "5", "0", // onset dow, millis in day
                    "7", "0"  // cease dow, millis in day
                }
            },
        };
    }
}
