package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A+\u0010\u0000\u001A\u00020\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0002H\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"observeReads", "", "T", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "block", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier$Node;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class ObserverModifierNodeKt {
    public static final void observeReads(@NotNull Node modifier$Node0, @NotNull Function0 function00) {
        ObserverNodeOwnerScope observerNodeOwnerScope0 = modifier$Node0.getOwnerScope$ui_release();
        if(observerNodeOwnerScope0 == null) {
            observerNodeOwnerScope0 = new ObserverNodeOwnerScope(((ObserverModifierNode)modifier$Node0));
            modifier$Node0.setOwnerScope$ui_release(observerNodeOwnerScope0);
        }
        DelegatableNodeKt.requireOwner(modifier$Node0).getSnapshotObserver().observeReads$ui_release(observerNodeOwnerScope0, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui_release(), function00);
    }
}

