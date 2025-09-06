package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0002H\u0014J\u0018\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0014J\u0010\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0002H\u0004J\u0014\u0010\u000E\u001A\u00020\u0002*\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0004¨\u0006\u000F"}, d2 = {"Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/internal/TaggedEncoder;", "", "()V", "composeName", "parentName", "childName", "elementName", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "nested", "nestedName", "getTag", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@InternalSerializationApi
public abstract class NamedValueEncoder extends TaggedEncoder {
    @NotNull
    public String composeName(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "parentName");
        Intrinsics.checkNotNullParameter(s1, "childName");
        return s.length() == 0 ? s1 : s + '.' + s1;
    }

    @NotNull
    public String elementName(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return serialDescriptor0.getElementName(v);
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public Object getTag(SerialDescriptor serialDescriptor0, int v) {
        return this.getTag(serialDescriptor0, v);
    }

    @NotNull
    public final String getTag(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        return this.nested(this.elementName(serialDescriptor0, v));
    }

    @NotNull
    public final String nested(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "nestedName");
        String s1 = (String)this.getCurrentTagOrNull();
        if(s1 == null) {
            s1 = "";
        }
        return this.composeName(s1, s);
    }
}

