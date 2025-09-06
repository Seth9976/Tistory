package p5;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import coil.compose.SubcomposeAsyncImageScope;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

public final class h implements BoxScope, SubcomposeAsyncImageScope {
    public final BoxScope a;
    public final AsyncImagePainter b;
    public final String c;
    public final Alignment d;
    public final ContentScale e;
    public final float f;
    public final ColorFilter g;
    public final boolean h;

    public h(BoxScope boxScope0, AsyncImagePainter asyncImagePainter0, String s, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, boolean z) {
        this.a = boxScope0;
        this.b = asyncImagePainter0;
        this.c = s;
        this.d = alignment0;
        this.e = contentScale0;
        this.f = f;
        this.g = colorFilter0;
        this.h = z;
    }

    @Override  // androidx.compose.foundation.layout.BoxScope
    public final Modifier align(Modifier modifier0, Alignment alignment0) {
        return this.a.align(modifier0, alignment0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((h)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((h)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((h)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((h)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((h)object0).e)) {
            return false;
        }
        if(Float.compare(this.f, ((h)object0).f) != 0) {
            return false;
        }
        return Intrinsics.areEqual(this.g, ((h)object0).g) ? this.h == ((h)object0).h : false;
    }

    @Override  // coil.compose.SubcomposeAsyncImageScope
    public final Alignment getAlignment() {
        return this.d;
    }

    @Override  // coil.compose.SubcomposeAsyncImageScope
    public final float getAlpha() {
        return this.f;
    }

    @Override  // coil.compose.SubcomposeAsyncImageScope
    public final boolean getClipToBounds() {
        return this.h;
    }

    @Override  // coil.compose.SubcomposeAsyncImageScope
    public final ColorFilter getColorFilter() {
        return this.g;
    }

    @Override  // coil.compose.SubcomposeAsyncImageScope
    public final String getContentDescription() {
        return this.c;
    }

    @Override  // coil.compose.SubcomposeAsyncImageScope
    public final ContentScale getContentScale() {
        return this.e;
    }

    @Override  // coil.compose.SubcomposeAsyncImageScope
    public final AsyncImagePainter getPainter() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = a.b(this.f, (this.e.hashCode() + (this.d.hashCode() + ((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F) * 0x1F) * 0x1F, 0x1F);
        ColorFilter colorFilter0 = this.g;
        if(colorFilter0 != null) {
            v = colorFilter0.hashCode();
        }
        return Boolean.hashCode(this.h) + (v1 + v) * 0x1F;
    }

    @Override  // androidx.compose.foundation.layout.BoxScope
    public final Modifier matchParentSize(Modifier modifier0) {
        return this.a.matchParentSize(modifier0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RealSubcomposeAsyncImageScope(parentScope=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", painter=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", contentDescription=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", alignment=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", contentScale=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", alpha=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", colorFilter=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", clipToBounds=");
        return a.p(stringBuilder0, this.h, ')');
    }
}

