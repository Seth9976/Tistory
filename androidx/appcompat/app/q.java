package androidx.appcompat.app;

import android.app.LocaleManager;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;

public abstract class q {
    @DoNotInline
    public static LocaleList a(Object object0) {
        return ((LocaleManager)object0).getApplicationLocales();
    }

    @DoNotInline
    public static void b(Object object0, LocaleList localeList0) {
        ((LocaleManager)object0).setApplicationLocales(localeList0);
    }
}

