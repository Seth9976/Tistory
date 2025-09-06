package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.os.LocaleListCompat;

public abstract class z {
    @DoNotInline
    public static void a(@NonNull Configuration configuration0, @NonNull Configuration configuration1, @NonNull Configuration configuration2) {
        LocaleList localeList0 = configuration0.getLocales();
        LocaleList localeList1 = configuration1.getLocales();
        if(!localeList0.equals(localeList1)) {
            configuration2.setLocales(localeList1);
            configuration2.locale = configuration1.locale;
        }
    }

    @DoNotInline
    public static LocaleListCompat b(Configuration configuration0) {
        return LocaleListCompat.forLanguageTags(configuration0.getLocales().toLanguageTags());
    }

    @DoNotInline
    public static void c(LocaleListCompat localeListCompat0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat0.toLanguageTags()));
    }

    @DoNotInline
    public static void d(Configuration configuration0, LocaleListCompat localeListCompat0) {
        configuration0.setLocales(LocaleList.forLanguageTags(localeListCompat0.toLanguageTags()));
    }
}

