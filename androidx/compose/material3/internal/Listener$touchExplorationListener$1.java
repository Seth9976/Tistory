package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00028F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"androidx/compose/material3/internal/Listener$touchExplorationListener$1", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "", "enabled", "", "onTouchExplorationStateChanged", "(Z)V", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getEnabled", "()Z", "setEnabled", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener$touchExplorationListener$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,183:1\n81#2:184\n107#2,2:185\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener$touchExplorationListener$1\n*L\n96#1:184\n96#1:185,2\n*E\n"})
public final class Listener.touchExplorationListener.1 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final MutableState a;

    public Listener.touchExplorationListener.1() {
        this.a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final boolean getEnabled() {
        return ((Boolean)this.a.getValue()).booleanValue();
    }

    @Override  // android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        this.setEnabled(z);
    }

    public final void setEnabled(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}

