package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u2.b;
import ue.a;

@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1#2:252\n1#2:275\n766#3:230\n857#3,2:231\n1726#3,3:233\n1747#3,3:236\n1747#3,3:239\n1603#3,9:242\n1855#3:251\n1856#3:253\n1612#3:254\n1726#3,3:255\n1549#3:258\n1620#3,3:259\n1747#3,3:262\n1603#3,9:265\n1855#3:274\n1856#3:276\n1612#3:277\n1855#3,2:278\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n156#1:252\n182#1:275\n89#1:230\n89#1:231,2\n153#1:233,3\n155#1:236,3\n156#1:239,3\n156#1:242,9\n156#1:251\n156#1:253\n156#1:254\n159#1:255,3\n169#1:258\n169#1:259,3\n177#1:262,3\n182#1:265,9\n182#1:274\n182#1:276\n182#1:277\n195#1:278,2\n*E\n"})
public abstract class AbstractSignatureParts {
    public static void a(Object object0, ArrayList arrayList0, b b0) {
        arrayList0.add(object0);
        Iterable iterable0 = (Iterable)b0.invoke(object0);
        if(iterable0 != null) {
            for(Object object1: iterable0) {
                AbstractSignatureParts.a(object1, arrayList0, b0);
            }
        }
    }

    public static final JavaTypeQualifiersByElementType access$extractAndMergeDefaultQualifiers(AbstractSignatureParts abstractSignatureParts0, KotlinTypeMarker kotlinTypeMarker0, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType0) {
        return abstractSignatureParts0.getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType0, abstractSignatureParts0.getAnnotations(kotlinTypeMarker0));
    }

    public final NullabilityQualifierWithMigrationStatus b(TypeParameterMarker typeParameterMarker0) {
        List list1;
        TypeSystemContext typeSystemContext0 = this.getTypeSystem();
        if(!this.isFromJava(typeParameterMarker0)) {
            return null;
        }
        List list0 = typeSystemContext0.getUpperBounds(typeParameterMarker0);
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
        alab1:
            for(Object object0: list0) {
                if(!typeSystemContext0.isError(((KotlinTypeMarker)object0))) {
                    if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                        for(Object object1: list0) {
                            if(this.c(((KotlinTypeMarker)object1)) == null) {
                                continue;
                            }
                            list1 = list0;
                            goto label_29;
                        }
                    }
                    if(list0 instanceof Collection && list0.isEmpty()) {
                        break;
                    }
                    Iterator iterator2 = list0.iterator();
                    while(true) {
                        if(!iterator2.hasNext()) {
                            break alab1;
                        }
                        Object object2 = iterator2.next();
                        if(this.getEnhancedForWarnings(((KotlinTypeMarker)object2)) == null) {
                            continue;
                        }
                        list1 = new ArrayList();
                        for(Object object3: list0) {
                            KotlinTypeMarker kotlinTypeMarker0 = this.getEnhancedForWarnings(((KotlinTypeMarker)object3));
                            if(kotlinTypeMarker0 != null) {
                                list1.add(kotlinTypeMarker0);
                            }
                        }
                    label_29:
                        if(!(list1 instanceof Collection) || !list1.isEmpty()) {
                            for(Object object4: list1) {
                                if(!typeSystemContext0.isNullableType(((KotlinTypeMarker)object4))) {
                                    return list1 == list0 ? new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false) : new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, true);
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        return list1 == list0 ? new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false) : new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, true);
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public final NullabilityQualifier c(KotlinTypeMarker kotlinTypeMarker0) {
        TypeSystemContext typeSystemContext0 = this.getTypeSystem();
        if(typeSystemContext0.isMarkedNullable(typeSystemContext0.lowerBoundIfFlexible(kotlinTypeMarker0))) {
            return NullabilityQualifier.NULLABLE;
        }
        return typeSystemContext0.isMarkedNullable(typeSystemContext0.upperBoundIfFlexible(kotlinTypeMarker0)) ? null : NullabilityQualifier.NOT_NULL;
    }

    @NotNull
    public final Function1 computeIndexedQualifiers(@NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull Iterable iterable0, @Nullable TypeEnhancementInfo typeEnhancementInfo0, boolean z) {
        JavaTypeQualifiers javaTypeQualifiers1;
        MutabilityQualifier mutabilityQualifier1;
        NullabilityQualifier nullabilityQualifier1;
        JavaTypeQualifiers javaTypeQualifiers0;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus4;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus3;
        TypeParameterMarker typeParameterMarker1;
        Iterable iterable2;
        int v;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "overrides");
        ArrayList arrayList0 = this.d(kotlinTypeMarker0);
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList1.add(this.d(((KotlinTypeMarker)object0)));
        }
        if(this.isCovariant() && (!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty())) {
            for(Object object1: iterable0) {
                if(this.isEqual(kotlinTypeMarker0, ((KotlinTypeMarker)object1))) {
                    continue;
                }
                v = 1;
                goto label_17;
            }
        }
        v = arrayList0.size();
    label_17:
        JavaTypeQualifiers[] arr_javaTypeQualifiers = new JavaTypeQualifiers[v];
        for(int v1 = 0; v1 < v; ++v1) {
            a a0 = (a)arrayList0.get(v1);
            TypeParameterMarker typeParameterMarker0 = a0.c;
            if(a0.a != null || (typeParameterMarker0 == null ? null : this.getTypeSystem().getVariance(typeParameterMarker0)) != TypeVariance.IN) {
                KotlinTypeMarker kotlinTypeMarker1 = a0.a;
                if(kotlinTypeMarker1 == null) {
                    iterable2 = CollectionsKt__CollectionsKt.emptyList();
                }
                else {
                    Iterable iterable1 = this.getAnnotations(kotlinTypeMarker1);
                    if(iterable1 != null) {
                        iterable2 = iterable1;
                    }
                }
                TypeSystemContext typeSystemContext0 = this.getTypeSystem();
                if(kotlinTypeMarker1 == null) {
                    typeParameterMarker1 = null;
                }
                else {
                    TypeConstructorMarker typeConstructorMarker0 = typeSystemContext0.typeConstructor(kotlinTypeMarker1);
                    if(typeConstructorMarker0 != null) {
                        typeParameterMarker1 = typeSystemContext0.getTypeParameterClassifier(typeConstructorMarker0);
                    }
                }
                boolean z1 = this.getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
                if(typeParameterMarker0 == null) {
                    if(z1 || !this.getEnableImprovementsInStrictMode() || kotlinTypeMarker1 == null || !this.isArrayOrPrimitiveArray(kotlinTypeMarker1)) {
                        iterable2 = CollectionsKt___CollectionsKt.plus(this.getContainerAnnotations(), iterable2);
                    }
                    else {
                        Iterable iterable3 = this.getContainerAnnotations();
                        ArrayList arrayList2 = new ArrayList();
                        for(Object object2: iterable3) {
                            if(!this.getAnnotationTypeQualifierResolver().isTypeUseAnnotation(object2)) {
                                arrayList2.add(object2);
                            }
                        }
                        iterable2 = CollectionsKt___CollectionsKt.plus(arrayList2, iterable2);
                    }
                }
                MutabilityQualifier mutabilityQualifier0 = this.getAnnotationTypeQualifierResolver().extractMutability(iterable2);
                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0 = this.getAnnotationTypeQualifierResolver().extractNullability(iterable2, new b(1, this, a0));
                if(nullabilityQualifierWithMigrationStatus0 == null) {
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType0 = typeParameterMarker0 == null || z1 ? this.getContainerApplicabilityType() : AnnotationQualifierApplicabilityType.TYPE_USE;
                    JavaDefaultQualifiers javaDefaultQualifiers0 = a0.b == null ? null : a0.b.get(annotationQualifierApplicabilityType0);
                    NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus1 = typeParameterMarker1 == null ? null : this.b(typeParameterMarker1);
                    if(nullabilityQualifierWithMigrationStatus1 == null) {
                        nullabilityQualifierWithMigrationStatus3 = javaDefaultQualifiers0 == null ? null : javaDefaultQualifiers0.getNullabilityQualifier();
                    }
                    else {
                        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2 = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus1, NullabilityQualifier.NOT_NULL, false, 2, null);
                        if(nullabilityQualifierWithMigrationStatus2 != null) {
                            nullabilityQualifierWithMigrationStatus3 = nullabilityQualifierWithMigrationStatus2;
                        }
                    }
                    boolean z2 = (nullabilityQualifierWithMigrationStatus1 == null ? null : nullabilityQualifierWithMigrationStatus1.getQualifier()) == NullabilityQualifier.NOT_NULL || typeParameterMarker1 != null && javaDefaultQualifiers0 != null && javaDefaultQualifiers0.getDefinitelyNotNull();
                    if(typeParameterMarker0 == null) {
                        nullabilityQualifierWithMigrationStatus4 = null;
                    }
                    else {
                        nullabilityQualifierWithMigrationStatus4 = this.b(typeParameterMarker0);
                        if(nullabilityQualifierWithMigrationStatus4 == null) {
                            nullabilityQualifierWithMigrationStatus4 = null;
                        }
                        else if(nullabilityQualifierWithMigrationStatus4.getQualifier() == NullabilityQualifier.NULLABLE) {
                            nullabilityQualifierWithMigrationStatus4 = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus4, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
                        }
                    }
                    if(nullabilityQualifierWithMigrationStatus4 != null) {
                        if(nullabilityQualifierWithMigrationStatus3 == null) {
                            nullabilityQualifierWithMigrationStatus3 = nullabilityQualifierWithMigrationStatus4;
                        }
                        else if((!nullabilityQualifierWithMigrationStatus4.isForWarningOnly() || nullabilityQualifierWithMigrationStatus3.isForWarningOnly()) && (!nullabilityQualifierWithMigrationStatus4.isForWarningOnly() && nullabilityQualifierWithMigrationStatus3.isForWarningOnly() || nullabilityQualifierWithMigrationStatus4.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus3.getQualifier()) >= 0 && nullabilityQualifierWithMigrationStatus4.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus3.getQualifier()) > 0)) {
                            nullabilityQualifierWithMigrationStatus3 = nullabilityQualifierWithMigrationStatus4;
                        }
                    }
                    javaTypeQualifiers0 = new JavaTypeQualifiers((nullabilityQualifierWithMigrationStatus3 == null ? null : nullabilityQualifierWithMigrationStatus3.getQualifier()), mutabilityQualifier0, z2, nullabilityQualifierWithMigrationStatus3 != null && nullabilityQualifierWithMigrationStatus3.isForWarningOnly());
                }
                else {
                    javaTypeQualifiers0 = new JavaTypeQualifiers(nullabilityQualifierWithMigrationStatus0.getQualifier(), mutabilityQualifier0, nullabilityQualifierWithMigrationStatus0.getQualifier() == NullabilityQualifier.NOT_NULL && typeParameterMarker1 != null, nullabilityQualifierWithMigrationStatus0.isForWarningOnly());
                }
            }
            else {
                javaTypeQualifiers0 = JavaTypeQualifiers.Companion.getNONE();
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object3: arrayList1) {
                a a1 = (a)CollectionsKt___CollectionsKt.getOrNull(((List)object3), v1);
                if(a1 == null) {
                    javaTypeQualifiers1 = null;
                }
                else {
                    KotlinTypeMarker kotlinTypeMarker2 = a1.a;
                    if(kotlinTypeMarker2 != null) {
                        NullabilityQualifier nullabilityQualifier0 = this.c(kotlinTypeMarker2);
                        if(nullabilityQualifier0 == null) {
                            KotlinTypeMarker kotlinTypeMarker3 = this.getEnhancedForWarnings(kotlinTypeMarker2);
                            nullabilityQualifier1 = kotlinTypeMarker3 == null ? null : this.c(kotlinTypeMarker3);
                        }
                        else {
                            nullabilityQualifier1 = nullabilityQualifier0;
                        }
                        TypeSystemContext typeSystemContext1 = this.getTypeSystem();
                        JavaToKotlinClassMap javaToKotlinClassMap0 = JavaToKotlinClassMap.INSTANCE;
                        if(javaToKotlinClassMap0.isReadOnly(this.getFqNameUnsafe(typeSystemContext1.lowerBoundIfFlexible(kotlinTypeMarker2)))) {
                            mutabilityQualifier1 = MutabilityQualifier.READ_ONLY;
                        }
                        else {
                            mutabilityQualifier1 = javaToKotlinClassMap0.isMutable(this.getFqNameUnsafe(typeSystemContext1.upperBoundIfFlexible(kotlinTypeMarker2))) ? MutabilityQualifier.MUTABLE : null;
                        }
                        javaTypeQualifiers1 = new JavaTypeQualifiers(nullabilityQualifier1, mutabilityQualifier1, this.getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker2) || this.isNotNullTypeParameterCompat(kotlinTypeMarker2), nullabilityQualifier1 != nullabilityQualifier0);
                    }
                }
                if(javaTypeQualifiers1 != null) {
                    arrayList3.add(javaTypeQualifiers1);
                }
            }
            arr_javaTypeQualifiers[v1] = TypeEnhancementUtilsKt.computeQualifiersForOverride(javaTypeQualifiers0, arrayList3, v1 == 0 && this.isCovariant(), v1 == 0 && this.getContainerIsVarargParameter(), z);
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a(typeEnhancementInfo0, arr_javaTypeQualifiers);
    }

    public final ArrayList d(KotlinTypeMarker kotlinTypeMarker0) {
        TypeSystemContext typeSystemContext0 = this.getTypeSystem();
        JavaTypeQualifiersByElementType javaTypeQualifiersByElementType0 = this.getContainerDefaultTypeQualifiers();
        a a0 = new a(kotlinTypeMarker0, this.getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType0, this.getAnnotations(kotlinTypeMarker0)), null);
        b b0 = new b(2, this, typeSystemContext0);
        ArrayList arrayList0 = new ArrayList(1);
        AbstractSignatureParts.a(a0, arrayList0, b0);
        return arrayList0;
    }

    public abstract boolean forceWarning(@NotNull Object arg1, @Nullable KotlinTypeMarker arg2);

    @NotNull
    public abstract AbstractAnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver();

    @NotNull
    public abstract Iterable getAnnotations(@NotNull KotlinTypeMarker arg1);

    @NotNull
    public abstract Iterable getContainerAnnotations();

    @NotNull
    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    @Nullable
    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    @Nullable
    public abstract KotlinTypeMarker getEnhancedForWarnings(@NotNull KotlinTypeMarker arg1);

    public boolean getForceOnlyHeadTypeConstructor() [...] // Inlined contents

    @Nullable
    public abstract FqNameUnsafe getFqNameUnsafe(@NotNull KotlinTypeMarker arg1);

    public abstract boolean getSkipRawTypeArguments();

    @NotNull
    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(@NotNull KotlinTypeMarker arg1);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(@NotNull KotlinTypeMarker arg1, @NotNull KotlinTypeMarker arg2);

    public abstract boolean isFromJava(@NotNull TypeParameterMarker arg1);

    public boolean isNotNullTypeParameterCompat(@NotNull KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "<this>");
        return false;
    }
}

