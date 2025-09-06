package ca;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.designsystem.common.TickSliderOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m1 extends Lambda implements Function1 {
    public final MutableState A;
    public final MutableFloatState B;
    public final int C;
    public final MutableFloatState D;
    public final MutableFloatState E;
    public final TickSliderOptions w;
    public final HapticFeedback x;
    public final float y;
    public final Function1 z;

    public m1(TickSliderOptions tickSliderOptions0, HapticFeedback hapticFeedback0, float f, Function1 function10, MutableState mutableState0, MutableFloatState mutableFloatState0, int v, MutableFloatState mutableFloatState1, MutableFloatState mutableFloatState2) {
        this.w = tickSliderOptions0;
        this.x = hapticFeedback0;
        this.y = f;
        this.z = function10;
        this.A = mutableState0;
        this.B = mutableFloatState0;
        this.C = v;
        this.D = mutableFloatState1;
        this.E = mutableFloatState2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Comparable comparable0 = KDSliderKt.access$KDSlider$lambda$8(this.A).clamp(((float)(KDSliderKt.access$KDSlider$lambda$10(this.B) + ((Number)object0).floatValue())));
        Intrinsics.checkNotNullExpressionValue(comparable0, "clamp(...)");
        KDSliderKt.access$KDSlider$lambda$11(this.B, ((Number)comparable0).floatValue());
        float f = KDSliderKt.access$KDSlider$offsetToValue(KDSliderKt.access$KDSlider$lambda$10(this.B), this.C, this.D);
        if(f % ((float)this.w.getDegreePerTick()) == 0.0f) {
            MutableFloatState mutableFloatState0 = this.E;
            if(KDSliderKt.access$KDSlider$lambda$14(mutableFloatState0) != f) {
                int v = HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI();
                this.x.performHapticFeedback-CdsT49E(v);
                KDSliderKt.access$KDSlider$lambda$15(mutableFloatState0, f);
            }
        }
        if(this.y != f) {
            this.z.invoke(f);
        }
        return Unit.INSTANCE;
    }
}

