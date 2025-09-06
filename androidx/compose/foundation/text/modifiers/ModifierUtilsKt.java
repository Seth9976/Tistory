package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A&\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"maxWidthForTextLayout", "", "Landroidx/compose/ui/unit/Constraints;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxWidthForTextLayout-R2G3SPE", "(JZI)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ModifierUtilsKt {
    // 去混淆评级： 中等(50)
    public static final int maxWidthForTextLayout-R2G3SPE(long v, boolean z, int v1) {
        return !z && !TextOverflow.equals-impl0(v1, 2) || !Constraints.getHasBoundedWidth-impl(v) ? 0x7FFFFFFF : Constraints.getMaxWidth-impl(v);
    }
}

