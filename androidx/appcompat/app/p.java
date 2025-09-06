package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.DoNotInline;

public abstract class p {
    @DoNotInline
    public static LocaleList a(String s) {
        return LocaleList.forLanguageTags(s);
    }
}

