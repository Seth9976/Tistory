package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.f0;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.b;

@SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n800#2,11:183\n1360#2:194\n1446#2,5:195\n1549#2:200\n1620#2,3:201\n*S KotlinDebug\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n*L\n153#1:183,11\n154#1:194\n154#1:195,5\n155#1:200\n155#1:201,3\n*E\n"})
public final class JavaAnnotationTargetMapper {
    @NotNull
    public static final JavaAnnotationTargetMapper INSTANCE;
    public static final Map a;
    public static final Map b;

    static {
        JavaAnnotationTargetMapper.INSTANCE = new JavaAnnotationTargetMapper();  // 初始化器: Ljava/lang/Object;-><init>()V
        JavaAnnotationTargetMapper.a = x.mapOf(new Pair[]{TuplesKt.to("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), TuplesKt.to("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), TuplesKt.to("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), TuplesKt.to("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), TuplesKt.to("FIELD", EnumSet.of(KotlinTarget.FIELD)), TuplesKt.to("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), TuplesKt.to("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), TuplesKt.to("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), TuplesKt.to("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), TuplesKt.to("TYPE_USE", EnumSet.of(KotlinTarget.TYPE))});
        JavaAnnotationTargetMapper.b = x.mapOf(new Pair[]{TuplesKt.to("RUNTIME", KotlinRetention.RUNTIME), TuplesKt.to("CLASS", KotlinRetention.BINARY), TuplesKt.to("SOURCE", KotlinRetention.SOURCE)});
    }

    @Nullable
    public final ConstantValue mapJavaRetentionArgument$descriptors_jvm(@Nullable JavaAnnotationArgument javaAnnotationArgument0) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument0 = javaAnnotationArgument0 instanceof JavaEnumValueAnnotationArgument ? ((JavaEnumValueAnnotationArgument)javaAnnotationArgument0) : null;
        if(javaEnumValueAnnotationArgument0 != null) {
            Name name0 = javaEnumValueAnnotationArgument0.getEntryName();
            String s = name0 == null ? null : name0.asString();
            KotlinRetention kotlinRetention0 = (KotlinRetention)JavaAnnotationTargetMapper.b.get(s);
            if(kotlinRetention0 != null) {
                ClassId classId0 = ClassId.topLevel(FqNames.annotationRetention);
                Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(StandardNames.F…ames.annotationRetention)");
                Name name1 = Name.identifier(kotlinRetention0.name());
                Intrinsics.checkNotNullExpressionValue(name1, "identifier(retention.name)");
                return new EnumValue(classId0, name1);
            }
        }
        return null;
    }

    @NotNull
    public final Set mapJavaTargetArgumentByName(@Nullable String s) {
        Set set0 = (EnumSet)JavaAnnotationTargetMapper.a.get(s);
        return set0 == null ? f0.emptySet() : set0;
    }

    @NotNull
    public final ConstantValue mapJavaTargetArguments$descriptors_jvm(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "arguments");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(object0 instanceof JavaEnumValueAnnotationArgument) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            Name name0 = ((JavaEnumValueAnnotationArgument)object1).getEntryName();
            String s = name0 == null ? null : name0.asString();
            o.addAll(arrayList1, JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArgumentByName(s));
        }
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(arrayList1, 10));
        for(Object object2: arrayList1) {
            ClassId classId0 = ClassId.topLevel(FqNames.annotationTarget);
            Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(StandardNames.FqNames.annotationTarget)");
            Name name1 = Name.identifier(((KotlinTarget)object2).name());
            Intrinsics.checkNotNullExpressionValue(name1, "identifier(kotlinTarget.name)");
            arrayList2.add(new EnumValue(classId0, name1));
        }
        return new ArrayValue(arrayList2, b.w);
    }
}

