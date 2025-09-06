package ga;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.filter.ui.ImageState.Loading;
import com.kakao.kandinsky.filter.ui.ImageState.Success;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function4 {
    public final List w;
    public final Function3 x;

    public f(List list0, Function3 function30) {
        this.w = list0;
        this.x = function30;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 14) == 0 ? (((Composer)object2).changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v2 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(804500131, v2, -1, "com.kakao.kandinsky.filter.ui.FilterMenu.<anonymous> (FilterMenu.kt:48)");
        }
        Filter filter0 = (Filter)this.w.get(v);
        int v3 = ((Density)((Composer)object2).consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(64.0f);
        e e0 = new e(this.x, filter0, v3, null);
        State state0 = SnapshotStateKt.produceState(ImageState.Loading.INSTANCE, filter0, e0, ((Composer)object2), 0x206);
        ((Composer)object2).startReplaceGroup(0xB7BA7BDD);
        g g0 = (g)state0.getValue();
        ((Composer)object2).startReplaceGroup(0xB7BA7BF8);
        if(g0 instanceof ImageState.Success) {
            ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(((ImageState.Success)g0).getBitmap()), null, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ContentScale.Companion.getCrop(), 0.0f, null, 0, ((Composer)object2), 25016, 0xE8);
        }
        ((Composer)object2).endReplaceGroup();
        ((Composer)object2).endReplaceGroup();
        if(z) {
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(((Composer)object2), MaterialTheme.$stable).getScrim-0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), ((Composer)object2), 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

