package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import b2.a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00A2\u0006\u0004\b\b\u0010\tJ\u001B\u0010\f\u001A\u00020\u0007*\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0006H$\u00A2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000E\u0010\u0004J\u000F\u0010\u0010\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0004J\r\u0010\u0011\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0011\u0010\u0004J\u001E\u0010\u0016\u001A\u00020\u0012*\u00020\n2\u0006\u0010\u0013\u001A\u00020\u0012H$\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001C\u001A\u00020\u00178\u0006\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\"\u0010$\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b%\u0010\u001F\u001A\u0004\b&\u0010!\"\u0004\b\'\u0010#R\"\u0010,\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b)\u0010\u001F\u001A\u0004\b*\u0010!\"\u0004\b+\u0010#R\"\u00100\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010\u001F\u001A\u0004\b.\u0010!\"\u0004\b/\u0010#R\"\u00104\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b1\u0010\u001F\u001A\u0004\b2\u0010!\"\u0004\b3\u0010#R\"\u00108\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b5\u0010\u001F\u001A\u0004\b6\u0010!\"\u0004\b7\u0010#R\u0014\u0010:\u001A\u00020\u001D8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010!R\u0014\u0010<\u001A\u00020\u001D8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b;\u0010!R$\u0010?\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\n8$X\u00A4\u0004\u00A2\u0006\u0006\u001A\u0004\b=\u0010>\u0082\u0001\u0002@A\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006B"}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "", "recalculateQueryOwner", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getLastCalculation", "()Ljava/util/Map;", "Landroidx/compose/ui/node/NodeCoordinator;", "alignmentLine", "getPositionFor", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/AlignmentLine;)I", "recalculate", "reset$ui_release", "reset", "onAlignmentsChanged", "Landroidx/compose/ui/geometry/Offset;", "position", "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculatePositionInParent", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "a", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "", "b", "Z", "getDirty$ui_release", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "c", "getUsedDuringParentMeasurement$ui_release", "setUsedDuringParentMeasurement$ui_release", "usedDuringParentMeasurement", "d", "getUsedDuringParentLayout$ui_release", "setUsedDuringParentLayout$ui_release", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "setPreviousUsedDuringParentLayout$ui_release", "previousUsedDuringParentLayout", "f", "getUsedByModifierMeasurement$ui_release", "setUsedByModifierMeasurement$ui_release", "usedByModifierMeasurement", "g", "getUsedByModifierLayout$ui_release", "setUsedByModifierLayout$ui_release", "usedByModifierLayout", "getQueried$ui_release", "queried", "getRequired$ui_release", "required", "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LookaheadAlignmentLines;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,247:1\n26#2:248\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines\n*L\n138#1:248\n*E\n"})
public abstract class AlignmentLines {
    public static final int $stable = 8;
    public final AlignmentLinesOwner a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public AlignmentLinesOwner h;
    public final HashMap i;

    public AlignmentLines(AlignmentLinesOwner alignmentLinesOwner0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = alignmentLinesOwner0;
        this.b = true;
        this.i = new HashMap();
    }

    public static final void access$addAlignmentLine(AlignmentLines alignmentLines0, AlignmentLine alignmentLine0, int v, NodeCoordinator nodeCoordinator0) {
        alignmentLines0.getClass();
        long v1 = OffsetKt.Offset(v, v);
        while(true) {
            v1 = alignmentLines0.calculatePositionInParent-R5De75A(nodeCoordinator0, v1);
            nodeCoordinator0 = nodeCoordinator0.getWrappedBy$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator0);
            if(Intrinsics.areEqual(nodeCoordinator0, alignmentLines0.a.getInnerCoordinator())) {
                break;
            }
            if(alignmentLines0.getAlignmentLinesMap(nodeCoordinator0).containsKey(alignmentLine0)) {
                float f = (float)alignmentLines0.getPositionFor(nodeCoordinator0, alignmentLine0);
                v1 = OffsetKt.Offset(f, f);
            }
        }
        int v2 = Math.round((alignmentLine0 instanceof HorizontalAlignmentLine ? Offset.getY-impl(v1) : Offset.getX-impl(v1)));
        HashMap hashMap0 = alignmentLines0.i;
        if(hashMap0.containsKey(alignmentLine0)) {
            v2 = AlignmentLineKt.merge(alignmentLine0, ((Number)x.getValue(hashMap0, alignmentLine0)).intValue(), v2);
        }
        hashMap0.put(alignmentLine0, v2);
    }

    public abstract long calculatePositionInParent-R5De75A(@NotNull NodeCoordinator arg1, long arg2);

    @NotNull
    public abstract Map getAlignmentLinesMap(@NotNull NodeCoordinator arg1);

    @NotNull
    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.a;
    }

    public final boolean getDirty$ui_release() {
        return this.b;
    }

    @NotNull
    public final Map getLastCalculation() {
        return this.i;
    }

    public abstract int getPositionFor(@NotNull NodeCoordinator arg1, @NotNull AlignmentLine arg2);

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.e;
    }

    // 去混淆评级： 低(40)
    public final boolean getQueried$ui_release() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean getRequired$ui_release() {
        this.recalculateQueryOwner();
        return this.h != null;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.g;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.f;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.d;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.c;
    }

    public final void onAlignmentsChanged() {
        this.b = true;
        AlignmentLinesOwner alignmentLinesOwner0 = this.a;
        AlignmentLinesOwner alignmentLinesOwner1 = alignmentLinesOwner0.getParentAlignmentLinesOwner();
        if(alignmentLinesOwner1 == null) {
            return;
        }
        if(this.c) {
            alignmentLinesOwner1.requestMeasure();
        }
        else if(this.e || this.d) {
            alignmentLinesOwner1.requestLayout();
        }
        if(this.f) {
            alignmentLinesOwner0.requestMeasure();
        }
        if(this.g) {
            alignmentLinesOwner0.requestLayout();
        }
        alignmentLinesOwner1.getAlignmentLines().onAlignmentsChanged();
    }

    public final void recalculate() {
        this.i.clear();
        a a0 = new a(this);
        this.a.forEachChildAlignmentLinesOwner(a0);
        Map map0 = this.getAlignmentLinesMap(this.a.getInnerCoordinator());
        this.i.putAll(map0);
        this.b = false;
    }

    public final void recalculateQueryOwner() {
        AlignmentLinesOwner alignmentLinesOwner0 = this.a;
        if(this.getQueried$ui_release()) {
            this.h = alignmentLinesOwner0;
        }
        else {
            AlignmentLinesOwner alignmentLinesOwner1 = alignmentLinesOwner0.getParentAlignmentLinesOwner();
            if(alignmentLinesOwner1 == null) {
                return;
            }
            alignmentLinesOwner0 = alignmentLinesOwner1.getAlignmentLines().h;
            if(alignmentLinesOwner0 != null && alignmentLinesOwner0.getAlignmentLines().getQueried$ui_release()) {
                this.h = alignmentLinesOwner0;
                return;
            }
            AlignmentLinesOwner alignmentLinesOwner2 = this.h;
            if(alignmentLinesOwner2 != null && !alignmentLinesOwner2.getAlignmentLines().getQueried$ui_release()) {
                AlignmentLinesOwner alignmentLinesOwner3 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                if(alignmentLinesOwner3 != null) {
                    AlignmentLines alignmentLines0 = alignmentLinesOwner3.getAlignmentLines();
                    if(alignmentLines0 != null) {
                        alignmentLines0.recalculateQueryOwner();
                    }
                }
                AlignmentLinesOwner alignmentLinesOwner4 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                if(alignmentLinesOwner4 == null) {
                    alignmentLinesOwner0 = null;
                }
                else {
                    AlignmentLines alignmentLines1 = alignmentLinesOwner4.getAlignmentLines();
                    alignmentLinesOwner0 = alignmentLines1 == null ? null : alignmentLines1.h;
                }
                this.h = alignmentLinesOwner0;
            }
        }
    }

    public final void reset$ui_release() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.h = null;
    }

    public final void setDirty$ui_release(boolean z) {
        this.b = z;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z) {
        this.e = z;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z) {
        this.g = z;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z) {
        this.f = z;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z) {
        this.d = z;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z) {
        this.c = z;
    }
}

