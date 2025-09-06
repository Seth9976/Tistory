package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0000\u0018\u0000 p2\u00020\u0001:\u0001pB\t\b\u0016\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u001B\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u001F\u001A\u00020\b2\u0006\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001F\u0010 \u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u001C\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b \u0010!JB\u0010\'\u001A\u00020\u001B2\u0006\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020\u00172\u0006\u0010#\u001A\u00020\u00172\u0006\u0010$\u001A\u00020\u001B2\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010(\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b(\u0010\u0003J\u0017\u0010)\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b)\u0010\u0015R\"\u00100\u001A\u00020\u001B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u00108\u001A\u0010\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\b\u0018\u0001018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u00107RB\u0010@\u001A\"\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b\u0018\u0001098\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R6\u0010H\u001A\u0016\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\b\u0018\u00010A8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GRN\u0010P\u001A.\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001B\u0018\u00010I8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010X\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010Q8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bR\u0010S\u001A\u0004\bT\u0010U\"\u0004\bV\u0010WR0\u0010\\\u001A\u0010\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\b\u0018\u0001018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bY\u00103\u001A\u0004\bZ\u00105\"\u0004\b[\u00107R0\u0010`\u001A\u0010\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\b\u0018\u0001018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b]\u00103\u001A\u0004\b^\u00105\"\u0004\b_\u00107R7\u0010j\u001A\b\u0012\u0004\u0012\u00020b0a2\f\u0010c\u001A\b\u0012\u0004\u0012\u00020b0a8V@VX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\bd\u0010e\u001A\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001A\u0010m\u001A\b\u0012\u0004\u0012\u00020\u00040\u00108@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bk\u0010lR\u001A\u0010o\u001A\b\u0012\u0004\u0012\u00020\u00040a8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bn\u0010g\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006q"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "<init>", "()V", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "", "unsubscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "", "nextSelectableId", "()J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;", "selectableId", "notifyPositionChange", "(J)V", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isInTouchMode", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "(JZ)V", "newPosition", "previousPosition", "isStartHandle", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "a", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "sorted", "Lkotlin/Function1;", "e", "Lkotlin/jvm/functions/Function1;", "getOnPositionChangeCallback$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnPositionChangeCallback$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "onPositionChangeCallback", "Lkotlin/Function4;", "f", "Lkotlin/jvm/functions/Function4;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkotlin/jvm/functions/Function4;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lkotlin/jvm/functions/Function4;)V", "onSelectionUpdateStartCallback", "Lkotlin/Function2;", "g", "Lkotlin/jvm/functions/Function2;", "getOnSelectionUpdateSelectAll$foundation_release", "()Lkotlin/jvm/functions/Function2;", "setOnSelectionUpdateSelectAll$foundation_release", "(Lkotlin/jvm/functions/Function2;)V", "onSelectionUpdateSelectAll", "Lkotlin/Function6;", "h", "Lkotlin/jvm/functions/Function6;", "getOnSelectionUpdateCallback$foundation_release", "()Lkotlin/jvm/functions/Function6;", "setOnSelectionUpdateCallback$foundation_release", "(Lkotlin/jvm/functions/Function6;)V", "onSelectionUpdateCallback", "Lkotlin/Function0;", "i", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "onSelectionUpdateEndCallback", "j", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "onSelectableChangeCallback", "k", "getAfterSelectableUnsubscribe$foundation_release", "setAfterSelectableUnsubscribe$foundation_release", "afterSelectableUnsubscribe", "Landroidx/collection/LongObjectMap;", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "getSubselections", "()Landroidx/collection/LongObjectMap;", "setSubselections", "(Landroidx/collection/LongObjectMap;)V", "subselections", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "getSelectableMap$foundation_release", "selectableMap", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,230:1\n81#2:231\n107#2,2:232\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n115#1:231\n115#1:232,2\n*E\n"})
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return SelectionRegistrarImpl.m;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public boolean a;
    public final ArrayList b;
    public final MutableLongObjectMap c;
    public final AtomicLong d;
    public Function1 e;
    public Function4 f;
    public Function2 g;
    public Function6 h;
    public Function0 i;
    public Function1 j;
    public Function1 k;
    public final MutableState l;
    public static final Saver m;

    static {
        SelectionRegistrarImpl.Companion = new Companion(null);
        SelectionRegistrarImpl.$stable = 8;
        SelectionRegistrarImpl.m = SaverKt.Saver(o1.w, v0.z);
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }

    public SelectionRegistrarImpl(long v) {
        this.b = new ArrayList();
        this.c = LongObjectMapKt.mutableLongObjectMapOf();
        this.d = new AtomicLong(v);
        this.l = SnapshotStateKt.mutableStateOf$default(LongObjectMapKt.emptyLongObjectMap(), null, 2, null);
    }

    public SelectionRegistrarImpl(long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v);
    }

    @Nullable
    public final Function1 getAfterSelectableUnsubscribe$foundation_release() {
        return this.k;
    }

    @Nullable
    public final Function1 getOnPositionChangeCallback$foundation_release() {
        return this.e;
    }

    @Nullable
    public final Function1 getOnSelectableChangeCallback$foundation_release() {
        return this.j;
    }

    @Nullable
    public final Function6 getOnSelectionUpdateCallback$foundation_release() {
        return this.h;
    }

    @Nullable
    public final Function0 getOnSelectionUpdateEndCallback$foundation_release() {
        return this.i;
    }

    @Nullable
    public final Function2 getOnSelectionUpdateSelectAll$foundation_release() {
        return this.g;
    }

    @Nullable
    public final Function4 getOnSelectionUpdateStartCallback$foundation_release() {
        return this.f;
    }

    @NotNull
    public final LongObjectMap getSelectableMap$foundation_release() {
        return this.c;
    }

    @NotNull
    public final List getSelectables$foundation_release() {
        return this.b;
    }

    public final boolean getSorted$foundation_release() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    @NotNull
    public LongObjectMap getSubselections() {
        return (LongObjectMap)this.l.getValue();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        AtomicLong atomicLong0 = this.d;
        long v;
        for(v = atomicLong0.getAndIncrement(); v == 0L; v = atomicLong0.getAndIncrement()) {
        }
        return v;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long v) {
        this.a = false;
        Function1 function10 = this.e;
        if(function10 != null) {
            function10.invoke(v);
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long v) {
        Function1 function10 = this.j;
        if(function10 != null) {
            function10.invoke(v);
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public boolean notifySelectionUpdate-njBpvok(@NotNull LayoutCoordinates layoutCoordinates0, long v, long v1, boolean z, @NotNull SelectionAdjustment selectionAdjustment0, boolean z1) {
        return this.h == null ? true : ((Boolean)this.h.invoke(Boolean.valueOf(z1), layoutCoordinates0, Offset.box-impl(v), Offset.box-impl(v1), Boolean.valueOf(z), selectionAdjustment0)).booleanValue();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        Function0 function00 = this.i;
        if(function00 != null) {
            function00.invoke();
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long v, boolean z) {
        Function2 function20 = this.g;
        if(function20 != null) {
            function20.invoke(Boolean.valueOf(z), v);
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateStart-ubNVwUQ(@NotNull LayoutCoordinates layoutCoordinates0, long v, @NotNull SelectionAdjustment selectionAdjustment0, boolean z) {
        Function4 function40 = this.f;
        if(function40 != null) {
            function40.invoke(Boolean.valueOf(z), layoutCoordinates0, Offset.box-impl(v), selectionAdjustment0);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(@Nullable Function1 function10) {
        this.k = function10;
    }

    public final void setOnPositionChangeCallback$foundation_release(@Nullable Function1 function10) {
        this.e = function10;
    }

    public final void setOnSelectableChangeCallback$foundation_release(@Nullable Function1 function10) {
        this.j = function10;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(@Nullable Function6 function60) {
        this.h = function60;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(@Nullable Function0 function00) {
        this.i = function00;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(@Nullable Function2 function20) {
        this.g = function20;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(@Nullable Function4 function40) {
        this.f = function40;
    }

    public final void setSorted$foundation_release(boolean z) {
        this.a = z;
    }

    public void setSubselections(@NotNull LongObjectMap longObjectMap0) {
        this.l.setValue(longObjectMap0);
    }

    @NotNull
    public final List sort(@NotNull LayoutCoordinates layoutCoordinates0) {
        if(!this.a) {
            n1 n10 = new n1(new p1(layoutCoordinates0), 0);
            n.sortWith(this.b, n10);
            this.a = true;
        }
        return this.getSelectables$foundation_release();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    @NotNull
    public Selectable subscribe(@NotNull Selectable selectable0) {
        if(selectable0.getSelectableId() == 0L) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable0.getSelectableId()).toString());
        }
        long v = selectable0.getSelectableId();
        MutableLongObjectMap mutableLongObjectMap0 = this.c;
        if(mutableLongObjectMap0.containsKey(v)) {
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable0 + ".selectableId has already subscribed.").toString());
        }
        mutableLongObjectMap0.set(selectable0.getSelectableId(), selectable0);
        this.b.add(selectable0);
        this.a = false;
        return selectable0;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(@NotNull Selectable selectable0) {
        long v = selectable0.getSelectableId();
        MutableLongObjectMap mutableLongObjectMap0 = this.c;
        if(!mutableLongObjectMap0.containsKey(v)) {
            return;
        }
        this.b.remove(selectable0);
        mutableLongObjectMap0.remove(selectable0.getSelectableId());
        Function1 function10 = this.k;
        if(function10 != null) {
            function10.invoke(selectable0.getSelectableId());
        }
    }
}

