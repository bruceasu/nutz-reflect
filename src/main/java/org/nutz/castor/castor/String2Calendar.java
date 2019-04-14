package org.nutz.castor.castor;

import org.nutz.lang.util.Strings;

import java.util.Calendar;


public class String2Calendar extends DateTimeCastor<String, Calendar> {

    @Override
    public Calendar cast(String src, Class<?> toType, String... args) {
        if (Strings.isBlank(src))
            return null;
        Calendar c = Calendar.getInstance();
        c.setTime(toDate(src));
        return c;
    }

}
