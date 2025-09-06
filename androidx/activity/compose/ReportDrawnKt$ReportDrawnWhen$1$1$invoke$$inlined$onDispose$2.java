package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import j.j;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1\n*L\n1#1,483:1\n139#2,2:484\n*E\n"})
public final class ReportDrawnKt.ReportDrawnWhen.1.1.invoke..inlined.onDispose.2 implements DisposableEffectResult {
    public final j a;

    public ReportDrawnKt.ReportDrawnWhen.1.1.invoke..inlined.onDispose.2(j j0) {
        this.a = j0;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        SnapshotStateObserver snapshotStateObserver0 = this.a.c;
        snapshotStateObserver0.clear(this.a.b);
        FullyDrawnReporter fullyDrawnReporter0 = this.a.a;
        if(!fullyDrawnReporter0.isFullyDrawnReported()) {
            fullyDrawnReporter0.removeReporter();
        }
        snapshotStateObserver0.clear();
        snapshotStateObserver0.stop();
    }
}

