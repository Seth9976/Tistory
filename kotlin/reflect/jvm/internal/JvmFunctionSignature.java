package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import pd.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tJ\u000F\u0010\u0003\u001A\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000B\f\r\u000E¨\u0006\u000F"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "", "asString", "()Ljava/lang/String;", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class JvmFunctionSignature {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR%\u0010\u0010\u001A\u0010\u0012\f\u0012\n \u000B*\u0004\u0018\u00010\n0\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "asString", "()Ljava/lang/String;", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "a", "Ljava/util/List;", "getMethods", "()Ljava/util/List;", "methods", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,283:1\n6442#2:284\n*S KotlinDebug\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n86#1:284\n*E\n"})
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {
        public final List a;

        public FakeJavaAnnotationConstructor(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "jClass");
            super(null);
            Method[] arr_method = class0.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(arr_method, "jClass.declaredMethods");
            this.a = ArraysKt___ArraysKt.sortedWith(arr_method, new kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor.special..inlined.sortedBy.1());

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
            @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n1#1,328:1\n86#2:329\n*E\n"})
            public final class kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor.special..inlined.sortedBy.1 implements Comparator {
                @Override
                public final int compare(Object object0, Object object1) {
                    return c.compareValues(((Method)object0).getName(), ((Method)object1).getName());
                }
            }

        }

        @Override  // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        public String asString() {
            return CollectionsKt___CollectionsKt.joinToString$default(this.a, "", "<init>(", ")V", 0, null, a.w, 24, null);
        }

        @NotNull
        public final List getMethods() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001B\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "asString", "()Ljava/lang/String;", "a", "Ljava/lang/reflect/Constructor;", "getConstructor", "()Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class JavaConstructor extends JvmFunctionSignature {
        public final Constructor a;

        public JavaConstructor(@NotNull Constructor constructor0) {
            Intrinsics.checkNotNullParameter(constructor0, "constructor");
            super(null);
            this.a = constructor0;
        }

        @Override  // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        public String asString() {
            Class[] arr_class = this.a.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_class, "constructor.parameterTypes");
            return ArraysKt___ArraysKt.joinToString$default(arr_class, "", "<init>(", ")V", 0, null, b.w, 24, null);
        }

        @NotNull
        public final Constructor getConstructor() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "asString", "()Ljava/lang/String;", "a", "Ljava/lang/reflect/Method;", "getMethod", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class JavaMethod extends JvmFunctionSignature {
        public final Method a;

        public JavaMethod(@NotNull Method method0) {
            Intrinsics.checkNotNullParameter(method0, "method");
            super(null);
            this.a = method0;
        }

        @Override  // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        public String asString() {
            return RuntimeTypeMapperKt.access$getSignature(this.a);
        }

        @NotNull
        public final Method getMethod() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\t\u0010\b¨\u0006\u000B"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "asString", "()Ljava/lang/String;", "getConstructorDesc", "constructorDesc", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class KotlinConstructor extends JvmFunctionSignature {
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method a;
        public final String b;

        public KotlinConstructor(@NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmMemberSignature$Method0) {
            Intrinsics.checkNotNullParameter(jvmMemberSignature$Method0, "signature");
            super(null);
            this.a = jvmMemberSignature$Method0;
            this.b = jvmMemberSignature$Method0.asString();
        }

        @Override  // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        public String asString() {
            return this.b;
        }

        @NotNull
        public final String getConstructorDesc() {
            return this.a.getDesc();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\t\u0010\bR\u0011\u0010\f\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "asString", "()Ljava/lang/String;", "getMethodName", "methodName", "getMethodDesc", "methodDesc", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class KotlinFunction extends JvmFunctionSignature {
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method a;
        public final String b;

        public KotlinFunction(@NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmMemberSignature$Method0) {
            Intrinsics.checkNotNullParameter(jvmMemberSignature$Method0, "signature");
            super(null);
            this.a = jvmMemberSignature$Method0;
            this.b = jvmMemberSignature$Method0.asString();
        }

        @Override  // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        public String asString() {
            return this.b;
        }

        @NotNull
        public final String getMethodDesc() {
            return this.a.getDesc();
        }

        @NotNull
        public final String getMethodName() {
            return this.a.getName();
        }
    }

    public JvmFunctionSignature(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract String asString();
}

