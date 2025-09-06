package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.collections.x;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class AnnotationQualifiersFqNamesKt {
    public static final FqName a;
    public static final FqName b;
    public static final FqName c;
    public static final FqName d;
    public static final List e;
    public static final Map f;
    public static final Map g;
    public static final Set h;

    static {
        AnnotationQualifiersFqNamesKt.a = new FqName("javax.annotation.meta.TypeQualifierNickname");
        AnnotationQualifiersFqNamesKt.b = new FqName("javax.annotation.meta.TypeQualifier");
        AnnotationQualifiersFqNamesKt.c = new FqName("javax.annotation.meta.TypeQualifierDefault");
        AnnotationQualifiersFqNamesKt.d = new FqName("kotlin.annotations.jvm.UnderMigration");
        List list0 = CollectionsKt__CollectionsKt.listOf(new AnnotationQualifierApplicabilityType[]{AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE});
        AnnotationQualifiersFqNamesKt.e = list0;
        Map map0 = x.mapOf(new Pair[]{TuplesKt.to(JvmAnnotationNamesKt.getJSPECIFY_OLD_NULL_MARKED(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null), list0, false)), TuplesKt.to(JvmAnnotationNamesKt.getJSPECIFY_NULL_MARKED(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null), list0, false))});
        AnnotationQualifiersFqNamesKt.f = map0;
        AnnotationQualifiersFqNamesKt.g = x.plus(x.mapOf(new Pair[]{TuplesKt.to(new FqName("javax.annotation.ParametersAreNullableByDefault"), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null), k.listOf(AnnotationQualifierApplicabilityType.VALUE_PARAMETER), false, 4, null)), TuplesKt.to(new FqName("javax.annotation.ParametersAreNonnullByDefault"), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null), k.listOf(AnnotationQualifierApplicabilityType.VALUE_PARAMETER), false, 4, null))}), map0);
        AnnotationQualifiersFqNamesKt.h = f0.setOf(new FqName[]{JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION(), JvmAnnotationNamesKt.getJAVAX_CHECKFORNULL_ANNOTATION()});
    }

    @NotNull
    public static final Map getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return AnnotationQualifiersFqNamesKt.g;
    }

    @NotNull
    public static final Set getBUILT_IN_TYPE_QUALIFIER_FQ_NAMES() {
        return AnnotationQualifiersFqNamesKt.h;
    }

    @NotNull
    public static final Map getJSPECIFY_DEFAULT_ANNOTATIONS() {
        return AnnotationQualifiersFqNamesKt.f;
    }

    @NotNull
    public static final FqName getMIGRATION_ANNOTATION_FQNAME() {
        return AnnotationQualifiersFqNamesKt.d;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_DEFAULT_FQNAME() {
        return AnnotationQualifiersFqNamesKt.c;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_FQNAME() {
        return AnnotationQualifiersFqNamesKt.b;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_NICKNAME_FQNAME() {
        return AnnotationQualifiersFqNamesKt.a;
    }
}

