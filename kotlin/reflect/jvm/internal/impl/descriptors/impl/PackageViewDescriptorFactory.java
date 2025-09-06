package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public interface PackageViewDescriptorFactory {
    public static final class Companion {
        public static final Companion a;
        public static final ModuleCapability b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new ModuleCapability("PackageViewDescriptorFactory");
        }

        @NotNull
        public final ModuleCapability getCAPABILITY() {
            return Companion.b;
        }
    }

    public static final class Default implements PackageViewDescriptorFactory {
        @NotNull
        public static final Default INSTANCE;

        static {
            Default.INSTANCE = new Default();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        @NotNull
        public PackageViewDescriptor compute(@NotNull ModuleDescriptorImpl moduleDescriptorImpl0, @NotNull FqName fqName0, @NotNull StorageManager storageManager0) {
            Intrinsics.checkNotNullParameter(moduleDescriptorImpl0, "module");
            Intrinsics.checkNotNullParameter(fqName0, "fqName");
            Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
            return new LazyPackageViewDescriptorImpl(moduleDescriptorImpl0, fqName0, storageManager0);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        PackageViewDescriptorFactory.Companion = Companion.a;
    }

    @NotNull
    PackageViewDescriptor compute(@NotNull ModuleDescriptorImpl arg1, @NotNull FqName arg2, @NotNull StorageManager arg3);
}

