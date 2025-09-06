package z1;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final List w;

    public j(List list0) {
        this.w = list0;
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
            ComposerKt.traceEventStart(0x8B8DA549, v, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:181)");
        }
        List list0 = this.w;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Function2 function20 = (Function2)list0.get(v2);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getVirtualConstructor();
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
            Function2 function21 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
                a.t(v3, composer0, v3, function21);
            }
            function20.invoke(((Composer)object0), 0);
            ((Composer)object0).endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

