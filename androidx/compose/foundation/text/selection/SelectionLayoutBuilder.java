package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u0016\u0010\u000E\u001A\u0012\u0012\u0004\u0012\u00020\f0\u000Bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010!\u001A\u00020 2\u0006\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0019\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00152\u0006\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u001C\u001A\u00020\u00172\u0006\u0010\u001D\u001A\u00020\u00152\u0006\u0010\u001F\u001A\u00020\u001E¢\u0006\u0004\b!\u0010\"R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\'\u0010$\u001A\u0004\b(\u0010&R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b\b\u0010/R\u0019\u0010\n\u001A\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\'\u0010\u000E\u001A\u0012\u0012\u0004\u0012\u00020\f0\u000Bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "previousHandlePosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "<init>", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLandroidx/compose/foundation/text/selection/Selection;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "build", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "selectableId", "", "rawStartHandleOffset", "Landroidx/compose/foundation/text/selection/Direction;", "startXHandleDirection", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "appendInfo", "(JILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/SelectableInfo;", "a", "J", "getCurrentPosition-F1C5BW0", "()J", "b", "getPreviousHandlePosition-F1C5BW0", "c", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "d", "Z", "()Z", "e", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "f", "Ljava/util/Comparator;", "getSelectableIdOrderingComparator", "()Ljava/util/Comparator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionLayoutBuilder {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Direction.values().length];
            try {
                arr_v[Direction.BEFORE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Direction.ON.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Direction.AFTER.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final long a;
    public final long b;
    public final LayoutCoordinates c;
    public final boolean d;
    public final Selection e;
    public final Comparator f;
    public final MutableLongIntMap g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public SelectionLayoutBuilder(long v, long v1, LayoutCoordinates layoutCoordinates0, boolean z, Selection selection0, Comparator comparator0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = layoutCoordinates0;
        this.d = z;
        this.e = selection0;
        this.f = comparator0;
        this.g = LongIntMapKt.mutableLongIntMapOf();
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int v, Direction direction0, Direction direction1) {
        if(v != -1) {
            return v;
        }
        switch(WhenMappings.$EnumSwitchMapping$0[SelectionLayoutKt.resolve2dDirection(direction0, direction1).ordinal()]) {
            case 1: {
                return this.k - 1;
            }
            case 2: {
                return this.k;
            }
            case 3: {
                return -1;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final SelectableInfo appendInfo(long v, int v1, @NotNull Direction direction0, @NotNull Direction direction1, int v2, @NotNull Direction direction2, @NotNull Direction direction3, int v3, @NotNull TextLayoutResult textLayoutResult0) {
        this.k += 2;
        SelectableInfo selectableInfo0 = new SelectableInfo(v, this.k, v1, v2, v3, textLayoutResult0);
        this.i = this.a(this.i, direction0, direction1);
        this.j = this.a(this.j, direction2, direction3);
        this.g.set(v, this.h.size());
        this.h.add(selectableInfo0);
        return selectableInfo0;
    }

    @NotNull
    public final SelectionLayout build() {
        int v = this.k + 1;
        ArrayList arrayList0 = this.h;
        switch(arrayList0.size()) {
            case 0: {
                throw new IllegalStateException("SelectionLayout must not be empty.");
            }
            case 1: {
                Object object0 = CollectionsKt___CollectionsKt.single(arrayList0);
                int v2 = this.i == -1 ? v : this.i;
                return this.j == -1 ? new s1(this.d, v2, v, this.e, ((SelectableInfo)object0)) : new s1(this.d, v2, this.j, this.e, ((SelectableInfo)object0));
            }
            default: {
                int v1 = this.i == -1 ? v : this.i;
                return this.j == -1 ? new m(this.g, arrayList0, v1, v, this.d, this.e) : new m(this.g, arrayList0, v1, this.j, this.d, this.e);
            }
        }
    }

    @NotNull
    public final LayoutCoordinates getContainerCoordinates() {
        return this.c;
    }

    public final long getCurrentPosition-F1C5BW0() {
        return this.a;
    }

    public final long getPreviousHandlePosition-F1C5BW0() {
        return this.b;
    }

    @Nullable
    public final Selection getPreviousSelection() {
        return this.e;
    }

    @NotNull
    public final Comparator getSelectableIdOrderingComparator() {
        return this.f;
    }

    public final boolean isStartHandle() {
        return this.d;
    }
}

