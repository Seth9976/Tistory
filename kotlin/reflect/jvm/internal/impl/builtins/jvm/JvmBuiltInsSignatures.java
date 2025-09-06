package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nJvmBuiltInsSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInsSignatures.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSignatures\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n13#2:188\n13#2:194\n13#2:200\n13#2:201\n13#2:202\n13#2:203\n13#2:204\n1446#3,5:189\n1446#3,5:195\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInsSignatures.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSignatures\n*L\n60#1:188\n160#1:194\n24#1:200\n68#1:201\n119#1:202\n138#1:203\n155#1:204\n61#1:189,5\n164#1:195,5\n*E\n"})
public final class JvmBuiltInsSignatures {
    @NotNull
    public static final JvmBuiltInsSignatures INSTANCE;
    public static final Set a;
    public static final Set b;
    public static final Set c;
    public static final Set d;
    public static final Set e;
    public static final Set f;

    static {
        JvmBuiltInsSignatures.INSTANCE = new JvmBuiltInsSignatures();  // 初始化器: Ljava/lang/Object;-><init>()V
        SignatureBuildingComponents signatureBuildingComponents0 = SignatureBuildingComponents.INSTANCE;
        JvmBuiltInsSignatures.a = g0.plus(signatureBuildingComponents0.inJavaUtil("Collection", new String[]{"toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"}), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(new JvmPrimitiveType[]{JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR});
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            String s = ((JvmPrimitiveType)object0).getWrapperFqName().shortName().asString();
            Intrinsics.checkNotNullExpressionValue(s, "it.wrapperFqName.shortName().asString()");
            o.addAll(linkedHashSet0, signatureBuildingComponents0.inJavaLang(s, new String[]{((JvmPrimitiveType)object0).getJavaKeywordName() + "Value()" + ((JvmPrimitiveType)object0).getDesc()}));
        }
        JvmBuiltInsSignatures.b = g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(linkedHashSet0, signatureBuildingComponents0.inJavaUtil("List", new String[]{"sort(Ljava/util/Comparator;)V"})), signatureBuildingComponents0.inJavaLang("String", new String[]{"codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"})), signatureBuildingComponents0.inJavaLang("Double", new String[]{"isInfinite()Z", "isNaN()Z"})), signatureBuildingComponents0.inJavaLang("Float", new String[]{"isInfinite()Z", "isNaN()Z"})), signatureBuildingComponents0.inJavaLang("Enum", new String[]{"getDeclaringClass()Ljava/lang/Class;", "finalize()V"})), signatureBuildingComponents0.inJavaLang("CharSequence", new String[]{"isEmpty()Z"}));
        SignatureBuildingComponents signatureBuildingComponents1 = SignatureBuildingComponents.INSTANCE;
        JvmBuiltInsSignatures.c = g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(g0.plus(signatureBuildingComponents1.inJavaLang("CharSequence", new String[]{"codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"}), signatureBuildingComponents1.inJavaUtil("Iterator", new String[]{"forEachRemaining(Ljava/util/function/Consumer;)V"})), signatureBuildingComponents1.inJavaLang("Iterable", new String[]{"forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"})), signatureBuildingComponents1.inJavaLang("Throwable", new String[]{"setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"})), signatureBuildingComponents1.inJavaUtil("Collection", new String[]{"spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"})), signatureBuildingComponents1.inJavaUtil("List", new String[]{"replaceAll(Ljava/util/function/UnaryOperator;)V"})), signatureBuildingComponents1.inJavaUtil("Map", new String[]{"getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"}));
        JvmBuiltInsSignatures.d = g0.plus(g0.plus(signatureBuildingComponents1.inJavaUtil("Collection", new String[]{"removeIf(Ljava/util/function/Predicate;)Z"}), signatureBuildingComponents1.inJavaUtil("List", new String[]{"replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V"})), signatureBuildingComponents1.inJavaUtil("Map", new String[]{"computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"}));
        JvmBuiltInsSignatures.INSTANCE.getClass();
        Iterable iterable1 = CollectionsKt__CollectionsKt.listOf(new JvmPrimitiveType[]{JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.BYTE, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, JvmPrimitiveType.BYTE, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT});
        LinkedHashSet linkedHashSet1 = new LinkedHashSet();
        for(Object object1: iterable1) {
            String s1 = ((JvmPrimitiveType)object1).getWrapperFqName().shortName().asString();
            Intrinsics.checkNotNullExpressionValue(s1, "it.wrapperFqName.shortName().asString()");
            String[] arr_s = signatureBuildingComponents1.constructors(new String[]{"Ljava/lang/String;"});
            o.addAll(linkedHashSet1, signatureBuildingComponents1.inJavaLang(s1, ((String[])Arrays.copyOf(arr_s, arr_s.length))));
        }
        String[] arr_s1 = signatureBuildingComponents1.constructors(new String[]{"D"});
        Set set0 = g0.plus(linkedHashSet1, signatureBuildingComponents1.inJavaLang("Float", ((String[])Arrays.copyOf(arr_s1, arr_s1.length))));
        String[] arr_s2 = signatureBuildingComponents1.constructors(new String[]{"[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;"});
        JvmBuiltInsSignatures.e = g0.plus(set0, signatureBuildingComponents1.inJavaLang("String", ((String[])Arrays.copyOf(arr_s2, arr_s2.length))));
        String[] arr_s3 = SignatureBuildingComponents.INSTANCE.constructors(new String[]{"Ljava/lang/String;Ljava/lang/Throwable;ZZ"});
        String[] arr_s4 = (String[])Arrays.copyOf(arr_s3, arr_s3.length);
        JvmBuiltInsSignatures.f = SignatureBuildingComponents.INSTANCE.inJavaLang("Throwable", arr_s4);
    }

    @NotNull
    public final Set getDROP_LIST_METHOD_SIGNATURES() {
        return JvmBuiltInsSignatures.a;
    }

    @NotNull
    public final Set getHIDDEN_CONSTRUCTOR_SIGNATURES() {
        return JvmBuiltInsSignatures.e;
    }

    @NotNull
    public final Set getHIDDEN_METHOD_SIGNATURES() {
        return JvmBuiltInsSignatures.b;
    }

    @NotNull
    public final Set getMUTABLE_METHOD_SIGNATURES() {
        return JvmBuiltInsSignatures.d;
    }

    @NotNull
    public final Set getVISIBLE_CONSTRUCTOR_SIGNATURES() {
        return JvmBuiltInsSignatures.f;
    }

    @NotNull
    public final Set getVISIBLE_METHOD_SIGNATURES() {
        return JvmBuiltInsSignatures.c;
    }

    public final boolean isArrayOrPrimitiveArray(@NotNull FqNameUnsafe fqNameUnsafe0) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe0, "fqName");
        return Intrinsics.areEqual(fqNameUnsafe0, FqNames.array) || StandardNames.isPrimitiveArray(fqNameUnsafe0);
    }

    public final boolean isSerializableInJava(@NotNull FqNameUnsafe fqNameUnsafe0) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe0, "fqName");
        if(this.isArrayOrPrimitiveArray(fqNameUnsafe0)) {
            return true;
        }
        ClassId classId0 = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe0);
        if(classId0 == null) {
            return false;
        }
        try {
            Class class0 = Class.forName(classId0.asSingleFqName().asString());
            return Serializable.class.isAssignableFrom(class0);
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }
}

