package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.x;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class JvmAnnotationNamesKt {
    public static final FqName a;
    public static final FqName b;
    public static final FqName c;
    public static final FqName d;
    public static final FqName e;
    public static final FqName f;
    public static final List g;
    public static final FqName h;
    public static final FqName i;
    public static final List j;
    public static final FqName k;
    public static final FqName l;
    public static final FqName m;
    public static final FqName n;
    public static final Set o;
    public static final Set p;
    public static final Set q;
    public static final Map r;

    static {
        FqName fqName0 = new FqName("org.jspecify.nullness.Nullable");
        JvmAnnotationNamesKt.a = fqName0;
        JvmAnnotationNamesKt.b = new FqName("org.jspecify.nullness.NullnessUnspecified");
        FqName fqName1 = new FqName("org.jspecify.nullness.NullMarked");
        JvmAnnotationNamesKt.c = fqName1;
        FqName fqName2 = new FqName("org.jspecify.annotations.Nullable");
        JvmAnnotationNamesKt.d = fqName2;
        JvmAnnotationNamesKt.e = new FqName("org.jspecify.annotations.NullnessUnspecified");
        FqName fqName3 = new FqName("org.jspecify.annotations.NullMarked");
        JvmAnnotationNamesKt.f = fqName3;
        FqName fqName4 = new FqName("androidx.annotation.Nullable");
        FqName fqName5 = new FqName("androidx.annotation.Nullable");
        FqName fqName6 = new FqName("android.annotation.Nullable");
        FqName fqName7 = new FqName("com.android.annotations.Nullable");
        FqName fqName8 = new FqName("org.eclipse.jdt.annotation.Nullable");
        FqName fqName9 = new FqName("org.checkerframework.checker.nullness.qual.Nullable");
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        FqName fqName12 = new FqName("edu.umd.cs.findbugs.annotations.CheckForNull");
        FqName fqName13 = new FqName("edu.umd.cs.findbugs.annotations.Nullable");
        FqName fqName14 = new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull");
        FqName fqName15 = new FqName("io.reactivex.annotations.Nullable");
        FqName fqName16 = new FqName("io.reactivex.rxjava3.annotations.Nullable");
        List list0 = CollectionsKt__CollectionsKt.listOf(new FqName[]{JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, fqName4, fqName5, fqName6, fqName7, fqName8, fqName9, fqName10, fqName11, fqName12, fqName13, fqName14, fqName15, fqName16});
        JvmAnnotationNamesKt.g = list0;
        FqName fqName17 = new FqName("javax.annotation.Nonnull");
        JvmAnnotationNamesKt.h = fqName17;
        JvmAnnotationNamesKt.i = new FqName("javax.annotation.CheckForNull");
        FqName fqName18 = new FqName("edu.umd.cs.findbugs.annotations.NonNull");
        FqName fqName19 = new FqName("androidx.annotation.NonNull");
        FqName fqName20 = new FqName("androidx.annotation.NonNull");
        FqName fqName21 = new FqName("android.annotation.NonNull");
        FqName fqName22 = new FqName("com.android.annotations.NonNull");
        FqName fqName23 = new FqName("org.eclipse.jdt.annotation.NonNull");
        FqName fqName24 = new FqName("org.checkerframework.checker.nullness.qual.NonNull");
        FqName fqName25 = new FqName("lombok.NonNull");
        FqName fqName26 = new FqName("io.reactivex.annotations.NonNull");
        FqName fqName27 = new FqName("io.reactivex.rxjava3.annotations.NonNull");
        List list1 = CollectionsKt__CollectionsKt.listOf(new FqName[]{JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, fqName18, fqName19, fqName20, fqName21, fqName22, fqName23, fqName24, fqName25, fqName26, fqName27});
        JvmAnnotationNamesKt.j = list1;
        FqName fqName28 = new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        JvmAnnotationNamesKt.k = fqName28;
        FqName fqName29 = new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        JvmAnnotationNamesKt.l = fqName29;
        FqName fqName30 = new FqName("androidx.annotation.RecentlyNullable");
        JvmAnnotationNamesKt.m = fqName30;
        FqName fqName31 = new FqName("androidx.annotation.RecentlyNonNull");
        JvmAnnotationNamesKt.n = fqName31;
        JvmAnnotationNamesKt.o = g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(new LinkedHashSet(), list0), fqName17), list1), fqName28), fqName29), fqName30), fqName31), fqName0), fqName1), fqName2), fqName3);
        JvmAnnotationNamesKt.p = f0.setOf(new FqName[]{JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, JvmAnnotationNames.READONLY_ANNOTATION});
        JvmAnnotationNamesKt.q = f0.setOf(new FqName[]{JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, JvmAnnotationNames.MUTABLE_ANNOTATION});
        JvmAnnotationNamesKt.r = x.mapOf(new Pair[]{TuplesKt.to(JvmAnnotationNames.TARGET_ANNOTATION, FqNames.target), TuplesKt.to(JvmAnnotationNames.RETENTION_ANNOTATION, FqNames.retention), TuplesKt.to(JvmAnnotationNames.DEPRECATED_ANNOTATION, FqNames.deprecated), TuplesKt.to(JvmAnnotationNames.DOCUMENTED_ANNOTATION, FqNames.mustBeDocumented)});
    }

    @NotNull
    public static final FqName getANDROIDX_RECENTLY_NON_NULL_ANNOTATION() {
        return JvmAnnotationNamesKt.n;
    }

    @NotNull
    public static final FqName getANDROIDX_RECENTLY_NULLABLE_ANNOTATION() {
        return JvmAnnotationNamesKt.m;
    }

    @NotNull
    public static final FqName getCOMPATQUAL_NONNULL_ANNOTATION() {
        return JvmAnnotationNamesKt.l;
    }

    @NotNull
    public static final FqName getCOMPATQUAL_NULLABLE_ANNOTATION() {
        return JvmAnnotationNamesKt.k;
    }

    @NotNull
    public static final FqName getJAVAX_CHECKFORNULL_ANNOTATION() {
        return JvmAnnotationNamesKt.i;
    }

    @NotNull
    public static final FqName getJAVAX_NONNULL_ANNOTATION() {
        return JvmAnnotationNamesKt.h;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULLABLE() {
        return JvmAnnotationNamesKt.d;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULLNESS_UNKNOWN() {
        return JvmAnnotationNamesKt.e;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULL_MARKED() {
        return JvmAnnotationNamesKt.f;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULLABLE() {
        return JvmAnnotationNamesKt.a;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULLNESS_UNKNOWN() {
        return JvmAnnotationNamesKt.b;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULL_MARKED() {
        return JvmAnnotationNamesKt.c;
    }

    @NotNull
    public static final Set getMUTABLE_ANNOTATIONS() {
        return JvmAnnotationNamesKt.q;
    }

    @NotNull
    public static final List getNOT_NULL_ANNOTATIONS() {
        return JvmAnnotationNamesKt.j;
    }

    @NotNull
    public static final List getNULLABLE_ANNOTATIONS() {
        return JvmAnnotationNamesKt.g;
    }

    @NotNull
    public static final Set getREAD_ONLY_ANNOTATIONS() {
        return JvmAnnotationNamesKt.p;
    }
}

