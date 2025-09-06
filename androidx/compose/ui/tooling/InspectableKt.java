package androidx.compose.ui.tooling;

import androidx.compose.foundation.text.selection.s;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.InspectionModeKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o2.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A \u0010\u0000\u001A\u00020\u00012\u0011\u0010\u0002\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001A(\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0011\u0010\u0002\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"InInspectionModeOnly", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Inspectable", "compositionDataRecord", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "(Landroidx/compose/ui/tooling/CompositionDataRecord;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "InspectableKt")
@SourceDebugExtension({"SMAP\nInspectable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Inspectable.android.kt\nandroidx/compose/ui/tooling/InspectableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,80:1\n77#2:81\n*S KotlinDebug\n*F\n+ 1 Inspectable.android.kt\nandroidx/compose/ui/tooling/InspectableKt\n*L\n76#1:81\n*E\n"})
public final class InspectableKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Deprecated(message = "This method should not be used in application code and will be removed soon.")
    public static final void InInspectionModeOnly(@NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x1CE68072);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1CE68072, v1, -1, "androidx.compose.ui.tooling.InInspectionModeOnly (Inspectable.android.kt:74)");
            }
            if(((Boolean)composer1.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                composer1.startReplaceGroup(0x8F5F01A4);
                function20.invoke(composer1, ((int)(v1 & 14)));
            }
            else {
                composer1.startReplaceGroup(0x8F5F5F7D);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(v, 3, function20));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void Inspectable(@NotNull CompositionDataRecord compositionDataRecord0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x9C7D7BAF);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(compositionDataRecord0) : composer1.changedInstance(compositionDataRecord0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9C7D7BAF, v1, -1, "androidx.compose.ui.tooling.Inspectable (Inspectable.android.kt:56)");
            }
            composer1.collectParameterInformation();
            Intrinsics.checkNotNull(compositionDataRecord0, "null cannot be cast to non-null type androidx.compose.ui.tooling.CompositionDataRecordImpl");
            CompositionData compositionData0 = composer1.getCompositionData();
            ((d)compositionDataRecord0).a.add(compositionData0);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{InspectionModeKt.getLocalInspectionMode().provides(Boolean.TRUE), InspectionTablesKt.getLocalInspectionTables().provides(((d)compositionDataRecord0).a)}, function20, composer1, v1 & 0x70 | ProvidedValue.$stable);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new aa.d(compositionDataRecord0, function20, v, 18));
        }
    }
}

