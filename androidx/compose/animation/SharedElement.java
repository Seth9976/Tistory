package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u000B\u0010\fJ(\u0010\u0015\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001A\u00020\n\u00A2\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001A\u00020\n\u00A2\u0006\u0004\b\u0017\u0010\fJ\u0015\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0018\u001A\u00020\r\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u001B\u001A\u00020\n2\u0006\u0010\u0018\u001A\u00020\r\u00A2\u0006\u0004\b\u001B\u0010\u001AR\u0017\u0010\u0002\u001A\u00020\u00018\u0006\u00A2\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R+\u0010*\u001A\u00020\u00072\u0006\u0010$\u001A\u00020\u00078F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\t\"\u0004\b(\u0010)R/\u00101\u001A\u0004\u0018\u00010+2\b\u0010$\u001A\u0004\u0018\u00010+8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b,\u0010&\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00106\u001A\u0004\u0018\u00010\r2\b\u0010$\u001A\u0004\u0018\u00010\r8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u001D\u0010<\u001A\b\u0012\u0004\u0012\u00020\r078\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R\u0013\u0010>\u001A\u0004\u0018\u00010+8F\u00A2\u0006\u0006\u001A\u0004\b=\u0010.\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006?"}, d2 = {"Landroidx/compose/animation/SharedElement;", "", "key", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "scope", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "", "isAnimating", "()Z", "", "updateMatch", "()V", "Landroidx/compose/animation/SharedElementInternalState;", "state", "Landroidx/compose/ui/geometry/Size;", "lookaheadSize", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "onLookaheadResult-v_w8tDc", "(Landroidx/compose/animation/SharedElementInternalState;JJ)V", "onLookaheadResult", "updateTargetBoundsProvider", "onSharedTransitionFinished", "sharedElementState", "addState", "(Landroidx/compose/animation/SharedElementInternalState;)V", "removeState", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getFoundMatch", "setFoundMatch", "(Z)V", "foundMatch", "Landroidx/compose/ui/geometry/Rect;", "e", "getCurrentBounds", "()Landroidx/compose/ui/geometry/Rect;", "setCurrentBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "currentBounds", "f", "Landroidx/compose/animation/SharedElementInternalState;", "getTargetBoundsProvider$animation_release", "()Landroidx/compose/animation/SharedElementInternalState;", "targetBoundsProvider", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "g", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getStates", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "states", "getTargetBounds", "targetBounds", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,254:1\n101#2,2:255\n33#2,6:257\n103#2:263\n33#2,6:273\n101#2,2:279\n33#2,6:281\n103#2:287\n51#2,6:288\n81#3:264\n107#3,2:265\n81#3:267\n107#3,2:268\n81#3:270\n107#3,2:271\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n*L\n43#1:255,2\n43#1:257,6\n43#1:263\n97#1:273,6\n115#1:279,2\n115#1:281,6\n115#1:287\n127#1:288,6\n45#1:264\n45#1:265,2\n79#1:267\n79#1:268,2\n83#1:270\n83#1:271,2\n*E\n"})
public final class SharedElement {
    public static final int $stable = 8;
    public final Object a;
    public final SharedTransitionScopeImpl b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public SharedElementInternalState f;
    public final SnapshotStateList g;
    public final h1 h;
    public final e i;

    public SharedElement(@NotNull Object object0, @NotNull SharedTransitionScopeImpl sharedTransitionScopeImpl0) {
        this.a = object0;
        this.b = sharedTransitionScopeImpl0;
        this.c = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.e = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.g = SnapshotStateKt.mutableStateListOf();
        this.h = new h1(this, 0);
        this.i = new e(this, 14);
    }

    public final boolean a() {
        SnapshotStateList snapshotStateList0 = this.g;
        int v = snapshotStateList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((SharedElementInternalState)snapshotStateList0.get(v1)).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }

    public final void addState(@NotNull SharedElementInternalState sharedElementInternalState0) {
        this.g.add(sharedElementInternalState0);
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.h, this.i);
    }

    @Nullable
    public final Rect getCurrentBounds() {
        return (Rect)this.e.getValue();
    }

    public final boolean getFoundMatch() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    @NotNull
    public final Object getKey() {
        return this.a;
    }

    @NotNull
    public final SharedTransitionScopeImpl getScope() {
        return this.b;
    }

    @NotNull
    public final SnapshotStateList getStates() {
        return this.g;
    }

    @Nullable
    public final Rect getTargetBounds() {
        SharedElementInternalState sharedElementInternalState0 = this.f;
        Rect rect0 = sharedElementInternalState0 == null ? null : RectKt.Rect-tz77jQw(sharedElementInternalState0.calculateLookaheadOffset-F1C5BW0(), sharedElementInternalState0.getNonNullLookaheadSize-NH-jbRc());
        this.c.setValue(rect0);
        return (Rect)this.c.getValue();
    }

    @Nullable
    public final SharedElementInternalState getTargetBoundsProvider$animation_release() {
        return this.f;
    }

    public final boolean isAnimating() {
        SnapshotStateList snapshotStateList0 = this.g;
        int v = snapshotStateList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((SharedElementInternalState)snapshotStateList0.get(v1)).getBoundsAnimation().isRunning()) {
                return this.getFoundMatch();
            }
        }
        return false;
    }

    public final void onLookaheadResult-v_w8tDc(@NotNull SharedElementInternalState sharedElementInternalState0, long v, long v1) {
        if(sharedElementInternalState0.getBoundsAnimation().getTarget()) {
            this.f = sharedElementInternalState0;
            MutableState mutableState0 = this.c;
            Rect rect0 = (Rect)mutableState0.getValue();
            Size size0 = null;
            Offset offset0 = rect0 == null ? null : Offset.box-impl(rect0.getTopLeft-F1C5BW0());
            if((offset0 == null ? false : Offset.equals-impl0(offset0.unbox-impl(), v1))) {
                Rect rect1 = (Rect)mutableState0.getValue();
                if(rect1 != null) {
                    size0 = Size.box-impl(rect1.getSize-NH-jbRc());
                }
                if(!(size0 == null ? false : Size.equals-impl0(size0.unbox-impl(), v))) {
                    goto label_12;
                }
            }
            else {
            label_12:
                Rect rect2 = RectKt.Rect-tz77jQw(v1, v);
                mutableState0.setValue(rect2);
                SnapshotStateList snapshotStateList0 = this.g;
                int v3 = snapshotStateList0.size();
                for(int v2 = 0; v2 < v3; ++v2) {
                    BoundsAnimation boundsAnimation0 = ((SharedElementInternalState)snapshotStateList0.get(v2)).getBoundsAnimation();
                    Rect rect3 = this.getCurrentBounds();
                    Intrinsics.checkNotNull(rect3);
                    boundsAnimation0.animate(rect3, rect2);
                }
            }
        }
    }

    public final void onSharedTransitionFinished() {
        boolean z = this.g.size() > 1 && this.a();
        this.d.setValue(Boolean.valueOf(z));
        this.c.setValue(null);
    }

    public final void removeState(@NotNull SharedElementInternalState sharedElementInternalState0) {
        this.g.remove(sharedElementInternalState0);
        if(this.g.isEmpty()) {
            this.updateMatch();
            SharedTransitionScopeKt.getSharedTransitionObserver().clear(this);
            return;
        }
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.h, this.i);
    }

    public final void setCurrentBounds(@Nullable Rect rect0) {
        this.e.setValue(rect0);
    }

    public final void updateMatch() {
        boolean z = this.a();
        SnapshotStateList snapshotStateList0 = this.g;
        MutableState mutableState0 = this.d;
        if(snapshotStateList0.size() > 1 && z) {
            mutableState0.setValue(Boolean.TRUE);
        }
        else if(!this.b.isTransitionActive()) {
            mutableState0.setValue(Boolean.FALSE);
        }
        else if(!z) {
            mutableState0.setValue(Boolean.FALSE);
        }
        if(!snapshotStateList0.isEmpty()) {
            SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.h, this.i);
        }
    }

    public final void updateTargetBoundsProvider() {
        SnapshotStateList snapshotStateList0 = this.g;
        int v = snapshotStateList0.size() - 1;
        SharedElementInternalState sharedElementInternalState0 = null;
        if(v >= 0) {
            while(true) {
                SharedElementInternalState sharedElementInternalState1 = (SharedElementInternalState)snapshotStateList0.get(v);
                if(sharedElementInternalState1.getBoundsAnimation().getTarget()) {
                    sharedElementInternalState0 = sharedElementInternalState1;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        if(Intrinsics.areEqual(sharedElementInternalState0, this.f)) {
            return;
        }
        this.f = sharedElementInternalState0;
        this.c.setValue(null);
    }
}

