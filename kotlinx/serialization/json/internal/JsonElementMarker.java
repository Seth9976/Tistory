package kotlinx.serialization.json.internal;

import androidx.compose.ui.platform.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ElementMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rR$\u0010\u0015\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F8\u0000@BX\u0080\u000E¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/JsonElementMarker;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "mark$kotlinx_serialization_json", "(I)V", "mark", "nextUnmarkedIndex$kotlinx_serialization_json", "()I", "nextUnmarkedIndex", "", "<set-?>", "b", "Z", "isUnmarkedNull$kotlinx_serialization_json", "()Z", "isUnmarkedNull", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class JsonElementMarker {
    public final ElementMarker a;
    public boolean b;

    public JsonElementMarker(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        super();
        this.a = new ElementMarker(serialDescriptor0, new i(2, this, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 4));
    }

    public static final boolean access$readIfAbsent(JsonElementMarker jsonElementMarker0, SerialDescriptor serialDescriptor0, int v) {
        jsonElementMarker0.getClass();
        boolean z = !serialDescriptor0.isElementOptional(v) && serialDescriptor0.getElementDescriptor(v).isNullable();
        jsonElementMarker0.b = z;
        return z;
    }

    public final boolean isUnmarkedNull$kotlinx_serialization_json() {
        return this.b;
    }

    public final void mark$kotlinx_serialization_json(int v) {
        this.a.mark(v);
    }

    public final int nextUnmarkedIndex$kotlinx_serialization_json() {
        return this.a.nextUnmarkedIndex();
    }
}

