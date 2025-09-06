package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001A\u00020\u0002X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/State;", "", "floatValue", "getFloatValue", "()F", "value", "getValue", "()Ljava/lang/Float;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FloatState extends State {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        @NotNull
        public static Float getValue(@NotNull FloatState floatState0) {
            return FloatState.access$getValue$jd(floatState0);
        }
    }

    static float access$getValue$jd(FloatState floatState0) {
        return (float)floatState0.super.getValue();
    }

    float getFloatValue();

    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    @NotNull
    default Float getValue() {
        return this.getFloatValue();
    }

    @Override  // androidx.compose.runtime.State
    default Object getValue() {
        return this.getValue();
    }
}

