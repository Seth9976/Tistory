package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import md.c;
import org.jetbrains.annotations.NotNull;

public interface BuiltInsLoader {
    public static final class Companion {
        public static final Companion a;
        public static final Lazy b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = c.lazy(LazyThreadSafetyMode.PUBLICATION, a.w);
        }

        @NotNull
        public final BuiltInsLoader getInstance() {
            return (BuiltInsLoader)Companion.b.getValue();
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        BuiltInsLoader.Companion = Companion.a;
    }

    @NotNull
    PackageFragmentProvider createPackageFragmentProvider(@NotNull StorageManager arg1, @NotNull ModuleDescriptor arg2, @NotNull Iterable arg3, @NotNull PlatformDependentDeclarationFilter arg4, @NotNull AdditionalClassPartsProvider arg5, boolean arg6);
}

