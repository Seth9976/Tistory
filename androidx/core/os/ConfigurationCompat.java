package androidx.core.os;

import android.content.res.Configuration;
import androidx.annotation.NonNull;

public final class ConfigurationCompat {
    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration0) {
        return LocaleListCompat.wrap(d.a(configuration0));
    }

    public static void setLocales(@NonNull Configuration configuration0, @NonNull LocaleListCompat localeListCompat0) {
        d.b(configuration0, localeListCompat0);
    }
}

