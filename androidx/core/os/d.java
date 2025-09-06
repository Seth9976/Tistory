package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

public abstract class d {
    @DoNotInline
    public static LocaleList a(Configuration configuration0) {
        return configuration0.getLocales();
    }

    @DoNotInline
    public static void b(@NonNull Configuration configuration0, @NonNull LocaleListCompat localeListCompat0) {
        configuration0.setLocales(((LocaleList)localeListCompat0.unwrap()));
    }
}

