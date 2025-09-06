package androidx.compose.material3;

import android.content.Context;
import android.view.TextureView;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import u.m;

public final class jr extends Lambda implements Function1 {
    public final int w;
    public final long x;
    public final Object y;
    public final Object z;

    public jr(LayoutCoordinates layoutCoordinates0, Path path0, long v) {
        this.w = 0;
        this.y = layoutCoordinates0;
        this.z = path0;
        this.x = v;
        super(1);
    }

    public jr(m m0, long v, Function1 function10) {
        this.w = 1;
        this.y = m0;
        this.x = v;
        this.z = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            TextureView textureView0 = new TextureView(((Context)object0));
            ((m)this.y).f = this.x;
            ((Function1)this.z).invoke(((m)this.y));
            textureView0.setSurfaceTextureListener(((m)this.y));
            return textureView0;
        }
        if(((LayoutCoordinates)this.y) != null) {
            ((ContentDrawScope)object0).drawContent();
            DrawScope.drawPath-LG529CI$default(((ContentDrawScope)object0), ((Path)this.z), this.x, 0.0f, null, null, 0, 60, null);
        }
        return Unit.INSTANCE;
    }
}

