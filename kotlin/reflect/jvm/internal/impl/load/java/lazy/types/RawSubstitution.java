package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import androidx.compose.material3.g1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nRawSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n*S KotlinDebug\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n*L\n73#1:96\n73#1:97,3\n*E\n"})
public final class RawSubstitution extends TypeSubstitution {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final RawProjectionComputer a;
    public final TypeParameterUpperBoundEraser b;
    public static final JavaTypeAttributes c;
    public static final JavaTypeAttributes d;

    static {
        RawSubstitution.Companion = new Companion(null);
        RawSubstitution.c = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        RawSubstitution.d = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution() {
        this(null, 1, null);
    }

    public RawSubstitution(@Nullable TypeParameterUpperBoundEraser typeParameterUpperBoundEraser0) {
        RawProjectionComputer rawProjectionComputer0 = new RawProjectionComputer();
        this.a = rawProjectionComputer0;
        if(typeParameterUpperBoundEraser0 == null) {
            typeParameterUpperBoundEraser0 = new TypeParameterUpperBoundEraser(rawProjectionComputer0, null, 2, null);
        }
        this.b = typeParameterUpperBoundEraser0;
    }

    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            typeParameterUpperBoundEraser0 = null;
        }
        this(typeParameterUpperBoundEraser0);
    }

    public final Pair a(SimpleType simpleType0, ClassDescriptor classDescriptor0, JavaTypeAttributes javaTypeAttributes0) {
        if(simpleType0.getConstructor().getParameters().isEmpty()) {
            return TuplesKt.to(simpleType0, Boolean.FALSE);
        }
        if(KotlinBuiltIns.isArray(simpleType0)) {
            TypeProjection typeProjection0 = (TypeProjection)simpleType0.getArguments().get(0);
            Variance variance0 = typeProjection0.getProjectionKind();
            KotlinType kotlinType0 = typeProjection0.getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "componentTypeProjection.type");
            List list0 = k.listOf(new TypeProjectionImpl(variance0, this.b(kotlinType0, javaTypeAttributes0)));
            return TuplesKt.to(KotlinTypeFactory.simpleType$default(simpleType0.getAttributes(), simpleType0.getConstructor(), list0, simpleType0.isMarkedNullable(), null, 16, null), Boolean.FALSE);
        }
        if(KotlinTypeKt.isError(simpleType0)) {
            String[] arr_s = {simpleType0.getConstructor().toString()};
            return TuplesKt.to(ErrorUtils.createErrorType(ErrorTypeKind.ERROR_RAW_TYPE, arr_s), Boolean.FALSE);
        }
        MemberScope memberScope0 = classDescriptor0.getMemberScope(this);
        Intrinsics.checkNotNullExpressionValue(memberScope0, "declaration.getMemberScope(this)");
        TypeAttributes typeAttributes0 = simpleType0.getAttributes();
        TypeConstructor typeConstructor0 = classDescriptor0.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor0, "declaration.typeConstructor");
        List list1 = classDescriptor0.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(list1, "declaration.typeConstructor.parameters");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
        for(Object object0: list1) {
            Intrinsics.checkNotNullExpressionValue(((TypeParameterDescriptor)object0), "parameter");
            arrayList0.add(ErasureProjectionComputer.computeProjection$default(this.a, ((TypeParameterDescriptor)object0), javaTypeAttributes0, this.b, null, 8, null));
        }
        return TuplesKt.to(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes0, typeConstructor0, arrayList0, simpleType0.isMarkedNullable(), memberScope0, new g1(5, classDescriptor0, this, simpleType0, javaTypeAttributes0)), Boolean.TRUE);
    }

    public static final Pair access$eraseInflexibleBasedOnClassDescriptor(RawSubstitution rawSubstitution0, SimpleType simpleType0, ClassDescriptor classDescriptor0, JavaTypeAttributes javaTypeAttributes0) {
        return rawSubstitution0.a(simpleType0, classDescriptor0, javaTypeAttributes0);
    }

    public final KotlinType b(KotlinType kotlinType0, JavaTypeAttributes javaTypeAttributes0) {
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        if(classifierDescriptor0 instanceof TypeParameterDescriptor) {
            JavaTypeAttributes javaTypeAttributes1 = javaTypeAttributes0.markIsRaw(true);
            return this.b(this.b.getErasedUpperBound(((TypeParameterDescriptor)classifierDescriptor0), javaTypeAttributes1), javaTypeAttributes0);
        }
        if(!(classifierDescriptor0 instanceof ClassDescriptor)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + classifierDescriptor0).toString());
        }
        ClassifierDescriptor classifierDescriptor1 = FlexibleTypesKt.upperIfFlexible(kotlinType0).getConstructor().getDeclarationDescriptor();
        if(!(classifierDescriptor1 instanceof ClassDescriptor)) {
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptor1 + "\" while for lower it\'s \"" + classifierDescriptor0 + '\"').toString());
        }
        Pair pair0 = this.a(FlexibleTypesKt.lowerIfFlexible(kotlinType0), ((ClassDescriptor)classifierDescriptor0), RawSubstitution.c);
        SimpleType simpleType0 = (SimpleType)pair0.component1();
        Pair pair1 = this.a(FlexibleTypesKt.upperIfFlexible(kotlinType0), ((ClassDescriptor)classifierDescriptor1), RawSubstitution.d);
        SimpleType simpleType1 = (SimpleType)pair1.component1();
        return !((Boolean)pair0.component2()).booleanValue() && !((Boolean)pair1.component2()).booleanValue() ? KotlinTypeFactory.flexibleType(simpleType0, simpleType1) : new RawTypeImpl(simpleType0, simpleType1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection get(KotlinType kotlinType0) {
        return this.get(kotlinType0);
    }

    @NotNull
    public TypeProjectionImpl get(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "key");
        return new TypeProjectionImpl(this.b(kotlinType0, new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null)));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }
}

