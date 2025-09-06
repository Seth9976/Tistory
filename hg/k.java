package hg;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

public final class k extends Lambda implements Function0 {
    public final int w;
    public final PluginGeneratedSerialDescriptor x;

    public k(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0, int v) {
        this.w = v;
        this.x = pluginGeneratedSerialDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                SerialDescriptor[] arr_serialDescriptor = this.x.getTypeParameterDescriptors$kotlinx_serialization_core();
                return PluginGeneratedSerialDescriptorKt.hashCodeImpl(this.x, arr_serialDescriptor);
            }
            case 1: {
                GeneratedSerializer generatedSerializer1 = PluginGeneratedSerialDescriptor.access$getGeneratedSerializer$p(this.x);
                if(generatedSerializer1 != null) {
                    KSerializer[] arr_kSerializer1 = generatedSerializer1.childSerializers();
                    return arr_kSerializer1 == null ? PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY : arr_kSerializer1;
                }
                return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
            }
            default: {
                GeneratedSerializer generatedSerializer0 = PluginGeneratedSerialDescriptor.access$getGeneratedSerializer$p(this.x);
                if(generatedSerializer0 != null) {
                    KSerializer[] arr_kSerializer = generatedSerializer0.typeParametersSerializers();
                    if(arr_kSerializer != null) {
                        ArrayList arrayList0 = new ArrayList(arr_kSerializer.length);
                        for(int v = 0; v < arr_kSerializer.length; ++v) {
                            arrayList0.add(arr_kSerializer[v].getDescriptor());
                        }
                        return Platform_commonKt.compactArray(arrayList0);
                    }
                    return Platform_commonKt.compactArray(null);
                }
                return Platform_commonKt.compactArray(null);
            }
        }
    }
}

