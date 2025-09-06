package p0;

import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.material.BackdropValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class p0 extends Lambda implements Function0 {
    public final int w;
    public final BackdropScaffoldState x;
    public final CoroutineScope y;

    public p0(BackdropScaffoldState backdropScaffoldState0, CoroutineScope coroutineScope0, int v) {
        this.w = v;
        this.x = backdropScaffoldState0;
        this.y = coroutineScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            BackdropScaffoldState backdropScaffoldState0 = this.x;
            if(((Boolean)backdropScaffoldState0.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed)).booleanValue()) {
                q0 q00 = new q0(backdropScaffoldState0, null);
                BuildersKt.launch$default(this.y, null, null, q00, 3, null);
            }
            return true;
        }
        BackdropScaffoldState backdropScaffoldState1 = this.x;
        if(((Boolean)backdropScaffoldState1.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed)).booleanValue()) {
            o0 o00 = new o0(backdropScaffoldState1, null);
            BuildersKt.launch$default(this.y, null, null, o00, 3, null);
        }
        return true;
    }
}

