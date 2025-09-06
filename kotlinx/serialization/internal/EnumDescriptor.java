package kotlinx.serialization.internal;

import hg.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.descriptors.SerialKind;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u001A\u001A\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lkotlinx/serialization/descriptors/SerialKind;", "m", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n13#2:152\n159#3:153\n1789#4,3:154\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n*L\n28#1:152\n46#1:153\n46#1:154,3\n*E\n"})
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
    public final ENUM m;
    public final Lazy n;

    public EnumDescriptor(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        super(s, null, v, 2, null);
        this.m = ENUM.INSTANCE;
        this.n = c.lazy(new d(v, s, this));
    }

    @Override  // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SerialDescriptor)) {
            return false;
        }
        if(((SerialDescriptor)object0).getKind() != ENUM.INSTANCE) {
            return false;
        }
        return Intrinsics.areEqual(this.getSerialName(), ((SerialDescriptor)object0).getSerialName()) ? Intrinsics.areEqual(Platform_commonKt.cachedSerialNames(this), Platform_commonKt.cachedSerialNames(((SerialDescriptor)object0))) : false;
    }

    @Override  // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int v) {
        return ((SerialDescriptor[])this.n.getValue())[v];
    }

    @Override  // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return this.m;
    }

    @Override  // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int v = this.getSerialName().hashCode();
        int v1 = 1;
        for(Object object0: SerialDescriptorKt.getElementNames(this)) {
            String s = (String)object0;
            v1 = v1 * 0x1F + (s == null ? 0 : s.hashCode());
        }
        return v * 0x1F + v1;
    }

    @Override  // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(SerialDescriptorKt.getElementNames(this), ", ", this.getSerialName() + '(', ")", 0, null, null, 56, null);
    }
}

