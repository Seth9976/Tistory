package androidx.transition;

import android.view.ViewGroup;
import android.view.WindowId;

public final class z0 implements WindowIdImpl {
    public final WindowId a;

    public z0(ViewGroup viewGroup0) {
        this.a = viewGroup0.getWindowId();
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof z0 && ((z0)object0).a.equals(this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

