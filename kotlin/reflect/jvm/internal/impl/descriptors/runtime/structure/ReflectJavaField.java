package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;

public final class ReflectJavaField extends ReflectJavaMember implements JavaField {
    public final Field a;

    public ReflectJavaField(@NotNull Field field0) {
        Intrinsics.checkNotNullParameter(field0, "member");
        super();
        this.a = field0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean getHasConstantNotNullInitializer() {
        return false;
    }

    @NotNull
    public Field getMember() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Member getMember() {
        return this.getMember();
    }

    @NotNull
    public ReflectJavaType getType() {
        Type type0 = this.getMember().getGenericType();
        Intrinsics.checkNotNullExpressionValue(type0, "member.genericType");
        return ReflectJavaType.Factory.create(type0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public JavaType getType() {
        return this.getType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean isEnumEntry() {
        return this.getMember().isEnumConstant();
    }
}

