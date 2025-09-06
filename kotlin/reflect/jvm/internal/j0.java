package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;

public final class j0 extends Lambda implements Function0 {
    public final Getter w;

    public j0(Getter kPropertyImpl$Getter0) {
        this.w = kPropertyImpl$Getter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Getter kPropertyImpl$Getter0 = this.w;
        PropertyGetterDescriptor propertyGetterDescriptor0 = kPropertyImpl$Getter0.getProperty().getDescriptor().getGetter();
        return propertyGetterDescriptor0 == null ? DescriptorFactory.createDefaultGetter(kPropertyImpl$Getter0.getProperty().getDescriptor(), Annotations.Companion.getEMPTY()) : propertyGetterDescriptor0;
    }
}

