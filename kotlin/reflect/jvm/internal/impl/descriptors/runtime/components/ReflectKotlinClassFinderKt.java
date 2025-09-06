package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.p;

public final class ReflectKotlinClassFinderKt {
    public static final String access$toRuntimeFqName(ClassId classId0) {
        String s = classId0.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "relativeClassName.asString()");
        String s1 = p.replace$default(s, '.', '$', false, 4, null);
        return classId0.getPackageFqName().isRoot() ? s1 : classId0.getPackageFqName() + '.' + s1;
    }
}

