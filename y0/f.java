package y0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.CompositionObserverHolder;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class f extends CompositionContext {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final CompositionObserverHolder d;
    public HashSet e;
    public final LinkedHashSet f;
    public final MutableState g;
    public final ComposerImpl h;

    public f(ComposerImpl composerImpl0, int v, boolean z, boolean z1, CompositionObserverHolder compositionObserverHolder0) {
        this.h = composerImpl0;
        super();
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = compositionObserverHolder0;
        this.f = new LinkedHashSet();
        this.g = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
    }

    public final void a() {
        LinkedHashSet linkedHashSet0 = this.f;
        if(!linkedHashSet0.isEmpty()) {
            HashSet hashSet0 = this.e;
            if(hashSet0 != null) {
                for(Object object0: linkedHashSet0) {
                    ComposerImpl composerImpl0 = (ComposerImpl)object0;
                    for(Object object1: hashSet0) {
                        ((Set)object1).remove(composerImpl0.c);
                    }
                }
            }
            linkedHashSet0.clear();
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void composeInitial$runtime_release(ControlledComposition controlledComposition0, Function2 function20) {
        this.h.b.composeInitial$runtime_release(controlledComposition0, function20);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference0) {
        this.h.b.deletedMovableContent$runtime_release(movableContentStateReference0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void doneComposing$runtime_release() {
        --this.h.A;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final boolean getCollectingCallByInformation$runtime_release() {
        return this.h.b.getCollectingCallByInformation$runtime_release();
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final boolean getCollectingParameterInformation$runtime_release() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final boolean getCollectingSourceInformation$runtime_release() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return (PersistentCompositionLocalMap)this.g.getValue();
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final int getCompoundHashKey$runtime_release() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final CoroutineContext getEffectCoroutineContext() {
        return this.h.b.getEffectCoroutineContext();
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.d;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return CompositionKt.getRecomposeCoroutineContext(this.h.getComposition());
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference0) {
        this.h.b.insertMovableContent$runtime_release(movableContentStateReference0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void invalidate$runtime_release(ControlledComposition controlledComposition0) {
        this.h.b.invalidate$runtime_release(this.h.getComposition());
        this.h.b.invalidate$runtime_release(controlledComposition0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl0) {
        this.h.b.invalidateScope$runtime_release(recomposeScopeImpl0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference0, MovableContentState movableContentState0) {
        this.h.b.movableContentStateReleased$runtime_release(movableContentStateReference0, movableContentState0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference0) {
        return this.h.b.movableContentStateResolve$runtime_release(movableContentStateReference0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void recordInspectionTable$runtime_release(Set set0) {
        HashSet hashSet0 = this.e;
        if(hashSet0 == null) {
            hashSet0 = new HashSet();
            this.e = hashSet0;
        }
        hashSet0.add(set0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void registerComposer$runtime_release(Composer composer0) {
        Intrinsics.checkNotNull(composer0, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
        super.registerComposer$runtime_release(((ComposerImpl)composer0));
        this.f.add(composer0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void registerComposition$runtime_release(ControlledComposition controlledComposition0) {
        this.h.b.registerComposition$runtime_release(controlledComposition0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition0) {
        this.h.b.reportRemovedComposition$runtime_release(controlledComposition0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void startComposing$runtime_release() {
        ++this.h.A;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void unregisterComposer$runtime_release(Composer composer0) {
        HashSet hashSet0 = this.e;
        if(hashSet0 != null) {
            for(Object object0: hashSet0) {
                Intrinsics.checkNotNull(composer0, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                ((Set)object0).remove(((ComposerImpl)composer0).c);
            }
        }
        TypeIntrinsics.asMutableCollection(this.f).remove(composer0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void unregisterComposition$runtime_release(ControlledComposition controlledComposition0) {
        this.h.b.unregisterComposition$runtime_release(controlledComposition0);
    }
}

