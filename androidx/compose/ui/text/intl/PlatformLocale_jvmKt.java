package androidx.compose.ui.text.intl;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u0010\u0010\n\u001A\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000\"\u001C\u0010\u0000\u001A\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\"\u001C\u0010\u0006\u001A\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005\"\u001C\u0010\b\u001A\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\u0005*\n\u0010\u000B\"\u00020\u00022\u00020\u0002¨\u0006\f"}, d2 = {"language", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "getLanguage", "(Ljava/util/Locale;)Ljava/lang/String;", "region", "getRegion", "script", "getScript", "getLanguageTag", "PlatformLocale", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformLocale_jvmKt {
    @NotNull
    public static final String getLanguage(@NotNull Locale locale0) {
        return locale0.getLanguage();
    }

    @NotNull
    public static final String getLanguageTag(@NotNull Locale locale0) {
        return locale0.toLanguageTag();
    }

    @NotNull
    public static final String getRegion(@NotNull Locale locale0) {
        return locale0.getCountry();
    }

    @NotNull
    public static final String getScript(@NotNull Locale locale0) {
        return locale0.getScript();
    }
}

