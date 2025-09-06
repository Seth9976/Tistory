package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor.DefaultImpls;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.OBJECT;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\r\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0017\u001A\u00020\n2\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u001A\u0010 \u001A\u00020\u001B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u001A\u0010$\u001A\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0014R\u0014\u0010&\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b%\u0010\u001A¨\u0006\'"}, d2 = {"Lkotlinx/serialization/internal/NothingSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lkotlinx/serialization/descriptors/SerialKind;", "a", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "b", "Ljava/lang/String;", "getSerialName", "serialName", "getElementsCount", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NothingSerialDescriptor implements SerialDescriptor {
    @NotNull
    public static final NothingSerialDescriptor INSTANCE;
    public static final OBJECT a;
    public static final String b;

    static {
        NothingSerialDescriptor.INSTANCE = new NothingSerialDescriptor();  // 初始化器: Ljava/lang/Object;-><init>()V
        NothingSerialDescriptor.a = OBJECT.INSTANCE;
        NothingSerialDescriptor.b = "kotlin.Nothing";
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getAnnotations() {
        return DefaultImpls.getAnnotations(this);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getElementAnnotations(int v) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int v) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int v) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return 0;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return NothingSerialDescriptor.a;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @Override
    public int hashCode() {
        return this.getKind().hashCode() * 0x1F - 0x6C61E840;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int v) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return "NothingSerialDescriptor";
    }
}

