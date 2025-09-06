package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;

public final class o extends Lambda implements Function0 {
    public final Data w;
    public final KClassImpl x;

    public o(Data kClassImpl$Data0, KClassImpl kClassImpl0) {
        this.w = kClassImpl$Data0;
        this.x = kClassImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClassDescriptor classDescriptor0 = this.w.getDescriptor();
        if(classDescriptor0.getKind() != ClassKind.OBJECT) {
            return null;
        }
        Object object0 = (!classDescriptor0.isCompanionObject() || CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(CompanionObjectMapping.INSTANCE, classDescriptor0) ? this.x.getJClass().getDeclaredField("INSTANCE") : this.x.getJClass().getEnclosingClass().getDeclaredField(classDescriptor0.getName().asString())).get(null);
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
        return object0;
    }
}

