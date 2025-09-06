package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

public final class a extends Lambda implements Function0 {
    public final TypeCheckerState w;
    public final TypeSystemContext x;
    public final SimpleTypeMarker y;
    public final SimpleTypeMarker z;

    public a(TypeCheckerState typeCheckerState0, TypeSystemContext typeSystemContext0, SimpleTypeMarker simpleTypeMarker0, SimpleTypeMarker simpleTypeMarker1) {
        this.w = typeCheckerState0;
        this.x = typeSystemContext0;
        this.y = simpleTypeMarker0;
        this.z = simpleTypeMarker1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TypeArgumentListMarker typeArgumentListMarker0 = this.x.asArgumentList(this.y);
        return Boolean.valueOf(AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(this.w, typeArgumentListMarker0, this.z));
    }
}

