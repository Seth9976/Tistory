package androidx.core.text;

import android.icu.util.ULocale;
import androidx.annotation.DoNotInline;
import java.util.Locale;

public abstract class c {
    @DoNotInline
    public static ULocale a(Object object0) {
        return ULocale.addLikelySubtags(((ULocale)object0));
    }

    @DoNotInline
    public static ULocale b(Locale locale0) {
        return ULocale.forLocale(locale0);
    }

    @DoNotInline
    public static String c(Object object0) {
        return ((ULocale)object0).getScript();
    }
}

