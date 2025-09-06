package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001A*\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A#\u0010\u0002\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001A*\u0010\u0002\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"absoluteOffset", "Landroidx/compose/ui/Modifier;", "offset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "absoluteOffset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset-VpY3zN4", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,256:1\n148#2:257\n148#2:258\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n49#1:257\n75#1:258\n*E\n"})
public final class OffsetKt {
    @NotNull
    public static final Modifier absoluteOffset(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new OffsetPxElement(function10, new g3(function10, 0), false));
    }

    @Stable
    @NotNull
    public static final Modifier absoluteOffset-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new OffsetElement(f, f1, false, new f3(f, f1, 0)));
    }

    public static Modifier absoluteOffset-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return OffsetKt.absoluteOffset-VpY3zN4(modifier0, f, f1);
    }

    @NotNull
    public static final Modifier offset(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new OffsetPxElement(function10, new g3(function10, 1), true));
    }

    @Stable
    @NotNull
    public static final Modifier offset-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new OffsetElement(f, f1, true, new f3(f, f1, 1)));
    }

    public static Modifier offset-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return OffsetKt.offset-VpY3zN4(modifier0, f, f1);
    }
}

