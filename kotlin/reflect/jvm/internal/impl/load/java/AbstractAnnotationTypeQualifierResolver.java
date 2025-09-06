package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import oe.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbstractAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,213:1\n1#2:214\n1#2:220\n1#2:225\n1#2:247\n1747#3,3:215\n288#3,2:221\n1611#3:223\n1855#3:224\n1856#3:226\n1612#3:227\n1747#3,3:228\n1789#3,3:231\n1789#3,3:234\n1603#3,9:237\n1855#3:246\n1856#3:248\n1612#3:249\n73#4,2:218\n361#5,7:250\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n*L\n40#1:220\n81#1:225\n162#1:247\n30#1:215,3\n79#1:221,2\n81#1:223\n81#1:224\n81#1:226\n81#1:227\n88#1:228,3\n124#1:231,3\n136#1:234,3\n162#1:237,9\n162#1:246\n162#1:248\n162#1:249\n40#1:218,2\n208#1:250,7\n*E\n"})
public abstract class AbstractAnnotationTypeQualifierResolver {
    public final JavaTypeEnhancementState a;
    public final ConcurrentHashMap b;
    public static final LinkedHashMap c;

    static {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        AnnotationQualifierApplicabilityType[] arr_annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.values();
        for(int v = 0; v < arr_annotationQualifierApplicabilityType.length; ++v) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType0 = arr_annotationQualifierApplicabilityType[v];
            if(linkedHashMap0.get("TYPE_PARAMETER") == null) {
                linkedHashMap0.put("TYPE_PARAMETER", annotationQualifierApplicabilityType0);
            }
        }
        AbstractAnnotationTypeQualifierResolver.c = linkedHashMap0;
    }

    public AbstractAnnotationTypeQualifierResolver(@NotNull JavaTypeEnhancementState javaTypeEnhancementState0) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState0, "javaTypeEnhancementState");
        super();
        this.a = javaTypeEnhancementState0;
        this.b = new ConcurrentHashMap();
    }

    public final NullabilityQualifierWithMigrationStatus a(Object object0, Function1 function10) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0 = this.d(object0, ((Boolean)function10.invoke(object0)).booleanValue());
        if(nullabilityQualifierWithMigrationStatus0 != null) {
            return nullabilityQualifierWithMigrationStatus0;
        }
        Object object1 = this.resolveTypeQualifierAnnotation(object0);
        if(object1 == null) {
            return null;
        }
        if(this.e(object0) == null) {
            this.a.getJsr305().getGlobalLevel();
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus1 = this.d(object1, ((Boolean)function10.invoke(object1)).booleanValue());
        return nullabilityQualifierWithMigrationStatus1 == null ? null : NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus1, null, false, 1, null);
    }

    public final Object b(Object object0, FqName fqName0) {
        for(Object object1: this.getMetaAnnotations(object0)) {
            if(Intrinsics.areEqual(this.getFqName(object1), fqName0)) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final boolean c(Object object0, FqName fqName0) {
        Iterable iterable0 = this.getMetaAnnotations(object0);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(Intrinsics.areEqual(this.getFqName(object1), fqName0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final NullabilityQualifierWithMigrationStatus d(Object object0, boolean z) {
        NullabilityQualifier nullabilityQualifier0;
        FqName fqName0 = this.getFqName(object0);
        if(fqName0 == null) {
            return null;
        }
        boolean z1 = false;
        ReportLevel reportLevel0 = (ReportLevel)this.a.getGetReportLevelForAnnotation().invoke(fqName0);
        if(JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName0)) {
            nullabilityQualifier0 = NullabilityQualifier.NULLABLE;
        }
        else {
            if(JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName0)) {
                nullabilityQualifier0 = NullabilityQualifier.NOT_NULL;
                goto label_40;
            }
            if((Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getJSPECIFY_OLD_NULLABLE()) ? true : Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getJSPECIFY_NULLABLE()))) {
                nullabilityQualifier0 = NullabilityQualifier.NULLABLE;
                goto label_40;
            }
            if((Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getJSPECIFY_OLD_NULLNESS_UNKNOWN()) ? true : Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getJSPECIFY_NULLNESS_UNKNOWN()))) {
                nullabilityQualifier0 = NullabilityQualifier.FORCE_FLEXIBILITY;
                goto label_40;
            }
            if(Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION())) {
                String s = (String)CollectionsKt___CollectionsKt.firstOrNull(this.enumArguments(object0, false));
                if(s != null) {
                    switch(s) {
                        case "ALWAYS": {
                            break;
                        }
                        case "MAYBE": 
                        case "NEVER": {
                            nullabilityQualifier0 = NullabilityQualifier.NULLABLE;
                            goto label_40;
                        }
                        case "UNKNOWN": {
                            nullabilityQualifier0 = NullabilityQualifier.FORCE_FLEXIBILITY;
                            goto label_40;
                        }
                        default: {
                            return null;
                        }
                    }
                }
                nullabilityQualifier0 = NullabilityQualifier.NOT_NULL;
                goto label_40;
            }
            if(Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION())) {
                nullabilityQualifier0 = NullabilityQualifier.NULLABLE;
                goto label_40;
            }
            if(Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION())) {
                nullabilityQualifier0 = NullabilityQualifier.NOT_NULL;
                goto label_40;
            }
            if(Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NON_NULL_ANNOTATION())) {
                nullabilityQualifier0 = NullabilityQualifier.NOT_NULL;
            }
            else if(Intrinsics.areEqual(fqName0, JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NULLABLE_ANNOTATION())) {
                nullabilityQualifier0 = NullabilityQualifier.NULLABLE;
            }
            else {
                return null;
            }
        }
    label_40:
        if(z) {
            z1 = true;
        }
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier0, z1);
    }

    public final ReportLevel e(Object object0) {
        JavaTypeEnhancementState javaTypeEnhancementState0 = this.a;
        ReportLevel reportLevel0 = (ReportLevel)javaTypeEnhancementState0.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(this.getFqName(object0));
        if(reportLevel0 != null) {
            return reportLevel0;
        }
        Object object1 = this.b(object0, AnnotationQualifiersFqNamesKt.getMIGRATION_ANNOTATION_FQNAME());
        if(object1 != null) {
            Iterable iterable0 = this.enumArguments(object1, false);
            if(iterable0 != null) {
                String s = (String)CollectionsKt___CollectionsKt.firstOrNull(iterable0);
                if(s != null) {
                    ReportLevel reportLevel1 = javaTypeEnhancementState0.getJsr305().getMigrationLevel();
                    if(reportLevel1 == null) {
                        switch(s) {
                            case "IGNORE": {
                                return ReportLevel.IGNORE;
                            }
                            case "STRICT": {
                                return ReportLevel.STRICT;
                            }
                            case "WARN": {
                                return ReportLevel.WARN;
                            }
                            default: {
                                return null;
                            }
                        }
                    }
                    return reportLevel1;
                }
            }
        }
        return null;
    }

    @NotNull
    public abstract Iterable enumArguments(@NotNull Object arg1, boolean arg2);

    @Nullable
    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(@Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType0, @NotNull Iterable iterable0) {
        EnumMap enumMap1;
        Pair pair0;
        JavaDefaultQualifiers javaDefaultQualifiers2;
        ReportLevel reportLevel0;
        Intrinsics.checkNotNullParameter(iterable0, "annotations");
        JavaTypeEnhancementState javaTypeEnhancementState0 = this.a;
        if(javaTypeEnhancementState0.getDisabledDefaultAnnotations()) {
            return javaTypeQualifiersByElementType0;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            JavaDefaultQualifiers javaDefaultQualifiers0 = null;
            if(javaTypeEnhancementState0.getDisabledDefaultAnnotations()) {
                javaDefaultQualifiers2 = null;
            }
            else {
                JavaDefaultQualifiers javaDefaultQualifiers1 = (JavaDefaultQualifiers)AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(this.getFqName(object0));
                if(javaDefaultQualifiers1 != null) {
                    FqName fqName0 = this.getFqName(object0);
                    if(fqName0 == null || !AnnotationQualifiersFqNamesKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName0)) {
                        ReportLevel reportLevel1 = this.e(object0);
                        reportLevel0 = reportLevel1 == null ? javaTypeEnhancementState0.getJsr305().getGlobalLevel() : reportLevel1;
                    }
                    else {
                        reportLevel0 = (ReportLevel)javaTypeEnhancementState0.getGetReportLevelForAnnotation().invoke(fqName0);
                    }
                    if(reportLevel0 == ReportLevel.IGNORE) {
                        reportLevel0 = null;
                    }
                    if(reportLevel0 != null) {
                        javaDefaultQualifiers2 = JavaDefaultQualifiers.copy$default(javaDefaultQualifiers1, NullabilityQualifierWithMigrationStatus.copy$default(javaDefaultQualifiers1.getNullabilityQualifier(), null, false, 1, null), null, false, 6, null);
                    }
                }
            }
            if(javaDefaultQualifiers2 == null) {
                if(javaTypeEnhancementState0.getJsr305().isDisabled()) {
                    pair0 = null;
                }
                else {
                    Object object1 = this.b(object0, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_DEFAULT_FQNAME());
                    if(object1 != null) {
                        for(Object object2: this.getMetaAnnotations(object0)) {
                            if(this.resolveTypeQualifierAnnotation(object2) == null) {
                                continue;
                            }
                            goto label_36;
                        }
                        object2 = null;
                    label_36:
                        if(object2 != null) {
                            Iterable iterable1 = this.enumArguments(object1, true);
                            Set set0 = new LinkedHashSet();
                            for(Object object3: iterable1) {
                                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType0 = (AnnotationQualifierApplicabilityType)AbstractAnnotationTypeQualifierResolver.c.get(((String)object3));
                                if(annotationQualifierApplicabilityType0 != null) {
                                    set0.add(annotationQualifierApplicabilityType0);
                                }
                            }
                            if(set0.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
                                set0 = g0.plus(g0.minus(ArraysKt___ArraysKt.toSet(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), set0);
                            }
                            pair0 = new Pair(object2, set0);
                        }
                    }
                }
                if(pair0 != null) {
                    Object object4 = pair0.component1();
                    Set set1 = (Set)pair0.component2();
                    if(this.e(object0) == null && this.e(object4) == null) {
                        javaTypeEnhancementState0.getJsr305().getGlobalLevel();
                    }
                    NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0 = this.a(object4, a.w);
                    if(nullabilityQualifierWithMigrationStatus0 != null) {
                        javaDefaultQualifiers0 = new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus0, null, false, 1, null), set1, false, 4, null);
                    }
                }
            }
            else {
                javaDefaultQualifiers0 = javaDefaultQualifiers2;
            }
            if(javaDefaultQualifiers0 != null) {
                arrayList0.add(javaDefaultQualifiers0);
            }
        }
        if(arrayList0.isEmpty()) {
            return javaTypeQualifiersByElementType0;
        }
        if(javaTypeQualifiersByElementType0 == null) {
            enumMap1 = new EnumMap(AnnotationQualifierApplicabilityType.class);
        }
        else {
            EnumMap enumMap0 = javaTypeQualifiersByElementType0.getDefaultQualifiers();
            enumMap1 = enumMap0 == null ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap(enumMap0);
        }
        boolean z = false;
        for(Object object5: arrayList0) {
            JavaDefaultQualifiers javaDefaultQualifiers3 = (JavaDefaultQualifiers)object5;
            for(Object object6: javaDefaultQualifiers3.getQualifierApplicabilityTypes()) {
                enumMap1.put(((AnnotationQualifierApplicabilityType)object6), javaDefaultQualifiers3);
                z = true;
            }
        }
        return z ? new JavaTypeQualifiersByElementType(enumMap1) : javaTypeQualifiersByElementType0;
    }

    @Nullable
    public final MutabilityQualifier extractMutability(@NotNull Iterable iterable0) {
        MutabilityQualifier mutabilityQualifier1;
        Intrinsics.checkNotNullParameter(iterable0, "annotations");
        MutabilityQualifier mutabilityQualifier0 = null;
        for(Object object0: iterable0) {
            FqName fqName0 = this.getFqName(object0);
            if(JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS().contains(fqName0)) {
                mutabilityQualifier1 = MutabilityQualifier.READ_ONLY;
            }
            else {
                if(!JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS().contains(fqName0)) {
                    continue;
                }
                mutabilityQualifier1 = MutabilityQualifier.MUTABLE;
            }
            if(mutabilityQualifier0 != null && mutabilityQualifier0 != mutabilityQualifier1) {
                return null;
            }
            mutabilityQualifier0 = mutabilityQualifier1;
        }
        return mutabilityQualifier0;
    }

    @Nullable
    public final NullabilityQualifierWithMigrationStatus extractNullability(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0 = null;
        Iterator iterator0 = androidx.room.a.n(iterable0, "annotations", function10, "forceWarning");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus1 = this.a(object0, function10);
            if(nullabilityQualifierWithMigrationStatus0 != null) {
                if(nullabilityQualifierWithMigrationStatus1 == null || Intrinsics.areEqual(nullabilityQualifierWithMigrationStatus1, nullabilityQualifierWithMigrationStatus0) || nullabilityQualifierWithMigrationStatus1.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus0.isForWarningOnly()) {
                    continue;
                }
                if(nullabilityQualifierWithMigrationStatus1.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus0.isForWarningOnly()) {
                    return null;
                }
            }
            nullabilityQualifierWithMigrationStatus0 = nullabilityQualifierWithMigrationStatus1;
        }
        return nullabilityQualifierWithMigrationStatus0;
    }

    @Nullable
    public abstract FqName getFqName(@NotNull Object arg1);

    @NotNull
    public abstract Object getKey(@NotNull Object arg1);

    @NotNull
    public abstract Iterable getMetaAnnotations(@NotNull Object arg1);

    public final boolean isTypeUseAnnotation(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "annotation");
        Object object1 = this.b(object0, FqNames.target);
        if(object1 == null) {
            return false;
        }
        Iterable iterable0 = this.enumArguments(object1, false);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object2: iterable0) {
                if(Intrinsics.areEqual(((String)object2), "TYPE")) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Nullable
    public final Object resolveTypeQualifierAnnotation(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "annotation");
        if(this.a.getJsr305().isDisabled()) {
            return null;
        }
        if(!CollectionsKt___CollectionsKt.contains(AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_FQ_NAMES(), this.getFqName(object0)) && !this.c(object0, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_FQNAME())) {
            if(!this.c(object0, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_NICKNAME_FQNAME())) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap0 = this.b;
            Object object1 = this.getKey(object0);
            Object object2 = concurrentHashMap0.get(object1);
            if(object2 == null) {
                object2 = null;
                for(Object object3: this.getMetaAnnotations(object0)) {
                    Object object4 = this.resolveTypeQualifierAnnotation(object3);
                    if(object4 != null) {
                        object2 = object4;
                        break;
                    }
                }
                if(object2 == null) {
                    return null;
                }
                Object object5 = concurrentHashMap0.putIfAbsent(object1, object2);
                return object5 == null ? object2 : object5;
            }
            return object2;
        }
        return object0;
    }
}

