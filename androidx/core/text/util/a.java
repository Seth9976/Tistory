package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.MeasureUnit;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.util.Locale;
import l3.e;

public abstract class a {
    @DoNotInline
    public static String a(@NonNull Locale locale0) {
        switch(e.a[DateTimePatternGenerator.getInstance(locale0).getDefaultHourCycle().ordinal()]) {
            case 1: {
                return "h11";
            }
            case 2: {
                return "h12";
            }
            case 3: {
                return "h23";
            }
            case 4: {
                return "h24";
            }
            default: {
                return "";
            }
        }
    }

    @DoNotInline
    public static String b(@NonNull Locale locale0) {
        String s = ((UnlocalizedNumberFormatter)((UnlocalizedNumberFormatter)NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale0).format(1L).getOutputUnit().getIdentifier();
        return s.startsWith("fahrenhe") ? "fahrenhe" : s;
    }
}

