package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.PlatformStringDelegate;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001C\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\n\u0010\u0006\u001A\u00060\u0007j\u0002`\bH\u0016J\u001C\u0010\t\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\n\u0010\u0006\u001A\u00060\u0007j\u0002`\bH\u0016J\u001C\u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\n\u0010\u0006\u001A\u00060\u0007j\u0002`\bH\u0016J\u001C\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\n\u0010\u0006\u001A\u00060\u0007j\u0002`\bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", "string", "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable;

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String capitalize(@NotNull String s, @NotNull Locale locale0) {
        if(s.length() > 0) {
            int v = s.charAt(0);
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
            return (Character.isLowerCase(((char)v)) ? b.titlecase(((char)v), locale0) : String.valueOf(((char)v))) + s1;
        }
        return s;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String decapitalize(@NotNull String s, @NotNull Locale locale0) {
        if(s.length() > 0) {
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
            return b.lowercase(s.charAt(0), locale0) + s1;
        }
        return s;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String toLowerCase(@NotNull String s, @NotNull Locale locale0) {
        String s1 = s.toLowerCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).toLowerCase(locale)");
        return s1;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String toUpperCase(@NotNull String s, @NotNull Locale locale0) {
        String s1 = s.toUpperCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).toUpperCase(locale)");
        return s1;
    }
}

