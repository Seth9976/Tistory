package androidx.databinding;

import androidx.annotation.NonNull;

public class PropertyChangeRegistry extends CallbackRegistry {
    public static final g f;

    static {
        PropertyChangeRegistry.f = new g();  // 初始化器: Landroidx/databinding/CallbackRegistry$NotifierCallback;-><init>()V
    }

    public PropertyChangeRegistry() {
        super(PropertyChangeRegistry.f);
    }

    public void notifyChange(@NonNull Observable observable0, int v) {
        this.notifyCallbacks(observable0, v, null);
    }
}

