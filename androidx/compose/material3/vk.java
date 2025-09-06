package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class vk extends Lambda implements Function3 {
    public final int w;
    public final boolean x;
    public final SliderColors y;

    public vk(int v, SliderColors sliderColors0, boolean z) {
        this.w = v;
        this.x = z;
        this.y = sliderColors0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x9F98CFE2, v1, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:634)");
                }
                SliderDefaults.INSTANCE.Track-4EFweAY(((RangeSliderState)object0), null, this.x, this.y, null, null, 0.0f, 0.0f, ((Composer)object1), v1 & 14 | 0x6000000, 0xF2);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object2).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(377064480, v2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                }
                SliderDefaults.INSTANCE.Track-4EFweAY(((RangeSliderState)object0), null, this.x, this.y, null, null, 0.0f, 0.0f, ((Composer)object1), v2 & 14 | 0x6000000, 0xF2);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v3 = ((Number)object2).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xE66B080F, v3, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:529)");
                }
                SliderDefaults.INSTANCE.Track-4EFweAY(((RangeSliderState)object0), null, this.x, this.y, null, null, 0.0f, 0.0f, ((Composer)object1), v3 & 14 | 0x6000000, 0xF2);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                int v4 = ((Number)object2).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x2264E809, v4, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:349)");
                }
                SliderDefaults.INSTANCE.Track-4EFweAY(((SliderState)object0), null, this.x, this.y, null, null, 0.0f, 0.0f, ((Composer)object1), v4 & 14 | 0x6000000, 0xF2);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                int v5 = ((Number)object2).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1843234110, v5, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                }
                SliderDefaults.INSTANCE.Track-4EFweAY(((SliderState)object0), null, this.x, this.y, null, null, 0.0f, 0.0f, ((Composer)object1), v5 & 14 | 0x6000000, 0xF2);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object2).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2083675534, v, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:267)");
                }
                SliderDefaults.INSTANCE.Track-4EFweAY(((SliderState)object0), null, this.x, this.y, null, null, 0.0f, 0.0f, ((Composer)object1), v & 14 | 0x6000000, 0xF2);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

