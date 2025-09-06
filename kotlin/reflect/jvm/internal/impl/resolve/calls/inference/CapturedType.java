package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import org.jetbrains.annotations.NotNull;

public final class CapturedType extends SimpleType implements CapturedTypeMarker {
    public final TypeProjection b;
    public final CapturedTypeConstructor c;
    public final boolean d;
    public final TypeAttributes e;

    public CapturedType(@NotNull TypeProjection typeProjection0, @NotNull CapturedTypeConstructor capturedTypeConstructor0, boolean z, @NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeProjection0, "typeProjection");
        Intrinsics.checkNotNullParameter(capturedTypeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        super();
        this.b = typeProjection0;
        this.c = capturedTypeConstructor0;
        this.d = z;
        this.e = typeAttributes0;
    }

    public CapturedType(TypeProjection typeProjection0, CapturedTypeConstructor capturedTypeConstructor0, boolean z, TypeAttributes typeAttributes0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            capturedTypeConstructor0 = new CapturedTypeConstructorImpl(typeProjection0);
        }
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            typeAttributes0 = TypeAttributes.Companion.getEmpty();
        }
        this(typeProjection0, capturedTypeConstructor0, z, typeAttributes0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List getArguments() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.e;
    }

    @NotNull
    public CapturedTypeConstructor getConstructor() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.getConstructor();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.d;
    }

    @NotNull
    public CapturedType makeNullableAsSpecified(boolean z) {
        return z == this.isMarkedNullable() ? this : new CapturedType(this.b, this.getConstructor(), z, this.getAttributes());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public SimpleType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @NotNull
    public CapturedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        TypeProjection typeProjection0 = this.b.refine(kotlinTypeRefiner0);
        Intrinsics.checkNotNullExpressionValue(typeProjection0, "typeProjection.refine(kotlinTypeRefiner)");
        return new CapturedType(typeProjection0, this.getConstructor(), this.isMarkedNullable(), this.getAttributes());
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
        return new CapturedType(this.b, this.getConstructor(), this.isMarkedNullable(), typeAttributes0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return "Captured(" + this.b + ')' + (this.isMarkedNullable() ? "?" : "");
    }
}

