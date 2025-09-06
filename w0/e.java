package w0;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.material3.internal.Listener.switchAccessListener.1;
import androidx.compose.material3.internal.Listener.touchExplorationListener.1;
import androidx.lifecycle.Lifecycle.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final a1 w;
    public final AccessibilityManager x;

    public e(a1 a10, AccessibilityManager accessibilityManager0) {
        this.w = a10;
        this.x = accessibilityManager0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((Event)object0) == Event.ON_RESUME) {
            a1 a10 = this.w;
            a10.getClass();
            AccessibilityManager accessibilityManager0 = this.x;
            Boolean boolean0 = Boolean.valueOf(accessibilityManager0.isEnabled());
            a10.a.setValue(boolean0);
            accessibilityManager0.addAccessibilityStateChangeListener(a10);
            Listener.touchExplorationListener.1 listener$touchExplorationListener$10 = a10.b;
            if(listener$touchExplorationListener$10 != null) {
                listener$touchExplorationListener$10.setEnabled(accessibilityManager0.isTouchExplorationEnabled());
                accessibilityManager0.addTouchExplorationStateChangeListener(listener$touchExplorationListener$10);
            }
            if(Build.VERSION.SDK_INT >= 33) {
                Listener.switchAccessListener.1 listener$switchAccessListener$10 = a10.c;
                if(listener$switchAccessListener$10 != null) {
                    listener$switchAccessListener$10.setEnabled(a1.a(accessibilityManager0));
                    z0.a(accessibilityManager0, listener$switchAccessListener$10);
                }
            }
        }
        return Unit.INSTANCE;
    }
}

