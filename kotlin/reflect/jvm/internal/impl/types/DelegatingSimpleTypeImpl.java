package kotlin.reflect.jvm.internal.impl.types;

import ff.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {
    public final SimpleType b;

    public DelegatingSimpleTypeImpl(@NotNull SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        super();
        this.b = simpleType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        return z == this.isMarkedNullable() ? this : this.getDelegate().makeNullableAsSpecified(z).replaceAttributes(this.getAttributes());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return typeAttributes0 != this.getAttributes() ? new i(this, typeAttributes0) : this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }
}

