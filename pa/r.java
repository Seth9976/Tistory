package pa;

import aa.l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.kakao.kandinsky.border.BorderScreenKt;
import com.kakao.kandinsky.border.ComposableSingletons.BorderScreenKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import ea.a;
import ea.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class r extends Lambda implements Function2 {
    public final Function2 A;
    public final int w;
    public final State x;
    public final Function1 y;
    public final Function0 z;

    public r(State state0, Function1 function10, Function0 function00, Function2 function20, int v) {
        this.w = v;
        this.x = state0;
        this.y = function10;
        this.z = function00;
        this.A = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            Composer composer0 = (Composer)object0;
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && composer0.getSkipping()) {
                composer0.skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6A3D22FB, v, -1, "com.kakao.kandinsky.border.BorderScreen.<anonymous> (BorderScreen.kt:43)");
            }
            State state0 = this.x;
            BorderScreenKt.access$BorderList(BorderScreenKt.access$BorderScreen$lambda$0(state0).getPhoto().getOriginalUri(), BorderScreenKt.access$BorderScreen$lambda$0(state0).getBorderList(), BorderScreenKt.access$BorderScreen$lambda$0(state0).getPhoto().getBorder(), BorderScreenKt.access$BorderScreen$lambda$0(state0).getOnSelectBorder(), composer0, 0);
            boolean z = BorderScreenKt.access$BorderScreen$lambda$0(state0).isSingleImage();
            composer0.startReplaceGroup(0x1CD6F3A1);
            boolean z1 = composer0.changed(state0);
            l l0 = composer0.rememberedValue();
            if(z1 || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(state0, 27);
                composer0.updateRememberedValue(l0);
            }
            composer0.endReplaceGroup();
            composer0.startReplaceGroup(0x1CD6F4AE);
            Function1 function10 = this.y;
            boolean z2 = composer0.changed(function10);
            boolean z3 = composer0.changed(state0);
            Function0 function00 = this.z;
            boolean z4 = composer0.changed(function00);
            a a0 = composer0.rememberedValue();
            if((z2 | z3 | z4) != 0 || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(function10, function00, state0, 3);
                composer0.updateRememberedValue(a0);
            }
            composer0.endReplaceGroup();
            composer0.startReplaceGroup(0x1CD6F5E8);
            Function2 function20 = this.A;
            boolean z5 = composer0.changed(function20);
            boolean z6 = composer0.changed(state0);
            b b0 = composer0.rememberedValue();
            if(z5 || z6 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(function20, state0, 2);
                composer0.updateRememberedValue(b0);
            }
            composer0.endReplaceGroup();
            FeatureBottomBarKt.CommonFeatureBottomBar(z, l0, a0, b0, ComposableSingletons.BorderScreenKt.INSTANCE.getLambda-1$border_release(), composer0, 0x6000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        Composer composer1 = (Composer)object0;
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x57C75703, v1, -1, "com.kakao.kandinsky.resize.ResizeScreen.<anonymous>.<anonymous> (ReSizeScreen.kt:123)");
        }
        State state1 = this.x;
        long v2 = ReSizeScreenKt.access$ResizeScreen$lambda$0(state1).getOriginalSize-YbymL2g();
        int v3 = ReSizeScreenKt.access$ResizeScreen$lambda$0(state1).getModifiedWidth();
        ImmutableList immutableList0 = ReSizeScreenKt.access$ResizeScreen$lambda$0(state1).getFixedWidthList();
        boolean z7 = ReSizeScreenKt.access$ResizeScreen$lambda$0(state1).isSingleImage();
        Function0 function01 = ReSizeScreenKt.access$ResizeScreen$lambda$0(state1).getOnClickOriginalSize();
        Function0 function02 = ReSizeScreenKt.access$ResizeScreen$lambda$0(state1).getOnClickCustomInput();
        Function1 function11 = ReSizeScreenKt.access$ResizeScreen$lambda$0(state1).getOnChangeWidth();
        composer1.startReplaceGroup(0x2E05736);
        boolean z8 = composer1.changed(state1);
        l l1 = composer1.rememberedValue();
        if(z8 || l1 == Composer.Companion.getEmpty()) {
            l1 = new l(state1, 25);
            composer1.updateRememberedValue(l1);
        }
        composer1.endReplaceGroup();
        Function0 function03 = FunctionStateKt.skippableLambda(l1, composer1, 0);
        composer1.startReplaceGroup(0x2E0586E);
        Function1 function12 = this.y;
        boolean z9 = composer1.changed(function12);
        boolean z10 = composer1.changed(state1);
        Function0 function04 = this.z;
        boolean z11 = composer1.changed(function04);
        a a1 = composer1.rememberedValue();
        if((z9 | z10 | z11) != 0 || a1 == Composer.Companion.getEmpty()) {
            a1 = new a(function12, function04, state1, 2);
            composer1.updateRememberedValue(a1);
        }
        composer1.endReplaceGroup();
        Function0 function05 = FunctionStateKt.skippableLambda(a1, composer1, 0);
        composer1.startReplaceGroup(0x2E059D7);
        Function2 function21 = this.A;
        boolean z12 = composer1.changed(function21);
        boolean z13 = composer1.changed(state1);
        b b1 = composer1.rememberedValue();
        if(z12 || z13 || b1 == Composer.Companion.getEmpty()) {
            b1 = new b(function21, state1, 1);
            composer1.updateRememberedValue(b1);
        }
        composer1.endReplaceGroup();
        ReSizeScreenKt.access$DefaultTypeToolbar-SUCSAKA(null, v2, v3, immutableList0, z7, function01, function02, function11, function03, function05, FunctionStateKt.skippableLambda(b1, composer1, 0), composer1, 0, 0, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

