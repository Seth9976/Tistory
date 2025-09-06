package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class od extends Lambda implements Function2 {
    public final CoroutineScope A;
    public final Function1 B;
    public final Modifier C;
    public final float D;
    public final Shape E;
    public final long F;
    public final long G;
    public final float H;
    public final Function2 I;
    public final Function2 J;
    public final Function3 K;
    public final long w;
    public final Function0 x;
    public final SheetState y;
    public final Animatable z;

    public od(long v, Function0 function00, SheetState sheetState0, Animatable animatable0, CoroutineScope coroutineScope0, Function1 function10, Modifier modifier0, float f, Shape shape0, long v1, long v2, float f1, Function2 function20, Function2 function21, Function3 function30) {
        this.w = v;
        this.x = function00;
        this.y = sheetState0;
        this.z = animatable0;
        this.A = coroutineScope0;
        this.B = function10;
        this.C = modifier0;
        this.D = f;
        this.E = shape0;
        this.F = v1;
        this.G = v2;
        this.H = f1;
        this.I = function20;
        this.J = function21;
        this.K = function30;
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
            ComposerKt.traceEventStart(-314673510, v, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
        }
        Modifier modifier0 = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null)), false, a5.O, 1, null);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        boolean z = this.y.getTargetValue() != SheetValue.Hidden;
        ModalBottomSheetKt.access$Scrim-3J-VO9M(this.w, this.x, z, ((Composer)object0), 0);
        ModalBottomSheetKt.ModalBottomSheetContent-IQkwcL4(BoxScopeInstance.INSTANCE, this.z, this.A, this.x, this.B, this.C, this.y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, ((Composer)object0), 6 | Animatable.$stable << 3, 0, 0);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

