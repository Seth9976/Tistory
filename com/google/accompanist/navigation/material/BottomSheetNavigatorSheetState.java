package com.google.accompanist.navigation.material;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@ExperimentalMaterialNavigationApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u0011\u0010\u000B\u001A\u00020\n8F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0010\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0012\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u000F¨\u0006\u0013"}, d2 = {"Lcom/google/accompanist/navigation/material/BottomSheetNavigatorSheetState;", "", "Landroidx/compose/material/ModalBottomSheetState;", "sheetState", "<init>", "(Landroidx/compose/material/ModalBottomSheetState;)V", "a", "Landroidx/compose/material/ModalBottomSheetState;", "getSheetState$navigation_material_release", "()Landroidx/compose/material/ModalBottomSheetState;", "", "isVisible", "()Z", "Landroidx/compose/material/ModalBottomSheetValue;", "getCurrentValue", "()Landroidx/compose/material/ModalBottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "navigation-material_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BottomSheetNavigatorSheetState {
    public static final int $stable;
    public final ModalBottomSheetState a;

    public BottomSheetNavigatorSheetState(@NotNull ModalBottomSheetState modalBottomSheetState0) {
        Intrinsics.checkNotNullParameter(modalBottomSheetState0, "sheetState");
        super();
        this.a = modalBottomSheetState0;
    }

    @NotNull
    public final ModalBottomSheetValue getCurrentValue() {
        return this.a.getCurrentValue();
    }

    @NotNull
    public final ModalBottomSheetState getSheetState$navigation_material_release() {
        return this.a;
    }

    @NotNull
    public final ModalBottomSheetValue getTargetValue() {
        return this.a.getTargetValue();
    }

    public final boolean isVisible() {
        return this.a.isVisible();
    }
}

