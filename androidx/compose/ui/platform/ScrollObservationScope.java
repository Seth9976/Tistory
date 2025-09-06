package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR$\u0010\b\u001A\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u0017\u001A\u0004\b\u001D\u0010\u0019\"\u0004\b\u001E\u0010\u001BR$\u0010\n\u001A\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u000B\u001A\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010 \u001A\u0004\b&\u0010\"\"\u0004\b\'\u0010$R\u0014\u0010)\u001A\u00020(8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/ScrollAxisRange;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "a", "I", "getSemanticsNodeId", "()I", "b", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "c", "Ljava/lang/Float;", "getOldXValue", "()Ljava/lang/Float;", "setOldXValue", "(Ljava/lang/Float;)V", "d", "getOldYValue", "setOldYValue", "e", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "()Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "f", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "", "isValidOwnerScope", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollObservationScope implements OwnerScope {
    public static final int $stable = 8;
    public final int a;
    public final List b;
    public Float c;
    public Float d;
    public ScrollAxisRange e;
    public ScrollAxisRange f;

    public ScrollObservationScope(int v, @NotNull List list0, @Nullable Float float0, @Nullable Float float1, @Nullable ScrollAxisRange scrollAxisRange0, @Nullable ScrollAxisRange scrollAxisRange1) {
        this.a = v;
        this.b = list0;
        this.c = float0;
        this.d = float1;
        this.e = scrollAxisRange0;
        this.f = scrollAxisRange1;
    }

    @NotNull
    public final List getAllScopes() {
        return this.b;
    }

    @Nullable
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.e;
    }

    @Nullable
    public final Float getOldXValue() {
        return this.c;
    }

    @Nullable
    public final Float getOldYValue() {
        return this.d;
    }

    public final int getSemanticsNodeId() {
        return this.a;
    }

    @Nullable
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.f;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.b.contains(this);
    }

    public final void setHorizontalScrollAxisRange(@Nullable ScrollAxisRange scrollAxisRange0) {
        this.e = scrollAxisRange0;
    }

    public final void setOldXValue(@Nullable Float float0) {
        this.c = float0;
    }

    public final void setOldYValue(@Nullable Float float0) {
        this.d = float0;
    }

    public final void setVerticalScrollAxisRange(@Nullable ScrollAxisRange scrollAxisRange0) {
        this.f = scrollAxisRange0;
    }
}

