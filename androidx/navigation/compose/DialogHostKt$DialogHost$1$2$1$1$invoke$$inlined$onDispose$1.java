package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2$1$1\n*L\n1#1,497:1\n59#2,3:498\n*E\n"})
public final class DialogHostKt.DialogHost.1.2.1.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final DialogNavigator a;
    public final NavBackStackEntry b;
    public final SnapshotStateList c;

    public DialogHostKt.DialogHost.1.2.1.1.invoke..inlined.onDispose.1(DialogNavigator dialogNavigator0, NavBackStackEntry navBackStackEntry0, SnapshotStateList snapshotStateList0) {
        this.a = dialogNavigator0;
        this.b = navBackStackEntry0;
        this.c = snapshotStateList0;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.a.onTransitionComplete$navigation_compose_release(this.b);
        this.c.remove(this.b);
    }
}

