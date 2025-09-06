package ye;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;

public final class g extends Lambda implements Function1 {
    public final int w;
    public final DescriptorRendererImpl x;

    public g(DescriptorRendererImpl descriptorRendererImpl0, int v) {
        this.w = v;
        this.x = descriptorRendererImpl0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((TypeProjection)object0), "it");
                if(((TypeProjection)object0).isStarProjection()) {
                    return "*";
                }
                KotlinType kotlinType0 = ((TypeProjection)object0).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "it.type");
                String s = this.x.renderType(kotlinType0);
                return ((TypeProjection)object0).getProjectionKind() == Variance.INVARIANT ? s : ((TypeProjection)object0).getProjectionKind() + ' ' + s;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((ConstantValue)object0), "it");
                return this.x.e(((ConstantValue)object0));
            }
            default: {
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object0), "it");
                return this.x.renderType(((KotlinType)object0));
            }
        }
    }
}

