package androidx.work;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemClock implements Clock {
    @Override  // androidx.work.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}

