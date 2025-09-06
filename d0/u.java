package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final LazyLayoutItemContentFactory w;
    public final v x;

    public u(LazyLayoutItemContentFactory lazyLayoutItemContentFactory0, v v0) {
        this.w = lazyLayoutItemContentFactory0;
        this.x = v0;
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
            ComposerKt.traceEventStart(0x53AF4291, v, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
        }
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory0 = this.w;
        LazyLayoutItemProvider lazyLayoutItemProvider0 = (LazyLayoutItemProvider)lazyLayoutItemContentFactory0.getItemProvider().invoke();
        v v1 = this.x;
        int v2 = v1.c;
        int v3 = lazyLayoutItemProvider0.getItemCount();
        Object object2 = v1.a;
        if(v2 >= v3 || !Intrinsics.areEqual(lazyLayoutItemProvider0.getKey(v2), object2)) {
            v2 = lazyLayoutItemProvider0.getIndex(object2);
            if(v2 != -1) {
                v1.c = v2;
            }
        }
        ((Composer)object0).startReusableGroup(0xCF, Boolean.valueOf(v2 != -1));
        boolean z = ((Composer)object0).changed(v2 != -1);
        ((Composer)object0).startReplaceGroup(0xCC294FAD);
        if(v2 == -1) {
            ((Composer)object0).deactivateToEndGroup(z);
        }
        else {
            ((Composer)object0).startReplaceGroup(0x81A0D09B);
            LazyLayoutItemContentFactoryKt.access$SkippableItem-JVlU9Rs(lazyLayoutItemProvider0, lazyLayoutItemContentFactory0.a, v2, v1.a, ((Composer)object0), 0);
            ((Composer)object0).endReplaceGroup();
        }
        ((Composer)object0).endReplaceGroup();
        ((Composer)object0).endReusableGroup();
        boolean z1 = ((Composer)object0).changedInstance(v1);
        g1 g10 = ((Composer)object0).rememberedValue();
        if(z1 || g10 == Composer.Companion.getEmpty()) {
            g10 = new g1(v1, 18);
            ((Composer)object0).updateRememberedValue(g10);
        }
        EffectsKt.DisposableEffect(object2, g10, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

