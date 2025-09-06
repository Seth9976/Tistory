package androidx.compose.material3;

import aa.x;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.room.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A<\u0010\t\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0019\b\u0002\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001A%\u0010\u0011\u001A\u00020\u0010*\u00020\u000B2\u0006\u0010\r\u001A\u00020\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0000¢\u0006\u0004\b\u0011\u0010\u0012*b\b\u0002\u0010\u0017\"-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0007¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0007¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material3/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "SnackbarHost", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "toMillis", "(Landroidx/compose/material3/SnackbarDuration;ZLandroidx/compose/ui/platform/AccessibilityManager;)J", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "content", "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,440:1\n77#2:441\n1223#3,6:442\n1223#3,6:448\n1223#3,6:521\n1223#3,6:527\n1223#3,6:533\n1223#3,6:539\n151#4,3:454\n33#4,4:457\n154#4,2:461\n38#4:463\n156#4:464\n200#4,2:465\n33#4,4:467\n202#4,2:471\n38#4:473\n204#4:474\n33#4,6:511\n71#5:475\n68#5,6:476\n74#5:510\n78#5:520\n78#6,6:482\n85#6,4:497\n89#6,2:507\n93#6:519\n368#7,9:488\n377#7:509\n378#7,2:517\n4032#8,6:501\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n*L\n224#1:441\n225#1:442,6\n329#1:448,6\n420#1:521,6\n421#1:527,6\n430#1:533,6\n431#1:539,6\n332#1:454,3\n332#1:457,4\n332#1:461,2\n332#1:463\n332#1:464\n337#1:465,2\n337#1:467,4\n337#1:471,2\n337#1:473\n337#1:474\n396#1:511,6\n394#1:475\n394#1:476,6\n394#1:510\n394#1:520\n394#1:482,6\n394#1:497,4\n394#1:507,2\n394#1:519\n394#1:488,9\n394#1:509\n394#1:517,2\n394#1:501,6\n*E\n"})
public final class SnackbarHostKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[SnackbarDuration.values().length];
            try {
                arr_v[SnackbarDuration.Indefinite.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SnackbarDuration.Long.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SnackbarDuration.Short.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SnackbarHost(@NotNull SnackbarHostState snackbarHostState0, @Nullable Modifier modifier0, @Nullable Function3 function30, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x1BAACC01);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(snackbarHostState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            if((v1 & 4) != 0) {
                function30 = ComposableSingletons.SnackbarHostKt.INSTANCE.getLambda-1$material3_release();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1BAACC01, v2, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)");
            }
            SnackbarData snackbarData0 = snackbarHostState0.getCurrentSnackbarData();
            AccessibilityManager accessibilityManager0 = (AccessibilityManager)composer1.consume(CompositionLocalsKt.getLocalAccessibilityManager());
            boolean z = composer1.changed(snackbarData0);
            boolean z1 = composer1.changedInstance(accessibilityManager0);
            vl vl0 = composer1.rememberedValue();
            if(z || z1 || vl0 == Composer.Companion.getEmpty()) {
                vl0 = new vl(snackbarData0, accessibilityManager0, null);
                composer1.updateRememberedValue(vl0);
            }
            EffectsKt.LaunchedEffect(snackbarData0, vl0, composer1, 0);
            SnackbarHostKt.a(snackbarHostState0.getCurrentSnackbarData(), modifier0, function30, composer1, v2 & 0x3F0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(snackbarHostState0, modifier0, function30, v, v1, 2));
        }
    }

    public static final void a(SnackbarData snackbarData0, Modifier modifier0, Function3 function30, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xB185AB60);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(snackbarData0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB185AB60, v2, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
            }
            fa fa0 = composer1.rememberedValue();
            if(fa0 == Composer.Companion.getEmpty()) {
                fa0 = new fa();  // 初始化器: Ljava/lang/Object;-><init>()V
                fa0.a = new Object();
                fa0.b = new ArrayList();
                composer1.updateRememberedValue(fa0);
            }
            composer1.startReplaceGroup(0xB516941D);
            boolean z = Intrinsics.areEqual(snackbarData0, fa0.a);
            ArrayList arrayList0 = fa0.b;
            if(!z) {
                fa0.a = snackbarData0;
                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                int v3 = arrayList0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    arrayList1.add(((ea)arrayList0.get(v4)).a);
                }
                List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList1);
                if(!list0.contains(snackbarData0)) {
                    list0.add(snackbarData0);
                }
                arrayList0.clear();
                List list1 = ListUtilsKt.fastFilterNotNull(list0);
                int v5 = list1.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    SnackbarData snackbarData1 = (SnackbarData)list1.get(v6);
                    arrayList0.add(new ea(snackbarData1, ComposableLambdaKt.rememberComposableLambda(0x9D5F8A3B, true, new ul(snackbarData1, snackbarData0, list0, fa0), composer1, 54)));
                }
            }
            composer1.endReplaceGroup();
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                a.t(v7, composer1, v7, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            fa0.c = ComposablesKt.getCurrentRecomposeScope(composer1, 0);
            composer1.startReplaceGroup(1748085441);
            int v8 = arrayList0.size();
            for(int v9 = 0; v9 < v8; ++v9) {
                ea ea0 = (ea)arrayList0.get(v9);
                composer1.startMovableGroup(1201076541, ea0.a);
                ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xBC53A981, true, new x(7, function30, ea0.a), composer1, 54);
                ea0.b.invoke(composableLambda0, composer1, 6);
                composer1.endMovableGroup();
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(snackbarData0, modifier1, function30, v, v1, 1));
        }
    }

    public static final State access$animatedOpacity(AnimationSpec animationSpec0, boolean z, Function0 function00, Composer composer0, int v, int v1) {
        if((v1 & 4) != 0) {
            function00 = wl.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5558E4EE, v, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)");
        }
        Animatable animatable0 = composer0.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(animatable0 == composer$Companion0.getEmpty()) {
            animatable0 = AnimatableKt.Animatable$default((z ? 0.0f : 1.0f), 0.0f, 2, null);
            composer0.updateRememberedValue(animatable0);
        }
        Boolean boolean0 = Boolean.valueOf(z);
        boolean z1 = composer0.changedInstance(animatable0);
        int v2 = 0;
        boolean z2 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changed(z) || (v & 0x30) == 0x20;
        boolean z3 = composer0.changedInstance(animationSpec0);
        if((v & 0x380 ^ 0x180) > 0x100 && composer0.changed(function00) || (v & 0x180) == 0x100) {
            v2 = 1;
        }
        xl xl0 = composer0.rememberedValue();
        if((z1 | z2 | z3 | v2) != 0 || xl0 == composer$Companion0.getEmpty()) {
            xl xl1 = new xl(animatable0, z, animationSpec0, function00, null);
            composer0.updateRememberedValue(xl1);
            xl0 = xl1;
        }
        EffectsKt.LaunchedEffect(boolean0, xl0, composer0, v >> 3 & 14);
        State state0 = animatable0.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    public static final State access$animatedScale(AnimationSpec animationSpec0, boolean z, Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1966809761, v, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)");
        }
        Animatable animatable0 = composer0.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(animatable0 == composer$Companion0.getEmpty()) {
            animatable0 = AnimatableKt.Animatable$default((z ? 0.8f : 1.0f), 0.0f, 2, null);
            composer0.updateRememberedValue(animatable0);
        }
        Boolean boolean0 = Boolean.valueOf(z);
        boolean z1 = composer0.changedInstance(animatable0);
        boolean z2 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changed(z) || (v & 0x30) == 0x20;
        boolean z3 = composer0.changedInstance(animationSpec0);
        yl yl0 = composer0.rememberedValue();
        if((z1 | z2 | z3) != 0 || yl0 == composer$Companion0.getEmpty()) {
            yl0 = new yl(animatable0, z, animationSpec0, null);
            composer0.updateRememberedValue(yl0);
        }
        EffectsKt.LaunchedEffect(boolean0, yl0, composer0, v >> 3 & 14);
        State state0 = animatable0.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    public static final long toMillis(@NotNull SnackbarDuration snackbarDuration0, boolean z, @Nullable AccessibilityManager accessibilityManager0) {
        switch(WhenMappings.$EnumSwitchMapping$0[snackbarDuration0.ordinal()]) {
            case 1: {
                return accessibilityManager0 == null ? 0x7FFFFFFFFFFFFFFFL : accessibilityManager0.calculateRecommendedTimeoutMillis(0x7FFFFFFFFFFFFFFFL, true, true, z);
            }
            case 2: {
                return accessibilityManager0 == null ? 10000L : accessibilityManager0.calculateRecommendedTimeoutMillis(10000L, true, true, z);
            }
            case 3: {
                return accessibilityManager0 == null ? 4000L : accessibilityManager0.calculateRecommendedTimeoutMillis(4000L, true, true, z);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

