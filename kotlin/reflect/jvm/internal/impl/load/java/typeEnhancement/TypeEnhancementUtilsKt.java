package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\ntypeEnhancementUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1#2:62\n1#2:73\n1#2:86\n1#2:99\n1603#3,9:63\n1855#3:72\n1856#3:74\n1612#3:75\n1603#3,9:76\n1855#3:85\n1856#3:87\n1612#3:88\n1603#3,9:89\n1855#3:98\n1856#3:100\n1612#3:101\n1747#3,3:102\n*S KotlinDebug\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n*L\n41#1:73\n43#1:86\n45#1:99\n41#1:63,9\n41#1:72\n41#1:74\n41#1:75\n43#1:76,9\n43#1:85\n43#1:87\n43#1:88\n45#1:89,9\n45#1:98\n45#1:100\n45#1:101\n54#1:102,3\n*E\n"})
public final class TypeEnhancementUtilsKt {
    public static final Object a(Set set0, Enum enum0, Enum enum1, Enum enum2, boolean z) {
        Enum enum3;
        if(z) {
            if(set0.contains(enum0)) {
                enum3 = enum0;
            }
            else {
                enum3 = set0.contains(enum1) ? enum1 : null;
            }
            if(Intrinsics.areEqual(enum3, enum0) && Intrinsics.areEqual(enum2, enum1)) {
                return null;
            }
            return enum2 == null ? enum3 : enum2;
        }
        if(enum2 != null) {
            Set set1 = CollectionsKt___CollectionsKt.toSet(g0.plus(set0, enum2));
            if(set1 != null) {
                set0 = set1;
            }
        }
        return CollectionsKt___CollectionsKt.singleOrNull(set0);
    }

    @NotNull
    public static final JavaTypeQualifiers computeQualifiersForOverride(@NotNull JavaTypeQualifiers javaTypeQualifiers0, @NotNull Collection collection0, boolean z, boolean z1, boolean z2) {
        NullabilityQualifier nullabilityQualifier5;
        NullabilityQualifier nullabilityQualifier0;
        Intrinsics.checkNotNullParameter(javaTypeQualifiers0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "superQualifiers");
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = collection0.iterator();
        while(true) {
            nullabilityQualifier0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            JavaTypeQualifiers javaTypeQualifiers1 = (JavaTypeQualifiers)object0;
            if(!javaTypeQualifiers1.isNullabilityQualifierForWarning()) {
                nullabilityQualifier0 = javaTypeQualifiers1.getNullability();
            }
            if(nullabilityQualifier0 != null) {
                arrayList0.add(nullabilityQualifier0);
            }
        }
        Set set0 = CollectionsKt___CollectionsKt.toSet(arrayList0);
        NullabilityQualifier nullabilityQualifier1 = javaTypeQualifiers0.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers0.getNullability();
        NullabilityQualifier nullabilityQualifier2 = nullabilityQualifier1 == NullabilityQualifier.FORCE_FLEXIBILITY ? NullabilityQualifier.FORCE_FLEXIBILITY : ((NullabilityQualifier)TypeEnhancementUtilsKt.a(set0, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier1, z));
        if(nullabilityQualifier2 == null) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: collection0) {
                NullabilityQualifier nullabilityQualifier3 = ((JavaTypeQualifiers)object1).getNullability();
                if(nullabilityQualifier3 != null) {
                    arrayList1.add(nullabilityQualifier3);
                }
            }
            Set set1 = CollectionsKt___CollectionsKt.toSet(arrayList1);
            NullabilityQualifier nullabilityQualifier4 = javaTypeQualifiers0.getNullability();
            nullabilityQualifier5 = NullabilityQualifier.FORCE_FLEXIBILITY;
            if(nullabilityQualifier4 != nullabilityQualifier5) {
                nullabilityQualifier5 = (NullabilityQualifier)TypeEnhancementUtilsKt.a(set1, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier4, z);
            }
        }
        else {
            nullabilityQualifier5 = nullabilityQualifier2;
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: collection0) {
            MutabilityQualifier mutabilityQualifier0 = ((JavaTypeQualifiers)object2).getMutability();
            if(mutabilityQualifier0 != null) {
                arrayList2.add(mutabilityQualifier0);
            }
        }
        MutabilityQualifier mutabilityQualifier1 = (MutabilityQualifier)TypeEnhancementUtilsKt.a(CollectionsKt___CollectionsKt.toSet(arrayList2), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers0.getMutability(), z);
        if(nullabilityQualifier5 != null && !z2 && (!z1 || nullabilityQualifier5 != NullabilityQualifier.NULLABLE)) {
            nullabilityQualifier0 = nullabilityQualifier5;
        }
        boolean z3 = false;
        boolean z4 = false;
        if(nullabilityQualifier0 == NullabilityQualifier.NOT_NULL) {
            if(javaTypeQualifiers0.getDefinitelyNotNull()) {
                z3 = true;
            }
            else if(!collection0.isEmpty()) {
                for(Object object3: collection0) {
                    if(((JavaTypeQualifiers)object3).getDefinitelyNotNull()) {
                        z3 = true;
                        break;
                    }
                }
            }
        }
        if(nullabilityQualifier0 != null && nullabilityQualifier2 != nullabilityQualifier5) {
            z4 = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifier0, mutabilityQualifier1, z3, z4);
    }

    public static final boolean hasEnhancedNullability(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
        Intrinsics.checkNotNullExpressionValue(JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext0.hasAnnotation(kotlinTypeMarker0, JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION);
    }
}

