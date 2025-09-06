package gg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

public final class a implements SerialDescriptor {
    public final SerialDescriptor a;
    public final KClass b;
    public final String c;

    public a(SerialDescriptor serialDescriptor0, KClass kClass0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "original");
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        super();
        this.a = serialDescriptor0;
        this.b = kClass0;
        this.c = serialDescriptor0.getSerialName() + '<' + kClass0.getSimpleName() + '>';
    }

    // 去混淆评级： 低(25)
    @Override
    public final boolean equals(Object object0) {
        a a0 = object0 instanceof a ? ((a)object0) : null;
        return a0 == null ? false : Intrinsics.areEqual(this.a, a0.a) && Intrinsics.areEqual(a0.b, this.b);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int v) {
        return this.a.getElementAnnotations(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int v) {
        return this.a.getElementDescriptor(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return this.a.getElementIndex(s);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int v) {
        return this.a.getElementName(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.a.getElementsCount();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialKind getKind() {
        return this.a.getKind();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode() * 0x1F;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int v) {
        return this.a.isElementOptional(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        return this.a.isNullable();
    }

    @Override
    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}

