package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nReflectJavaConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n11335#2:52\n11670#2,3:53\n*S KotlinDebug\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n*L\n49#1:52\n49#1:53,3\n*E\n"})
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {
    public final Constructor a;

    public ReflectJavaConstructor(@NotNull Constructor constructor0) {
        Intrinsics.checkNotNullParameter(constructor0, "member");
        super();
        this.a = constructor0;
    }

    @NotNull
    public Constructor getMember() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Member getMember() {
        return this.getMember();
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

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    @NotNull
    public List getValueParameters() {
        Type[] arr_type = this.getMember().getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(arr_type, "types");
        if(arr_type.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Class class0 = this.getMember().getDeclaringClass();
        if(class0.getDeclaringClass() != null && !Modifier.isStatic(class0.getModifiers())) {
            arr_type = (Type[])ArraysKt___ArraysJvmKt.copyOfRange(arr_type, 1, arr_type.length);
        }
        Annotation[][] arr2_annotation = this.getMember().getParameterAnnotations();
        if(arr2_annotation.length < arr_type.length) {
            throw new IllegalStateException("Illegal generic signature: " + this.getMember());
        }
        if(arr2_annotation.length > arr_type.length) {
            Intrinsics.checkNotNullExpressionValue(arr2_annotation, "annotations");
            arr2_annotation = (Annotation[][])ArraysKt___ArraysJvmKt.copyOfRange(arr2_annotation, arr2_annotation.length - arr_type.length, arr2_annotation.length);
        }
        Intrinsics.checkNotNullExpressionValue(arr_type, "realTypes");
        Intrinsics.checkNotNullExpressionValue(arr2_annotation, "realAnnotations");
        return this.getValueParameters(arr_type, arr2_annotation, this.getMember().isVarArgs());
    }
}

