package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1\n*L\n1#1,497:1\n122#2,2:498\n*E\n"})
public final class WindowInsetsConnection_androidKt.rememberWindowInsetsConnection.1.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final n4 a;

    public WindowInsetsConnection_androidKt.rememberWindowInsetsConnection.1.1.invoke..inlined.onDispose.1(n4 n40) {
        this.a = n40;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        n4 n40 = this.a;
        CancellableContinuationImpl cancellableContinuationImpl0 = n40.j;
        if(cancellableContinuationImpl0 != null) {
            cancellableContinuationImpl0.resume(null, f4.y);
        }
        Job job0 = n40.i;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController0 = n40.e;
        if(windowInsetsAnimationController0 != null) {
            windowInsetsAnimationController0.finish(!Intrinsics.areEqual(windowInsetsAnimationController0.getCurrentInsets(), windowInsetsAnimationController0.getHiddenStateInsets()));
        }
    }
}

