package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0019\u0010\u0003\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0019\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001A\u0019\u0010\u0006\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001A\u0019\u0010\u0007\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0004\u001A\u0019\u0010\u0003\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0005\u0010\n\u001A\u0019\u0010\u0006\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\n\u001A\u0019\u0010\u0007\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000B"}, d2 = {"", "Landroidx/compose/ui/text/intl/Locale;", "locale", "toUpperCase", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/Locale;)Ljava/lang/String;", "toLowerCase", "capitalize", "decapitalize", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/LocaleList;)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class StringKt {
    public static final PlatformStringDelegate a;

    static {
        StringKt.a = AndroidStringDelegate_androidKt.ActualStringDelegate();
    }

    @NotNull
    public static final String capitalize(@NotNull String s, @NotNull Locale locale0) {
        java.util.Locale locale1 = locale0.getPlatformLocale();
        return StringKt.a.capitalize(s, locale1);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final String capitalize(@NotNull String s, @NotNull LocaleList localeList0) {
        return localeList0.isEmpty() ? StringKt.capitalize(s, Locale.Companion.getCurrent()) : StringKt.capitalize(s, localeList0.get(0));
    }

    @NotNull
    public static final String decapitalize(@NotNull String s, @NotNull Locale locale0) {
        return StringKt.a.decapitalize(s, locale0.getPlatformLocale());
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final String decapitalize(@NotNull String s, @NotNull LocaleList localeList0) {
        return localeList0.isEmpty() ? StringKt.decapitalize(s, Locale.Companion.getCurrent()) : StringKt.decapitalize(s, localeList0.get(0));
    }

    @NotNull
    public static final String toLowerCase(@NotNull String s, @NotNull Locale locale0) {
        return StringKt.a.toLowerCase(s, locale0.getPlatformLocale());
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final String toLowerCase(@NotNull String s, @NotNull LocaleList localeList0) {
        return localeList0.isEmpty() ? StringKt.toLowerCase(s, Locale.Companion.getCurrent()) : StringKt.toLowerCase(s, localeList0.get(0));
    }

    @NotNull
    public static final String toUpperCase(@NotNull String s, @NotNull Locale locale0) {
        return StringKt.a.toUpperCase(s, locale0.getPlatformLocale());
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final String toUpperCase(@NotNull String s, @NotNull LocaleList localeList0) {
        return localeList0.isEmpty() ? StringKt.toUpperCase(s, Locale.Companion.getCurrent()) : StringKt.toUpperCase(s, localeList0.get(0));
    }
}

