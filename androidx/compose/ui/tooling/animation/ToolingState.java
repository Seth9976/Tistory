package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000F\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\f\u001A\u00028\u00002\u0006\u0010\u0006\u001A\u00028\u00008V@VX\u0096\u008E\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\u0005¨\u0006\r"}, d2 = {"Landroidx/compose/ui/tooling/animation/ToolingState;", "T", "Landroidx/compose/runtime/State;", "default", "<init>", "(Ljava/lang/Object;)V", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "value", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nToolingState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolingState.android.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n81#2:41\n107#2,2:42\n*S KotlinDebug\n*F\n+ 1 ToolingState.android.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n*L\n38#1:41\n38#1:42,2\n*E\n"})
public final class ToolingState implements State {
    public static final int $stable;
    public final MutableState a;

    public ToolingState(Object object0) {
        this.a = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.a.getValue();
    }

    public void setValue(Object object0) {
        this.a.setValue(object0);
    }
}

