package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {
    public final Enum b;

    public ReflectJavaEnumValueAnnotationArgument(@Nullable Name name0, @NotNull Enum enum0) {
        Intrinsics.checkNotNullParameter(enum0, "value");
        super(name0, null);
        this.b = enum0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    public Name getEntryName() {
        return Name.identifier(this.b.name());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    public ClassId getEnumClassId() {
        Class class0 = this.b.getClass();
        if(!class0.isEnum()) {
            class0 = class0.getEnclosingClass();
        }
        Intrinsics.checkNotNullExpressionValue(class0, "enumClass");
        return ReflectClassUtilKt.getClassId(class0);
    }
}

