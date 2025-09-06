package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration {
    @NotNull
    public static final TypeMappingConfigurationImpl INSTANCE;

    static {
        TypeMappingConfigurationImpl.INSTANCE = new TypeMappingConfigurationImpl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @NotNull
    public KotlinType commonSupertype(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt___CollectionsKt.joinToString$default(collection0, null, null, null, 0, null, null, 0x3F, null));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    public String getPredefinedFullInternalNameForClass(ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    public String getPredefinedInternalNameForClass(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public Object getPredefinedTypeForClass(ClassDescriptor classDescriptor0) {
        return this.getPredefinedTypeForClass(classDescriptor0);
    }

    @Nullable
    public JvmType getPredefinedTypeForClass(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    public KotlinType preprocessType(KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "kotlinType");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public void processErrorType(@NotNull KotlinType kotlinType0, @NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "kotlinType");
        Intrinsics.checkNotNullParameter(classDescriptor0, "descriptor");
    }
}

