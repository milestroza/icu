package com.ibm.icu.dev.data;

import java.util.ListResourceBundle;
import com.ibm.icu.impl.ICUListResourceBundle;

public class TestDataElements_testaliases extends ICUListResourceBundle {

    public TestDataElements_testaliases  () {
          super.contents = data;
    }
    private static Object[][] data = new Object[][] { 
                {
                    "CollationElements",
                    new ICUListResourceBundle.Alias("/ICUDATA/uk"),
                },

                {
                    "anotheralias",
                    new ICUListResourceBundle.Alias("/ICUDATA/uk/CollationElements"),
                },
                {
                    "nonexisting",
                    new ICUListResourceBundle.Alias("/ICUDATA/uk"),
                },
                {
                    "referencingalias",
                    new ICUListResourceBundle.Alias("testaliases/anotheralias/Sequence"),
                },
                {
                    "simplealias",
                    new ICUListResourceBundle.Alias("testtypes/menu/file/open"),
                },
                {
                    "zoneStrings",
                    new Object[]{
                        new ICUListResourceBundle.Alias("/ICUDATA/en"),
                        new ICUListResourceBundle.Alias("/ICUDATA/en"),

                    },
                },
                {
                    "zoneTests",
                    new Object[][]{
                        {
                            "zoneAlias",
                            new ICUListResourceBundle.Alias("/ICUDATA/en/zoneStrings"),
                        },
                        {
                            "zoneAlias1",
                            new ICUListResourceBundle.Alias("/ICUDATA/en/zoneStrings/3"),
                        },
                        {
                            "zoneAlias2",
                            new ICUListResourceBundle.Alias("/ICUDATA/en/zoneStrings/3/0"),
                        },
                    },
                },
    };
}
