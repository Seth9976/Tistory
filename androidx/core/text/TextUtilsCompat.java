package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

public final class TextUtilsCompat {
    public static int getLayoutDirectionFromLocale(@Nullable Locale locale0) {
        return TextUtils.getLayoutDirectionFromLocale(locale0);
    }

    @NonNull
    public static String htmlEncode(@NonNull String s) {
        return TextUtils.htmlEncode(s);
    }
}

