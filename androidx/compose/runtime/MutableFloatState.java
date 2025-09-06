package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0018\u0010\u0004\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00038W@WX\u0096\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/MutableState;", "", "floatValue", "getFloatValue", "()F", "setFloatValue", "(F)V", "value", "getValue", "()Ljava/lang/Float;", "setValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface MutableFloatState extends FloatState, MutableState {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        @NotNull
        public static Float getValue(@NotNull MutableFloatState mutableFloatState0) {
            return MutableFloatState.access$getValue$jd(mutableFloatState0);
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        public static void setValue(@NotNull MutableFloatState mutableFloatState0, float f) {
            mutableFloatState0.super.setValue(f);
        }
    }

    static float access$getValue$jd(MutableFloatState mutableFloatState0) {
        return (float)mutableFloatState0.super.getValue();
    }

    @Override  // androidx.compose.runtime.FloatState
    float getFloatValue();

    @Override  // androidx.compose.runtime.FloatState
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    @NotNull
    default Float getValue() {
        return this.getFloatValue();
    }

    @Override  // androidx.compose.runtime.FloatState, androidx.compose.runtime.MutableState
    default Object getValue() {
        return this.getValue();
    }

    void setFloatValue(float arg1);

    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    default void setValue(float f) {
        this.setFloatValue(f);
    }

    @Override  // androidx.compose.runtime.MutableState
    default void setValue(Object object0) {
        this.setValue(((Number)object0).floatValue());
    }
}

