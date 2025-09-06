package w0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.material3.internal.Listener.switchAccessListener.1;
import androidx.compose.material3.internal.Listener.touchExplorationListener.1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;

public final class a1 implements AccessibilityManager.AccessibilityStateChangeListener, State {
    public final MutableState a;
    public final Listener.touchExplorationListener.1 b;
    public final Listener.switchAccessListener.1 c;

    public a1(boolean z, boolean z1) {
        Listener.switchAccessListener.1 listener$switchAccessListener$10 = null;
        this.a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.b = z ? new Listener.touchExplorationListener.1() : null;
        if(z1 && Build.VERSION.SDK_INT >= 33) {
            listener$switchAccessListener$10 = new Listener.switchAccessListener.1(this);
        }
        this.c = listener$switchAccessListener$10;
    }

    public static boolean a(AccessibilityManager accessibilityManager0) {
        List list0 = accessibilityManager0.getEnabledAccessibilityServiceList(16);
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = ((AccessibilityServiceInfo)list0.get(v1)).getSettingsActivityName();
            if(s != null && StringsKt__StringsKt.contains$default(s, "SwitchAccess", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(30)
    @Override  // androidx.compose.runtime.State
    public final Object getValue() {
        return Boolean.valueOf(((Boolean)this.a.getValue()).booleanValue() && ((this.b == null ? false : this.b.getEnabled()) || (this.c == null ? false : this.c.getEnabled())));
    }

    @Override  // android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}

