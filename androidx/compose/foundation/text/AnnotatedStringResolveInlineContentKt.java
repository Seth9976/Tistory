package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import androidx.room.a;
import j0.g;
import j0.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\u001Af\u0010\u000E\u001A?\u0012\u0014\u0012\u0012\u0012\u000E\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001F\u0012\u001D\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0013\u0010\u0011\u001A\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A@\u0010\u0015\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00020\u00002\'\u0010\u0014\u001A#\u0012\u001F\u0012\u001D\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016*:\b\u0000\u0010\u0017\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0002\b\f0\u00072\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0002\b\f0\u0007*\u0018\b\u0000\u0010\u0018\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "resolveInlineContent", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)Lkotlin/Pair;", "", "hasInlineContent", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "text", "inlineContents", "InlineChildren", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,89:1\n33#2,6:90\n33#2,4:96\n38#2:134\n78#3:100\n76#3,8:101\n85#3,4:118\n89#3,2:128\n93#3:133\n368#4,9:109\n377#4,3:130\n4032#5,6:122\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n*L\n46#1:90,6\n75#1:96,4\n75#1:134\n76#1:100\n76#1:101,8\n76#1:118,4\n76#1:128,2\n76#1:133\n76#1:109,9\n76#1:130,3\n76#1:122,6\n*E\n"})
public final class AnnotatedStringResolveInlineContentKt {
    public static final Pair a;

    static {
        AnnotatedStringResolveInlineContentKt.a = new Pair(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(@NotNull AnnotatedString annotatedString0, @NotNull List list0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x95089FA9);
        int v1 = (v & 6) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(list0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x95089FA9, v1, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Range annotatedString$Range0 = (Range)list0.get(v3);
                Function3 function30 = (Function3)annotatedString$Range0.component1();
                int v4 = annotatedString$Range0.component2();
                int v5 = annotatedString$Range0.component3();
                g g0 = g.a;
                int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
                Updater.set-impl(composer1, g0, composeUiNode$Companion0.getSetMeasurePolicy());
                Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
                Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                    a.t(v6, composer1, v6, function20);
                }
                Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
                function30.invoke(annotatedString0.subSequence(v4, v5).getText(), composer1, 0);
                composer1.endNode();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(annotatedString0, list0, v));
        }
    }

    public static final boolean hasInlineContent(@NotNull AnnotatedString annotatedString0) {
        return annotatedString0.hasStringAnnotations("androidx.compose.foundation.text.inlineContent", 0, annotatedString0.getText().length());
    }

    @NotNull
    public static final Pair resolveInlineContent(@NotNull AnnotatedString annotatedString0, @Nullable Map map0) {
        if(map0 != null && !map0.isEmpty()) {
            List list0 = annotatedString0.getStringAnnotations("androidx.compose.foundation.text.inlineContent", 0, annotatedString0.getText().length());
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            int v1 = list0.size();
            for(int v = 0; v < v1; ++v) {
                Range annotatedString$Range0 = (Range)list0.get(v);
                InlineTextContent inlineTextContent0 = (InlineTextContent)map0.get(annotatedString$Range0.getItem());
                if(inlineTextContent0 != null) {
                    arrayList0.add(new Range(inlineTextContent0.getPlaceholder(), annotatedString$Range0.getStart(), annotatedString$Range0.getEnd()));
                    arrayList1.add(new Range(inlineTextContent0.getChildren(), annotatedString$Range0.getStart(), annotatedString$Range0.getEnd()));
                }
            }
            return new Pair(arrayList0, arrayList1);
        }
        return AnnotatedStringResolveInlineContentKt.a;
    }
}

