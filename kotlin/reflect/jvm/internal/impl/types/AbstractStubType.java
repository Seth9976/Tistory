package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractStubType extends SimpleType {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final NewTypeVariableConstructor b;
    public final boolean c;
    public final ErrorScope d;

    static {
        AbstractStubType.Companion = new Companion(null);
    }

    public AbstractStubType(@NotNull NewTypeVariableConstructor newTypeVariableConstructor0, boolean z) {
        Intrinsics.checkNotNullParameter(newTypeVariableConstructor0, "originalTypeVariable");
        super();
        this.b = newTypeVariableConstructor0;
        this.c = z;
        this.d = ErrorUtils.createErrorScope(ErrorScopeKind.STUB_TYPE_SCOPE, new String[]{newTypeVariableConstructor0.toString()});
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List getArguments() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.d;
    }

    @NotNull
    public final NewTypeVariableConstructor getOriginalTypeVariable() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        return z == this.isMarkedNullable() ? this : this.materialize(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @NotNull
    public abstract AbstractStubType materialize(boolean arg1);

    @NotNull
    public AbstractStubType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }
}

