package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0017\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"currentStateAsState", "Landroidx/compose/runtime/State;", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LifecycleExtKt {
    @Composable
    @NotNull
    public static final State currentStateAsState(@NotNull Lifecycle lifecycle0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x8F34EB00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8F34EB00, v, -1, "androidx.lifecycle.compose.currentStateAsState (LifecycleExt.kt:31)");
        }
        State state0 = SnapshotStateKt.collectAsState(lifecycle0.getCurrentStateFlow(), null, composer0, 0, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}

