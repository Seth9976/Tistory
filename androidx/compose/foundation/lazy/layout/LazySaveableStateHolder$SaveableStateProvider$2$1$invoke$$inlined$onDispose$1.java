package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import d0.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2$1\n*L\n1#1,497:1\n89#2,2:498\n*E\n"})
public final class LazySaveableStateHolder.SaveableStateProvider.2.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final f0 a;
    public final Object b;

    public LazySaveableStateHolder.SaveableStateProvider.2.1.invoke..inlined.onDispose.1(f0 f00, Object object0) {
        this.a = f00;
        this.b = object0;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.a.c.add(this.b);
    }
}

