package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class KotlinClassFinderKt {
    @Nullable
    public static final KotlinJvmBinaryClass findKotlinClass(@NotNull KotlinClassFinder kotlinClassFinder0, @NotNull JavaClass javaClass0, @NotNull JvmMetadataVersion jvmMetadataVersion0) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "<this>");
        Intrinsics.checkNotNullParameter(javaClass0, "javaClass");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion0, "jvmMetadataVersion");
        Result kotlinClassFinder$Result0 = kotlinClassFinder0.findKotlinClassOrContent(javaClass0, jvmMetadataVersion0);
        return kotlinClassFinder$Result0 == null ? null : kotlinClassFinder$Result0.toKotlinJvmBinaryClass();
    }

    @Nullable
    public static final KotlinJvmBinaryClass findKotlinClass(@NotNull KotlinClassFinder kotlinClassFinder0, @NotNull ClassId classId0, @NotNull JvmMetadataVersion jvmMetadataVersion0) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "<this>");
        Intrinsics.checkNotNullParameter(classId0, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion0, "jvmMetadataVersion");
        Result kotlinClassFinder$Result0 = kotlinClassFinder0.findKotlinClassOrContent(classId0, jvmMetadataVersion0);
        return kotlinClassFinder$Result0 == null ? null : kotlinClassFinder$Result0.toKotlinJvmBinaryClass();
    }
}

