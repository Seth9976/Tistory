package j0;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter.Companion;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final long w;

    public d(long v) {
        this.w = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Size.getWidth-impl(((CacheDrawScope)object0).getSize-NH-jbRc());
        return ((CacheDrawScope)object0).onDrawWithContent(new c(f / 2.0f, AndroidSelectionHandles_androidKt.createHandleImage(((CacheDrawScope)object0), f / 2.0f), Companion.tint-xETnrds$default(ColorFilter.Companion, this.w, 0, 2, null)));
    }
}

