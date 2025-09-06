package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJavaNullabilityAnnotationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaNullabilityAnnotationSettings.kt\norg/jetbrains/kotlin/load/java/JavaNullabilityAnnotationSettingsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
public final class JavaNullabilityAnnotationSettingsKt {
    public static final FqName a;
    public static final FqName[] b;
    public static final NullabilityAnnotationStatesImpl c;
    public static final JavaNullabilityAnnotationsStatus d;

    static {
        FqName fqName0 = new FqName("org.jspecify.nullness");
        FqName fqName1 = new FqName("org.jspecify.annotations");
        JavaNullabilityAnnotationSettingsKt.a = fqName1;
        FqName fqName2 = new FqName("io.reactivex.rxjava3.annotations");
        FqName fqName3 = new FqName("org.checkerframework.checker.nullness.compatqual");
        Intrinsics.checkNotNullExpressionValue("io.reactivex.rxjava3.annotations", "RXJAVA3_ANNOTATIONS_PACKAGE.asString()");
        JavaNullabilityAnnotationSettingsKt.b = new FqName[]{new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.NonNull")};
        Pair pair0 = TuplesKt.to(new FqName("org.jetbrains.annotations"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair1 = TuplesKt.to(new FqName("androidx.annotation"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair2 = TuplesKt.to(new FqName("android.support.annotation"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair3 = TuplesKt.to(new FqName("android.annotation"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair4 = TuplesKt.to(new FqName("com.android.annotations"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair5 = TuplesKt.to(new FqName("org.eclipse.jdt.annotation"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair6 = TuplesKt.to(new FqName("org.checkerframework.checker.nullness.qual"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair7 = TuplesKt.to(fqName3, JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair8 = TuplesKt.to(new FqName("javax.annotation"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair9 = TuplesKt.to(new FqName("edu.umd.cs.findbugs.annotations"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair10 = TuplesKt.to(new FqName("io.reactivex.annotations"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        Pair pair11 = TuplesKt.to(new FqName("androidx.annotation.RecentlyNullable"), new JavaNullabilityAnnotationsStatus(ReportLevel.WARN, null, null, 4, null));
        Pair pair12 = TuplesKt.to(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(ReportLevel.WARN, null, null, 4, null));
        Pair pair13 = TuplesKt.to(new FqName("lombok"), JavaNullabilityAnnotationsStatus.Companion.getDEFAULT());
        KotlinVersion kotlinVersion0 = new KotlinVersion(1, 9);
        Pair pair14 = TuplesKt.to(fqName0, new JavaNullabilityAnnotationsStatus(ReportLevel.WARN, kotlinVersion0, ReportLevel.STRICT));
        KotlinVersion kotlinVersion1 = new KotlinVersion(1, 9);
        Pair pair15 = TuplesKt.to(fqName1, new JavaNullabilityAnnotationsStatus(ReportLevel.WARN, kotlinVersion1, ReportLevel.STRICT));
        KotlinVersion kotlinVersion2 = new KotlinVersion(1, 8);
        JavaNullabilityAnnotationSettingsKt.c = new NullabilityAnnotationStatesImpl(x.mapOf(new Pair[]{pair0, pair1, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, TuplesKt.to(fqName2, new JavaNullabilityAnnotationsStatus(ReportLevel.WARN, kotlinVersion2, ReportLevel.STRICT))}));
        JavaNullabilityAnnotationSettingsKt.d = new JavaNullabilityAnnotationsStatus(ReportLevel.WARN, null, null, 4, null);
    }

    @NotNull
    public static final Jsr305Settings getDefaultJsr305Settings(@NotNull KotlinVersion kotlinVersion0) {
        ReportLevel reportLevel0;
        Intrinsics.checkNotNullParameter(kotlinVersion0, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus0 = JavaNullabilityAnnotationSettingsKt.d;
        if(javaNullabilityAnnotationsStatus0.getSinceVersion() != null && javaNullabilityAnnotationsStatus0.getSinceVersion().compareTo(kotlinVersion0) <= 0) {
            reportLevel0 = javaNullabilityAnnotationsStatus0.getReportLevelAfter();
            return new Jsr305Settings(reportLevel0, JavaNullabilityAnnotationSettingsKt.getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevel0), null, 4, null);
        }
        reportLevel0 = javaNullabilityAnnotationsStatus0.getReportLevelBefore();
        return new Jsr305Settings(reportLevel0, JavaNullabilityAnnotationSettingsKt.getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevel0), null, 4, null);
    }

    public static Jsr305Settings getDefaultJsr305Settings$default(KotlinVersion kotlinVersion0, int v, Object object0) {
        if((v & 1) != 0) {
            kotlinVersion0 = KotlinVersion.CURRENT;
        }
        return JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings(kotlinVersion0);
    }

    @Nullable
    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(@NotNull ReportLevel reportLevel0) {
        Intrinsics.checkNotNullParameter(reportLevel0, "globalReportLevel");
        return reportLevel0 == ReportLevel.WARN ? null : reportLevel0;
    }

    @NotNull
    public static final ReportLevel getDefaultReportLevelForAnnotation(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "annotationFqName");
        return JavaNullabilityAnnotationSettingsKt.getReportLevelForAnnotation$default(fqName0, NullabilityAnnotationStates.Companion.getEMPTY(), null, 4, null);
    }

    @NotNull
    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return JavaNullabilityAnnotationSettingsKt.a;
    }

    @NotNull
    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return JavaNullabilityAnnotationSettingsKt.b;
    }

    @NotNull
    public static final ReportLevel getReportLevelForAnnotation(@NotNull FqName fqName0, @NotNull NullabilityAnnotationStates nullabilityAnnotationStates0, @NotNull KotlinVersion kotlinVersion0) {
        Intrinsics.checkNotNullParameter(fqName0, "annotation");
        Intrinsics.checkNotNullParameter(nullabilityAnnotationStates0, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(kotlinVersion0, "configuredKotlinVersion");
        ReportLevel reportLevel0 = (ReportLevel)nullabilityAnnotationStates0.get(fqName0);
        if(reportLevel0 != null) {
            return reportLevel0;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus0 = (JavaNullabilityAnnotationsStatus)JavaNullabilityAnnotationSettingsKt.c.get(fqName0);
        if(javaNullabilityAnnotationsStatus0 == null) {
            return ReportLevel.IGNORE;
        }
        return javaNullabilityAnnotationsStatus0.getSinceVersion() == null || javaNullabilityAnnotationsStatus0.getSinceVersion().compareTo(kotlinVersion0) > 0 ? javaNullabilityAnnotationsStatus0.getReportLevelBefore() : javaNullabilityAnnotationsStatus0.getReportLevelAfter();
    }

    public static ReportLevel getReportLevelForAnnotation$default(FqName fqName0, NullabilityAnnotationStates nullabilityAnnotationStates0, KotlinVersion kotlinVersion0, int v, Object object0) {
        if((v & 4) != 0) {
            kotlinVersion0 = new KotlinVersion(1, 7, 20);
        }
        return JavaNullabilityAnnotationSettingsKt.getReportLevelForAnnotation(fqName0, nullabilityAnnotationStates0, kotlinVersion0);
    }
}

