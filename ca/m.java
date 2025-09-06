package ca;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function4 {
    public static final m A;
    public final int w;
    public static final m x;
    public static final m y;
    public static final m z;

    static {
        m.x = new m(4, 0);
        m.y = new m(4, 1);
        m.z = new m(4, 2);
        m.A = new m(4, 3);
    }

    public m(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        switch(this.w) {
            case 0: {
                ((Boolean)object0).booleanValue();
                int v1 = ((Number)object1).intValue();
                int v2 = ((Number)object3).intValue();
                if((v2 & 0x70) == 0) {
                    v2 |= (((Composer)object2).changed(v1) ? 0x20 : 16);
                }
                if((v2 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(79607403, v2, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$ItemSliderKt.lambda-1.<anonymous> (ItemSlider.kt:57)");
                }
                TextKt.Text--4IGK_g(String.valueOf(v1), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object2), 0, 0, 0x1FFFE);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ((Boolean)object0).booleanValue();
                int v3 = ((Number)object1).intValue();
                int v4 = ((Number)object3).intValue();
                if((v4 & 0x70) == 0) {
                    v4 |= (((Composer)object2).changed(v3) ? 0x20 : 16);
                }
                if((v4 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1409632020, v4, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$ItemSliderKt.lambda-3.<anonymous> (ItemSlider.kt:80)");
                }
                TextKt.Text--4IGK_g(String.valueOf(v3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object2), 0, 0, 0x1FFFE);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                ((Boolean)object0).booleanValue();
                ((Number)object1).intValue();
                int v5 = ((Number)object3).intValue();
                if((v5 & 641) == 0x80 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xDFB647A8, v5, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$ItemSliderKt.lambda-6.<anonymous> (ItemSlider.kt:104)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                ((Boolean)object0).booleanValue();
                ((Number)object1).intValue();
                int v = ((Number)object3).intValue();
                if((v & 641) == 0x80 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1834056371, v, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$ItemSliderKt.lambda-7.<anonymous> (ItemSlider.kt:105)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

