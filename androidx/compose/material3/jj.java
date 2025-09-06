package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class jj extends Lambda implements Function2 {
    public final boolean A;
    public final Function1 B;
    public final boolean C;
    public final Function2 D;
    public final Function2 E;
    public final Function2 F;
    public final MutableInteractionSource G;
    public final SearchBarColors w;
    public final String x;
    public final Function1 y;
    public final Function1 z;

    public jj(SearchBarColors searchBarColors0, String s, Function1 function10, Function1 function11, boolean z, Function1 function12, boolean z1, Function2 function20, Function2 function21, Function2 function22, MutableInteractionSource mutableInteractionSource0) {
        this.w = searchBarColors0;
        this.x = s;
        this.y = function10;
        this.z = function11;
        this.A = z;
        this.B = function12;
        this.C = z1;
        this.D = function20;
        this.E = function21;
        this.F = function22;
        this.G = mutableInteractionSource0;
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
            ComposerKt.traceEventStart(0xBAF89FB1, v, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
        }
        Modifier modifier0 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        SearchBarDefaults.INSTANCE.InputField(this.x, this.y, this.z, this.A, this.B, modifier0, this.C, this.D, this.E, this.F, this.w.getInputFieldColors(), this.G, ((Composer)object0), 0x30000, 0x180, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

