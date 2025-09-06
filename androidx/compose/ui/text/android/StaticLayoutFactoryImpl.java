package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\'¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\n\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\bH&¢\u0006\u0004\b\n\u0010\u000Bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "", "Landroidx/compose/ui/text/android/q;", "params", "Landroid/text/StaticLayout;", "create", "(Landroidx/compose/ui/text/android/q;)Landroid/text/StaticLayout;", "layout", "", "useFallbackLineSpacing", "isFallbackLineSpacingEnabled", "(Landroid/text/StaticLayout;Z)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
interface StaticLayoutFactoryImpl {
    @DoNotInline
    @NotNull
    StaticLayout create(@NotNull q arg1);

    boolean isFallbackLineSpacingEnabled(@NotNull StaticLayout arg1, boolean arg2);
}

