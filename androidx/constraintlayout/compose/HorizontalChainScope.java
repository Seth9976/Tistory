package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@LayoutScopeMarker
@Stable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001A\u0010\u0002\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR,\u0010\u0011\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0017\u001A\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001D\u001A\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010 \u001A\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001A\u001A\u0004\b\u001F\u0010\u001CR\u0017\u0010#\u001A\u00020\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001A\u001A\u0004\b\"\u0010\u001CR\u0017\u0010&\u001A\u00020\u00188\u0006¢\u0006\f\n\u0004\b$\u0010\u001A\u001A\u0004\b%\u0010\u001C¨\u0006\'"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalChainScope;", "", "id", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "b", "Ljava/util/List;", "getTasks$compose_release", "()Ljava/util/List;", "tasks", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "c", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "parent", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "d", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getStart", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "start", "e", "getAbsoluteLeft", "absoluteLeft", "f", "getEnd", "end", "g", "getAbsoluteRight", "absoluteRight", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class HorizontalChainScope {
    public final Object a;
    public final ArrayList b;
    public final ConstrainedLayoutReference c;
    public final e d;
    public final e e;
    public final e f;
    public final e g;

    public HorizontalChainScope(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "id");
        super();
        this.a = object0;
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Intrinsics.checkNotNullExpressionValue(State.PARENT, "PARENT");
        this.c = new ConstrainedLayoutReference(State.PARENT);
        this.d = new e(arrayList0, object0, -2);
        this.e = new e(arrayList0, object0, 0);
        this.f = new e(arrayList0, object0, -1);
        this.g = new e(arrayList0, object0, 1);
    }

    @NotNull
    public final VerticalAnchorable getAbsoluteLeft() {
        return this.e;
    }

    @NotNull
    public final VerticalAnchorable getAbsoluteRight() {
        return this.g;
    }

    @NotNull
    public final VerticalAnchorable getEnd() {
        return this.f;
    }

    @NotNull
    public final Object getId$compose_release() {
        return this.a;
    }

    @NotNull
    public final ConstrainedLayoutReference getParent() {
        return this.c;
    }

    @NotNull
    public final VerticalAnchorable getStart() {
        return this.d;
    }

    @NotNull
    public final List getTasks$compose_release() {
        return this.b;
    }
}

