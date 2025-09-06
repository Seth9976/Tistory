package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {
    public final CaptureStatus b;
    public final NewCapturedTypeConstructor c;
    public final UnwrappedType d;
    public final TypeAttributes e;
    public final boolean f;
    public final boolean g;

    public NewCapturedType(@NotNull CaptureStatus captureStatus0, @Nullable UnwrappedType unwrappedType0, @NotNull TypeProjection typeProjection0, @NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(captureStatus0, "captureStatus");
        Intrinsics.checkNotNullParameter(typeProjection0, "projection");
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        this(captureStatus0, new NewCapturedTypeConstructor(typeProjection0, null, null, typeParameterDescriptor0, 6, null), unwrappedType0, null, false, false, 56, null);
    }

    public NewCapturedType(@NotNull CaptureStatus captureStatus0, @NotNull NewCapturedTypeConstructor newCapturedTypeConstructor0, @Nullable UnwrappedType unwrappedType0, @NotNull TypeAttributes typeAttributes0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(captureStatus0, "captureStatus");
        Intrinsics.checkNotNullParameter(newCapturedTypeConstructor0, "constructor");
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        super();
        this.b = captureStatus0;
        this.c = newCapturedTypeConstructor0;
        this.d = unwrappedType0;
        this.e = typeAttributes0;
        this.f = z;
        this.g = z1;
    }

    public NewCapturedType(CaptureStatus captureStatus0, NewCapturedTypeConstructor newCapturedTypeConstructor0, UnwrappedType unwrappedType0, TypeAttributes typeAttributes0, boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            typeAttributes0 = TypeAttributes.Companion.getEmpty();
        }
        this(captureStatus0, newCapturedTypeConstructor0, unwrappedType0, typeAttributes0, ((v & 16) == 0 ? z : false), ((v & 0x20) == 0 ? z1 : false));
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
    public final CaptureStatus getCaptureStatus() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.getConstructor();
    }

    @NotNull
    public NewCapturedTypeConstructor getConstructor() {
        return this.c;
    }

    @Nullable
    public final UnwrappedType getLowerType() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f;
    }

    public final boolean isProjectionNotNull() {
        return this.g;
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
    public NewCapturedType makeNullableAsSpecified(boolean z) {
        return new NewCapturedType(this.b, this.getConstructor(), this.d, this.getAttributes(), z, false, 0x20, null);
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
    public NewCapturedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        NewCapturedTypeConstructor newCapturedTypeConstructor0 = this.getConstructor().refine(kotlinTypeRefiner0);
        UnwrappedType unwrappedType0 = this.d;
        if(unwrappedType0 != null) {
            UnwrappedType unwrappedType1 = kotlinTypeRefiner0.refineType(unwrappedType0).unwrap();
            return new NewCapturedType(this.b, newCapturedTypeConstructor0, unwrappedType1, this.getAttributes(), this.isMarkedNullable(), false, 0x20, null);
        }
        return new NewCapturedType(this.b, newCapturedTypeConstructor0, null, this.getAttributes(), this.isMarkedNullable(), false, 0x20, null);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return new NewCapturedType(this.b, this.getConstructor(), this.d, typeAttributes0, this.isMarkedNullable(), this.g);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }
}

