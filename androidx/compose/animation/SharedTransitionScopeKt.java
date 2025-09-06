package androidx.compose.animation;

import aa.a;
import androidx.collection.MutableScatterMap;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.material3.gd;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScopeKt;
import ca.m0;
import ca.s1;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.f1;
import s.k1;
import s.m1;
import s.v;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A7\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001A3\u0010\u000B\u001A\u00020\u00042\"\u0010\u0007\u001A\u001E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u000B\u0010\f\"\u0014\u0010\u000E\u001A\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000E\u0010\u000F\"\u001B\u0010\u0015\u001A\u00020\u00108@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/SharedTransitionScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "SharedTransitionLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "SharedTransitionScope", "(Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "", "VisualDebugging", "Z", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "f", "Lkotlin/Lazy;", "getSharedTransitionObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SharedTransitionObserver", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1337:1\n863#2:1338\n863#2:1340\n1#3:1339\n1#3:1341\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n*L\n1302#1:1338\n1303#1:1340\n1302#1:1339\n1303#1:1341\n*E\n"})
public final class SharedTransitionScopeKt {
    public static final boolean VisualDebugging = false;
    public static final f1 a;
    public static final SpringSpec b;
    public static final SharedTransitionScopeKt.ParentClip.1 c;
    public static final v d;
    public static final k1 e;
    public static final Lazy f;
    public static final MutableScatterMap g;

    static {
        SharedTransitionScopeKt.a = f1.z;
        SharedTransitionScopeKt.b = AnimationSpecKt.spring$default(0.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 1, null);
        SharedTransitionScopeKt.c = new SharedTransitionScopeKt.ParentClip.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        SharedTransitionScopeKt.d = v.y;
        SharedTransitionScopeKt.e = new k1();  // 初始化器: Ljava/lang/Object;-><init>()V
        SharedTransitionScopeKt.f = c.lazy(LazyThreadSafetyMode.NONE, f1.A);
        SharedTransitionScopeKt.g = new MutableScatterMap(0, 1, null);
    }

    @ExperimentalSharedTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SharedTransitionLayout(@Nullable Modifier modifier0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(2043053727);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2043053727, v2, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:111)");
            }
            SharedTransitionScopeKt.SharedTransitionScope(ComposableLambdaKt.rememberComposableLambda(-130587847, true, new m0(modifier0, function30, 1), composer1, 54), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s1(modifier0, function30, v, v1, 1));
        }
    }

    @ExperimentalSharedTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SharedTransitionScope(@NotNull Function4 function40, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x833C0783);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function40) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x833C0783, v1, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:138)");
            }
            LookaheadScopeKt.LookaheadScope(ComposableLambdaKt.rememberComposableLambda(0xCC80E542, true, new m1(function40), composer1, 54), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(function40, v, 12));
        }
    }

    public static final n access$ScaleToBoundsCached(ContentScale contentScale0, Alignment alignment0) {
        if(contentScale0 != ContentScale.Companion.getFillWidth() && contentScale0 != ContentScale.Companion.getFillHeight() && contentScale0 != ContentScale.Companion.getFillBounds() && contentScale0 != ContentScale.Companion.getFit() && contentScale0 != ContentScale.Companion.getCrop() && contentScale0 != ContentScale.Companion.getNone() && contentScale0 != ContentScale.Companion.getInside() || alignment0 != Alignment.Companion.getTopStart() && alignment0 != Alignment.Companion.getTopCenter() && alignment0 != Alignment.Companion.getTopEnd() && alignment0 != Alignment.Companion.getCenterStart() && alignment0 != Alignment.Companion.getCenter() && alignment0 != Alignment.Companion.getCenterEnd() && alignment0 != Alignment.Companion.getBottomStart() && alignment0 != Alignment.Companion.getBottomCenter() && alignment0 != Alignment.Companion.getBottomEnd()) {
            return new n(contentScale0, alignment0);
        }
        MutableScatterMap mutableScatterMap0 = SharedTransitionScopeKt.g;
        MutableScatterMap mutableScatterMap1 = mutableScatterMap0.get(contentScale0);
        if(mutableScatterMap1 == null) {
            mutableScatterMap1 = new MutableScatterMap(0, 1, null);
            mutableScatterMap0.set(contentScale0, mutableScatterMap1);
        }
        n n0 = mutableScatterMap1.get(alignment0);
        if(n0 == null) {
            n0 = new n(contentScale0, alignment0);
            mutableScatterMap1.set(alignment0, n0);
        }
        return n0;
    }

    public static final Modifier access$createContentScaleModifier(Modifier modifier0, n n0, Function0 function00) {
        if(Intrinsics.areEqual(n0.a, ContentScale.Companion.getCrop())) {
            a a0 = new a(function00, 20);
            return modifier0.then(GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, a0)).then(new SkipToLookaheadElement(n0, function00));
        }
        return modifier0.then(Modifier.Companion).then(new SkipToLookaheadElement(n0, function00));
    }

    @NotNull
    public static final SnapshotStateObserver getSharedTransitionObserver() {
        return (SnapshotStateObserver)SharedTransitionScopeKt.f.getValue();
    }
}

