package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"createMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class MultiContentMeasurePolicyKt {
    @PublishedApi
    @NotNull
    public static final MeasurePolicy createMeasurePolicy(@NotNull MultiContentMeasurePolicy multiContentMeasurePolicy0) {
        return new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy0);
    }
}

