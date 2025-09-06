package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.DoNotInline;
import androidx.core.os.LocaleListCompat;

public abstract class e0 {
    @DoNotInline
    public static LocaleListCompat a(Configuration configuration0) {
        return LocaleListCompat.forLanguageTags(configuration0.getLocales().toLanguageTags());
    }
}

