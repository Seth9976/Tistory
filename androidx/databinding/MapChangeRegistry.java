package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MapChangeRegistry extends CallbackRegistry {
    public static final e f;

    static {
        MapChangeRegistry.f = new e();  // 初始化器: Landroidx/databinding/CallbackRegistry$NotifierCallback;-><init>()V
    }

    public MapChangeRegistry() {
        super(MapChangeRegistry.f);
    }

    public void notifyChange(@NonNull ObservableMap observableMap0, @Nullable Object object0) {
        this.notifyCallbacks(observableMap0, 0, object0);
    }
}

