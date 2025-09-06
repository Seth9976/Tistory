package androidx.compose.material3;

import aa.q;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import ce.e;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;

public final class x extends Lambda implements Function2 {
    public final int w;
    public final MutableState x;

    public x(MutableState mutableState0, int v) {
        this.w = v;
        this.x = mutableState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                TransformOrigin transformOrigin0 = TransformOrigin.box-impl(MenuKt.calculateTransformOrigin(((IntRect)object0), ((IntRect)object1)));
                this.x.setValue(transformOrigin0);
                return Unit.INSTANCE;
            }
            case 1: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xDCB6EB5A, v, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:191)");
                }
                MutableState mutableState0 = this.x;
                if(!p.isBlank(((CharSequence)mutableState0.getValue()))) {
                    TextKt.Text--4IGK_g(((String)mutableState0.getValue()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FFFE);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                TransformOrigin transformOrigin1 = TransformOrigin.box-impl(MenuKt.calculateTransformOrigin(((IntRect)object0), ((IntRect)object1)));
                this.x.setValue(transformOrigin1);
                return Unit.INSTANCE;
            }
            case 3: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x991A6569, v1, -1, "com.kakao.kandinsky.designsystem.common.PreviewSlider.<anonymous>.<anonymous>.<anonymous> (KDSlider.kt:51)");
                }
                MutableState mutableState1 = this.x;
                float f = KDSliderKt.access$PreviewSlider$lambda$1(mutableState1);
                ((Composer)object0).startReplaceGroup(0xED586E39);
                q q0 = ((Composer)object0).rememberedValue();
                if(q0 == Composer.Companion.getEmpty()) {
                    q0 = new q(mutableState1, 7);
                    ((Composer)object0).updateRememberedValue(q0);
                }
                ((Composer)object0).endReplaceGroup();
                KDSliderKt.KDSlider(null, false, f, q0, 0.0f, null, true, null, 0, e.rangeTo(0.0f, 100.0f), ((Composer)object0), 0x6180C00, 0xB3);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(349743250, v2, -1, "com.kakao.kandinsky.designsystem.common.PreviewSlider.<anonymous>.<anonymous>.<anonymous> (KDSlider.kt:63)");
                }
                MutableState mutableState2 = this.x;
                float f1 = KDSliderKt.access$PreviewSlider$lambda$1(mutableState2);
                ((Composer)object0).startReplaceGroup(0xED586FD8);
                q q1 = ((Composer)object0).rememberedValue();
                if(q1 == Composer.Companion.getEmpty()) {
                    q1 = new q(mutableState2, 8);
                    ((Composer)object0).updateRememberedValue(q1);
                }
                ((Composer)object0).endReplaceGroup();
                KDSliderKt.KDSlider(null, false, f1, q1, 0.0f, null, true, null, 0, e.rangeTo(0.0f, 100.0f), ((Composer)object0), 0x6180C00, 0xB3);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                TransformOrigin transformOrigin2 = TransformOrigin.box-impl(androidx.compose.material.MenuKt.calculateTransformOrigin(((IntRect)object0), ((IntRect)object1)));
                this.x.setValue(transformOrigin2);
                return Unit.INSTANCE;
            }
            case 6: {
                TransformOrigin transformOrigin3 = TransformOrigin.box-impl(androidx.compose.material.MenuKt.calculateTransformOrigin(((IntRect)object0), ((IntRect)object1)));
                this.x.setValue(transformOrigin3);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).floatValue();
                SwipeRefreshIndicatorKt.access$SwipeRefreshIndicator__UAkqwU$lambda$5(this.x, ((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
        }
    }
}

