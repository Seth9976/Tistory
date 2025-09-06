package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function3 {
    public final Function4 w;
    public final Function4 x;
    public final Function4 y;

    public g(Function4 function40, Function4 function41, Function4 function42) {
        this.w = function40;
        this.x = function41;
        this.y = function42;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((SubcomposeAsyncImageScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1302781228, v, -1, "coil.compose.contentOf.<anonymous> (SubcomposeAsyncImage.kt:381)");
        }
        State asyncImagePainter$State0 = ((SubcomposeAsyncImageScope)object0).getPainter().getState();
        int v1 = 0;
        int v2 = 1;
        if(asyncImagePainter$State0 instanceof Loading) {
            ((Composer)object1).startReplaceableGroup(0xE710FB0B);
            Function4 function40 = this.w;
            if(function40 == null) {
                v1 = 1;
            }
            else {
                function40.invoke(((SubcomposeAsyncImageScope)object0), asyncImagePainter$State0, ((Composer)object1), ((int)(v & 14 | 0x40)));
            }
            ((Composer)object1).endReplaceableGroup();
            v2 = v1;
        }
        else if(asyncImagePainter$State0 instanceof Success) {
            ((Composer)object1).startReplaceableGroup(0xE710FB0B);
            Function4 function41 = this.x;
            if(function41 == null) {
                v1 = 1;
            }
            else {
                function41.invoke(((SubcomposeAsyncImageScope)object0), asyncImagePainter$State0, ((Composer)object1), ((int)(v & 14 | 0x40)));
            }
            ((Composer)object1).endReplaceableGroup();
            v2 = v1;
        }
        else if(asyncImagePainter$State0 instanceof Error) {
            ((Composer)object1).startReplaceableGroup(0xE710FB0B);
            Function4 function42 = this.y;
            if(function42 == null) {
                v1 = 1;
            }
            else {
                function42.invoke(((SubcomposeAsyncImageScope)object0), asyncImagePainter$State0, ((Composer)object1), ((int)(v & 14 | 0x40)));
            }
            ((Composer)object1).endReplaceableGroup();
            v2 = v1;
        }
        else {
            if(asyncImagePainter$State0 instanceof Empty) {
                ((Composer)object1).startReplaceableGroup(-418301399);
            }
            else {
                ((Composer)object1).startReplaceableGroup(-418301339);
            }
            ((Composer)object1).endReplaceableGroup();
        }
        if(v2 != 0) {
            SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(((SubcomposeAsyncImageScope)object0), null, null, null, null, null, 0.0f, null, false, ((Composer)object1), v & 14, 0xFF);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

