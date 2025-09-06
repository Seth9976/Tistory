package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import androidx.recyclerview.widget.k;
import b2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n3433#3,7:264\n1726#3,3:271\n3433#3,7:274\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:264,7\n143#1:271,3\n155#1:274,7\n*E\n"})
public final class JavaTypeEnhancement {
    public final JavaResolverSettings a;

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings0) {
        Intrinsics.checkNotNullParameter(javaResolverSettings0, "javaResolverSettings");
        super();
        this.a = javaResolverSettings0;
    }

    public final k a(SimpleType simpleType0, Function1 function10, int v, TypeComponentPosition typeComponentPosition0, boolean z, boolean z1) {
        TypeProjection typeProjection1;
        i i0;
        int v3;
        TypeConstructor typeConstructor0;
        int v1 = !z1 || !z ? 1 : 0;
        if(!TypeComponentPositionKt.shouldEnhance(typeComponentPosition0) && simpleType0.getArguments().isEmpty()) {
            return new k(1, null, false);
        }
        ClassifierDescriptor classifierDescriptor0 = simpleType0.getConstructor().getDeclarationDescriptor();
        if(classifierDescriptor0 == null) {
            return new k(1, null, false);
        }
        JavaTypeQualifiers javaTypeQualifiers0 = (JavaTypeQualifiers)function10.invoke(v);
        ClassifierDescriptor classifierDescriptor1 = TypeEnhancementKt.access$enhanceMutability(classifierDescriptor0, javaTypeQualifiers0, typeComponentPosition0);
        Boolean boolean0 = TypeEnhancementKt.access$getEnhancedNullability(javaTypeQualifiers0, typeComponentPosition0);
        if(classifierDescriptor1 == null) {
            typeConstructor0 = simpleType0.getConstructor();
        }
        else {
            typeConstructor0 = classifierDescriptor1.getTypeConstructor();
            if(typeConstructor0 == null) {
                typeConstructor0 = simpleType0.getConstructor();
            }
        }
        Intrinsics.checkNotNullExpressionValue(typeConstructor0, "enhancedClassifier?.typeConstructor ?: constructor");
        int v2 = v + 1;
        Iterable iterable0 = simpleType0.getArguments();
        List list0 = typeConstructor0.getParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "typeConstructor.parameters");
        Iterator iterator0 = iterable0.iterator();
        Iterator iterator1 = list0.iterator();
        ArrayList arrayList0 = new ArrayList(Math.min(l.collectionSizeOrDefault(iterable0, 10), l.collectionSizeOrDefault(list0, 10)));
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)object1;
            TypeProjection typeProjection0 = (TypeProjection)object0;
            if(v1 == 0) {
                v3 = 0;
                i0 = new i(null, 0);
            }
            else {
                v3 = v1;
                if(!typeProjection0.isStarProjection()) {
                    i0 = this.b(typeProjection0.getType().unwrap(), function10, v2, z1);
                }
                else if(((JavaTypeQualifiers)function10.invoke(v2)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrappedType0 = typeProjection0.getType().unwrap();
                    i0 = new i(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrappedType0).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrappedType0).makeNullableAsSpecified(true)), 1);
                }
                else {
                    i0 = new i(null, 1);
                }
            }
            v2 += i0.a;
            UnwrappedType unwrappedType1 = (UnwrappedType)i0.b;
            if(unwrappedType1 != null) {
                Variance variance0 = typeProjection0.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(variance0, "arg.projectionKind");
                typeProjection1 = TypeUtilsKt.createProjection(unwrappedType1, variance0, typeParameterDescriptor0);
            }
            else if(classifierDescriptor1 == null || typeProjection0.isStarProjection()) {
                typeProjection1 = classifierDescriptor1 == null ? null : TypeUtils.makeStarProjection(typeParameterDescriptor0);
            }
            else {
                KotlinType kotlinType0 = typeProjection0.getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "arg.type");
                Variance variance1 = typeProjection0.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(variance1, "arg.projectionKind");
                typeProjection1 = TypeUtilsKt.createProjection(kotlinType0, variance1, typeParameterDescriptor0);
            }
            arrayList0.add(typeProjection1);
            v1 = v3;
        }
        int v4 = v2 - v;
        if(classifierDescriptor1 == null && boolean0 == null) {
            if(!arrayList0.isEmpty()) {
                for(Object object2: arrayList0) {
                    if(((TypeProjection)object2) == null) {
                        continue;
                    }
                    goto label_68;
                }
            }
            return new k(v4, null, false);
        }
    label_68:
        Annotations annotations0 = simpleType0.getAnnotations();
        Annotations[] arr_annotations = new Annotations[3];
        boolean z2 = false;
        arr_annotations[0] = annotations0;
        arr_annotations[1] = classifierDescriptor1 == null ? null : TypeEnhancementKt.access$getENHANCED_MUTABILITY_ANNOTATIONS$p();
        arr_annotations[2] = boolean0 == null ? null : TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS();
        TypeAttributes typeAttributes0 = TypeAttributesKt.toDefaultAttributes(TypeEnhancementKt.access$compositeAnnotationsOrSingle(CollectionsKt__CollectionsKt.listOfNotNull(arr_annotations)));
        Iterable iterable1 = simpleType0.getArguments();
        Iterator iterator3 = arrayList0.iterator();
        Iterator iterator4 = iterable1.iterator();
        ArrayList arrayList1 = new ArrayList(Math.min(l.collectionSizeOrDefault(arrayList0, 10), l.collectionSizeOrDefault(iterable1, 10)));
        while(iterator3.hasNext() && iterator4.hasNext()) {
            Object object3 = iterator3.next();
            Object object4 = iterator4.next();
            TypeProjection typeProjection2 = (TypeProjection)object4;
            TypeProjection typeProjection3 = (TypeProjection)object3;
            if(typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList1.add(typeProjection2);
        }
        SimpleType simpleType1 = KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, arrayList1, (boolean0 == null ? simpleType0.isMarkedNullable() : boolean0.booleanValue()), null, 16, null);
        if(javaTypeQualifiers0.getDefinitelyNotNull()) {
            simpleType1 = this.a.getCorrectNullabilityForNotNullTypeParameter() ? SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType1, true) : new NotNullTypeParameterImpl(simpleType1);
        }
        if(boolean0 != null && javaTypeQualifiers0.isNullabilityQualifierForWarning()) {
            z2 = true;
        }
        return new k(v4, simpleType1, z2);
    }

    public final i b(UnwrappedType unwrappedType0, Function1 function10, int v, boolean z) {
        UnwrappedType unwrappedType1 = null;
        if(KotlinTypeKt.isError(unwrappedType0)) {
            return new i(null, 1);
        }
        if(unwrappedType0 instanceof FlexibleType) {
            k k0 = this.a(((FlexibleType)unwrappedType0).getLowerBound(), function10, v, TypeComponentPosition.FLEXIBLE_LOWER, unwrappedType0 instanceof RawType, z);
            k k1 = this.a(((FlexibleType)unwrappedType0).getUpperBound(), function10, v, TypeComponentPosition.FLEXIBLE_UPPER, unwrappedType0 instanceof RawType, z);
            UnwrappedType unwrappedType2 = (SimpleType)k0.c;
            SimpleType simpleType0 = (SimpleType)k1.c;
            if(unwrappedType2 != null || simpleType0 != null) {
                if(!k0.b && !k1.b) {
                    if(unwrappedType0 instanceof RawType) {
                        if(unwrappedType2 == null) {
                            unwrappedType2 = ((FlexibleType)unwrappedType0).getLowerBound();
                        }
                        if(simpleType0 == null) {
                            simpleType0 = ((FlexibleType)unwrappedType0).getUpperBound();
                        }
                        return new i(new RawTypeImpl(((SimpleType)unwrappedType2), simpleType0), k0.a);
                    }
                    if(unwrappedType2 == null) {
                        unwrappedType2 = ((FlexibleType)unwrappedType0).getLowerBound();
                    }
                    if(simpleType0 == null) {
                        simpleType0 = ((FlexibleType)unwrappedType0).getUpperBound();
                    }
                    return new i(KotlinTypeFactory.flexibleType(((SimpleType)unwrappedType2), simpleType0), k0.a);
                }
                if(simpleType0 == null) {
                    Intrinsics.checkNotNull(unwrappedType2);
                }
                else {
                    UnwrappedType unwrappedType3 = unwrappedType2 == null ? simpleType0 : unwrappedType2;
                    UnwrappedType unwrappedType4 = KotlinTypeFactory.flexibleType(((SimpleType)unwrappedType3), simpleType0);
                    if(unwrappedType4 == null) {
                        Intrinsics.checkNotNull(unwrappedType2);
                    }
                    else {
                        unwrappedType2 = unwrappedType4;
                    }
                }
                unwrappedType1 = TypeWithEnhancementKt.wrapEnhancement(unwrappedType0, unwrappedType2);
            }
            return new i(unwrappedType1, k0.a);
        }
        if(!(unwrappedType0 instanceof SimpleType)) {
            throw new NoWhenBranchMatchedException();
        }
        k k2 = this.a(((SimpleType)unwrappedType0), function10, v, TypeComponentPosition.INFLEXIBLE, false, z);
        boolean z1 = k2.b;
        UnwrappedType unwrappedType5 = (SimpleType)k2.c;
        if(z1) {
            unwrappedType5 = TypeWithEnhancementKt.wrapEnhancement(unwrappedType0, unwrappedType5);
        }
        return new i(unwrappedType5, k2.a);
    }

    @Nullable
    public final KotlinType enhance(@NotNull KotlinType kotlinType0, @NotNull Function1 function10, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "qualifiers");
        return (UnwrappedType)this.b(kotlinType0.unwrap(), function10, 0, z).b;
    }
}

