package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor.DefaultImpls;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001C\u001A\u00020\u000F2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0096\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\bH\u0016¢\u0006\u0004\b\u001E\u0010\u001FR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0019R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u0014\u0010(\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\'\u0010\u001F¨\u0006)"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)V", "", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "getSerialName", "b", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "getKind", "()Lkotlinx/serialization/descriptors/PrimitiveKind;", "getElementsCount", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PrimitiveSerialDescriptor implements SerialDescriptor {
    public final String a;
    public final PrimitiveKind b;

    public PrimitiveSerialDescriptor(@NotNull String s, @NotNull PrimitiveKind primitiveKind0) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(primitiveKind0, "kind");
        super();
        this.a = s;
        this.b = primitiveKind0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PrimitiveSerialDescriptor ? Intrinsics.areEqual(this.getSerialName(), ((PrimitiveSerialDescriptor)object0).getSerialName()) && Intrinsics.areEqual(this.getKind(), ((PrimitiveSerialDescriptor)object0).getKind()) : false;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getAnnotations() {
        return DefaultImpls.getAnnotations(this);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getElementAnnotations(int v) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int v) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int v) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return 0;
    }

    @NotNull
    public PrimitiveKind getKind() {
        return this.b;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.getKind();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.getKind().hashCode() * 0x1F + this.getSerialName().hashCode();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int v) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return false;
    }

    @Override
    @NotNull
    public String toString() {
        return "PrimitiveDescriptor(" + this.getSerialName() + ')';
    }
}

