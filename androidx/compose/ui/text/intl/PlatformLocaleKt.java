package androidx.compose.ui.text.intl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001A\u0010\u0005\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "a", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "getPlatformLocaleDelegate", "()Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "platformLocaleDelegate", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformLocaleKt {
    public static final PlatformLocaleDelegate a;

    static {
        PlatformLocaleKt.a = AndroidPlatformLocale_androidKt.createPlatformLocaleDelegate();
    }

    @NotNull
    public static final PlatformLocaleDelegate getPlatformLocaleDelegate() {
        return PlatformLocaleKt.a;
    }
}

