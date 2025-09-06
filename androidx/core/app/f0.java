package androidx.core.app;

import android.app.LocaleManager;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;

public abstract class f0 {
    @DoNotInline
    public static LocaleList a(Object object0) {
        return ((LocaleManager)object0).getApplicationLocales();
    }

    @DoNotInline
    public static LocaleList b(Object object0) {
        return ((LocaleManager)object0).getSystemLocales();
    }
}

