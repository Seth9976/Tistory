package androidx.compose.foundation;

import android.os.Build.VERSION;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0011\u0010\u0001\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A%\u0010\u0001\u001A\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0001\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "systemGestureExclusion", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "exclusion", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "SystemGestureExclusionKt")
@SourceDebugExtension({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,111:1\n66#1:112\n66#1:113\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n42#1:112\n59#1:113\n*E\n"})
public final class SystemGestureExclusionKt {
    @NotNull
    public static final Modifier systemGestureExclusion(@NotNull Modifier modifier0) {
        return Build.VERSION.SDK_INT < 29 ? modifier0 : modifier0.then(new ExcludeFromSystemGestureElement(null));
    }

    @NotNull
    public static final Modifier systemGestureExclusion(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return Build.VERSION.SDK_INT < 29 ? modifier0 : modifier0.then(new ExcludeFromSystemGestureElement(function10));
    }
}

