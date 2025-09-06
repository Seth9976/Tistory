package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaAnnotationArguments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n11335#2:80\n11670#2,3:81\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n*L\n48#1:80\n48#1:81,3\n*E\n"})
public final class ReflectJavaArrayAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaArrayAnnotationArgument {
    public final Object[] b;

    public ReflectJavaArrayAnnotationArgument(@Nullable Name name0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "values");
        super(name0, null);
        this.b = arr_object;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument
    @NotNull
    public List getElements() {
        Object[] arr_object = this.b;
        List list0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Intrinsics.checkNotNull(object0);
            list0.add(ReflectJavaAnnotationArgument.Factory.create(object0, null));
        }
        return list0;
    }
}

