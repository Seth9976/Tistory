package k2;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult.Immutable;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function4 {
    public final AndroidParagraphIntrinsics w;

    public a(AndroidParagraphIntrinsics androidParagraphIntrinsics0) {
        this.w = androidParagraphIntrinsics0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        AndroidParagraphIntrinsics androidParagraphIntrinsics0 = this.w;
        State state0 = androidParagraphIntrinsics0.getFontFamilyResolver().resolve-DPcqOEQ(((FontFamily)object0), ((FontWeight)object1), ((FontStyle)object2).unbox-impl(), ((FontSynthesis)object3).unbox-impl());
        if(!(state0 instanceof Immutable)) {
            g g0 = new g(state0, androidParagraphIntrinsics0.j);
            androidParagraphIntrinsics0.j = g0;
            Intrinsics.checkNotNull(g0.c, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface)g0.c;
        }
        Object object4 = state0.getValue();
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface)object4;
    }
}

