package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

public abstract class WrappedType extends KotlinType {
    public WrappedType() {
        super(null);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List getArguments() {
        return this.getDelegate().getArguments();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.getDelegate().getAttributes();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.getDelegate().getConstructor();
    }

    @NotNull
    public abstract KotlinType getDelegate();

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.getDelegate().getMemberScope();
    }

    public boolean isComputed() {
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.getDelegate().isMarkedNullable();
    }

    // 去混淆评级： 低(20)
    @Override
    @NotNull
    public String toString() {
        return this.isComputed() ? this.getDelegate().toString() : "<Not computed yet>";
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public final UnwrappedType unwrap() {
        KotlinType kotlinType0;
        for(kotlinType0 = this.getDelegate(); kotlinType0 instanceof WrappedType; kotlinType0 = ((WrappedType)kotlinType0).getDelegate()) {
        }
        Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (UnwrappedType)kotlinType0;
    }
}

