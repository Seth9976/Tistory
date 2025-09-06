package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaTypeAttributes extends ErasureTypeAttributes {
    public final TypeUsage d;
    public final JavaTypeFlexibility e;
    public final boolean f;
    public final boolean g;
    public final Set h;
    public final SimpleType i;

    public JavaTypeAttributes(@NotNull TypeUsage typeUsage0, @NotNull JavaTypeFlexibility javaTypeFlexibility0, boolean z, boolean z1, @Nullable Set set0, @Nullable SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(typeUsage0, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(javaTypeFlexibility0, "flexibility");
        super(typeUsage0, set0, simpleType0);
        this.d = typeUsage0;
        this.e = javaTypeFlexibility0;
        this.f = z;
        this.g = z1;
        this.h = set0;
        this.i = simpleType0;
    }

    public JavaTypeAttributes(TypeUsage typeUsage0, JavaTypeFlexibility javaTypeFlexibility0, boolean z, boolean z1, Set set0, SimpleType simpleType0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            javaTypeFlexibility0 = JavaTypeFlexibility.INFLEXIBLE;
        }
        this(typeUsage0, javaTypeFlexibility0, ((v & 4) == 0 ? z : false), ((v & 8) == 0 ? z1 : false), ((v & 16) == 0 ? set0 : null), ((v & 0x20) == 0 ? simpleType0 : null));
    }

    @NotNull
    public final JavaTypeAttributes copy(@NotNull TypeUsage typeUsage0, @NotNull JavaTypeFlexibility javaTypeFlexibility0, boolean z, boolean z1, @Nullable Set set0, @Nullable SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(typeUsage0, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(javaTypeFlexibility0, "flexibility");
        return new JavaTypeAttributes(typeUsage0, javaTypeFlexibility0, z, z1, set0, simpleType0);
    }

    public static JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes0, TypeUsage typeUsage0, JavaTypeFlexibility javaTypeFlexibility0, boolean z, boolean z1, Set set0, SimpleType simpleType0, int v, Object object0) {
        if((v & 1) != 0) {
            typeUsage0 = javaTypeAttributes0.d;
        }
        if((v & 2) != 0) {
            javaTypeFlexibility0 = javaTypeAttributes0.e;
        }
        if((v & 4) != 0) {
            z = javaTypeAttributes0.f;
        }
        if((v & 8) != 0) {
            z1 = javaTypeAttributes0.g;
        }
        if((v & 16) != 0) {
            set0 = javaTypeAttributes0.h;
        }
        if((v & 0x20) != 0) {
            simpleType0 = javaTypeAttributes0.i;
        }
        return javaTypeAttributes0.copy(typeUsage0, javaTypeFlexibility0, z, z1, set0, simpleType0);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof JavaTypeAttributes ? Intrinsics.areEqual(((JavaTypeAttributes)object0).getDefaultType(), this.getDefaultType()) && ((JavaTypeAttributes)object0).getHowThisTypeIsUsed() == this.getHowThisTypeIsUsed() && ((JavaTypeAttributes)object0).e == this.e && ((JavaTypeAttributes)object0).f == this.f && ((JavaTypeAttributes)object0).g == this.g : false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    public SimpleType getDefaultType() {
        return this.i;
    }

    @NotNull
    public final JavaTypeFlexibility getFlexibility() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    public TypeUsage getHowThisTypeIsUsed() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    public Set getVisitedTypeParameters() {
        return this.h;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        SimpleType simpleType0 = this.getDefaultType();
        int v = simpleType0 == null ? 0 : simpleType0.hashCode();
        int v1 = this.getHowThisTypeIsUsed().hashCode() + v * 0x1F + v;
        int v2 = 0x400 * v + this.e.hashCode() + 0x20 * this.getHowThisTypeIsUsed().hashCode();
        int v3 = v2 * 0x1F + this.f + v2;
        return v3 * 0x1F + this.g + v3;
    }

    public final boolean isForAnnotationParameter() {
        return this.g;
    }

    public final boolean isRaw() {
        return this.f;
    }

    @NotNull
    public final JavaTypeAttributes markIsRaw(boolean z) {
        return JavaTypeAttributes.copy$default(this, null, null, z, false, null, null, 59, null);
    }

    @Override
    @NotNull
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.d + ", flexibility=" + this.e + ", isRaw=" + this.f + ", isForAnnotationParameter=" + this.g + ", visitedTypeParameters=" + this.h + ", defaultType=" + this.i + ')';
    }

    @NotNull
    public JavaTypeAttributes withDefaultType(@Nullable SimpleType simpleType0) {
        return JavaTypeAttributes.copy$default(this, null, null, false, false, null, simpleType0, 0x1F, null);
    }

    @NotNull
    public final JavaTypeAttributes withFlexibility(@NotNull JavaTypeFlexibility javaTypeFlexibility0) {
        Intrinsics.checkNotNullParameter(javaTypeFlexibility0, "flexibility");
        return JavaTypeAttributes.copy$default(this, null, javaTypeFlexibility0, false, false, null, null, 61, null);
    }

    @NotNull
    public JavaTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        return this.getVisitedTypeParameters() == null ? JavaTypeAttributes.copy$default(this, null, null, false, false, e0.setOf(typeParameterDescriptor0), null, 0x2F, null) : JavaTypeAttributes.copy$default(this, null, null, false, false, g0.plus(this.getVisitedTypeParameters(), typeParameterDescriptor0), null, 0x2F, null);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public ErasureTypeAttributes withNewVisitedTypeParameter(TypeParameterDescriptor typeParameterDescriptor0) {
        return this.withNewVisitedTypeParameter(typeParameterDescriptor0);
    }
}

