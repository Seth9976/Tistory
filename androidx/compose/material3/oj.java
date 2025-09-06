package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class oj extends Lambda implements Function2 {
    public final Shape w;
    public final SearchBarColors x;
    public final float y;
    public final float z;

    public oj(Shape shape0, SearchBarColors searchBarColors0, float f, float f1) {
        this.w = shape0;
        this.x = searchBarColors0;
        this.y = f;
        this.z = f1;
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
            ComposerKt.traceEventStart(-170534294, v, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
        }
        long v1 = ColorSchemeKt.contentColorFor-ek8zF_U(this.x.getContainerColor-0d7_KjU(), ((Composer)object0), 0);
        SurfaceKt.Surface-T9BRK9s(null, this.w, this.x.getContainerColor-0d7_KjU(), v1, this.y, this.z, null, ComposableSingletons.SearchBar_androidKt.INSTANCE.getLambda-2$material3_release(), ((Composer)object0), 0xC00000, 65);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

