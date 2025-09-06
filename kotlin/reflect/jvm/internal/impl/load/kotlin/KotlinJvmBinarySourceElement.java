package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {
    public final KotlinJvmBinaryClass a;

    public KotlinJvmBinarySourceElement(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0, @Nullable IncompatibleVersionErrorData incompatibleVersionErrorData0, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability0) {
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "binaryClass");
        Intrinsics.checkNotNullParameter(deserializedContainerAbiStability0, "abiStability");
        super();
        this.a = kotlinJvmBinaryClass0;
    }

    @NotNull
    public final KotlinJvmBinaryClass getBinaryClass() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        Intrinsics.checkNotNullExpressionValue(SourceFile.NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return SourceFile.NO_SOURCE_FILE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    public String getPresentableString() {
        return "Class \'" + this.a.getClassId().asSingleFqName().asString() + '\'';
    }

    @Override
    @NotNull
    public String toString() {
        return "KotlinJvmBinarySourceElement: " + this.a;
    }
}

