package androidx.compose.ui.text.intl;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001A\u00060\bj\u0002`\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI23;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "()V", "current", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "parseLanguageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "languageTag", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    public static final int $stable;

    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public LocaleList getCurrent() {
        return new LocaleList(k.listOf(new Locale(java.util.Locale.getDefault())));
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public java.util.Locale parseLanguageTag(@NotNull String s) {
        java.util.Locale locale0 = java.util.Locale.forLanguageTag(s);
        if(Intrinsics.areEqual(locale0.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + s + " is not well-formed. Locale is resolved to Undetermined. Note that underscore \'_\' is not a valid subtags delimiter and must be replaced with \'-\'.");
        }
        return locale0;
    }
}

