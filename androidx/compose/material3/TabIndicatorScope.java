package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\bg\u0018\u00002\u00020\u0001J=\u0010\u0002\u001A\u00020\u0003*\u00020\u00032/\u0010\u0004\u001A+\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000B0\u0005¢\u0006\u0002\b\fH&J\u001E\u0010\r\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/TabIndicatorScope;", "", "tabIndicatorLayout", "Landroidx/compose/ui/Modifier;", "measure", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "", "Landroidx/compose/material3/TabPosition;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "tabIndicatorOffset", "selectedTabIndex", "", "matchContentSize", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TabIndicatorScope {
    @NotNull
    Modifier tabIndicatorLayout(@NotNull Modifier arg1, @NotNull Function4 arg2);

    @NotNull
    Modifier tabIndicatorOffset(@NotNull Modifier arg1, int arg2, boolean arg3);

    static Modifier tabIndicatorOffset$default(TabIndicatorScope tabIndicatorScope0, Modifier modifier0, int v, boolean z, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tabIndicatorOffset");
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        return tabIndicatorScope0.tabIndicatorOffset(modifier0, v, z);
    }
}

