package kotlinx.serialization.internal;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000F\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001E\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0097\u0001\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\f\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0006H\u0097\u0001\u00A2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000EH\u0097\u0001\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\u0006H\u0097\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0007\u001A\u00020\u0006H\u0097\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\u00142\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0096\u0002\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001ER\u001A\u0010\u0003\u001A\u00020\u00018\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u001A\u0010&\u001A\u00020\u000E8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u001CR \u0010,\u001A\b\u0012\u0004\u0012\u00020\u000E0\'8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u001A\u0010/\u001A\b\u0012\u0004\u0012\u00020\t0\b8VX\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b-\u0010.R\u0014\u00101\u001A\u00020\u00068\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b0\u0010\u001ER\u0014\u00102\u001A\u00020\u00148VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b2\u00103R\u0014\u00107\u001A\u0002048\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b5\u00106R\u0014\u00108\u001A\u00020\u00148VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b8\u00103\u00A8\u00069"}, d2 = {"Lkotlinx/serialization/internal/SerialDescriptorForNullable;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "original", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "", "isElementOptional", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getOriginal$kotlinx_serialization_core", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Ljava/lang/String;", "getSerialName", "serialName", "", "c", "Ljava/util/Set;", "getSerialNames", "()Ljava/util/Set;", "serialNames", "getAnnotations", "()Ljava/util/List;", "annotations", "getElementsCount", "elementsCount", "isInline", "()Z", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "isNullable", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SerialDescriptorForNullable implements SerialDescriptor, CachedNames {
    public final SerialDescriptor a;
    public final String b;
    public final Set c;

    public SerialDescriptorForNullable(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "original");
        super();
        this.a = serialDescriptor0;
        this.b = serialDescriptor0.getSerialName() + '?';
        this.c = Platform_commonKt.cachedSerialNames(serialDescriptor0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SerialDescriptorForNullable ? Intrinsics.areEqual(this.a, ((SerialDescriptorForNullable)object0).a) : false;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    @NotNull
    public List getElementAnnotations(int v) {
        return this.a.getElementAnnotations(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    @NotNull
    public SerialDescriptor getElementDescriptor(int v) {
        return this.a.getElementDescriptor(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public int getElementIndex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return this.a.getElementIndex(s);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    @NotNull
    public String getElementName(int v) {
        return this.a.getElementName(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.a.getElementsCount();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return this.a.getKind();
    }

    @NotNull
    public final SerialDescriptor getOriginal$kotlinx_serialization_core() {
        return this.a;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.b;
    }

    @Override  // kotlinx.serialization.internal.CachedNames
    @NotNull
    public Set getSerialNames() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public boolean isElementOptional(int v) {
        return this.a.isElementOptional(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.a.isInline();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return true;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a + '?';
    }
}

