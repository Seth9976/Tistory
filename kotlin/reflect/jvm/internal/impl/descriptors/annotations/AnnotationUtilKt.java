package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import fg.c;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import org.jetbrains.annotations.NotNull;

public final class AnnotationUtilKt {
    public static final Name a;
    public static final Name b;
    public static final Name c;
    public static final Name d;
    public static final Name e;

    static {
        Name name0 = Name.identifier("message");
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(\"message\")");
        AnnotationUtilKt.a = name0;
        Name name1 = Name.identifier("replaceWith");
        Intrinsics.checkNotNullExpressionValue(name1, "identifier(\"replaceWith\")");
        AnnotationUtilKt.b = name1;
        Name name2 = Name.identifier("level");
        Intrinsics.checkNotNullExpressionValue(name2, "identifier(\"level\")");
        AnnotationUtilKt.c = name2;
        Name name3 = Name.identifier("expression");
        Intrinsics.checkNotNullExpressionValue(name3, "identifier(\"expression\")");
        AnnotationUtilKt.d = name3;
        Name name4 = Name.identifier("imports");
        Intrinsics.checkNotNullExpressionValue(name4, "identifier(\"imports\")");
        AnnotationUtilKt.e = name4;
    }

    @NotNull
    public static final AnnotationDescriptor createDeprecatedAnnotation(@NotNull KotlinBuiltIns kotlinBuiltIns0, @NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "<this>");
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(s1, "replaceWith");
        Intrinsics.checkNotNullParameter(s2, "level");
        StringValue stringValue0 = new StringValue(s1);
        Pair pair0 = TuplesKt.to(AnnotationUtilKt.d, stringValue0);
        ArrayValue arrayValue0 = new ArrayValue(CollectionsKt__CollectionsKt.emptyList(), new c(kotlinBuiltIns0, 29));
        Map map0 = x.mapOf(new Pair[]{pair0, TuplesKt.to(AnnotationUtilKt.e, arrayValue0)});
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor0 = new BuiltInAnnotationDescriptor(kotlinBuiltIns0, FqNames.replaceWith, map0);
        StringValue stringValue1 = new StringValue(s);
        Pair pair1 = TuplesKt.to(AnnotationUtilKt.a, stringValue1);
        AnnotationValue annotationValue0 = new AnnotationValue(builtInAnnotationDescriptor0);
        Pair pair2 = TuplesKt.to(AnnotationUtilKt.b, annotationValue0);
        ClassId classId0 = ClassId.topLevel(FqNames.deprecationLevel);
        Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(StandardNames.FqNames.deprecationLevel)");
        Name name0 = Name.identifier(s2);
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(level)");
        EnumValue enumValue0 = new EnumValue(classId0, name0);
        Map map1 = x.mapOf(new Pair[]{pair1, pair2, TuplesKt.to(AnnotationUtilKt.c, enumValue0)});
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns0, FqNames.deprecated, map1);
    }

    public static AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "";
        }
        if((v & 4) != 0) {
            s2 = "WARNING";
        }
        return AnnotationUtilKt.createDeprecatedAnnotation(kotlinBuiltIns0, s, s1, s2);
    }
}

