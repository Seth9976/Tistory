package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import b2.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u0014\u0010\u000B\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/ObserverModifierNode;", "observerNode", "<init>", "(Landroidx/compose/ui/node/ObserverModifierNode;)V", "a", "Landroidx/compose/ui/node/ObserverModifierNode;", "getObserverNode$ui_release", "()Landroidx/compose/ui/node/ObserverModifierNode;", "", "isValidOwnerScope", "()Z", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ObserverNodeOwnerScope implements OwnerScope {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "", "OnObserveReadsChanged", "Lkotlin/jvm/functions/Function1;", "getOnObserveReadsChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Function1 getOnObserveReadsChanged$ui_release() {
            return ObserverNodeOwnerScope.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final ObserverModifierNode a;
    public static final d b;

    static {
        ObserverNodeOwnerScope.Companion = new Companion(null);
        ObserverNodeOwnerScope.$stable = 8;
        ObserverNodeOwnerScope.b = d.B;
    }

    public ObserverNodeOwnerScope(@NotNull ObserverModifierNode observerModifierNode0) {
        this.a = observerModifierNode0;
    }

    @NotNull
    public final ObserverModifierNode getObserverNode$ui_release() {
        return this.a;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.a.getNode().isAttached();
    }
}

