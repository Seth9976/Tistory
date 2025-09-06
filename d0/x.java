package d0;

import aa.l;
import aa.r;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimatedVisibilityScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchStateKt;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt;
import androidx.compose.material3.g1;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s.i;

public final class x extends Lambda implements Function3 {
    public final Object A;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public x(int v, Object object0, Object object1, Object object2, Object object3) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = object3;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                Composer composer0 = (Composer)object1;
                int v1 = ((Number)object2).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xA73FB41D, v1, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
                }
                LazyLayoutItemContentFactory lazyLayoutItemContentFactory0 = composer0.rememberedValue();
                Companion composer$Companion0 = Composer.Companion;
                if(lazyLayoutItemContentFactory0 == composer$Companion0.getEmpty()) {
                    lazyLayoutItemContentFactory0 = new LazyLayoutItemContentFactory(((SaveableStateHolder)object0), new l(((State)this.A), 9));
                    composer0.updateRememberedValue(lazyLayoutItemContentFactory0);
                }
                SubcomposeLayoutState subcomposeLayoutState0 = composer0.rememberedValue();
                if(subcomposeLayoutState0 == composer$Companion0.getEmpty()) {
                    subcomposeLayoutState0 = new SubcomposeLayoutState(new w(lazyLayoutItemContentFactory0));
                    composer0.updateRememberedValue(subcomposeLayoutState0);
                }
                LazyLayoutPrefetchState lazyLayoutPrefetchState0 = (LazyLayoutPrefetchState)this.x;
                if(lazyLayoutPrefetchState0 == null) {
                    composer0.startReplaceGroup(205858881);
                }
                else {
                    composer0.startReplaceGroup(205264983);
                    PrefetchScheduler prefetchScheduler0 = lazyLayoutPrefetchState0.getPrefetchScheduler$foundation_release();
                    if(prefetchScheduler0 == null) {
                        composer0.startReplaceGroup(0x650EC3);
                        prefetchScheduler0 = PrefetchScheduler_androidKt.rememberDefaultPrefetchScheduler(composer0, 0);
                    }
                    else {
                        composer0.startReplaceGroup(0x650A86);
                    }
                    composer0.endReplaceGroup();
                    Object[] arr_object = {lazyLayoutPrefetchState0, lazyLayoutItemContentFactory0, subcomposeLayoutState0, prefetchScheduler0};
                    boolean z = composer0.changed(lazyLayoutPrefetchState0);
                    boolean z1 = composer0.changedInstance(lazyLayoutItemContentFactory0);
                    boolean z2 = composer0.changedInstance(subcomposeLayoutState0);
                    boolean z3 = composer0.changedInstance(prefetchScheduler0);
                    g1 g10 = composer0.rememberedValue();
                    if((z | z1 | z2 | z3) != 0 || g10 == composer$Companion0.getEmpty()) {
                        g1 g11 = new g1(2, lazyLayoutPrefetchState0, lazyLayoutItemContentFactory0, subcomposeLayoutState0, prefetchScheduler0);
                        composer0.updateRememberedValue(g11);
                        g10 = g11;
                    }
                    EffectsKt.DisposableEffect(arr_object, g10, composer0, 0);
                }
                composer0.endReplaceGroup();
                Modifier modifier1 = LazyLayoutPrefetchStateKt.traversablePrefetchState(((Modifier)this.y), lazyLayoutPrefetchState0);
                boolean z4 = composer0.changed(lazyLayoutItemContentFactory0);
                Function2 function20 = (Function2)this.z;
                boolean z5 = composer0.changed(function20);
                aa.x x0 = composer0.rememberedValue();
                if(z4 || z5 || x0 == composer$Companion0.getEmpty()) {
                    x0 = new aa.x(12, lazyLayoutItemContentFactory0, function20);
                    composer0.updateRememberedValue(x0);
                }
                SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState0, modifier1, x0, composer0, SubcomposeLayoutState.$stable, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object2).intValue();
                if((v2 & 6) == 0) {
                    v2 |= (((v2 & 8) == 0 ? ((Composer)object1).changed(((AnimatedVisibilityScope)object0)) : ((Composer)object1).changedInstance(((AnimatedVisibilityScope)object0))) ? 4 : 2);
                }
                if((v2 & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xDB459A16, v2, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)");
                }
                SnapshotStateList snapshotStateList0 = (SnapshotStateList)this.x;
                boolean z6 = ((Composer)object1).changed(snapshotStateList0);
                Object object3 = this.y;
                boolean z7 = ((Composer)object1).changedInstance(object3);
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0 = (AnimatedContentTransitionScopeImpl)this.z;
                boolean z8 = ((Composer)object1).changedInstance(animatedContentTransitionScopeImpl0);
                r r0 = ((Composer)object1).rememberedValue();
                if((z6 | z7 | z8) != 0 || r0 == Composer.Companion.getEmpty()) {
                    r0 = new r(snapshotStateList0, object3, 20, animatedContentTransitionScopeImpl0);
                    ((Composer)object1).updateRememberedValue(r0);
                }
                EffectsKt.DisposableEffect(((AnimatedVisibilityScope)object0), r0, ((Composer)object1), v2 & 14);
                Intrinsics.checkNotNull(((AnimatedVisibilityScope)object0), "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                animatedContentTransitionScopeImpl0.getTargetSizeMap$animation_release().set(object3, ((AnimatedVisibilityScopeImpl)(((AnimatedVisibilityScope)object0))).getTargetSize$animation_release());
                i i0 = ((Composer)object1).rememberedValue();
                if(i0 == Composer.Companion.getEmpty()) {
                    i0 = new i(((AnimatedVisibilityScope)object0));
                    ((Composer)object1).updateRememberedValue(i0);
                }
                ((Function4)this.A).invoke(i0, object3, ((Composer)object1), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object2).intValue();
                ((Composer)object1).startReplaceGroup(1840112047);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1840112047, v, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:668)");
                }
                Modifier modifier0 = ((Modifier)object0).then(EnterExitTransitionKt.createModifier(((AnimatedVisibilityScope)this.x).getTransition(), ((EnterTransition)this.y), ((ExitTransition)this.z), null, ((String)this.A), ((Composer)object1), 0, 4));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier0;
            }
        }
    }
}

