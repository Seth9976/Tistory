package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;
import org.jetbrains.annotations.NotNull;

public final class LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.2 extends AbstractNodeHandler {
    public final JavaClassDescriptor a;
    public final Set b;
    public final Lambda c;

    public LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.2(JavaClassDescriptor javaClassDescriptor0, Set set0, Function1 function10) {
        this.a = javaClassDescriptor0;
        this.b = set0;
        this.c = (Lambda)function10;
        super();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$AbstractNodeHandler
    public boolean beforeChildren(Object object0) {
        return this.beforeChildren(((ClassDescriptor)object0));
    }

    public boolean beforeChildren(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "current");
        if(classDescriptor0 == this.a) {
            return true;
        }
        MemberScope memberScope0 = classDescriptor0.getStaticScope();
        Intrinsics.checkNotNullExpressionValue(memberScope0, "current.staticScope");
        if(memberScope0 instanceof LazyJavaStaticScope) {
            Collection collection0 = (Collection)((Function1)this.c).invoke(memberScope0);
            this.b.addAll(collection0);
            return false;
        }
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$NodeHandler
    public Object result() {
        return Unit.INSTANCE;
    }

    public void result() {
    }
}

