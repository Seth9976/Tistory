package se;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

public final class e extends Lambda implements Function1 {
    public final int w;
    public final LazyJavaClassMemberScope x;

    public e(LazyJavaClassMemberScope lazyJavaClassMemberScope0, int v) {
        this.w = v;
        this.x = lazyJavaClassMemberScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Name)object0), "it");
            return LazyJavaClassMemberScope.access$searchMethodsInSupertypesWithoutBuiltinMagic(this.x, ((Name)object0));
        }
        Intrinsics.checkNotNullParameter(((Name)object0), "it");
        return LazyJavaClassMemberScope.access$searchMethodsByNameWithoutBuiltinMagic(this.x, ((Name)object0));
    }
}

