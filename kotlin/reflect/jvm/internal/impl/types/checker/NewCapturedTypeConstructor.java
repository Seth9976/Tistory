package kotlin.reflect.jvm.internal.impl.types.checker;

import aa.m;
import d0.s;
import f0.c;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {
    public final TypeProjection a;
    public Function0 b;
    public final NewCapturedTypeConstructor c;
    public final TypeParameterDescriptor d;
    public final Lazy e;

    public NewCapturedTypeConstructor(@NotNull TypeProjection typeProjection0, @NotNull List list0, @Nullable NewCapturedTypeConstructor newCapturedTypeConstructor0) {
        Intrinsics.checkNotNullParameter(typeProjection0, "projection");
        Intrinsics.checkNotNullParameter(list0, "supertypes");
        this(typeProjection0, new c(list0, 3), newCapturedTypeConstructor0, null, 8, null);
    }

    public NewCapturedTypeConstructor(TypeProjection typeProjection0, List list0, NewCapturedTypeConstructor newCapturedTypeConstructor0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            newCapturedTypeConstructor0 = null;
        }
        this(typeProjection0, list0, newCapturedTypeConstructor0);
    }

    public NewCapturedTypeConstructor(@NotNull TypeProjection typeProjection0, @Nullable Function0 function00, @Nullable NewCapturedTypeConstructor newCapturedTypeConstructor0, @Nullable TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(typeProjection0, "projection");
        super();
        this.a = typeProjection0;
        this.b = function00;
        this.c = newCapturedTypeConstructor0;
        this.d = typeParameterDescriptor0;
        s s0 = new s(this, 16);
        this.e = md.c.lazy(LazyThreadSafetyMode.PUBLICATION, s0);
    }

    public NewCapturedTypeConstructor(TypeProjection typeProjection0, Function0 function00, NewCapturedTypeConstructor newCapturedTypeConstructor0, TypeParameterDescriptor typeParameterDescriptor0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function00 = null;
        }
        if((v & 4) != 0) {
            newCapturedTypeConstructor0 = null;
        }
        if((v & 8) != 0) {
            typeParameterDescriptor0 = null;
        }
        this(typeProjection0, function00, newCapturedTypeConstructor0, typeParameterDescriptor0);
    }

    public static final Function0 access$getSupertypesComputation$p(NewCapturedTypeConstructor newCapturedTypeConstructor0) {
        return newCapturedTypeConstructor0.b;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!Intrinsics.areEqual(NewCapturedTypeConstructor.class, class0)) {
            return false;
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor0 = (NewCapturedTypeConstructor)object0;
        NewCapturedTypeConstructor newCapturedTypeConstructor1 = this.c == null ? this : this.c;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = newCapturedTypeConstructor0.c;
        if(newCapturedTypeConstructor2 != null) {
            newCapturedTypeConstructor0 = newCapturedTypeConstructor2;
        }
        return newCapturedTypeConstructor1 == newCapturedTypeConstructor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinType kotlinType0 = this.getProjection().getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "projection.type");
        return TypeUtilsKt.getBuiltIns(kotlinType0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List getParameters() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    @NotNull
    public TypeProjection getProjection() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection getSupertypes() {
        return this.getSupertypes();
    }

    @NotNull
    public List getSupertypes() {
        List list0 = (List)this.e.getValue();
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Override
    public int hashCode() {
        return this.c == null ? super.hashCode() : this.c.hashCode();
    }

    public final void initializeSupertypes(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "supertypes");
        this.b = new c(list0, 4);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @NotNull
    public NewCapturedTypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        TypeProjection typeProjection0 = this.getProjection().refine(kotlinTypeRefiner0);
        Intrinsics.checkNotNullExpressionValue(typeProjection0, "projection.refine(kotlinTypeRefiner)");
        return new NewCapturedTypeConstructor(typeProjection0, (this.b == null ? null : new m(25, this, kotlinTypeRefiner0)), (this.c == null ? this : this.c), this.d);
    }

    @Override
    @NotNull
    public String toString() {
        return "CapturedType(" + this.getProjection() + ')';
    }
}

