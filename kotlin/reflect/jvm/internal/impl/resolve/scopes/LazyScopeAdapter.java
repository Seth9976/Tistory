package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import a4.c;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class LazyScopeAdapter extends AbstractScopeAdapter {
    public final NotNullLazyValue a;

    @JvmOverloads
    public LazyScopeAdapter(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "getScope");
        this(null, function00, 1, null);
    }

    @JvmOverloads
    public LazyScopeAdapter(@NotNull StorageManager storageManager0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(function00, "getScope");
        super();
        this.a = storageManager0.createLazyValue(new c(function00, 7));
    }

    public LazyScopeAdapter(StorageManager storageManager0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            storageManager0 = LockBasedStorageManager.NO_LOCKS;
            Intrinsics.checkNotNullExpressionValue(storageManager0, "NO_LOCKS");
        }
        this(storageManager0, function00);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public MemberScope getWorkerScope() {
        return (MemberScope)this.a.invoke();
    }
}

