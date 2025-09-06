package ma;

import androidx.compose.material3.n7;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import com.kakao.kandinsky.decoration.DecorationRect;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o2.c;

public final class i extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final int w;
    public final int x;
    public final long y;
    public final Object z;

    public i(long v, a a0, DecorationRect decorationRect0, Function2 function20, Function2 function21, int v1) {
        this.w = 0;
        this.y = v;
        this.z = a0;
        this.A = decorationRect0;
        this.B = function20;
        this.C = function21;
        this.x = v1;
        super(2);
    }

    public i(String s, String s1, Class class0, int v, ComposeViewAdapter composeViewAdapter0, long v1) {
        this.w = 1;
        this.z = s;
        this.A = s1;
        this.B = class0;
        this.x = v;
        this.C = composeViewAdapter0;
        this.y = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(320194433, v, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:497)");
            }
            boolean z = ((Composer)object0).changed(((String)this.z));
            boolean z1 = ((Composer)object0).changed(((String)this.A));
            boolean z2 = ((Composer)object0).changedInstance(((Composer)object0));
            boolean z3 = ((Composer)object0).changedInstance(((Class)this.B));
            boolean z4 = ((Composer)object0).changed(this.x);
            ComposeViewAdapter composeViewAdapter0 = (ComposeViewAdapter)this.C;
            boolean z5 = ((Composer)object0).changedInstance(composeViewAdapter0);
            n7 n70 = ((Composer)object0).rememberedValue();
            if((z | z1 | z2 | z3 | z4 | z5) != 0 || n70 == Composer.Companion.getEmpty()) {
                n70 = new n7(((String)this.z), ((String)this.A), ((Composer)object0), ((Class)this.B), this.x, ((ComposeViewAdapter)this.C), 1);
                ((Composer)object0).updateRememberedValue(n70);
            }
            if(this.y >= 0L) {
                ((Composer)object0).startReplaceGroup(-967718059);
                boolean z6 = ((Composer)object0).changedInstance(composeViewAdapter0);
                c c0 = ((Composer)object0).rememberedValue();
                if(z6 || c0 == Composer.Companion.getEmpty()) {
                    c0 = new c(composeViewAdapter0);
                    ((Composer)object0).updateRememberedValue(c0);
                }
                composeViewAdapter0.setClock$ui_tooling_release(new PreviewAnimationClock(c0));
            }
            else {
                ((Composer)object0).startReplaceGroup(0xC6624E3B);
            }
            ((Composer)object0).endReplaceGroup();
            n70.invoke();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        MosaicDecorationKt.a(this.y, ((a)this.z), ((DecorationRect)this.A), ((Function2)this.B), ((Function2)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
        return Unit.INSTANCE;
    }
}

