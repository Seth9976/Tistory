package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001E\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001A\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\r\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001A\u00020\u00142\u0006\u0010\b\u001A\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\n0\t8VX\u0097\u0005¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0014\u0010 \u001A\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0014\u0010!\u001A\u00020\u00148VX\u0096\u0005¢\u0006\u0006\u001A\u0004\b!\u0010\"R\u0014\u0010#\u001A\u00020\u00148VX\u0097\u0005¢\u0006\u0006\u001A\u0004\b#\u0010\"R\u0014\u0010\'\u001A\u00020$8\u0016X\u0097\u0005¢\u0006\u0006\u001A\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkotlinx/serialization/descriptors/WrappedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "original", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "", "isElementOptional", "(I)Z", "a", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "getAnnotations", "()Ljava/util/List;", "annotations", "getElementsCount", "()I", "elementsCount", "isInline", "()Z", "isNullable", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class WrappedSerialDescriptor implements SerialDescriptor {
    public final String a;
    public final SerialDescriptor b;

    public WrappedSerialDescriptor(@NotNull String s, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "original");
        super();
        this.a = s;
        this.b = serialDescriptor0;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    @NotNull
    public List getElementAnnotations(int v) {
        return this.b.getElementAnnotations(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    @NotNull
    public SerialDescriptor getElementDescriptor(int v) {
        return this.b.getElementDescriptor(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public int getElementIndex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return this.b.getElementIndex(s);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    @NotNull
    public String getElementName(int v) {
        return this.b.getElementName(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.b.getElementsCount();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return this.b.getKind();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.a;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public boolean isElementOptional(int v) {
        return this.b.isElementOptional(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.b.isInline();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return this.b.isNullable();
    }
}

