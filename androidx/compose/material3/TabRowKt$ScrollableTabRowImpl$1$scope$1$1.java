package androidx.compose.material3;

import androidx.compose.foundation.text.selection.w0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u00012\u00020\u0002JD\u0010\r\u001A\u00020\u0003*\u00020\u00032/\u0010\f\u001A+\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ#\u0010\u0013\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001D\u0010\u0017\u001A\u00020\u00162\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u001E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00198\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"androidx/compose/material3/TabRowKt$ScrollableTabRowImpl$1$scope$1$1", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/material3/TabPositionsHolder;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "", "Landroidx/compose/material3/TabPosition;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measure", "tabIndicatorLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;)Landroidx/compose/ui/Modifier;", "", "selectedTabIndex", "", "matchContentSize", "tabIndicatorOffset", "(Landroidx/compose/ui/Modifier;IZ)Landroidx/compose/ui/Modifier;", "positions", "", "setTabPositions", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MutableState;", "a", "Landroidx/compose/runtime/MutableState;", "getTabPositions", "()Landroidx/compose/runtime/MutableState;", "tabPositions", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TabRowKt.ScrollableTabRowImpl.1.scope.1.1 implements TabIndicatorScope, TabPositionsHolder {
    public final MutableState a;

    public TabRowKt.ScrollableTabRowImpl.1.scope.1.1() {
        this.a = SnapshotStateKt.mutableStateOf$default(CollectionsKt__CollectionsKt.emptyList(), null, 2, null);
    }

    @NotNull
    public final MutableState getTabPositions() {
        return this.a;
    }

    @Override  // androidx.compose.material3.TabPositionsHolder
    public void setTabPositions(@NotNull List list0) {
        this.a.setValue(list0);
    }

    @Override  // androidx.compose.material3.TabIndicatorScope
    @NotNull
    public Modifier tabIndicatorLayout(@NotNull Modifier modifier0, @NotNull Function4 function40) {
        return LayoutModifierKt.layout(modifier0, new w0(2, function40, this));
    }

    @Override  // androidx.compose.material3.TabIndicatorScope
    @NotNull
    public Modifier tabIndicatorOffset(@NotNull Modifier modifier0, int v, boolean z) {
        return modifier0.then(new TabIndicatorModifier(this.a, v, z));
    }
}

