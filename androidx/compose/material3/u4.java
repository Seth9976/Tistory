package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.unit.IntRect;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u4 extends Lambda implements Function2 {
    public static final u4 A;
    public static final u4 B;
    public static final u4 C;
    public static final u4 D;
    public static final u4 E;
    public static final u4 F;
    public static final u4 G;
    public static final u4 H;
    public static final u4 I;
    public static final u4 J;
    public static final u4 K;
    public static final u4 L;
    public static final u4 M;
    public static final u4 N;
    public static final u4 O;
    public static final u4 P;
    public final int w;
    public static final u4 x;
    public static final u4 y;
    public static final u4 z;

    static {
        u4.x = new u4(2, 0);
        u4.y = new u4(2, 1);
        u4.z = new u4(2, 2);
        u4.A = new u4(2, 3);
        u4.B = new u4(2, 4);
        u4.C = new u4(2, 5);
        u4.D = new u4(2, 6);
        u4.E = new u4(2, 7);
        u4.F = new u4(2, 8);
        u4.G = new u4(2, 9);
        u4.H = new u4(2, 10);
        u4.I = new u4(2, 11);
        u4.J = new u4(2, 12);
        u4.K = new u4(2, 13);
        u4.L = new u4(2, 14);
        u4.M = new u4(2, 15);
        u4.N = new u4(2, 16);
        u4.O = new u4(2, 17);
        u4.P = new u4(2, 18);
    }

    public u4(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD5921CB9, v, -1, "androidx.compose.material3.ComposableSingletons$TabRowKt.lambda-3.<anonymous> (TabRow.kt:312)");
                }
                DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, 0L, ((Composer)object0), 0, 7);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-764008582, v1, -1, "androidx.compose.material3.ComposableSingletons$TabRowKt.lambda-4.<anonymous> (TabRow.kt:368)");
                }
                DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, 0L, ((Composer)object0), 0, 7);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xB2F808, v2, -1, "androidx.compose.material3.ComposableSingletons$TabRowKt.lambda-5.<anonymous> (TabRow.kt:437)");
                }
                DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, 0L, ((Composer)object0), 0, 7);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD571B182, v3, -1, "androidx.compose.material3.ComposableSingletons$TabRowKt.lambda-6.<anonymous> (TabRow.kt:504)");
                }
                DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, 0L, ((Composer)object0), 0, 7);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                int v4 = ((Number)object1).intValue();
                if((v4 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x7F394BF2, v4, -1, "androidx.compose.material3.ComposableSingletons$TabRowKt.lambda-7.<anonymous> (TabRow.kt:1011)");
                }
                DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, 0L, ((Composer)object0), 0, 7);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                return AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier(), 2, null);
            }
            case 6: {
                SaverScope saverScope1 = (SaverScope)object0;
                return CollectionsKt__CollectionsKt.listOf(new Object[]{((q7)object1).getSelectedDateMillis(), ((q7)object1).getDisplayedMonthMillis(), ((q7)object1).getYearRange().getFirst(), ((q7)object1).getYearRange().getLast(), ((q7)object1).getDisplayMode-jFl-4v0()});
            }
            case 7: {
                SaverScope saverScope2 = (SaverScope)object0;
                return CollectionsKt__CollectionsKt.listOf(new Object[]{((r8)object1).getSelectedStartDateMillis(), ((r8)object1).getSelectedEndDateMillis(), ((r8)object1).getDisplayedMonthMillis(), ((r8)object1).getYearRange().getFirst(), ((r8)object1).getYearRange().getLast(), ((r8)object1).getDisplayMode-jFl-4v0()});
            }
            case 8: {
                IntRect intRect0 = (IntRect)object0;
                IntRect intRect1 = (IntRect)object1;
                return Unit.INSTANCE;
            }
            case 9: {
                return ((IntrinsicMeasurable)object0).maxIntrinsicHeight(((Number)object1).intValue());
            }
            case 10: {
                return ((IntrinsicMeasurable)object0).maxIntrinsicWidth(((Number)object1).intValue());
            }
            case 11: {
                return ((IntrinsicMeasurable)object0).minIntrinsicHeight(((Number)object1).intValue());
            }
            case 12: {
                return ((IntrinsicMeasurable)object0).minIntrinsicWidth(((Number)object1).intValue());
            }
            case 13: {
                return ((IntrinsicMeasurable)object0).maxIntrinsicHeight(((Number)object1).intValue());
            }
            case 14: {
                return ((IntrinsicMeasurable)object0).maxIntrinsicWidth(((Number)object1).intValue());
            }
            case 15: {
                return ((IntrinsicMeasurable)object0).minIntrinsicHeight(((Number)object1).intValue());
            }
            case 16: {
                return ((IntrinsicMeasurable)object0).minIntrinsicWidth(((Number)object1).intValue());
            }
            case 17: {
                SaverScope saverScope3 = (SaverScope)object0;
                return CollectionsKt__CollectionsKt.listOf(new Object[]{((vq)object1).getHour(), ((vq)object1).e.getIntValue(), Boolean.valueOf(((vq)object1).a)});
            }
            default: {
                SaverScope saverScope0 = (SaverScope)object0;
                return CollectionsKt__CollectionsKt.listOf(new Float[]{((TopAppBarState)object1).getHeightOffsetLimit(), ((TopAppBarState)object1).getHeightOffset(), ((TopAppBarState)object1).getContentOffset()});
            }
        }
    }
}

