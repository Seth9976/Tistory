package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import g0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000F\u0010\n\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u001A\u0010\f\u001A\u00020\u000B8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "requester", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V", "", "onAttach", "()V", "updateRequester", "onDetach", "", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,179:1\n728#2,2:180\n735#2,2:182\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n*L\n164#1:180,2\n171#1:182,2\n*E\n"})
public final class BringIntoViewRequesterNode extends Node {
    public static final int $stable = 8;
    public BringIntoViewRequester n;

    public BringIntoViewRequesterNode(@NotNull BringIntoViewRequester bringIntoViewRequester0) {
        this.n = bringIntoViewRequester0;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.updateRequester(this.n);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        BringIntoViewRequester bringIntoViewRequester0 = this.n;
        if(bringIntoViewRequester0 instanceof b) {
            Intrinsics.checkNotNull(bringIntoViewRequester0, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b)bringIntoViewRequester0).a.remove(this);
        }
    }

    public final void updateRequester(@NotNull BringIntoViewRequester bringIntoViewRequester0) {
        BringIntoViewRequester bringIntoViewRequester1 = this.n;
        if(bringIntoViewRequester1 instanceof b) {
            Intrinsics.checkNotNull(bringIntoViewRequester1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b)bringIntoViewRequester1).a.remove(this);
        }
        if(bringIntoViewRequester0 instanceof b) {
            ((b)bringIntoViewRequester0).a.add(this);
        }
        this.n = bringIntoViewRequester0;
    }
}

