package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMethod.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n1#2:38\n11335#3:39\n11670#3,3:40\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMethod.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMethod\n*L\n35#1:39\n35#1:40,3\n*E\n"})
public final class ReflectJavaMethod extends ReflectJavaMember implements JavaMethod {
    public final Method a;

    public ReflectJavaMethod(@NotNull Method method0) {
        Intrinsics.checkNotNullParameter(method0, "member");
        super();
        this.a = method0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    @Nullable
    public JavaAnnotationArgument getAnnotationParameterDefaultValue() {
        Object object0 = this.getMember().getDefaultValue();
        return object0 != null ? ReflectJavaAnnotationArgument.Factory.create(object0, null) : null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public boolean getHasAnnotationParameterDefaultValue() {
        return this.getAnnotationParameterDefaultValue() != null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Member getMember() {
        return this.getMember();
    }

    @NotNull
    public Method getMember() {
        return this.a;
    }

    @NotNull
    public ReflectJavaType getReturnType() {
        Type type0 = this.getMember().getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(type0, "member.genericReturnType");
        return ReflectJavaType.Factory.create(type0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public JavaType getReturnType() {
        return this.getReturnType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List getTypeParameters() {
        TypeVariable[] arr_typeVariable = this.getMember().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(arr_typeVariable, "member.typeParameters");
        List list0 = new ArrayList(arr_typeVariable.length);
        for(int v = 0; v < arr_typeVariable.length; ++v) {
            list0.add(new ReflectJavaTypeParameter(arr_typeVariable[v]));
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    @NotNull
    public List getValueParameters() {
        Type[] arr_type = this.getMember().getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(arr_type, "member.genericParameterTypes");
        Annotation[][] arr2_annotation = this.getMember().getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(arr2_annotation, "member.parameterAnnotations");
        return this.getValueParameters(arr_type, arr2_annotation, this.getMember().isVarArgs());
    }
}

