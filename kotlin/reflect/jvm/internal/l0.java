package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;

public final class l0 extends Lambda implements Function0 {
    public final Setter w;

    public l0(Setter kPropertyImpl$Setter0) {
        this.w = kPropertyImpl$Setter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Setter kPropertyImpl$Setter0 = this.w;
        PropertySetterDescriptor propertySetterDescriptor0 = kPropertyImpl$Setter0.getProperty().getDescriptor().getSetter();
        return propertySetterDescriptor0 == null ? DescriptorFactory.createDefaultSetter(kPropertyImpl$Setter0.getProperty().getDescriptor(), Annotations.Companion.getEMPTY(), Annotations.Companion.getEMPTY()) : propertySetterDescriptor0;
    }
}

