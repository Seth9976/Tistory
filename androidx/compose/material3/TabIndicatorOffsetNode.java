package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ&\u0010\u0015\u001A\u00020\u0012*\u00020\r2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\"\u0010\b\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\"\u0010\n\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "<init>", "(Landroidx/compose/runtime/State;IZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "n", "Landroidx/compose/runtime/State;", "getTabPositionsState", "()Landroidx/compose/runtime/State;", "setTabPositionsState", "(Landroidx/compose/runtime/State;)V", "o", "I", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "p", "Z", "getFollowContentSize", "()Z", "setFollowContentSize", "(Z)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabIndicatorOffsetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1355:1\n1#2:1356\n*E\n"})
public final class TabIndicatorOffsetNode extends Node implements LayoutModifierNode {
    public static final int $stable = 8;
    public State n;
    public int o;
    public boolean p;
    public Animatable q;
    public Animatable r;
    public Dp s;
    public Dp t;

    public TabIndicatorOffsetNode(@NotNull State state0, int v, boolean z) {
        this.n = state0;
        this.o = v;
        this.p = z;
    }

    public final boolean getFollowContentSize() {
        return this.p;
    }

    public final int getSelectedTabIndex() {
        return this.o;
    }

    @NotNull
    public final State getTabPositionsState() {
        return this.n;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        if(((List)this.n.getValue()).isEmpty()) {
            return MeasureScope.layout$default(measureScope0, 0, 0, null, xm.w, 4, null);
        }
        float f = this.p ? ((TabPosition)((List)this.n.getValue()).get(this.o)).getContentWidth-D9Ej5fM() : ((TabPosition)((List)this.n.getValue()).get(this.o)).getWidth-D9Ej5fM();
        Dp dp0 = this.t;
        if(dp0 == null) {
            this.t = Dp.box-impl(f);
        }
        else {
            Animatable animatable0 = this.r;
            if(animatable0 == null) {
                Intrinsics.checkNotNull(dp0);
                animatable0 = new Animatable(dp0, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.r = animatable0;
            }
            if(!Dp.equals-impl0(f, ((Dp)animatable0.getTargetValue()).unbox-impl())) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new ym(animatable0, f, null), 3, null);
            }
        }
        float f1 = ((TabPosition)((List)this.n.getValue()).get(this.o)).getLeft-D9Ej5fM();
        Dp dp1 = this.s;
        if(dp1 == null) {
            this.s = Dp.box-impl(f1);
        }
        else {
            Animatable animatable1 = this.q;
            if(animatable1 == null) {
                Intrinsics.checkNotNull(dp1);
                animatable1 = new Animatable(dp1, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.q = animatable1;
            }
            if(!Dp.equals-impl0(f1, ((Dp)animatable1.getTargetValue()).unbox-impl())) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new zm(animatable1, f1, null), 3, null);
            }
        }
        Animatable animatable2 = this.q;
        if(animatable2 != null) {
            f1 = ((Dp)animatable2.getValue()).unbox-impl();
        }
        Animatable animatable3 = this.r;
        if(animatable3 != null) {
            f = ((Dp)animatable3.getValue()).unbox-impl();
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, measureScope0.roundToPx-0680j_4(f), measureScope0.roundToPx-0680j_4(f), 0, 0, 12, null));
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new an(placeable0, measureScope0, f1), 4, null);
    }

    public final void setFollowContentSize(boolean z) {
        this.p = z;
    }

    public final void setSelectedTabIndex(int v) {
        this.o = v;
    }

    public final void setTabPositionsState(@NotNull State state0) {
        this.n = state0;
    }
}

