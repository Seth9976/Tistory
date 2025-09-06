package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class BinaryClassAnnotationAndConstantLoaderImplKt {
    @NotNull
    public static final BinaryClassAnnotationAndConstantLoaderImpl createBinaryClassAnnotationAndConstantLoader(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull NotFoundClasses notFoundClasses0, @NotNull StorageManager storageManager0, @NotNull KotlinClassFinder kotlinClassFinder0, @NotNull JvmMetadataVersion jvmMetadataVersion0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion0, "jvmMetadataVersion");
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl0 = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptor0, notFoundClasses0, storageManager0, kotlinClassFinder0);
        binaryClassAnnotationAndConstantLoaderImpl0.setJvmMetadataVersion(jvmMetadataVersion0);
        return binaryClassAnnotationAndConstantLoaderImpl0;
    }
}

