package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import java.util.Locale;

public abstract class j {
    @DoNotInline
    public static LocaleList a(Locale[] arr_locale) {
        return new LocaleList(arr_locale);
    }

    @DoNotInline
    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    @DoNotInline
    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}

