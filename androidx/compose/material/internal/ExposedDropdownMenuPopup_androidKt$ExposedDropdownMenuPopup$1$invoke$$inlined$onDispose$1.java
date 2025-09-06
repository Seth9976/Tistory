package androidx.compose.material.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import s0.g;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1\n*L\n1#1,497:1\n127#2,4:498\n*E\n"})
public final class ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final g a;

    public ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup.1.invoke..inlined.onDispose.1(g g0) {
        this.a = g0;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.a.disposeComposition();
        this.a.getClass();
        ViewTreeLifecycleOwner.set(this.a, null);
        this.a.F.getViewTreeObserver().removeOnGlobalLayoutListener(this.a);
        this.a.G.removeViewImmediate(this.a);
    }
}

