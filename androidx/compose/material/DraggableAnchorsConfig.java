package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001C\u0010\b\u001A\u00020\u0007*\u00028\u00002\u0006\u0010\u0006\u001A\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tR&\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/DraggableAnchorsConfig;", "T", "", "<init>", "()V", "", "position", "", "at", "(Ljava/lang/Object;F)V", "", "a", "Ljava/util/Map;", "getAnchors$material_release", "()Ljava/util/Map;", "anchors", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DraggableAnchorsConfig {
    public static final int $stable = 8;
    public final LinkedHashMap a;

    public DraggableAnchorsConfig() {
        this.a = new LinkedHashMap();
    }

    public final void at(Object object0, float f) {
        this.a.put(object0, f);
    }

    @NotNull
    public final Map getAnchors$material_release() {
        return this.a;
    }
}

