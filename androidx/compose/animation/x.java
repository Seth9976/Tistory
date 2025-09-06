package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

public final class x extends Lambda implements Function3 {
    public final PlaceHolderSize A;
    public final boolean B;
    public final OverlayClip C;
    public final float D;
    public final boolean E;
    public final BoundsTransform F;
    public final SharedContentState w;
    public final Transition x;
    public final Lambda y;
    public final SharedTransitionScopeImpl z;

    public x(SharedContentState sharedTransitionScope$SharedContentState0, Transition transition0, Function1 function10, SharedTransitionScopeImpl sharedTransitionScopeImpl0, PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z, OverlayClip sharedTransitionScope$OverlayClip0, float f, boolean z1, BoundsTransform boundsTransform0) {
        this.w = sharedTransitionScope$SharedContentState0;
        this.x = transition0;
        this.y = (Lambda)function10;
        this.z = sharedTransitionScopeImpl0;
        this.A = sharedTransitionScope$PlaceHolderSize0;
        this.B = z;
        this.C = sharedTransitionScope$OverlayClip0;
        this.D = f;
        this.E = z1;
        this.F = boundsTransform0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Transition transition1;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        composer0.startReplaceGroup(0x921EBE6F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x921EBE6F, v, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:968)");
        }
        Object object3 = this.w.getKey();
        composer0.startMovableGroup(0xEA8FCA61, object3);
        SharedElement sharedElement0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        SharedTransitionScopeImpl sharedTransitionScopeImpl0 = this.z;
        if(sharedElement0 == composer$Companion0.getEmpty()) {
            sharedElement0 = SharedTransitionScopeImpl.access$sharedElementsFor(sharedTransitionScopeImpl0, object3);
            composer0.updateRememberedValue(sharedElement0);
        }
        Transition transition0 = this.x;
        composer0.startMovableGroup(0xEA8FD60E, transition0);
        Lambda lambda0 = this.y;
        boolean z = false;
        if(transition0 == null) {
            composer0.startReplaceGroup(1735245009);
            Intrinsics.checkNotNull(lambda0, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
            Boolean boolean1 = (Boolean)((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(lambda0, 1)).invoke(Unit.INSTANCE);
            boolean z2 = boolean1.booleanValue();
            MutableTransitionState mutableTransitionState0 = composer0.rememberedValue();
            if(mutableTransitionState0 == composer$Companion0.getEmpty()) {
                if(sharedElement0.getCurrentBounds() == null) {
                    z = z2;
                }
                else if(!z2) {
                    z = true;
                }
                mutableTransitionState0 = new MutableTransitionState(Boolean.valueOf(z));
                composer0.updateRememberedValue(mutableTransitionState0);
            }
            mutableTransitionState0.setTargetState(boolean1);
            transition1 = TransitionKt.rememberTransition(mutableTransitionState0, null, composer0, MutableTransitionState.$stable, 2);
        }
        else {
            composer0.startReplaceGroup(1735101820);
            String s = object3.toString();
            boolean z1 = composer0.changed(transition0);
            Object object4 = composer0.rememberedValue();
            if(z1 || object4 == composer$Companion0.getEmpty()) {
                object4 = transition0.getCurrentState();
                composer0.updateRememberedValue(object4);
            }
            if(transition0.isSeeking()) {
                object4 = transition0.getCurrentState();
            }
            composer0.startReplaceGroup(0x4F4141D1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4F4141D1, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:974)");
            }
            Boolean boolean0 = (Boolean)((Function1)lambda0).invoke(object4);
            boolean0.getClass();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            Object object5 = transition0.getTargetState();
            composer0.startReplaceGroup(0x4F4141D1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4F4141D1, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:974)");
            }
            Object object6 = ((Function1)lambda0).invoke(object5);
            ((Boolean)object6).getClass();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            transition1 = TransitionKt.createChildTransitionInternal(transition0, boolean0, ((Boolean)object6), s, composer0, 0);
        }
        composer0.endReplaceGroup();
        composer0.startMovableGroup(0xEA906D16, Boolean.valueOf(sharedTransitionScopeImpl0.isTransitionActive()));
        DeferredAnimation transition$DeferredAnimation0 = TransitionKt.createDeferredAnimation(transition1, VectorConvertersKt.getVectorConverter(Rect.Companion), null, composer0, 0, 2);
        composer0.endMovableGroup();
        boolean z3 = composer0.changed(transition1);
        BoundsAnimation boundsAnimation0 = composer0.rememberedValue();
        BoundsTransform boundsTransform0 = this.F;
        if(z3 || boundsAnimation0 == composer$Companion0.getEmpty()) {
            boundsAnimation0 = new BoundsAnimation(sharedTransitionScopeImpl0, transition1, transition$DeferredAnimation0, boundsTransform0);
            composer0.updateRememberedValue(boundsAnimation0);
        }
        boundsAnimation0.updateAnimation(transition$DeferredAnimation0, boundsTransform0);
        composer0.endMovableGroup();
        SharedElementInternalState sharedElementInternalState0 = SharedTransitionScopeImpl.access$rememberSharedElementState(this.z, sharedElement0, boundsAnimation0, this.A, this.B, this.w, this.C, this.D, this.E, composer0, 0);
        composer0.endMovableGroup();
        Modifier modifier0 = ((Modifier)object0).then(new SharedBoundsNodeElement(sharedElementInternalState0));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }
}

