package androidx.compose.material3;

import a2.b;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;BA\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\r\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010H\u0086@\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0010H\u0086@\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0010H\u0086@\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0010H\u0086@\u00A2\u0006\u0004\b\u0015\u0010\u0012J\"\u0010\u001A\u001A\u00020\u00102\u0006\u0010\u0016\u001A\u00020\u00062\b\b\u0002\u0010\u0017\u001A\u00020\rH\u0080@\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001D\u001A\u00020\u00102\u0006\u0010\u0016\u001A\u00020\u0006H\u0080@\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0018\u0010 \u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\rH\u0080@\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u001A\u0010\n\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b%\u0010\"\u001A\u0004\b&\u0010$R(\u0010.\u001A\b\u0012\u0004\u0012\u00020\u00060\'8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u00101\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b/\u00100R\u0011\u0010\u0016\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b2\u00100R\u0011\u00103\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b3\u0010$R\u0011\u00105\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b4\u0010$R\u0011\u00107\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b6\u0010$R\u0016\u0010:\u001A\u0004\u0018\u00010\r8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b8\u00109\u00A8\u0006<"}, d2 = {"Landroidx/compose/material3/SheetState;", "", "", "skipPartiallyExpanded", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/material3/SheetValue;", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "skipHiddenState", "<init>", "(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;Z)V", "", "requireOffset", "()F", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "partialExpand", "show", "hide", "targetValue", "velocity", "animateTo$material3_release", "(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material3_release", "(Landroidx/compose/material3/SheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "settle$material3_release", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settle", "a", "Z", "getSkipPartiallyExpanded$material3_release", "()Z", "b", "getSkipHiddenState$material3_release", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "c", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "setAnchoredDraggableState$material3_release", "(Landroidx/compose/material3/internal/AnchoredDraggableState;)V", "anchoredDraggableState", "getCurrentValue", "()Landroidx/compose/material3/SheetValue;", "currentValue", "getTargetValue", "isVisible", "getHasExpandedState", "hasExpandedState", "getHasPartiallyExpandedState", "hasPartiallyExpandedState", "getOffset$material3_release", "()Ljava/lang/Float;", "offset", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SheetState {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JE\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "", "skipPartiallyExpanded", "Lkotlin/Function1;", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "Landroidx/compose/ui/unit/Density;", "density", "skipHiddenState", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", "Saver", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/unit/Density;Z)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(boolean z, @NotNull Function1 function10, @NotNull Density density0, boolean z1) {
            ik ik0 = new ik(z, function10, density0, z1);
            return SaverKt.Saver(hk.w, ik0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final boolean a;
    public final boolean b;
    public AnchoredDraggableState c;

    static {
        SheetState.Companion = new Companion(null);
    }

    public SheetState(boolean z, @NotNull Density density0, @NotNull SheetValue sheetValue0, @NotNull Function1 function10, boolean z1) {
        this.a = z;
        this.b = z1;
        if(z && sheetValue0 == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if(z1 && sheetValue0 == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.c = new AnchoredDraggableState(sheetValue0, new jk(density0, 0), new b(density0, 9), SheetDefaultsKt.b, function10);
    }

    public SheetState(boolean z, Density density0, SheetValue sheetValue0, Function1 function10, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            sheetValue0 = SheetValue.Hidden;
        }
        if((v & 8) != 0) {
            function10 = a5.W;
        }
        if((v & 16) != 0) {
            z1 = false;
        }
        this(z, density0, sheetValue0, function10, z1);
    }

    @Nullable
    public final Object animateTo$material3_release(@NotNull SheetValue sheetValue0, float f, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo(this.c, sheetValue0, f, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateTo$material3_release$default(SheetState sheetState0, SheetValue sheetValue0, float f, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            f = sheetState0.c.getLastVelocity();
        }
        return sheetState0.animateTo$material3_release(sheetValue0, f, continuation0);
    }

    @Nullable
    public final Object expand(@NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.c, SheetValue.Expanded, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState getAnchoredDraggableState$material3_release() {
        return this.c;
    }

    @NotNull
    public final SheetValue getCurrentValue() {
        return (SheetValue)this.c.getCurrentValue();
    }

    public final boolean getHasExpandedState() {
        return this.c.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.c.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    @Nullable
    public final Float getOffset$material3_release() {
        return this.c.getOffset();
    }

    public final boolean getSkipHiddenState$material3_release() {
        return this.b;
    }

    public final boolean getSkipPartiallyExpanded$material3_release() {
        return this.a;
    }

    @NotNull
    public final SheetValue getTargetValue() {
        return (SheetValue)this.c.getTargetValue();
    }

    @Nullable
    public final Object hide(@NotNull Continuation continuation0) {
        if(this.b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object object0 = SheetState.animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final boolean isVisible() {
        return this.c.getCurrentValue() != SheetValue.Hidden;
    }

    @Nullable
    public final Object partialExpand(@NotNull Continuation continuation0) {
        if(this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object object0 = SheetState.animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final float requireOffset() {
        return this.c.requireOffset();
    }

    public final void setAnchoredDraggableState$material3_release(@NotNull AnchoredDraggableState anchoredDraggableState0) {
        this.c = anchoredDraggableState0;
    }

    @Nullable
    public final Object settle$material3_release(float f, @NotNull Continuation continuation0) {
        Object object0 = this.c.settle(f, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object show(@NotNull Continuation continuation0) {
        Object object0 = SheetState.animateTo$material3_release$default(this, (this.getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded), 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material3_release(@NotNull SheetValue sheetValue0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.snapTo(this.c, sheetValue0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

