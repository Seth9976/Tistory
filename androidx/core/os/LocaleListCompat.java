package androidx.core.os;

import android.os.Build.VERSION;
import android.os.LocaleList;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import java.util.Locale;

public final class LocaleListCompat {
    public final k a;
    public static final LocaleListCompat b;

    static {
        LocaleListCompat.b = LocaleListCompat.create(new Locale[0]);
    }

    public LocaleListCompat(k k0) {
        this.a = k0;
    }

    @NonNull
    public static LocaleListCompat create(@NonNull Locale[] arr_locale) {
        return LocaleListCompat.wrap(j.a(arr_locale));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof LocaleListCompat && this.a.equals(((LocaleListCompat)object0).a);
    }

    @NonNull
    public static LocaleListCompat forLanguageTags(@Nullable String s) {
        if(s != null && !s.isEmpty()) {
            String[] arr_s = s.split(",", -1);
            Locale[] arr_locale = new Locale[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_locale[v] = i.a(arr_s[v]);
            }
            return LocaleListCompat.create(arr_locale);
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    @Nullable
    public Locale get(int v) {
        return this.a.a.get(v);
    }

    @NonNull
    @Size(min = 1L)
    public static LocaleListCompat getAdjustedDefault() {
        return LocaleListCompat.wrap(j.b());
    }

    @NonNull
    @Size(min = 1L)
    public static LocaleListCompat getDefault() {
        return LocaleListCompat.wrap(j.c());
    }

    @NonNull
    public static LocaleListCompat getEmptyLocaleList() {
        return LocaleListCompat.b;
    }

    @Nullable
    public Locale getFirstMatch(@NonNull String[] arr_s) {
        return this.a.a.getFirstMatch(arr_s);
    }

    @Override
    public int hashCode() {
        return this.a.a.hashCode();
    }

    @IntRange(from = -1L)
    public int indexOf(@Nullable Locale locale0) {
        return this.a.a.indexOf(locale0);
    }

    public boolean isEmpty() {
        return this.a.a.isEmpty();
    }

    @RequiresApi(21)
    public static boolean matchesLanguageAndScript(@NonNull Locale locale0, @NonNull Locale locale1) {
        return Build.VERSION.SDK_INT < 33 ? i.b(locale0, locale1) : LocaleList.matchesLanguageAndScript(locale0, locale1);
    }

    @IntRange(from = 0L)
    public int size() {
        return this.a.a.size();
    }

    @NonNull
    public String toLanguageTags() {
        return this.a.a.toLanguageTags();
    }

    @Override
    @NonNull
    public String toString() {
        return this.a.a.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.a.a;
    }

    @NonNull
    @RequiresApi(24)
    public static LocaleListCompat wrap(@NonNull LocaleList localeList0) {
        return new LocaleListCompat(new k(localeList0));
    }

    @RequiresApi(24)
    @Deprecated
    public static LocaleListCompat wrap(Object object0) {
        return LocaleListCompat.wrap(((LocaleList)object0));
    }
}

