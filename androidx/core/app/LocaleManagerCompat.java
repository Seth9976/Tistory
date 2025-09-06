package androidx.core.app;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.core.os.LocaleListCompat;

public final class LocaleManagerCompat {
    @AnyThread
    @NonNull
    public static LocaleListCompat getApplicationLocales(@NonNull Context context0) {
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = context0.getSystemService("locale");
            return object0 == null ? LocaleListCompat.getEmptyLocaleList() : LocaleListCompat.wrap(f0.a(object0));
        }
        return LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context0));
    }

    @AnyThread
    @NonNull
    public static LocaleListCompat getSystemLocales(@NonNull Context context0) {
        LocaleListCompat localeListCompat0 = LocaleListCompat.getEmptyLocaleList();
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = context0.getSystemService("locale");
            return object0 == null ? localeListCompat0 : LocaleListCompat.wrap(f0.b(object0));
        }
        return e0.a(Resources.getSystem().getConfiguration());
    }
}

