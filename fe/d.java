package fe;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

public final class d extends Lambda implements Function0 {
    public final int w;
    public final ReceiverParameterDescriptor x;

    public d(ReceiverParameterDescriptor receiverParameterDescriptor0, int v) {
        this.w = v;
        this.x = receiverParameterDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.x;
    }
}

