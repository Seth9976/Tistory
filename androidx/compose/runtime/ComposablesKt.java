package androidx.compose.runtime;

import a5.b;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\\\u0010\u0012\u001A\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0015\"\u000E\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000E\b\b\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001A\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001C\u0012\u0004\u0012\u00020\u00130\u001B\u00A2\u0006\u0002\b\u001D\u00A2\u0006\u0002\b\u001EH\u0087\b\u00A2\u0006\u0002\u0010\u001F\u001Ak\u0010\u0012\u001A\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000E\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000E\b\b\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001A\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001C\u0012\u0004\u0012\u00020\u00130\u001B\u00A2\u0006\u0002\b\u001D\u00A2\u0006\u0002\b\u001E2\u0011\u0010 \u001A\r\u0012\u0004\u0012\u00020\u00130\u0019\u00A2\u0006\u0002\b!H\u0087\b\u00A2\u0006\u0002\u0010\"\u001A\u0091\u0001\u0010\u0012\u001A\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000E\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000E\b\b\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001A\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001C\u0012\u0004\u0012\u00020\u00130\u001B\u00A2\u0006\u0002\b\u001D\u00A2\u0006\u0002\b\u001E2$\b\b\u0010#\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140$\u0012\u0004\u0012\u00020\u00130\u001B\u00A2\u0006\u0002\b!\u00A2\u0006\u0002\b\u001E2\u0011\u0010 \u001A\r\u0012\u0004\u0012\u00020\u00130\u0019\u00A2\u0006\u0002\b!H\u0087\b\u00A2\u0006\u0002\u0010%\u001A\\\u0010&\u001A\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0015\"\u000E\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000E\b\b\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001A\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001C\u0012\u0004\u0012\u00020\u00130\u001B\u00A2\u0006\u0002\b\u001D\u00A2\u0006\u0002\b\u001EH\u0087\b\u00A2\u0006\u0002\u0010\u001F\u001Ak\u0010&\u001A\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000E\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000E\b\b\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001A\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001C\u0012\u0004\u0012\u00020\u00130\u001B\u00A2\u0006\u0002\b\u001D\u00A2\u0006\u0002\b\u001E2\u0011\u0010 \u001A\r\u0012\u0004\u0012\u00020\u00130\u0019\u00A2\u0006\u0002\b!H\u0087\b\u00A2\u0006\u0002\u0010\"\u001A\u0091\u0001\u0010&\u001A\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000E\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000E\b\b\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001A\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001C\u0012\u0004\u0012\u00020\u00130\u001B\u00A2\u0006\u0002\b\u001D\u00A2\u0006\u0002\b\u001E2$\b\b\u0010#\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140$\u0012\u0004\u0012\u00020\u00130\u001B\u00A2\u0006\u0002\b!\u00A2\u0006\u0002\b\u001E2\u0011\u0010 \u001A\r\u0012\u0004\u0012\u00020\u00130\u0019\u00A2\u0006\u0002\b!H\u0087\b\u00A2\u0006\u0002\u0010%\u001A+\u0010\'\u001A\u00020\u00132\b\u0010(\u001A\u0004\u0018\u00010\u00152\u0011\u0010 \u001A\r\u0012\u0004\u0012\u00020\u00130\u0019\u00A2\u0006\u0002\b!H\u0087\b\u00A2\u0006\u0002\u0010)\u001A+\u0010*\u001A\u00020\u00132\u0006\u0010+\u001A\u00020,2\u0013\b\u0004\u0010 \u001A\r\u0012\u0004\u0012\u00020\u00130\u0019\u00A2\u0006\u0002\b!H\u0087\b\u00A2\u0006\u0002\u0010-\u001A\b\u0010.\u001A\u00020\u0013H\u0001\u001A?\u0010(\u001A\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0016\u0010/\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001500\"\u0004\u0018\u00010\u00152\u0011\u00101\u001A\r\u0012\u0004\u0012\u0002H\u00140\u0019\u00A2\u0006\u0002\b!H\u0087\b\u00A2\u0006\u0002\u00102\u001A)\u00103\u001A\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0013\b\u0004\u00104\u001A\r\u0012\u0004\u0012\u0002H\u00140\u0019\u00A2\u0006\u0002\b\u001DH\u0087\b\u00A2\u0006\u0002\u00105\u001A3\u00103\u001A\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001A\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001A\r\u0012\u0004\u0012\u0002H\u00140\u0019\u00A2\u0006\u0002\b\u001DH\u0087\b\u00A2\u0006\u0002\u00107\u001A=\u00103\u001A\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001A\u0004\u0018\u00010\u00152\b\u00108\u001A\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001A\r\u0012\u0004\u0012\u0002H\u00140\u0019\u00A2\u0006\u0002\b\u001DH\u0087\b\u00A2\u0006\u0002\u00109\u001AG\u00103\u001A\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001A\u0004\u0018\u00010\u00152\b\u00108\u001A\u0004\u0018\u00010\u00152\b\u0010:\u001A\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001A\r\u0012\u0004\u0012\u0002H\u00140\u0019\u00A2\u0006\u0002\b\u001DH\u0087\b\u00A2\u0006\u0002\u0010;\u001AA\u00103\u001A\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0016\u0010/\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001500\"\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001A\r\u0012\u0004\u0012\u0002H\u00140\u0019\u00A2\u0006\u0002\b\u001DH\u0087\b\u00A2\u0006\u0002\u0010<\u001A\r\u0010=\u001A\u00020>H\u0007\u00A2\u0006\u0002\u0010?\"\u0011\u0010\u0000\u001A\u00020\u00018G\u00A2\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001A\u00020\u00058G\u00A2\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001A\u00020\t8G\u00A2\u0006\f\u0012\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0011\u0010\u000E\u001A\u00020\u000F8G\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011\u00A8\u0006@"}, d2 = {"currentComposer", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentCompositeKeyHash", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositionLocalContext", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "()V", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "ComposeNode", "", "T", "", "E", "Landroidx/compose/runtime/Applier;", "factory", "Lkotlin/Function0;", "update", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Landroidx/compose/runtime/DisallowComposableCalls;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "skippableUpdate", "Landroidx/compose/runtime/SkippableUpdater;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "ReusableContent", "key", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableContentHost", "active", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "keys", "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "remember", "calculation", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "rememberCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,488:1\n1223#2,6:489\n1223#2,6:495\n1223#2,6:501\n1223#2,6:507\n1223#2,6:513\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:489,6\n37#1:495,6\n51#1:501,6\n69#1:507,6\n89#1:513,6\n*E\n"})
public final class ComposablesKt {
    @Composable
    public static final void ComposeNode(Function0 function00, Function1 function10, Composer composer0, int v) {
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(applier0 == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(composer0));
        composer0.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ComposeNode(Function0 function00, Function1 function10, Function2 function20, Composer composer0, int v) {
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(applier0 == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(composer0));
        b.y(composer0, v >> 6 & 14, function20);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final void ComposeNode(Function0 function00, Function1 function10, Function3 function30, Function2 function20, Composer composer0, int v) {
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(applier0 == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(composer0));
        a.w(v >> 3 & 0x70, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        function20.invoke(composer0, ((int)(v >> 9 & 14)));
        composer0.endReplaceableGroup();
        composer0.endNode();
    }

    @Composable
    public static final void ReusableComposeNode(Function0 function00, Function1 function10, Composer composer0, int v) {
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(applier0 == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(composer0));
        composer0.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableComposeNode(Function0 function00, Function1 function10, Function2 function20, Composer composer0, int v) {
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(applier0 == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(composer0));
        b.y(composer0, v >> 6 & 14, function20);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final void ReusableComposeNode(Function0 function00, Function1 function10, Function3 function30, Function2 function20, Composer composer0, int v) {
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(applier0 == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(composer0));
        a.w(v >> 3 & 0x70, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        function20.invoke(composer0, ((int)(v >> 9 & 14)));
        composer0.endReplaceableGroup();
        composer0.endNode();
    }

    @Composable
    public static final void ReusableContent(@Nullable Object object0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        composer0.startReusableGroup(0xCF, object0);
        function20.invoke(composer0, ((int)(v >> 3 & 14)));
        composer0.endReusableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        composer0.startReusableGroup(0xCF, Boolean.valueOf(z));
        boolean z1 = composer0.changed(z);
        composer0.startReplaceGroup(0xCC294FAD);
        if(z) {
            function20.invoke(composer0, ((int)(v >> 3 & 14)));
        }
        else {
            composer0.deactivateToEndGroup(z1);
        }
        composer0.endReplaceGroup();
        composer0.endReusableGroup();
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getCurrentComposer")
    @NotNull
    public static final Composer getCurrentComposer(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDEF6D01C, v, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:187)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @Composable
    @JvmName(name = "getCurrentCompositeKeyHash")
    public static final int getCurrentCompositeKeyHash(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1F4264F3, v, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int v1 = composer0.getCompoundKeyHash();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getCurrentCompositionLocalContext")
    @NotNull
    public static final CompositionLocalContext getCurrentCompositionLocalContext(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFD6A7EDC, v, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:211)");
        }
        CompositionLocalContext compositionLocalContext0 = new CompositionLocalContext(composer0.buildContext().getCompositionLocalScope$runtime_release());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionLocalContext0;
    }

    public static void getCurrentCompositionLocalContext$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getCurrentRecomposeScope")
    @NotNull
    public static final RecomposeScope getCurrentRecomposeScope(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x178A93E7, v, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        RecomposeScope recomposeScope0 = composer0.getRecomposeScope();
        if(recomposeScope0 == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer0.recordUsed(recomposeScope0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope0;
    }

    @PublishedApi
    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final Object key(@NotNull Object[] arr_object, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        return function20.invoke(composer0, ((int)(v >> 3 & 14)));
    }

    @Composable
    public static final Object remember(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        boolean z = composer0.changed(object0);
        boolean z1 = composer0.changed(object1);
        boolean z2 = composer0.changed(object2);
        Object object3 = composer0.rememberedValue();
        if((z | z1 | z2) != 0 || object3 == Composer.Companion.getEmpty()) {
            object3 = function00.invoke();
            composer0.updateRememberedValue(object3);
        }
        return object3;
    }

    @Composable
    public static final Object remember(@Nullable Object object0, @Nullable Object object1, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        boolean z = composer0.changed(object0);
        boolean z1 = composer0.changed(object1);
        Object object2 = composer0.rememberedValue();
        if(z || z1 || object2 == Composer.Companion.getEmpty()) {
            object2 = function00.invoke();
            composer0.updateRememberedValue(object2);
        }
        return object2;
    }

    @Composable
    public static final Object remember(@Nullable Object object0, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        boolean z = composer0.changed(object0);
        Object object1 = composer0.rememberedValue();
        if(z || object1 == Composer.Companion.getEmpty()) {
            object1 = function00.invoke();
            composer0.updateRememberedValue(object1);
        }
        return object1;
    }

    @Composable
    public static final Object remember(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Object object0 = composer0.rememberedValue();
        if(object0 == Composer.Companion.getEmpty()) {
            object0 = function00.invoke();
            composer0.updateRememberedValue(object0);
        }
        return object0;
    }

    @Composable
    public static final Object remember(@NotNull Object[] arr_object, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        boolean z = false;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            z |= composer0.changed(arr_object[v1]);
        }
        Object object0 = composer0.rememberedValue();
        if(z || object0 == Composer.Companion.getEmpty()) {
            object0 = function00.invoke();
            composer0.updateRememberedValue(object0);
        }
        return object0;
    }

    @Composable
    @NotNull
    public static final CompositionContext rememberCompositionContext(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBA8383F4, v, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        CompositionContext compositionContext0 = composer0.buildContext();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionContext0;
    }
}

