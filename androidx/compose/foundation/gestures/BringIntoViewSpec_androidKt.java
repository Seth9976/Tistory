package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\"&\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0004\u0010\u0005\" \u0010\u000E\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0007\u001A\u0004\b\u000B\u0010\f¨\u0006\u000F"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBringIntoViewSpec", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBringIntoViewSpec$annotations", "()V", "LocalBringIntoViewSpec", "b", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getPivotBringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getPivotBringIntoViewSpec$annotations", "PivotBringIntoViewSpec", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BringIntoViewSpec_androidKt {
    public static final ProvidableCompositionLocal a;
    public static final BringIntoViewSpec_androidKt.PivotBringIntoViewSpec.1 b;

    static {
        BringIntoViewSpec_androidKt.a = CompositionLocalKt.compositionLocalWithComputedDefaultOf(i.w);
        BringIntoViewSpec_androidKt.b = new BringIntoViewSpec_androidKt.PivotBringIntoViewSpec.1();
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final ProvidableCompositionLocal getLocalBringIntoViewSpec() {
        return BringIntoViewSpec_androidKt.a;
    }

    @ExperimentalFoundationApi
    public static void getLocalBringIntoViewSpec$annotations() {
    }

    @NotNull
    public static final BringIntoViewSpec getPivotBringIntoViewSpec() {
        return BringIntoViewSpec_androidKt.b;
    }

    public static void getPivotBringIntoViewSpec$annotations() {
    }
}

