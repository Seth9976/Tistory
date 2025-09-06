package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001B\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0012\u001A\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "name", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Z", "isInline", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"})
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {
    public final boolean m;

    public InlineClassDescriptor(@NotNull String s, @NotNull GeneratedSerializer generatedSerializer0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer0, "generatedSerializer");
        super(s, generatedSerializer0, 1);
        this.m = true;
    }

    @Override  // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(@Nullable Object object0) {
        if(this != object0) {
            if(object0 instanceof InlineClassDescriptor && (Intrinsics.areEqual(this.getSerialName(), ((SerialDescriptor)object0).getSerialName()) && ((InlineClassDescriptor)object0).isInline() && Arrays.equals(this.getTypeParameterDescriptors$kotlinx_serialization_core(), ((InlineClassDescriptor)object0).getTypeParameterDescriptors$kotlinx_serialization_core()) && this.getElementsCount() == ((SerialDescriptor)object0).getElementsCount())) {
                int v = this.getElementsCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(!Intrinsics.areEqual(this.getElementDescriptor(v1).getSerialName(), ((SerialDescriptor)object0).getElementDescriptor(v1).getSerialName()) || !Intrinsics.areEqual(this.getElementDescriptor(v1).getKind(), ((SerialDescriptor)object0).getElementDescriptor(v1).getKind())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override  // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 0x1F;
    }

    @Override  // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean isInline() {
        return this.m;
    }
}

