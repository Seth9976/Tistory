package androidx.compose.material3;

import androidx.compose.material3.carousel.CarouselState;
import ib.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;

public final class nq extends Lambda implements Function0 {
    public final int w;
    public final int x;
    public final Object y;

    public nq(int v, Object object0, int v1) {
        this.w = v1;
        this.x = v;
        this.y = object0;
        super(0);
    }

    public nq(Object object0, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.x = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                TimePickerState timePickerState0 = (TimePickerState)this.y;
                int v = timePickerState0.getSelection-yecRtBI();
                int v1 = this.x;
                if(!TimePickerSelectionMode.equals-impl0(v1, v)) {
                    timePickerState0.setSelection-6_8s6DQ(v1);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Object object0 = ((CallableMemberDescriptor)this.y).getValueParameters().get(this.x);
                Intrinsics.checkNotNullExpressionValue(object0, "descriptor.valueParameters[i]");
                return (ParameterDescriptor)object0;
            }
            case 2: {
                ((f)this.y).a(this.x);
                return Unit.INSTANCE;
            }
            default: {
                return new CarouselState(this.x, 0.0f, ((Function0)this.y));
            }
        }
    }
}

