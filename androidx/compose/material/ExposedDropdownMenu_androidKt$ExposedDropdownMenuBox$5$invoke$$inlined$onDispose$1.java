package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p0.z5;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5\n*L\n1#1,497:1\n153#2:498\n*E\n"})
public final class ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox.5.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final z5 a;

    public ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox.5.invoke..inlined.onDispose.1(z5 z50) {
        this.a = z50;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        z5 z50 = this.a;
        View view0 = z50.a;
        if(z50.c) {
            view0.getViewTreeObserver().removeOnGlobalLayoutListener(z50);
            z50.c = false;
        }
        view0.removeOnAttachStateChangeListener(z50);
    }
}

