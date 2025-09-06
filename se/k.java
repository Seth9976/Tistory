package se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;

public final class k {
    public final Name a;
    public final JavaClass b;

    public k(Name name0, JavaClass javaClass0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        super();
        this.a = name0;
        this.b = javaClass0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof k && Intrinsics.areEqual(this.a, ((k)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

