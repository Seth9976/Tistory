package ig;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.JsonElementSerializer;

public final class a implements SerialDescriptor {
    public final SerialDescriptor a;
    public static final a b;
    public static final String c;

    static {
        a.b = new a();
        a.c = "kotlinx.serialization.json.JsonArray";
    }

    public a() {
        this.a = BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).getDescriptor();
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
        return a.c;
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
}

