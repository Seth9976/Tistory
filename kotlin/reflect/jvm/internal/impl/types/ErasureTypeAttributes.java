package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nErasureTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasureTypeAttributes.kt\norg/jetbrains/kotlin/types/ErasureTypeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public class ErasureTypeAttributes {
    public final TypeUsage a;
    public final Set b;
    public final SimpleType c;

    public ErasureTypeAttributes(@NotNull TypeUsage typeUsage0, @Nullable Set set0, @Nullable SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(typeUsage0, "howThisTypeIsUsed");
        super();
        this.a = typeUsage0;
        this.b = set0;
        this.c = simpleType0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ErasureTypeAttributes ? Intrinsics.areEqual(((ErasureTypeAttributes)object0).getDefaultType(), this.getDefaultType()) && ((ErasureTypeAttributes)object0).getHowThisTypeIsUsed() == this.getHowThisTypeIsUsed() : false;
    }

    @Nullable
    public SimpleType getDefaultType() {
        return this.c;
    }

    @NotNull
    public TypeUsage getHowThisTypeIsUsed() {
        return this.a;
    }

    @Nullable
    public Set getVisitedTypeParameters() {
        return this.b;
    }

    @Override
    public int hashCode() {
        SimpleType simpleType0 = this.getDefaultType();
        if(simpleType0 != null) {
            int v = simpleType0.hashCode();
            return this.getHowThisTypeIsUsed().hashCode() + v * 0x1F + v;
        }
        return this.getHowThisTypeIsUsed().hashCode();
    }

    @NotNull
    public ErasureTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        TypeUsage typeUsage0 = this.getHowThisTypeIsUsed();
        Set set0 = this.getVisitedTypeParameters();
        if(set0 != null) {
            Set set1 = g0.plus(set0, typeParameterDescriptor0);
            return set1 == null ? new ErasureTypeAttributes(typeUsage0, e0.setOf(typeParameterDescriptor0), this.getDefaultType()) : new ErasureTypeAttributes(typeUsage0, set1, this.getDefaultType());
        }
        return new ErasureTypeAttributes(typeUsage0, e0.setOf(typeParameterDescriptor0), this.getDefaultType());
    }
}

