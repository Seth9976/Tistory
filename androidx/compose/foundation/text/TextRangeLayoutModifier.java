package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\t\u001A\u00020\u0000*\u00020\u00062\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;", "measurePolicy", "<init>", "(Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/text/TextRangeLayoutModifier;", "a", "Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextRangeLayoutModifier implements ParentDataModifier {
    public static final int $stable;
    public final TextRangeScopeMeasurePolicy a;

    public TextRangeLayoutModifier(@NotNull TextRangeScopeMeasurePolicy textRangeScopeMeasurePolicy0) {
        this.a = textRangeScopeMeasurePolicy0;
    }

    @NotNull
    public final TextRangeScopeMeasurePolicy getMeasurePolicy() {
        return this.a;
    }

    @NotNull
    public TextRangeLayoutModifier modifyParentData(@NotNull Density density0, @Nullable Object object0) [...] // Inlined contents

    @Override  // androidx.compose.ui.layout.ParentDataModifier
    public Object modifyParentData(Density density0, Object object0) {
        return this;
    }
}

