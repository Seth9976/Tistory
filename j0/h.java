package j0;

import androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final AnnotatedString w;
    public final List x;
    public final int y;

    public h(AnnotatedString annotatedString0, List list0, int v) {
        this.w = annotatedString0;
        this.x = list0;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AnnotatedStringResolveInlineContentKt.InlineChildren(this.w, this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
        return Unit.INSTANCE;
    }
}

