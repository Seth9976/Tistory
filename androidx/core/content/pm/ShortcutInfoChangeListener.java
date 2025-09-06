package androidx.core.content.pm;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public abstract class ShortcutInfoChangeListener {
    @AnyThread
    public void onAllShortcutsRemoved() {
    }

    @AnyThread
    public void onShortcutAdded(@NonNull List list0) {
    }

    @AnyThread
    public void onShortcutRemoved(@NonNull List list0) {
    }

    @AnyThread
    public void onShortcutUpdated(@NonNull List list0) {
    }

    @AnyThread
    public void onShortcutUsageReported(@NonNull List list0) {
    }
}

