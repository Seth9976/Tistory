package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function1 {
    public final int w;
    public final AndroidComposeViewAccessibilityDelegateCompat x;

    public z(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, int v) {
        this.w = v;
        this.x = androidComposeViewAccessibilityDelegateCompat0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            AndroidComposeViewAccessibilityDelegateCompat.access$scheduleScrollEventIfNeeded(this.x, ((ScrollObservationScope)object0));
            return Unit.INSTANCE;
        }
        return Boolean.valueOf(this.x.getView().getParent().requestSendAccessibilityEvent(this.x.getView(), ((AccessibilityEvent)object0)));
    }
}

