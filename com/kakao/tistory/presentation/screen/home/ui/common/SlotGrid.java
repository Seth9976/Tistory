package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/ui/common/SlotGrid;", "", "Landroidx/compose/ui/unit/Dp;", "maxWidth", "", "isSlotGridExpanded-0680j_4", "(F)Z", "isSlotGridExpanded", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotGrid.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotGrid\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,184:1\n148#2:185\n*S KotlinDebug\n*F\n+ 1 SlotGrid.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotGrid\n*L\n182#1:185\n*E\n"})
public final class SlotGrid {
    public static final int $stable;
    @NotNull
    public static final SlotGrid INSTANCE;
    public static final float a;

    static {
        SlotGrid.INSTANCE = new SlotGrid();
        SlotGrid.a = 576.0f;
    }

    public final boolean isSlotGridExpanded-0680j_4(float f) {
        return Dp.compareTo-0680j_4(f, SlotGrid.a) >= 0;
    }
}

