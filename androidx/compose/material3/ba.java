package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ba extends Lambda implements Function2 {
    public final Modifier w;
    public final WindowInsets x;
    public final int y;
    public final Function2 z;

    public ba(Modifier modifier0, WindowInsets windowInsets0, int v, Function2 function20) {
        this.w = modifier0;
        this.x = windowInsets0;
        this.y = v;
        this.z = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        h9 h90;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5DCCB94A, v, -1, "androidx.compose.material3.ExpressiveNavigationBar.<anonymous> (ExpressiveNavigationBar.kt:93)");
        }
        Modifier modifier0 = SelectableGroupKt.selectableGroup(SizeKt.defaultMinSize-VpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(this.w, this.x), 0.0f, 0.0f, 1, null));
        int v1 = this.y;
        if(NavigationBarArrangement.equals-impl0(v1, 0)) {
            h90 = new h9();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        else if(NavigationBarArrangement.equals-impl0(v1, 1)) {
            h90 = new a3();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        else {
            throw new IllegalArgumentException("Invalid ItemsArrangement value.");
        }
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
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
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, h90, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        Integer integer0 = r0.a.l(composeUiNode$Companion0, composer0, modifier1, 0);
        if(r0.a.B(this.z, ((Composer)object0), integer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

