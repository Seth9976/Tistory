package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;

public final class w0 extends Lambda implements Function2 {
    public final TextStyle A;
    public final float B;
    public final boolean C;
    public final Function2 D;
    public final ComposableLambda E;
    public final float F;
    public final TopAppBarScrollBehavior G;
    public final Function2 H;
    public final TextStyle I;
    public final float J;
    public final IntRef K;
    public final boolean L;
    public final WindowInsets w;
    public final float x;
    public final TopAppBarColors y;
    public final Function2 z;

    public w0(WindowInsets windowInsets0, float f, TopAppBarColors topAppBarColors0, Function2 function20, TextStyle textStyle0, float f1, boolean z, Function2 function21, ComposableLambda composableLambda0, float f2, TopAppBarScrollBehavior topAppBarScrollBehavior0, Function2 function22, TextStyle textStyle1, float f3, IntRef ref$IntRef0, boolean z1) {
        this.w = windowInsets0;
        this.x = f;
        this.y = topAppBarColors0;
        this.z = function20;
        this.A = textStyle0;
        this.B = f1;
        this.C = z;
        this.D = function21;
        this.E = composableLambda0;
        this.F = f2;
        this.G = topAppBarScrollBehavior0;
        this.H = function22;
        this.I = textStyle1;
        this.J = f3;
        this.K = ref$IntRef0;
        this.L = z1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350062619, v, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2043)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), Alignment.Companion.getStart(), ((Composer)object0), 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier$Companion0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function00);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object0));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        Modifier modifier1 = SizeKt.heightIn-VpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(modifier$Companion0, this.w)), 0.0f, this.x, 1, null);
        v0 v00 = new v0();  // 初始化器: Ljava/lang/Object;-><init>()V
        TopAppBarColors topAppBarColors0 = this.y;
        AppBarKt.access$TopAppBarLayout-kXwM9vE(modifier1, v00, this.y.getNavigationIconContentColor-0d7_KjU(), this.y.getTitleContentColor-0d7_KjU(), this.y.getActionIconContentColor-0d7_KjU(), this.z, this.A, this.B, arrangement0.getCenter(), arrangement0.getStart(), 0, this.C, this.D, this.E, ((Composer)object0), 0x36000030, 0xC06);
        Modifier modifier2 = SizeKt.heightIn-VpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(modifier$Companion0, WindowInsetsKt.only-bOOhFvg(this.w, 15))), 0.0f, this.F - this.x, 1, null);
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = this.G;
        boolean z = ((Composer)object0).changed(topAppBarScrollBehavior0);
        k0 k00 = ((Composer)object0).rememberedValue();
        if(z || k00 == Composer.Companion.getEmpty()) {
            k00 = new k0(topAppBarScrollBehavior0, 1);
            ((Composer)object0).updateRememberedValue(k00);
        }
        AppBarKt.access$TopAppBarLayout-kXwM9vE(modifier2, k00, topAppBarColors0.getNavigationIconContentColor-0d7_KjU(), topAppBarColors0.getTitleContentColor-0d7_KjU(), topAppBarColors0.getActionIconContentColor-0d7_KjU(), this.H, this.I, this.J, arrangement0.getBottom(), arrangement0.getStart(), this.K.element, this.L, ComposableSingletons.AppBarKt.INSTANCE.getLambda-17$material3_release(), ComposableSingletons.AppBarKt.INSTANCE.getLambda-18$material3_release(), ((Composer)object0), 0x36000000, 0xD80);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

