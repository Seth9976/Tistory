package w9;

import com.kakao.kandinsky.core.filter.core.Texture;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public final Texture a;
    public int b;

    public c(Texture texture0) {
        Intrinsics.checkNotNullParameter(texture0, "texture");
        super();
        this.a = texture0;
        this.b = 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((c)object0).a) ? this.b == ((c)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.b + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "RetainedTexture(texture=" + this.a + ", count=" + this.b + ")";
    }
}

