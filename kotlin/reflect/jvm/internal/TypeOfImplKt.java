package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u001F\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0017\u0010\b\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/reflect/KType;", "lowerBound", "upperBound", "createPlatformKType", "(Lkotlin/reflect/KType;Lkotlin/reflect/KType;)Lkotlin/reflect/KType;", "type", "createMutableCollectionKType", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KType;", "createNothingType", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\ntypeOfImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeOfImpl.kt\nkotlin/reflect/jvm/internal/TypeOfImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class TypeOfImplKt {
    @NotNull
    public static final KType createMutableCollectionKType(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "type");
        KotlinType kotlinType0 = ((KTypeImpl)kType0).getType();
        if(!(kotlinType0 instanceof SimpleType)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + kType0).toString());
        }
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        if(classDescriptor0 == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + kType0);
        }
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor0);
        FqName fqName0 = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(fqNameUnsafe0);
        if(fqName0 == null) {
            throw new IllegalArgumentException("Not a readonly collection: " + classDescriptor0);
        }
        ClassDescriptor classDescriptor1 = DescriptorUtilsKt.getBuiltIns(classDescriptor0).getBuiltInClassByFqName(fqName0);
        Intrinsics.checkNotNullExpressionValue(classDescriptor1, "builtIns.getBuiltInClassByFqName(fqName)");
        TypeConstructor typeConstructor0 = classDescriptor1.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor0, "classifier.readOnlyToMutable().typeConstructor");
        return new KTypeImpl(KotlinTypeFactory.simpleType$default(((SimpleType)kotlinType0), null, typeConstructor0, null, false, 26, null), null, 2, null);
    }

    @NotNull
    public static final KType createNothingType(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "type");
        KotlinType kotlinType0 = ((KTypeImpl)kType0).getType();
        if(!(kotlinType0 instanceof SimpleType)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a Nothing type: " + kType0).toString());
        }
        TypeConstructor typeConstructor0 = TypeUtilsKt.getBuiltIns(kotlinType0).getNothing().getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor0, "kotlinType.builtIns.nothing.typeConstructor");
        return new KTypeImpl(KotlinTypeFactory.simpleType$default(((SimpleType)kotlinType0), null, typeConstructor0, null, false, 26, null), null, 2, null);
    }

    @NotNull
    public static final KType createPlatformKType(@NotNull KType kType0, @NotNull KType kType1) {
        Intrinsics.checkNotNullParameter(kType0, "lowerBound");
        Intrinsics.checkNotNullParameter(kType1, "upperBound");
        KotlinType kotlinType0 = ((KTypeImpl)kType0).getType();
        Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinType1 = ((KTypeImpl)kType1).getType();
        Intrinsics.checkNotNull(kotlinType1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new KTypeImpl(KotlinTypeFactory.flexibleType(((SimpleType)kotlinType0), ((SimpleType)kotlinType1)), null, 2, null);
    }
}

