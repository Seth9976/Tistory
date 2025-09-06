package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import j0.g3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u000F\u001A\u00020\u000B2\b\b\u0002\u0010\u0007\u001A\u00020\u00062\'\u0010\u000E\u001A#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096A¢\u0006\u0004\b\u000F\u0010\u0010R\u001B\u0010\u0016\u001A\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001B\u0010\u0019\u001A\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001A\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001A\u001A\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0015R\u0014\u0010\u001C\u001A\u00020\u00118VX\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0015R\u0014\u0010\u001E\u001A\u00020\u00118VX\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0015¨\u0006\u001F"}, d2 = {"androidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Landroidx/compose/runtime/State;", "getCanScrollForward", "()Z", "canScrollForward", "c", "getCanScrollBackward", "canScrollBackward", "isScrollInProgress", "getLastScrolledBackward", "lastScrolledBackward", "getLastScrolledForward", "lastScrolledForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,371:1\n81#2:372\n81#2:373\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n*L\n86#1:372\n89#1:373\n*E\n"})
public final class TextFieldScrollKt.textFieldScrollable.2.wrappedScrollableState.1.1 implements ScrollableState {
    public final ScrollableState a;
    public final State b;
    public final State c;

    public TextFieldScrollKt.textFieldScrollable.2.wrappedScrollableState.1.1(ScrollableState scrollableState0, TextFieldScrollerPosition textFieldScrollerPosition0) {
        this.a = scrollableState0;
        this.b = SnapshotStateKt.derivedStateOf(new g3(textFieldScrollerPosition0, 1));
        this.c = SnapshotStateKt.derivedStateOf(new g3(textFieldScrollerPosition0, 0));
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.a.dispatchRawDelta(f);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean)this.b.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.a.getLastScrolledBackward();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.a.getLastScrolledForward();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.a.isScrollInProgress();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return this.a.scroll(mutatePriority0, function20, continuation0);
    }
}

