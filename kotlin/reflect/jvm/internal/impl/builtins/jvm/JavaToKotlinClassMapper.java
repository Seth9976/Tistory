package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJavaToKotlinClassMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMapper.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMapper\n*L\n1#1,80:1\n75#1,3:81\n75#1,3:84\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMapper.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMapper\n*L\n59#1:81,3\n65#1:84,3\n*E\n"})
public final class JavaToKotlinClassMapper {
    @NotNull
    public static final JavaToKotlinClassMapper INSTANCE;

    static {
        JavaToKotlinClassMapper.INSTANCE = new JavaToKotlinClassMapper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final ClassDescriptor convertMutableToReadOnly(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "mutable");
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(classDescriptor0);
        FqName fqName0 = JavaToKotlinClassMap.INSTANCE.mutableToReadOnly(fqNameUnsafe0);
        if(fqName0 == null) {
            throw new IllegalArgumentException("Given class " + classDescriptor0 + " is not a mutable collection");
        }
        ClassDescriptor classDescriptor1 = DescriptorUtilsKt.getBuiltIns(classDescriptor0).getBuiltInClassByFqName(fqName0);
        Intrinsics.checkNotNullExpressionValue(classDescriptor1, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
        return classDescriptor1;
    }

    @NotNull
    public final ClassDescriptor convertReadOnlyToMutable(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "readOnly");
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(classDescriptor0);
        FqName fqName0 = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(fqNameUnsafe0);
        if(fqName0 == null) {
            throw new IllegalArgumentException("Given class " + classDescriptor0 + " is not a read-only collection");
        }
        ClassDescriptor classDescriptor1 = DescriptorUtilsKt.getBuiltIns(classDescriptor0).getBuiltInClassByFqName(fqName0);
        Intrinsics.checkNotNullExpressionValue(classDescriptor1, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
        return classDescriptor1;
    }

    public final boolean isMutable(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "mutable");
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(classDescriptor0);
        return JavaToKotlinClassMap.INSTANCE.isMutable(fqNameUnsafe0);
    }

    public final boolean isReadOnly(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "readOnly");
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(classDescriptor0);
        return JavaToKotlinClassMap.INSTANCE.isReadOnly(fqNameUnsafe0);
    }

    @Nullable
    public final ClassDescriptor mapJavaToKotlin(@NotNull FqName fqName0, @NotNull KotlinBuiltIns kotlinBuiltIns0, @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        ClassId classId0 = integer0 == null || !Intrinsics.areEqual(fqName0, JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME()) ? JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(fqName0) : StandardNames.getFunctionClassId(((int)integer0));
        return classId0 == null ? null : kotlinBuiltIns0.getBuiltInClassByFqName(classId0.asSingleFqName());
    }

    public static ClassDescriptor mapJavaToKotlin$default(JavaToKotlinClassMapper javaToKotlinClassMapper0, FqName fqName0, KotlinBuiltIns kotlinBuiltIns0, Integer integer0, int v, Object object0) {
        if((v & 4) != 0) {
            integer0 = null;
        }
        return javaToKotlinClassMapper0.mapJavaToKotlin(fqName0, kotlinBuiltIns0, integer0);
    }

    @NotNull
    public final Collection mapPlatformClass(@NotNull FqName fqName0, @NotNull KotlinBuiltIns kotlinBuiltIns0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        ClassDescriptor classDescriptor0 = JavaToKotlinClassMapper.mapJavaToKotlin$default(this, fqName0, kotlinBuiltIns0, null, 4, null);
        if(classDescriptor0 == null) {
            return f0.emptySet();
        }
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor0);
        FqName fqName1 = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(fqNameUnsafe0);
        if(fqName1 == null) {
            return e0.setOf(classDescriptor0);
        }
        ClassDescriptor classDescriptor1 = kotlinBuiltIns0.getBuiltInClassByFqName(fqName1);
        Intrinsics.checkNotNullExpressionValue(classDescriptor1, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        return CollectionsKt__CollectionsKt.listOf(new ClassDescriptor[]{classDescriptor0, classDescriptor1});
    }
}

