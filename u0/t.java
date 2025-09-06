package u0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.compose.ui.graphics.Color;

public final class t extends RippleDrawable {
    public final boolean a;
    public Color b;
    public Integer c;
    public boolean d;

    static {
    }

    public t(boolean z) {
        super(ColorStateList.valueOf(0xFF000000), null, (z ? new ColorDrawable(-1) : null));
        this.a = z;
    }

    @Override  // android.graphics.drawable.RippleDrawable
    public final Rect getDirtyBounds() {
        if(!this.a) {
            this.d = true;
        }
        Rect rect0 = super.getDirtyBounds();
        this.d = false;
        return rect0;
    }

    @Override  // android.graphics.drawable.RippleDrawable
    public final boolean isProjected() {
        return this.d;
    }
}

