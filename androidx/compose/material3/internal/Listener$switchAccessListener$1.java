package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w0.a1;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u000F\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00078F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"androidx/compose/material3/internal/Listener$switchAccessListener$1", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager;", "am", "", "onAccessibilityServicesStateChanged", "(Landroid/view/accessibility/AccessibilityManager;)V", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener$switchAccessListener$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,183:1\n81#2:184\n107#2,2:185\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener$switchAccessListener$1\n*L\n109#1:184\n109#1:185,2\n*E\n"})
public final class Listener.switchAccessListener.1 implements AccessibilityManager.AccessibilityServicesStateChangeListener {
    public final MutableState a;
    public final a1 b;

    public Listener.switchAccessListener.1(a1 a10) {
        this.b = a10;
        this.a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final boolean getEnabled() {
        return ((Boolean)this.a.getValue()).booleanValue();
    }

    @Override  // android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener
    public void onAccessibilityServicesStateChanged(@NotNull AccessibilityManager accessibilityManager0) {
        this.b.getClass();
        this.setEnabled(a1.a(accessibilityManager0));
    }

    public final void setEnabled(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}

