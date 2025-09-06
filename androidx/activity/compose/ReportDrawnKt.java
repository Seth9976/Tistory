package androidx.activity.compose;

import aa.o;
import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.y1;
import ca.h;
import eb.d;
import j.a;
import j.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001A+\u0010\u0003\u001A\u00020\u00012\u001C\u0010\u0004\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007¢\u0006\u0002\u0010\b\u001A\u001B\u0010\t\u001A\u00020\u00012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\f0\u000BH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"ReportDrawn", "", "(Landroidx/compose/runtime/Composer;I)V", "ReportDrawnAfter", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReportDrawnWhen", "predicate", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n955#2,6:177\n955#2,6:183\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n*L\n133#1:177,6\n172#1:183,6\n*E\n"})
public final class ReportDrawnKt {
    @Composable
    public static final void ReportDrawn(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAF1DA058);
        if(v != 0 || !composer1.getSkipping()) {
            ReportDrawnKt.ReportDrawnWhen(a.B, composer1, 6);
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 8));
        }
    }

    @Composable
    public static final void ReportDrawnAfter(@NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x38584E28);
        int v1 = (v & 6) == 0 ? (composer1.changed(function10) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            goto label_18;
        }
        FullyDrawnReporterOwner fullyDrawnReporterOwner0 = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composer1, 6);
        if(fullyDrawnReporterOwner0 != null) {
            FullyDrawnReporter fullyDrawnReporter0 = fullyDrawnReporterOwner0.getFullyDrawnReporter();
            if(fullyDrawnReporter0 != null) {
                composer1.startReplaceableGroup(-100805929);
                boolean z = composer1.changed(fullyDrawnReporter0);
                boolean z1 = composer1.changed(function10);
                k k0 = composer1.rememberedValue();
                if(z || z1 || k0 == Composer.Companion.getEmpty()) {
                    k0 = new k(fullyDrawnReporter0, function10, null);
                    composer1.updateRememberedValue(k0);
                }
                composer1.endReplaceableGroup();
                EffectsKt.LaunchedEffect(function10, fullyDrawnReporter0, k0, composer1, v1 & 14);
            label_18:
                ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                if(scopeUpdateScope0 != null) {
                    scopeUpdateScope0.updateScope(new y1(v, 1, function10));
                }
                return;
            }
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new y1(v, 2, function10));
        }
    }

    @Composable
    public static final void ReportDrawnWhen(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x85FB6D86);
        int v1 = (v & 6) == 0 ? (composer1.changed(function00) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            goto label_18;
        }
        FullyDrawnReporterOwner fullyDrawnReporterOwner0 = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composer1, 6);
        if(fullyDrawnReporterOwner0 != null) {
            FullyDrawnReporter fullyDrawnReporter0 = fullyDrawnReporterOwner0.getFullyDrawnReporter();
            if(fullyDrawnReporter0 != null) {
                composer1.startReplaceableGroup(-537074000);
                boolean z = composer1.changed(fullyDrawnReporter0);
                boolean z1 = composer1.changed(function00);
                o o0 = composer1.rememberedValue();
                if(z || z1 || o0 == Composer.Companion.getEmpty()) {
                    o0 = new o(28, fullyDrawnReporter0, function00);
                    composer1.updateRememberedValue(o0);
                }
                composer1.endReplaceableGroup();
                EffectsKt.DisposableEffect(fullyDrawnReporter0, function00, o0, composer1, v1 << 3 & 0x70);
            label_18:
                ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                if(scopeUpdateScope0 != null) {
                    scopeUpdateScope0.updateScope(new d(function00, v, 3));
                }
                return;
            }
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new d(function00, v, 4));
        }
    }
}

