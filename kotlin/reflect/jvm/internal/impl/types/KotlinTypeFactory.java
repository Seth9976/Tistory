package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.selection.h;
import androidx.compose.material3.qc;
import ff.g;
import ff.i;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
public final class KotlinTypeFactory {
    @NotNull
    public static final KotlinTypeFactory INSTANCE;

    static {
        KotlinTypeFactory.INSTANCE = new KotlinTypeFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final g access$refineConstructor(KotlinTypeFactory kotlinTypeFactory0, TypeConstructor typeConstructor0, KotlinTypeRefiner kotlinTypeRefiner0, List list0) {
        kotlinTypeFactory0.getClass();
        ClassifierDescriptor classifierDescriptor0 = typeConstructor0.getDeclarationDescriptor();
        if(classifierDescriptor0 != null) {
            ClassifierDescriptor classifierDescriptor1 = kotlinTypeRefiner0.refineDescriptor(classifierDescriptor0);
            if(classifierDescriptor1 != null) {
                if(classifierDescriptor1 instanceof TypeAliasDescriptor) {
                    return new g(KotlinTypeFactory.computeExpandedType(((TypeAliasDescriptor)classifierDescriptor1), list0), null);
                }
                TypeConstructor typeConstructor1 = classifierDescriptor1.getTypeConstructor().refine(kotlinTypeRefiner0);
                Intrinsics.checkNotNullExpressionValue(typeConstructor1, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
                return new g(null, typeConstructor1);
            }
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public static final SimpleType computeExpandedType(@NotNull TypeAliasDescriptor typeAliasDescriptor0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(typeAliasDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        return new TypeAliasExpander(DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor0, list0), TypeAttributes.Companion.getEmpty());
    }

    @JvmStatic
    @NotNull
    public static final UnwrappedType flexibleType(@NotNull SimpleType simpleType0, @NotNull SimpleType simpleType1) {
        Intrinsics.checkNotNullParameter(simpleType0, "lowerBound");
        Intrinsics.checkNotNullParameter(simpleType1, "upperBound");
        return Intrinsics.areEqual(simpleType0, simpleType1) ? simpleType0 : new FlexibleTypeImpl(simpleType0, simpleType1);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType integerLiteralType(@NotNull TypeAttributes typeAttributes0, @NotNull IntegerLiteralTypeConstructor integerLiteralTypeConstructor0, boolean z) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        Intrinsics.checkNotNullParameter(integerLiteralTypeConstructor0, "constructor");
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes0, integerLiteralTypeConstructor0, CollectionsKt__CollectionsKt.emptyList(), z, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, new String[]{"unknown integer literal type"}));
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleNotNullType(@NotNull TypeAttributes typeAttributes0, @NotNull ClassDescriptor classDescriptor0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        Intrinsics.checkNotNullParameter(classDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        TypeConstructor typeConstructor0 = classDescriptor0.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor0, "descriptor.typeConstructor");
        return KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, list0, false, null, 16, null);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleType(@NotNull SimpleType simpleType0, @NotNull TypeAttributes typeAttributes0, @NotNull TypeConstructor typeConstructor0, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(simpleType0, "baseType");
        Intrinsics.checkNotNullParameter(typeAttributes0, "annotations");
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        return KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, list0, z, null, 16, null);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes typeAttributes0, @NotNull TypeConstructor typeConstructor0, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        return KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, list0, z, null, 16, null);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes typeAttributes0, @NotNull TypeConstructor typeConstructor0, @NotNull List list0, boolean z, @Nullable KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        if(typeAttributes0.isEmpty() && list0.isEmpty() && !z && typeConstructor0.getDeclarationDescriptor() != null) {
            ClassifierDescriptor classifierDescriptor0 = typeConstructor0.getDeclarationDescriptor();
            Intrinsics.checkNotNull(classifierDescriptor0);
            SimpleType simpleType0 = classifierDescriptor0.getDefaultType();
            Intrinsics.checkNotNullExpressionValue(simpleType0, "constructor.declarationDescriptor!!.defaultType");
            return simpleType0;
        }
        KotlinTypeFactory.INSTANCE.getClass();
        ClassifierDescriptor classifierDescriptor1 = typeConstructor0.getDeclarationDescriptor();
        if(classifierDescriptor1 instanceof TypeParameterDescriptor) {
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes0, typeConstructor0, list0, z, ((TypeParameterDescriptor)classifierDescriptor1).getDefaultType().getMemberScope(), new h(typeAttributes0, typeConstructor0, list0, z));
        }
        if(classifierDescriptor1 instanceof ClassDescriptor) {
            if(kotlinTypeRefiner0 == null) {
                kotlinTypeRefiner0 = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(classifierDescriptor1));
            }
            return list0.isEmpty() ? KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes0, typeConstructor0, list0, z, ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible(((ClassDescriptor)classifierDescriptor1), kotlinTypeRefiner0), new h(typeAttributes0, typeConstructor0, list0, z)) : KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes0, typeConstructor0, list0, z, ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible(((ClassDescriptor)classifierDescriptor1), TypeConstructorSubstitution.Companion.create(typeConstructor0, list0), kotlinTypeRefiner0), new h(typeAttributes0, typeConstructor0, list0, z));
        }
        if(classifierDescriptor1 instanceof TypeAliasDescriptor) {
            String s = ((TypeAliasDescriptor)classifierDescriptor1).getName().toString();
            Intrinsics.checkNotNullExpressionValue(s, "descriptor.name.toString()");
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes0, typeConstructor0, list0, z, ErrorUtils.createErrorScope(ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE, true, new String[]{s}), new h(typeAttributes0, typeConstructor0, list0, z));
        }
        if(!(typeConstructor0 instanceof IntersectionTypeConstructor)) {
            throw new IllegalStateException("Unsupported classifier: " + classifierDescriptor1 + " for constructor: " + typeConstructor0);
        }
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes0, typeConstructor0, list0, z, ((IntersectionTypeConstructor)typeConstructor0).createScopeForKotlinType(), new h(typeAttributes0, typeConstructor0, list0, z));
    }

    public static SimpleType simpleType$default(SimpleType simpleType0, TypeAttributes typeAttributes0, TypeConstructor typeConstructor0, List list0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            typeAttributes0 = simpleType0.getAttributes();
        }
        if((v & 4) != 0) {
            typeConstructor0 = simpleType0.getConstructor();
        }
        if((v & 8) != 0) {
            list0 = simpleType0.getArguments();
        }
        if((v & 16) != 0) {
            z = simpleType0.isMarkedNullable();
        }
        return KotlinTypeFactory.simpleType(simpleType0, typeAttributes0, typeConstructor0, list0, z);
    }

    public static SimpleType simpleType$default(TypeAttributes typeAttributes0, TypeConstructor typeConstructor0, List list0, boolean z, KotlinTypeRefiner kotlinTypeRefiner0, int v, Object object0) {
        if((v & 16) != 0) {
            kotlinTypeRefiner0 = null;
        }
        return KotlinTypeFactory.simpleType(typeAttributes0, typeConstructor0, list0, z, kotlinTypeRefiner0);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes typeAttributes0, @NotNull TypeConstructor typeConstructor0, @NotNull List list0, boolean z, @NotNull MemberScope memberScope0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        Intrinsics.checkNotNullParameter(memberScope0, "memberScope");
        SimpleType simpleType0 = new c(typeConstructor0, list0, z, memberScope0, new qc(typeAttributes0, typeConstructor0, list0, z, memberScope0));
        return !typeAttributes0.isEmpty() ? new i(simpleType0, typeAttributes0) : simpleType0;
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes typeAttributes0, @NotNull TypeConstructor typeConstructor0, @NotNull List list0, boolean z, @NotNull MemberScope memberScope0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        Intrinsics.checkNotNullParameter(memberScope0, "memberScope");
        Intrinsics.checkNotNullParameter(function10, "refinedTypeFactory");
        SimpleType simpleType0 = new c(typeConstructor0, list0, z, memberScope0, function10);
        return !typeAttributes0.isEmpty() ? new i(simpleType0, typeAttributes0) : simpleType0;
    }
}

