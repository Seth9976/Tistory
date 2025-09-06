package he;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public final class e extends Lambda implements Function0 {
    public final int w;
    public final PrimitiveType x;

    public e(PrimitiveType primitiveType0, int v) {
        this.w = v;
        this.x = primitiveType0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            FqName fqName0 = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(this.x.getTypeName());
            Intrinsics.checkNotNullExpressionValue(fqName0, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return fqName0;
        }
        FqName fqName1 = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(this.x.getArrayTypeName());
        Intrinsics.checkNotNullExpressionValue(fqName1, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
        return fqName1;
    }
}

