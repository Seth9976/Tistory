package ke;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public final class g extends Lambda implements Function1 {
    public final int w;
    public final FqName x;

    public g(FqName fqName0, int v) {
        this.w = v;
        this.x = fqName0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Annotations)object0), "it");
            return ((Annotations)object0).findAnnotation(this.x);
        }
        Intrinsics.checkNotNullParameter(((FqName)object0), "it");
        return ((FqName)object0).isRoot() || !Intrinsics.areEqual(((FqName)object0).parent(), this.x) ? false : true;
    }
}

