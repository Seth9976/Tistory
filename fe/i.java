package fe;

import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;

public final class i extends Lambda implements Function0 {
    public final e0 w;

    public i(e0 e00) {
        this.w = e00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.getClass();
        ReflectKotlinClass reflectKotlinClass0 = (ReflectKotlinClass)this.w.c.getValue(this.w, e0.h[0]);
        if(reflectKotlinClass0 != null) {
            KotlinClassHeader kotlinClassHeader0 = reflectKotlinClass0.getClassHeader();
            if(kotlinClassHeader0 != null) {
                String[] arr_s = kotlinClassHeader0.getData();
                String[] arr_s1 = kotlinClassHeader0.getStrings();
                if(arr_s != null && arr_s1 != null) {
                    Pair pair0 = JvmProtoBufUtil.readPackageDataFrom(arr_s, arr_s1);
                    return new Triple(((JvmNameResolver)pair0.component1()), ((Package)pair0.component2()), kotlinClassHeader0.getMetadataVersion());
                }
            }
        }
        return null;
    }
}

