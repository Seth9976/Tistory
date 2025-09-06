package fe;

import androidx.compose.material3.nq;
import java.util.ArrayList;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.jvm.internal.KCallableImpl._parameters.1.invoke..inlined.sortBy.1;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KParameterImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;

public final class e extends Lambda implements Function0 {
    public final KCallableImpl w;

    public e(KCallableImpl kCallableImpl0) {
        this.w = kCallableImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v1;
        KCallableImpl kCallableImpl0 = this.w;
        CallableMemberDescriptor callableMemberDescriptor0 = kCallableImpl0.getDescriptor();
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        if(kCallableImpl0.isBound()) {
            v1 = 0;
        }
        else {
            ReceiverParameterDescriptor receiverParameterDescriptor0 = UtilKt.getInstanceReceiverParameter(callableMemberDescriptor0);
            if(receiverParameterDescriptor0 == null) {
                v1 = 0;
            }
            else {
                d d0 = new d(receiverParameterDescriptor0, 0);
                arrayList0.add(new KParameterImpl(kCallableImpl0, 0, Kind.INSTANCE, d0));
                v1 = 1;
            }
            ReceiverParameterDescriptor receiverParameterDescriptor1 = callableMemberDescriptor0.getExtensionReceiverParameter();
            if(receiverParameterDescriptor1 != null) {
                d d1 = new d(receiverParameterDescriptor1, 1);
                arrayList0.add(new KParameterImpl(kCallableImpl0, v1, Kind.EXTENSION_RECEIVER, d1));
                ++v1;
            }
        }
        int v2 = callableMemberDescriptor0.getValueParameters().size();
        while(v < v2) {
            nq nq0 = new nq(callableMemberDescriptor0, v, 1);
            arrayList0.add(new KParameterImpl(kCallableImpl0, v1, Kind.VALUE, nq0));
            ++v;
            ++v1;
        }
        if(kCallableImpl0.isAnnotationConstructor() && callableMemberDescriptor0 instanceof JavaCallableMemberDescriptor && arrayList0.size() > 1) {
            n.sortWith(arrayList0, new KCallableImpl._parameters.1.invoke..inlined.sortBy.1());
        }
        arrayList0.trimToSize();
        return arrayList0;
    }
}

