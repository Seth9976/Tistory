package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

public final class b extends Lambda implements Function1 {
    public final ArrayList w;
    public final TypeCheckerState x;
    public final TypeSystemContext y;
    public final SimpleTypeMarker z;

    public b(ArrayList arrayList0, TypeCheckerState typeCheckerState0, TypeSystemContext typeSystemContext0, SimpleTypeMarker simpleTypeMarker0) {
        this.w = arrayList0;
        this.x = typeCheckerState0;
        this.y = typeSystemContext0;
        this.z = simpleTypeMarker0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ForkPointContext)object0), "$this$runForkingPoint");
        for(Object object1: this.w) {
            ((ForkPointContext)object0).fork(new a(this.x, this.y, ((SimpleTypeMarker)object1), this.z));
        }
        return Unit.INSTANCE;
    }
}

