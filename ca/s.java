package ca;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function3 {
    public static final s A;
    public static final s B;
    public static final s C;
    public static final s D;
    public static final s E;
    public static final s F;
    public static final s G;
    public static final s H;
    public static final s I;
    public static final s J;
    public final int w;
    public static final s x;
    public static final s y;
    public static final s z;

    static {
        s.x = new s(3, 0);
        s.y = new s(3, 1);
        s.z = new s(3, 2);
        s.A = new s(3, 3);
        s.B = new s(3, 4);
        s.C = new s(3, 5);
        s.D = new s(3, 6);
        s.E = new s(3, 7);
        s.F = new s(3, 8);
        s.G = new s(3, 9);
        s.H = new s(3, 10);
        s.I = new s(3, 11);
        s.J = new s(3, 12);
    }

    public s(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                ((Number)object0).intValue();
                int v1 = ((Number)object2).intValue();
                if((v1 & 81) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x66266674, v1, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$ItemSliderKt.lambda-8.<anonymous> (ItemSlider.kt:294)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object0).intValue();
                int v2 = ((Number)object2).intValue();
                if((v2 & 81) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xBD2E60FF, v2, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$ItemSliderKt.lambda-9.<anonymous> (ItemSlider.kt:295)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v3 = ((Number)object2).intValue();
                Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$null");
                if((v3 & 81) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xAC8F0BBC, v3, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$KDSliderKt.lambda-1.<anonymous> (KDSlider.kt:193)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                int v4 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 2026708750);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2026708750, v4, -1, "com.kakao.kandinsky.designsystem.common.FeatureBottomBar.<anonymous> (FeatureBottomBar.kt:62)");
                }
                Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(((Modifier)object0), 50.0f), 0.0f, 1, null), 10.0f, 0.0f, 2, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier1;
            }
            case 4: {
                int v5 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), -1013476529);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1013476529, v5, -1, "com.kakao.kandinsky.designsystem.common.FeatureBottomBar.<anonymous> (FeatureBottomBar.kt:67)");
                }
                Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(((Modifier)object0), 68.0f), 0.0f, 1, null), 0.0f, 14.0f, 1, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier2;
            }
            case 5: {
                int v6 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), -346303827);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-346303827, v6, -1, "com.kakao.kandinsky.designsystem.common.ItemSlider.<anonymous> (ItemSlider.kt:116)");
                }
                Modifier modifier3 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(((Modifier)object0), 78.0f), 0.0f, 1, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier3;
            }
            case 6: {
                int v7 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0xDD41524C);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xDD41524C, v7, -1, "com.kakao.kandinsky.designsystem.common.ItemSlider.<anonymous> (ItemSlider.kt:117)");
                }
                Modifier modifier4 = SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(((Modifier)object0), 78.0f), 0.0f, 1, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier4;
            }
            case 7: {
                int v8 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0x700473B);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x700473B, v8, -1, "com.kakao.kandinsky.designsystem.common.ToastMessage.<anonymous> (ItemSlider.kt:326)");
                }
                Modifier modifier5 = OffsetKt.offset-VpY3zN4$default(((Modifier)object0), 0.0f, -55.0f, 1, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier5;
            }
            case 8: {
                int v9 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), -2014206340);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2014206340, v9, -1, "com.kakao.kandinsky.designsystem.common.ToastMessage.<anonymous> (ItemSlider.kt:328)");
                }
                Modifier modifier6 = DrawModifierKt.drawWithContent(OffsetKt.offset-VpY3zN4$default(((Modifier)object0), -40.0f, 0.0f, 2, null), q.z);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier6;
            }
            case 9: {
                int v10 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0x8189F41F);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x8189F41F, v10, -1, "com.kakao.kandinsky.designsystem.common.Slider.<anonymous> (KDSlider.kt:237)");
                }
                Modifier modifier7 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(((Modifier)object0), 28.0f), 0.0f, 1, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier7;
            }
            case 10: {
                int v11 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0x8BA08720);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x8BA08720, v11, -1, "com.kakao.kandinsky.designsystem.common.Slider.<anonymous> (KDSlider.kt:238)");
                }
                Modifier modifier8 = SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(((Modifier)object0), 28.0f), 0.0f, 1, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier8;
            }
            case 11: {
                int v12 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0x99AF1D20);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x99AF1D20, v12, -1, "com.kakao.kandinsky.designsystem.common.SliderNumber.<anonymous> (KDSlider.kt:344)");
                }
                Modifier modifier9 = OffsetKt.offset-VpY3zN4$default(((Modifier)object0), 0.0f, -35.0f, 1, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier9;
            }
            default: {
                int v = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0xD26AEA3F);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD26AEA3F, v, -1, "com.kakao.kandinsky.designsystem.common.SliderNumber.<anonymous> (KDSlider.kt:346)");
                }
                Modifier modifier0 = DrawModifierKt.drawWithContent(OffsetKt.offset-VpY3zN4$default(((Modifier)object0), -16.0f, 0.0f, 2, null), q.B);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier0;
            }
        }
    }
}

