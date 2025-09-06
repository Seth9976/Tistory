package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;
import androidx.annotation.DoNotInline;

public abstract class y0 {
    @DoNotInline
    public static LocaleList a(String s) {
        return LocaleList.forLanguageTags(s);
    }

    @DoNotInline
    public static void b(TextView textView0, LocaleList localeList0) {
        textView0.setTextLocales(localeList0);
    }
}

