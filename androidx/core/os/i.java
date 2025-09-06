package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.text.ICUCompat;
import java.util.Locale;

public abstract class i {
    public static final Locale[] a;

    static {
        i.a = new Locale[]{new Locale("en", "XA"), new Locale("ar", "XB")};
    }

    @DoNotInline
    public static Locale a(String s) {
        return Locale.forLanguageTag(s);
    }

    @DoNotInline
    public static boolean b(@NonNull Locale locale0, @NonNull Locale locale1) {
        if(locale0.equals(locale1)) {
            return true;
        }
        if(!locale0.getLanguage().equals(locale1.getLanguage())) {
            return false;
        }
        Locale[] arr_locale = i.a;
        for(int v = 0; v < arr_locale.length; ++v) {
            if(arr_locale[v].equals(locale0)) {
                return false;
            }
        }
        for(int v1 = 0; v1 < arr_locale.length; ++v1) {
            if(arr_locale[v1].equals(locale1)) {
                return false;
            }
        }
        String s = ICUCompat.maximizeAndGetScript(locale0);
        if(s.isEmpty()) {
            String s1 = locale0.getCountry();
            return s1.isEmpty() || s1.equals(locale1.getCountry());
        }
        return s.equals(ICUCompat.maximizeAndGetScript(locale1));
    }
}

