package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import org.jetbrains.annotations.NotNull;
import ue.h;

@SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedEnhancementInfoKt\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 3 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder\n*L\n1#1,254:1\n201#1:256\n13#2:255\n207#3:257\n207#3:258\n207#3:259\n207#3:260\n207#3:261\n207#3:262\n207#3:263\n207#3:264\n207#3:265\n207#3:266\n207#3:267\n207#3:268\n207#3:269\n207#3:270\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedEnhancementInfoKt\n*L\n52#1:256\n41#1:255\n53#1:257\n58#1:258\n63#1:259\n75#1:260\n80#1:261\n128#1:262\n148#1:263\n154#1:264\n160#1:265\n167#1:266\n172#1:267\n178#1:268\n184#1:269\n191#1:270\n*E\n"})
public final class PredefinedEnhancementInfoKt {
    public static final JavaTypeQualifiers a;
    public static final JavaTypeQualifiers b;
    public static final JavaTypeQualifiers c;
    public static final LinkedHashMap d;

    static {
        PredefinedEnhancementInfoKt.a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);
        PredefinedEnhancementInfoKt.b = new JavaTypeQualifiers(NullabilityQualifier.NOT_NULL, null, false, false, 8, null);
        PredefinedEnhancementInfoKt.c = new JavaTypeQualifiers(NullabilityQualifier.NOT_NULL, null, true, false, 8, null);
        h h0 = new h();
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/Iterator").function("forEachRemaining", new b("java/util/function/Consumer"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/lang/Iterable").function("spliterator", new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h(SignatureBuildingComponents.INSTANCE));
        SignatureEnhancementBuilder.ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder0 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/Collection");
        signatureEnhancementBuilder$ClassEnhancementBuilder0.function("removeIf", new i("java/util/function/Predicate"));
        signatureEnhancementBuilder$ClassEnhancementBuilder0.function("stream", new j("java/util/stream/Stream"));
        signatureEnhancementBuilder$ClassEnhancementBuilder0.function("parallelStream", new k("java/util/stream/Stream"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/List").function("replaceAll", new l("java/util/function/UnaryOperator"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder1 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/Map");
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("forEach", new m("java/util/function/BiConsumer"));
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("putIfAbsent", new n("java/lang/Object"));
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("replace", new o("java/lang/Object"));
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("replace", new p("java/lang/Object"));
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("replaceAll", new q("java/util/function/BiFunction"));
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("compute", new r("java/lang/Object", "java/util/function/BiFunction"));
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("computeIfAbsent", new s("java/lang/Object", "java/util/function/Function"));
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("computeIfPresent", new t("java/lang/Object", "java/util/function/BiFunction"));
        signatureEnhancementBuilder$ClassEnhancementBuilder1.function("merge", new u("java/lang/Object", "java/util/function/BiFunction"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/Optional");
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("empty", new v("java/util/Optional"));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("of", new w("java/lang/Object", "java/util/Optional"));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("ofNullable", new x("java/lang/Object", "java/util/Optional"));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("get", new y("java/lang/Object"));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("ifPresent", new z("java/util/function/Consumer"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/lang/ref/Reference").function("get", new a0("java/lang/Object"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/function/Predicate").function("test", new b0("java/lang/Object"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/function/BiPredicate").function("test", new c0("java/lang/Object"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/function/Consumer").function("accept", new c("java/lang/Object"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/function/BiConsumer").function("accept", new d("java/lang/Object"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/function/Function").function("apply", new e("java/lang/Object"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/function/BiFunction").function("apply", new f("java/lang/Object"));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(h0, "java/util/function/Supplier").function("get", new g("java/lang/Object"));
        PredefinedEnhancementInfoKt.d = h0.a;
    }

    @NotNull
    public static final Map getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return PredefinedEnhancementInfoKt.d;
    }
}

