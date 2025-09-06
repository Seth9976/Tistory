package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1\n*L\n1#1,497:1\n162#2,2:498\n*E\n"})
public final class AndroidCompositionLocals_androidKt.obtainResourceIdCache.1.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final Context a;
    public final AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1 b;

    public AndroidCompositionLocals_androidKt.obtainResourceIdCache.1.1.invoke..inlined.onDispose.1(Context context0, AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$10) {
        this.a = context0;
        this.b = androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$10;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}

