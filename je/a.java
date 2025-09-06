package je;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

public final class a extends KotlinBuiltIns {
    public static final FallbackBuiltIns.Companion f;
    public static final a g;

    static {
        a.f = new FallbackBuiltIns.Companion(null);
        a a0 = new a(new LockBasedStorageManager("FallbackBuiltIns"));  // 初始化器: Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;)V
        a0.createBuiltInsModule(true);
        a.g = a0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return All.INSTANCE;
    }
}

