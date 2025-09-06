package kotlin.reflect.jvm.internal.impl.types.error;

import a5.b;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class ErrorType extends SimpleType {
    public final TypeConstructor b;
    public final MemberScope c;
    public final ErrorTypeKind d;
    public final List e;
    public final boolean f;
    public final String[] g;
    public final String h;

    @JvmOverloads
    public ErrorType(@NotNull TypeConstructor typeConstructor0, @NotNull MemberScope memberScope0, @NotNull ErrorTypeKind errorTypeKind0, @NotNull List list0, boolean z, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(memberScope0, "memberScope");
        Intrinsics.checkNotNullParameter(errorTypeKind0, "kind");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        super();
        this.b = typeConstructor0;
        this.c = memberScope0;
        this.d = errorTypeKind0;
        this.e = list0;
        this.f = z;
        this.g = arr_s;
        Object[] arr_object = Arrays.copyOf(arr_s, arr_s.length);
        this.h = b.f(arr_object.length, errorTypeKind0.getDebugMessage(), "format(format, *args)", arr_object);
    }

    public ErrorType(TypeConstructor typeConstructor0, MemberScope memberScope0, ErrorTypeKind errorTypeKind0, List list0, boolean z, String[] arr_s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 16) != 0) {
            z = false;
        }
        this(typeConstructor0, memberScope0, errorTypeKind0, list0, z, arr_s);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List getArguments() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.b;
    }

    @NotNull
    public final String getDebugMessage() {
        return this.h;
    }

    @NotNull
    public final ErrorTypeKind getKind() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        Object[] arr_object = Arrays.copyOf(this.g, this.g.length);
        return new ErrorType(this.getConstructor(), this.getMemberScope(), this.d, this.getArguments(), z, ((String[])arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @NotNull
    public ErrorType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public final ErrorType replaceArguments(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "newArguments");
        Object[] arr_object = Arrays.copyOf(this.g, this.g.length);
        return new ErrorType(this.getConstructor(), this.getMemberScope(), this.d, list0, this.isMarkedNullable(), ((String[])arr_object));
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

