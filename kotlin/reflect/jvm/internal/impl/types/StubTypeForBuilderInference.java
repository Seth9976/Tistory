package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;
import org.jetbrains.annotations.NotNull;

public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {
    public final TypeConstructor e;
    public final MemberScope f;

    public StubTypeForBuilderInference(@NotNull NewTypeVariableConstructor newTypeVariableConstructor0, boolean z, @NotNull TypeConstructor typeConstructor0) {
        Intrinsics.checkNotNullParameter(newTypeVariableConstructor0, "originalTypeVariable");
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        super(newTypeVariableConstructor0, z);
        this.e = typeConstructor0;
        this.f = newTypeVariableConstructor0.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    @NotNull
    public MemberScope getMemberScope() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    @NotNull
    public AbstractStubType materialize(boolean z) {
        return new StubTypeForBuilderInference(this.getOriginalTypeVariable(), z, this.getConstructor());
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return "Stub (BI): " + this.getOriginalTypeVariable() + (this.isMarkedNullable() ? "?" : "");
    }
}

