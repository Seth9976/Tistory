package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function2 {
    public final Function2 A;
    public final TextStyle B;
    public final boolean C;
    public final Function2 D;
    public final ComposableLambda E;
    public final WindowInsets w;
    public final float x;
    public final TopAppBarScrollBehavior y;
    public final TopAppBarColors z;

    public l0(WindowInsets windowInsets0, float f, TopAppBarScrollBehavior topAppBarScrollBehavior0, TopAppBarColors topAppBarColors0, Function2 function20, TextStyle textStyle0, boolean z, Function2 function21, ComposableLambda composableLambda0) {
        this.w = windowInsets0;
        this.x = f;
        this.y = topAppBarScrollBehavior0;
        this.z = topAppBarColors0;
        this.A = function20;
        this.B = textStyle0;
        this.C = z;
        this.D = function21;
        this.E = composableLambda0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8C24E366, v, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
        }
        Modifier modifier0 = SizeKt.heightIn-VpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, this.w)), 0.0f, this.x, 1, null);
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = this.y;
        boolean z = ((Composer)object0).changed(topAppBarScrollBehavior0);
        k0 k00 = ((Composer)object0).rememberedValue();
        if(z || k00 == Composer.Companion.getEmpty()) {
            k00 = new k0(topAppBarScrollBehavior0, 0);
            ((Composer)object0).updateRememberedValue(k00);
        }
        long v1 = this.z.getNavigationIconContentColor-0d7_KjU();
        long v2 = this.z.getTitleContentColor-0d7_KjU();
        long v3 = this.z.getActionIconContentColor-0d7_KjU();
        Arrangement arrangement0 = Arrangement.INSTANCE;
        HorizontalOrVertical arrangement$HorizontalOrVertical0 = arrangement0.getCenter();
        Horizontal arrangement$Horizontal0 = this.C ? arrangement0.getCenter() : arrangement0.getStart();
        AppBarKt.access$TopAppBarLayout-kXwM9vE(modifier0, k00, v1, v2, v3, this.A, this.B, 1.0f, arrangement$HorizontalOrVertical0, arrangement$Horizontal0, 0, false, this.D, this.E, ((Composer)object0), 0x6C00000, 0xC36);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

