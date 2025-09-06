package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class f extends Enum {
    public static final enum d a;
    public static final enum b b;
    public static final enum e c;
    public static final enum c d;
    public static final f[] e;

    static {
        d d0 = new d();
        f.a = d0;
        b b0 = new b();
        f.b = b0;
        e e0 = new e();
        f.c = e0;
        c c0 = new c();
        f.d = c0;
        f.e = new f[]{d0, b0, e0, c0};
    }

    public abstract f a(UnwrappedType arg1);

    public static f b(UnwrappedType unwrappedType0) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "<this>");
        if(unwrappedType0.isMarkedNullable()) {
            return f.b;
        }
        c c0 = f.d;
        if(unwrappedType0 instanceof DefinitelyNotNullType && ((DefinitelyNotNullType)unwrappedType0).getOriginal() instanceof StubTypeForBuilderInference) {
            return c0;
        }
        e e0 = f.c;
        return !(unwrappedType0 instanceof StubTypeForBuilderInference) && NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType0) ? c0 : e0;
    }

    public static f valueOf(String s) {
        return (f)Enum.valueOf(f.class, s);
    }

    public static f[] values() {
        return (f[])f.e.clone();
    }
}

