package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.MainThread;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.ui.R.id;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A.\u0010\r\u001A\u00020\f*\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0011\u0010\u000B\u001A\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0000¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "container", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/ReusableComposition;", "createSubcomposition", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/runtime/Composition;", "setContent", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class Wrapper_androidKt {
    public static final ViewGroup.LayoutParams a;

    static {
        Wrapper_androidKt.a = new ViewGroup.LayoutParams(-2, -2);
    }

    @MainThread
    @NotNull
    public static final ReusableComposition createSubcomposition(@NotNull LayoutNode layoutNode0, @NotNull CompositionContext compositionContext0) {
        return CompositionKt.ReusableComposition(new UiApplier(layoutNode0), compositionContext0);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    public static final Composition setContent(@NotNull AbstractComposeView abstractComposeView0, @NotNull CompositionContext compositionContext0, @NotNull Function2 function20) {
        AndroidComposeView androidComposeView0;
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        Composition composition0 = null;
        if(abstractComposeView0.getChildCount() > 0) {
            View view0 = abstractComposeView0.getChildAt(0);
            androidComposeView0 = view0 instanceof AndroidComposeView ? ((AndroidComposeView)view0) : null;
        }
        else {
            abstractComposeView0.removeAllViews();
            androidComposeView0 = null;
        }
        if(androidComposeView0 == null) {
            androidComposeView0 = new AndroidComposeView(abstractComposeView0.getContext(), compositionContext0.getEffectCoroutineContext());
            abstractComposeView0.addView(androidComposeView0, Wrapper_androidKt.a);
        }
        Composition composition1 = CompositionKt.Composition(new UiApplier(androidComposeView0.getRoot()), compositionContext0);
        Object object0 = androidComposeView0.getTag(id.wrapped_composition_tag);
        if(object0 instanceof i2) {
            composition0 = (i2)object0;
        }
        if(composition0 == null) {
            composition0 = new i2(androidComposeView0, composition1);
            androidComposeView0.setTag(id.wrapped_composition_tag, composition0);
        }
        ((i2)composition0).setContent(function20);
        if(!Intrinsics.areEqual(androidComposeView0.getCoroutineContext(), compositionContext0.getEffectCoroutineContext())) {
            androidComposeView0.setCoroutineContext(compositionContext0.getEffectCoroutineContext());
        }
        return composition0;
    }
}

