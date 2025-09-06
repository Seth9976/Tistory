package com.kakao.tistory.presentation.common.tiara;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.compose.LifecycleEffectKt;
import com.kakao.tiara.data.ActionKind;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u001AM\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000B\u001AI\u0010\f\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000E¨\u0006\u000F²\u0006\u0018\u0010\u0010\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u008A\u0084\u0002"}, d2 = {"TrackPage", "", "section", "", "page", "key", "", "actionKind", "Lcom/kakao/tiara/data/ActionKind;", "customProperties", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/kakao/tiara/data/ActionKind;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "TrackUsage", "actionName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease", "customPropertiesState"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTiaraExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiaraExtension.kt\ncom/kakao/tistory/presentation/common/tiara/TiaraExtensionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,59:1\n1223#2,6:60\n81#3:66\n*S KotlinDebug\n*F\n+ 1 TiaraExtension.kt\ncom/kakao/tistory/presentation/common/tiara/TiaraExtensionKt\n*L\n31#1:60,6\n29#1:66\n*E\n"})
public final class TiaraExtensionKt {
    @Composable
    public static final void TrackPage(@NotNull String s, @NotNull String s1, @Nullable Object object0, @Nullable ActionKind actionKind0, @Nullable Map map0, @Nullable Composer composer0, int v, int v1) {
        Map map1;
        Object object1;
        ActionKind actionKind1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(s1, "page");
        Composer composer1 = composer0.startRestartGroup(0x8BF63C04);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            actionKind1 = actionKind0;
        }
        else if((v & 0x1C00) == 0) {
            actionKind1 = actionKind0;
            v2 |= (composer1.changed(actionKind1) ? 0x800 : 0x400);
        }
        else {
            actionKind1 = actionKind0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x2000;
        }
        if((v1 & 20) != 20 || (0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            Object object2 = (v1 & 4) == 0 ? object0 : null;
            ActionKind actionKind2 = (v1 & 8) == 0 ? actionKind1 : null;
            Map map2 = (v1 & 16) == 0 ? map0 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8BF63C04, v2, -1, "com.kakao.tistory.presentation.common.tiara.TrackPage (TiaraExtension.kt:14)");
            }
            EffectsKt.LaunchedEffect(object2, s, s1, new a(s, s1, actionKind2, map2, null), composer1, v2 << 3 & 0x70 | 0x1008 | v2 << 3 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            object1 = object2;
            actionKind1 = actionKind2;
            map1 = map2;
        }
        else {
            composer1.skipToGroupEnd();
            object1 = object0;
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(s, s1, object1, actionKind1, map1, v, v1));
        }
    }

    @Composable
    public static final void TrackUsage(@NotNull String s, @NotNull String s1, @NotNull String s2, @Nullable Object object0, @Nullable Map map0, @Nullable Composer composer0, int v, int v1) {
        Map map1;
        Object object1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(s2, "actionName");
        Composer composer1 = composer0.startRestartGroup(0x1ED8C133);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s2) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x400;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x2000;
        }
        if((v1 & 24) != 24 || (0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            Object object2 = (v1 & 8) == 0 ? object0 : null;
            Map map2 = (v1 & 16) == 0 ? map0 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1ED8C133, v2, -1, "com.kakao.tistory.presentation.common.tiara.TrackUsage (TiaraExtension.kt:27)");
            }
            State state0 = SnapshotStateKt.rememberUpdatedState(map2, composer1, 8);
            composer1.startReplaceGroup(0x4A6855BF);
            boolean z = composer1.changed(state0);
            c c0 = composer1.rememberedValue();
            if((((v2 & 14) == 4 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 0x380) == 0x100 ? 1 : 0) | z) != 0 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(s, s1, s2, state0);
                composer1.updateRememberedValue(c0);
            }
            composer1.endReplaceGroup();
            LifecycleEffectKt.LifecycleResumeEffect(object2, s, s1, null, c0, composer1, 8 | v2 << 3 & 0x70 | v2 << 3 & 0x380, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            object1 = object2;
            map1 = map2;
        }
        else {
            composer1.skipToGroupEnd();
            object1 = object0;
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(s, s1, s2, object1, map1, v, v1));
        }
    }

    public static final Map access$TrackUsage$lambda$0(State state0) {
        return (Map)state0.getValue();
    }
}

