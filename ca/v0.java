package ca;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.selection.w0;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function3 {
    public final Function4 A;
    public final int B;
    public final State C;
    public final MutableState D;
    public final Function1 E;
    public final Orientation w;
    public final PagerState x;
    public final Function2 y;
    public final Function4 z;

    public v0(Orientation orientation0, PagerState pagerState0, Function2 function20, Function4 function40, Function4 function41, int v, State state0, MutableState mutableState0, Function1 function10) {
        this.w = orientation0;
        this.x = pagerState0;
        this.y = function20;
        this.z = function40;
        this.A = function41;
        this.B = v;
        this.C = state0;
        this.D = mutableState0;
        this.E = function10;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9C570E7E, v, -1, "com.kakao.kandinsky.designsystem.common.ItemSlider.<anonymous> (ItemSlider.kt:120)");
        }
        composer0.startMovableGroup(0x5CA29CF6, this.w);
        ItemSliderKt.access$Pager(((BoxWithConstraintsScope)object0), this.w, this.x, this.y, this.z, this.A, composer0, v & 14, 0);
        composer0.endMovableGroup();
        Modifier modifier0 = ((BoxWithConstraintsScope)object0).align(Modifier.Companion, Alignment.Companion.getCenter());
        EnterTransition enterTransition0 = EnterTransition.Companion.getNone();
        ExitTransition exitTransition0 = ExitTransition.Companion.getNone();
        boolean z = ItemSliderKt.access$ItemSlider$lambda$4(this.D);
        PagerState pagerState0 = this.x;
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(360169814, true, new w0(4, pagerState0, this.E), composer0, 54);
        MutableState mutableState0 = this.D;
        AnimatedVisibilityKt.AnimatedVisibility(z, modifier0, enterTransition0, exitTransition0, null, composableLambda0, composer0, 0x30000, 16);
        BoxKt.Box(BorderKt.border-xT4_qwU(SizeKt.size-3ABfNKs(((BoxWithConstraintsScope)object0).align(Modifier.Companion, Alignment.Companion.getCenter()), 58.0f), 1.0f, MaterialTheme.INSTANCE.getColorScheme(composer0, MaterialTheme.$stable).getOnSurface-0d7_KjU(), ItemSliderKt.access$getItemShape$p()), composer0, 0);
        int v1 = this.B;
        Integer integer0 = v1;
        composer0.startReplaceGroup(0x5CA2A0E5);
        boolean z1 = composer0.changed(pagerState0);
        boolean z2 = composer0.changed(v1);
        s0 s00 = composer0.rememberedValue();
        if(z1 || z2 || s00 == Composer.Companion.getEmpty()) {
            s00 = new s0(pagerState0, v1, null);
            composer0.updateRememberedValue(s00);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect(integer0, s00, composer0, 0x40);
        Boolean boolean0 = Boolean.valueOf(ItemSliderKt.access$ItemSlider$lambda$2(this.C));
        Integer integer1 = pagerState0.getTargetPage();
        composer0.startReplaceGroup(0x5CA2A1EC);
        boolean z3 = composer0.changed(v1);
        boolean z4 = composer0.changed(pagerState0);
        boolean z5 = composer0.changed(this.y);
        boolean z6 = composer0.changed(this.C);
        t0 t00 = composer0.rememberedValue();
        if((z3 | z4 | z5 | z6) != 0 || t00 == Composer.Companion.getEmpty()) {
            t00 = new t0(this.B, this.x, this.y, this.C, null);
            composer0.updateRememberedValue(t00);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect(boolean0, integer1, t00, composer0, 0x200);
        Boolean boolean1 = Boolean.valueOf(pagerState0.isScrollInProgress());
        composer0.startReplaceGroup(0x5CA2A2BD);
        boolean z7 = composer0.changed(pagerState0);
        u0 u00 = composer0.rememberedValue();
        if(z7 || u00 == Composer.Companion.getEmpty()) {
            u00 = new u0(pagerState0, mutableState0, null);
            composer0.updateRememberedValue(u00);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect(boolean1, u00, composer0, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

