package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt$ObserveState$3$1\n*L\n1#1,497:1\n80#2,3:498\n*E\n"})
public final class AccessibilityServiceStateProvider_androidKt.ObserveState.3.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final Function0 a;
    public final LifecycleOwner b;
    public final LifecycleEventObserver c;

    public AccessibilityServiceStateProvider_androidKt.ObserveState.3.1.invoke..inlined.onDispose.1(Function0 function00, LifecycleOwner lifecycleOwner0, LifecycleEventObserver lifecycleEventObserver0) {
        this.a = function00;
        this.b = lifecycleOwner0;
        this.c = lifecycleEventObserver0;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.a.invoke();
        this.b.getLifecycle().removeObserver(this.c);
    }
}

