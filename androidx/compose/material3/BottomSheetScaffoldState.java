package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/BottomSheetScaffoldState;", "", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V", "a", "Landroidx/compose/material3/SheetState;", "getBottomSheetState", "()Landroidx/compose/material3/SheetState;", "b", "Landroidx/compose/material3/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material3/SnackbarHostState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BottomSheetScaffoldState {
    public static final int $stable;
    public final SheetState a;
    public final SnackbarHostState b;

    public BottomSheetScaffoldState(@NotNull SheetState sheetState0, @NotNull SnackbarHostState snackbarHostState0) {
        this.a = sheetState0;
        this.b = snackbarHostState0;
    }

    @NotNull
    public final SheetState getBottomSheetState() {
        return this.a;
    }

    @NotNull
    public final SnackbarHostState getSnackbarHostState() {
        return this.b;
    }
}

