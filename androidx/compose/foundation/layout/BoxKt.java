package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\u001AL\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u001C\u0010\u000B\u001A\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001A\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u001F\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0017\u0010\f\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0014\"\u001A\u0010\u0019\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Box", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "alignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "maybeCachedBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "d", "Landroidx/compose/ui/layout/MeasurePolicy;", "getEmptyBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,339:1\n78#2,6:340\n85#2,4:355\n89#2,2:365\n93#2:370\n124#2,6:377\n131#2,5:392\n136#2:403\n138#2:406\n368#3,9:346\n377#3,3:367\n289#3,9:383\n298#3,2:404\n4032#4,6:359\n4032#4,6:397\n1223#5,6:371\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n73#1:340,6\n73#1:355,4\n73#1:365,2\n73#1:370\n238#1:377,6\n238#1:392,5\n238#1:403\n238#1:406\n73#1:346,9\n73#1:367,3\n238#1:383,9\n238#1:404,2\n73#1:359,6\n238#1:397,6\n117#1:371,6\n*E\n"})
public final class BoxKt {
    public static final HashMap a;
    public static final HashMap b;
    public static final x c;
    public static final t d;

    static {
        BoxKt.a = BoxKt.a(true);
        BoxKt.b = BoxKt.a(false);
        BoxKt.c = new x(Alignment.Companion.getTopStart(), false);
        BoxKt.d = t.b;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Box(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-211209833);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, v1, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, BoxKt.d, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function20);
            }
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(modifier0, v, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(@Nullable Modifier modifier0, @Nullable Alignment alignment0, boolean z, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            modifier0 = Modifier.Companion;
        }
        if((v1 & 2) != 0) {
            alignment0 = Alignment.Companion.getTopStart();
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment0, z);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        function30.invoke(BoxScopeInstance.INSTANCE, composer0, ((int)(v >> 6 & 0x70 | 6)));
        composer0.endNode();
    }

    public static final HashMap a(boolean z) {
        HashMap hashMap0 = new HashMap(9);
        BoxKt.b(hashMap0, z, Alignment.Companion.getTopStart());
        BoxKt.b(hashMap0, z, Alignment.Companion.getTopCenter());
        BoxKt.b(hashMap0, z, Alignment.Companion.getTopEnd());
        BoxKt.b(hashMap0, z, Alignment.Companion.getCenterStart());
        BoxKt.b(hashMap0, z, Alignment.Companion.getCenter());
        BoxKt.b(hashMap0, z, Alignment.Companion.getCenterEnd());
        BoxKt.b(hashMap0, z, Alignment.Companion.getBottomStart());
        BoxKt.b(hashMap0, z, Alignment.Companion.getBottomCenter());
        BoxKt.b(hashMap0, z, Alignment.Companion.getBottomEnd());
        return hashMap0;
    }

    public static final boolean access$getMatchesParentSize(Measurable measurable0) {
        Object object0 = measurable0.getParentData();
        p p0 = object0 instanceof p ? ((p)object0) : null;
        return p0 == null ? false : p0.o;
    }

    public static final void access$placeInBox(PlacementScope placeable$PlacementScope0, Placeable placeable0, Measurable measurable0, LayoutDirection layoutDirection0, int v, int v1, Alignment alignment0) {
        Alignment alignment2;
        Object object0 = measurable0.getParentData();
        p p0 = object0 instanceof p ? ((p)object0) : null;
        if(p0 == null) {
            alignment2 = alignment0;
        }
        else {
            Alignment alignment1 = p0.n;
            alignment2 = alignment1 == null ? alignment0 : alignment1;
        }
        PlacementScope.place-70tqf50$default(placeable$PlacementScope0, placeable0, alignment2.align-KFBX0sM(IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight()), IntSizeKt.IntSize(v, v1), layoutDirection0), 0.0f, 2, null);
    }

    public static final void b(HashMap hashMap0, boolean z, Alignment alignment0) {
        hashMap0.put(alignment0, new x(alignment0, z));
    }

    @NotNull
    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return BoxKt.d;
    }

    @PublishedApi
    @NotNull
    public static final MeasurePolicy maybeCachedBoxMeasurePolicy(@NotNull Alignment alignment0, boolean z) {
        MeasurePolicy measurePolicy0 = (MeasurePolicy)(z ? BoxKt.a : BoxKt.b).get(alignment0);
        return measurePolicy0 == null ? new x(alignment0, z) : measurePolicy0;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rememberBoxMeasurePolicy(@NotNull Alignment alignment0, boolean z, @Nullable Composer composer0, int v) {
        MeasurePolicy measurePolicy0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, v, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)");
        }
        if(!Intrinsics.areEqual(alignment0, Alignment.Companion.getTopStart()) || z) {
            composer0.startReplaceGroup(-1710100211);
            int v1 = 0;
            int v2 = ((v & 14 ^ 6) <= 4 || !composer0.changed(alignment0)) && (v & 6) != 4 ? 0 : 1;
            if((v & 0x70 ^ 0x30) > 0x20 && composer0.changed(z) || (v & 0x30) == 0x20) {
                v1 = 1;
            }
            x x0 = composer0.rememberedValue();
            if((v2 | v1) != 0 || x0 == Composer.Companion.getEmpty()) {
                x0 = new x(alignment0, z);
                composer0.updateRememberedValue(x0);
            }
            measurePolicy0 = x0;
            composer0.endReplaceGroup();
        }
        else {
            composer0.startReplaceGroup(-1710139705);
            composer0.endReplaceGroup();
            measurePolicy0 = BoxKt.c;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy0;
    }
}

