package hg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind.OBJECT;
import kotlinx.serialization.internal.EnumDescriptor;

public final class d extends Lambda implements Function0 {
    public final int w;
    public final String x;
    public final EnumDescriptor y;

    public d(int v, String s, EnumDescriptor enumDescriptor0) {
        this.w = v;
        this.x = s;
        this.y = enumDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = this.w;
        SerialDescriptor[] arr_serialDescriptor = new SerialDescriptor[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_serialDescriptor[v1] = SerialDescriptorsKt.buildSerialDescriptor$default((this.x + '.' + this.y.getElementName(v1)), OBJECT.INSTANCE, new SerialDescriptor[0], null, 8, null);
        }
        return arr_serialDescriptor;
    }
}

