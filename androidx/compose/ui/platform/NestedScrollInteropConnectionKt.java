package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0019\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "offset", "", "composeToViewOffset", "(F)I", "Landroid/view/View;", "hostView", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberNestedScrollInteropConnection", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "NestedScrollInteropConnectionKt")
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,239:1\n77#2:240\n1223#3,6:241\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n235#1:240\n236#1:241,6\n*E\n"})
public final class NestedScrollInteropConnectionKt {
    public static final int access$getScrollAxes-k-4lQ0M(long v) {
        int v1 = Math.abs(Offset.getX-impl(v)) >= 0.5f ? 1 : 0;
        return Math.abs(Offset.getY-impl(v)) >= 0.5f ? v1 | 2 : v1;
    }

    public static final long access$toOffset-Uv8p0NA(int[] arr_v, long v) {
        float f = Float.compare(Offset.getX-impl(v), 0.0f) < 0 ? c.coerceAtLeast(((float)arr_v[0]) * -1.0f, Offset.getX-impl(v)) : c.coerceAtMost(((float)arr_v[0]) * -1.0f, Offset.getX-impl(v));
        return Float.compare(Offset.getY-impl(v), 0.0f) < 0 ? OffsetKt.Offset(f, c.coerceAtLeast(((float)arr_v[1]) * -1.0f, Offset.getY-impl(v))) : OffsetKt.Offset(f, c.coerceAtMost(((float)arr_v[1]) * -1.0f, Offset.getY-impl(v)));
    }

    // 去混淆评级： 低(20)
    public static final int access$toViewType-GyEprt8(int v) {
        return !NestedScrollSource.equals-impl0(v, 1);
    }

    public static final float access$toViewVelocity(float f) [...] // Inlined contents

    public static final int composeToViewOffset(float f) {
        return f >= 0.0f ? -((int)(((float)Math.ceil(f)))) : -((int)(((float)Math.floor(f))));
    }

    @Composable
    @NotNull
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(@Nullable View view0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            view0 = (View)composer0.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x40209863, v, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        boolean z = composer0.changed(view0);
        NestedScrollInteropConnection nestedScrollInteropConnection0 = composer0.rememberedValue();
        if(z || nestedScrollInteropConnection0 == Composer.Companion.getEmpty()) {
            nestedScrollInteropConnection0 = new NestedScrollInteropConnection(view0);
            composer0.updateRememberedValue(nestedScrollInteropConnection0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nestedScrollInteropConnection0;
    }
}

