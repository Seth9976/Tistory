package kotlin.reflect.jvm.internal.impl.types;

import ff.h;
import ff.i;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;

public final class c extends SimpleType {
    public final TypeConstructor b;
    public final List c;
    public final boolean d;
    public final MemberScope e;
    public final Function1 f;

    public c(TypeConstructor typeConstructor0, List list0, boolean z, MemberScope memberScope0, Function1 function10) {
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        Intrinsics.checkNotNullParameter(memberScope0, "memberScope");
        Intrinsics.checkNotNullParameter(function10, "refinedTypeFactory");
        super();
        this.b = typeConstructor0;
        this.c = list0;
        this.d = z;
        this.e = memberScope0;
        this.f = function10;
        if(memberScope0 instanceof ErrorScope && !(memberScope0 instanceof ThrowingScope)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope0 + '\n' + typeConstructor0);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List getArguments() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor getConstructor() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope getMemberScope() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final SimpleType makeNullableAsSpecified(boolean z) {
        if(z == this.d) {
            return this;
        }
        if(z) {
            Intrinsics.checkNotNullParameter(this, "delegate");
            return new h(1, this, false);
        }
        Intrinsics.checkNotNullParameter(this, "delegate");
        return new h(0, this, false);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        KotlinType kotlinType0 = (SimpleType)this.f.invoke(kotlinTypeRefiner0);
        return kotlinType0 == null ? this : kotlinType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        UnwrappedType unwrappedType0 = (SimpleType)this.f.invoke(kotlinTypeRefiner0);
        return unwrappedType0 == null ? this : unwrappedType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final SimpleType replaceAttributes(TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return typeAttributes0.isEmpty() ? this : new i(this, typeAttributes0);
    }
}

