package androidx.compose.foundation.text.selection;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter.Companion;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final long w;
    public final Function0 x;
    public final boolean y;

    public i(long v, Function0 function00, boolean z) {
        this.w = v;
        this.x = function00;
        this.y = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ImageBitmap imageBitmap0 = AndroidSelectionHandles_androidKt.createHandleImage(((CacheDrawScope)object0), Size.getWidth-impl(((CacheDrawScope)object0).getSize-NH-jbRc()) / 2.0f);
        ColorFilter colorFilter0 = Companion.tint-xETnrds$default(ColorFilter.Companion, this.w, 0, 2, null);
        return ((CacheDrawScope)object0).onDrawWithContent(new h(this.x, this.y, imageBitmap0, colorFilter0, 0));
    }
}

