package aa;

import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.decoration.DecorationRect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function0 {
    public final int w;
    public final DecorationRect x;

    public c0(DecorationRect decorationRect0, int v) {
        this.w = v;
        this.x = decorationRect0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return this.x.getRotate();
            }
            case 1: {
                return Offset.box-impl(Offset.times-tuRUvjQ(this.x.getFlip-F1C5BW0(), this.x.getScale()));
            }
            case 2: {
                return Offset.box-impl(this.x.getTransition-F1C5BW0());
            }
            case 3: {
                return this.x.getRotate();
            }
            case 4: {
                return Offset.box-impl(Offset.times-tuRUvjQ(this.x.getFlip-F1C5BW0(), this.x.getScale()));
            }
            default: {
                return Offset.box-impl(this.x.getTransition-F1C5BW0());
            }
        }
    }
}

