package va;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final Text w;
    public final long x;
    public final int y;

    public s(Text signature$Text0, long v, int v1) {
        this.w = signature$Text0;
        this.x = v;
        this.y = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SignatureDecorationKt.b(this.w, this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
        return Unit.INSTANCE;
    }
}

