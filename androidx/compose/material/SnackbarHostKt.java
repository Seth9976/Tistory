package androidx.compose.material;

import aa.x;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.util.ListUtilsKt;
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
import p0.a9;
import p0.j4;
import p0.k4;
import p0.w8;
import p0.x8;
import p0.y8;
import p0.z8;
import r0.a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A<\u0010\t\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0019\b\u0002\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001A%\u0010\u0011\u001A\u00020\u0010*\u00020\u000B2\u0006\u0010\r\u001A\u00020\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0000¢\u0006\u0004\b\u0011\u0010\u0012*b\b\u0002\u0010\u0017\"-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0007¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0007¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "SnackbarHost", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "toMillis", "(Landroidx/compose/material/SnackbarDuration;ZLandroidx/compose/ui/platform/AccessibilityManager;)J", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "content", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,381:1\n74#2:382\n25#3:383\n456#3,8:428\n464#3,3:442\n467#3,3:452\n25#3:457\n25#3:464\n1116#4,6:384\n1116#4,6:458\n1116#4,6:465\n151#5,3:390\n33#5,4:393\n154#5,2:397\n38#5:399\n156#5:400\n200#5,2:401\n33#5,4:403\n202#5,2:407\n38#5:409\n204#5:410\n33#5,6:446\n68#6,6:411\n74#6:445\n78#6:456\n79#7,11:417\n92#7:455\n3737#8,6:436\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n160#1:382\n265#1:383\n323#1:428,8\n323#1:442,3\n323#1:452,3\n355#1:457\n368#1:464\n265#1:384,6\n355#1:458,6\n368#1:465,6\n268#1:390,3\n268#1:393,4\n268#1:397,2\n268#1:399\n268#1:400\n273#1:401,2\n273#1:403,4\n273#1:407,2\n273#1:409\n273#1:410\n325#1:446,6\n323#1:411,6\n323#1:445\n323#1:456\n323#1:417,11\n323#1:455\n323#1:436,6\n*E\n"})
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
        Composer composer1 = composer0.startRestartGroup(0x19B0B9FC);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(snackbarHostState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            if((v1 & 4) != 0) {
                function30 = ComposableSingletons.SnackbarHostKt.INSTANCE.getLambda-1$material_release();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x19B0B9FC, v2, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:157)");
            }
            SnackbarData snackbarData0 = snackbarHostState0.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(snackbarData0, new x8(snackbarData0, ((AccessibilityManager)composer1.consume(CompositionLocalsKt.getLocalAccessibilityManager())), null), composer1, 0x40);
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
            scopeUpdateScope0.updateScope(new sf(snackbarHostState0, modifier0, function30, v, v1, 15));
        }
    }

    public static final void a(SnackbarData snackbarData0, Modifier modifier0, Function3 function30, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x795CF2BD);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(snackbarData0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x795CF2BD, v2, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:263)");
            }
            composer1.startReplaceableGroup(0xE2A708A4);
            k4 k40 = composer1.rememberedValue();
            if(k40 == Composer.Companion.getEmpty()) {
                k40 = new k4();  // 初始化器: Ljava/lang/Object;-><init>()V
                k40.a = new Object();
                k40.b = new ArrayList();
                composer1.updateRememberedValue(k40);
            }
            composer1.endReplaceableGroup();
            boolean z = Intrinsics.areEqual(snackbarData0, k40.a);
            ArrayList arrayList0 = k40.b;
            if(!z) {
                k40.a = snackbarData0;
                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                int v3 = arrayList0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    arrayList1.add(((j4)arrayList0.get(v4)).a);
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
                    arrayList0.add(new j4(snackbarData1, ComposableLambdaKt.composableLambda(composer1, 1471040642, true, new w8(snackbarData1, snackbarData0, list0, k40))));
                }
            }
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer1, 0, -1323940314);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier1);
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                androidx.room.a.t(v7, composer1, v7, function20);
            }
            a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            k40.c = ComposablesKt.getCurrentRecomposeScope(composer1, 0);
            composer1.startReplaceableGroup(-1656513092);
            int v8 = arrayList0.size();
            for(int v9 = 0; v9 < v8; ++v9) {
                j4 j40 = (j4)arrayList0.get(v9);
                composer1.startMovableGroup(-208579669, j40.a);
                ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 2041982076, true, new x(26, function30, j40.a));
                j40.b.invoke(composableLambda0, composer1, 6);
                composer1.endMovableGroup();
            }
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(snackbarData0, modifier1, function30, v, v1, 14));
        }
    }

    public static final State access$animatedOpacity(AnimationSpec animationSpec0, boolean z, Function0 function00, Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x3C954F6F);
        if((v1 & 4) != 0) {
            function00 = y8.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3C954F6F, v, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:353)");
        }
        composer0.startReplaceableGroup(0xE2A708A4);
        Animatable animatable0 = composer0.rememberedValue();
        if(animatable0 == Composer.Companion.getEmpty()) {
            animatable0 = AnimatableKt.Animatable$default((z ? 0.0f : 1.0f), 0.0f, 2, null);
            composer0.updateRememberedValue(animatable0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new z8(animatable0, z, animationSpec0, function00, null), composer0, v >> 3 & 14 | 0x40);
        State state0 = animatable0.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    public static final State access$animatedScale(AnimationSpec animationSpec0, boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(2003504988);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, v, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:366)");
        }
        composer0.startReplaceableGroup(0xE2A708A4);
        Animatable animatable0 = composer0.rememberedValue();
        if(animatable0 == Composer.Companion.getEmpty()) {
            animatable0 = AnimatableKt.Animatable$default((z ? 0.8f : 1.0f), 0.0f, 2, null);
            composer0.updateRememberedValue(animatable0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new a9(animatable0, z, animationSpec0, null), composer0, v >> 3 & 14 | 0x40);
        State state0 = animatable0.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
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

