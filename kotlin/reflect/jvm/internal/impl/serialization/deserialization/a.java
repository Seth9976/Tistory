package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

public final class a {
    public final ClassId a;
    public final ClassData b;

    public a(ClassId classId0, ClassData classData0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        super();
        this.a = classId0;
        this.b = classData0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && Intrinsics.areEqual(this.a, ((a)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

