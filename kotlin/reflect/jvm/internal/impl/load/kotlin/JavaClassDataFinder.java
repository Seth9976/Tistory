package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaClassDataFinder implements ClassDataFinder {
    public final KotlinClassFinder a;
    public final DeserializedDescriptorResolver b;

    public JavaClassDataFinder(@NotNull KotlinClassFinder kotlinClassFinder0, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver0) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver0, "deserializedDescriptorResolver");
        super();
        this.a = kotlinClassFinder0;
        this.b = deserializedDescriptorResolver0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        DeserializedDescriptorResolver deserializedDescriptorResolver0 = this.b;
        JvmMetadataVersion jvmMetadataVersion0 = DeserializationHelpersKt.jvmMetadataVersionOrDefault(deserializedDescriptorResolver0.getComponents().getConfiguration());
        KotlinJvmBinaryClass kotlinJvmBinaryClass0 = KotlinClassFinderKt.findKotlinClass(this.a, classId0, jvmMetadataVersion0);
        if(kotlinJvmBinaryClass0 == null) {
            return null;
        }
        Intrinsics.areEqual(kotlinJvmBinaryClass0.getClassId(), classId0);
        return deserializedDescriptorResolver0.readClassData$descriptors_jvm(kotlinJvmBinaryClass0);
    }
}

