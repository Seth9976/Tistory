package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJavaTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeAttributes.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class JavaTypeAttributesKt {
    @NotNull
    public static final JavaTypeAttributes toAttributes(@NotNull TypeUsage typeUsage0, boolean z, boolean z1, @Nullable TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(typeUsage0, "<this>");
        return typeParameterDescriptor0 == null ? new JavaTypeAttributes(typeUsage0, null, z1, z, null, null, 34, null) : new JavaTypeAttributes(typeUsage0, null, z1, z, e0.setOf(typeParameterDescriptor0), null, 34, null);
    }

    public static JavaTypeAttributes toAttributes$default(TypeUsage typeUsage0, boolean z, boolean z1, TypeParameterDescriptor typeParameterDescriptor0, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        if((v & 4) != 0) {
            typeParameterDescriptor0 = null;
        }
        return JavaTypeAttributesKt.toAttributes(typeUsage0, z, z1, typeParameterDescriptor0);
    }
}

