package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import j2.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.b0;
import o0.b;
import o0.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00A8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001dB\u00C7\u0001\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0016\b\u0002\u0010\u000E\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001E\b\u0002\u0010\u001B\u001A\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\u0016\b\u0002\u0010!\u001A\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000B\u00A2\u0006\u0004\b\"\u0010#J\u001F\u0010%\u001A\u00020\u00112\b\u0010$\u001A\u0004\u0018\u00010\u001E2\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010)\u001A\u00020\u00112\u0006\u0010\u0006\u001A\u00020\u0005H\u0000\u00A2\u0006\u0004\b\'\u0010(JV\u0010,\u001A\u00020\u00112\u0006\u0010\b\u001A\u00020\u00072\u0014\u0010\u0019\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\u000F\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+Ja\u0010-\u001A\u00020\u00112\u0014\u0010\u000E\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B2\u001C\u0010\u001B\u001A\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\u0014\u0010!\u001A\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000B\u00A2\u0006\u0004\b-\u0010.J-\u00103\u001A\u00020\r2\u0006\u0010/\u001A\u00020\u00112\u0006\u00100\u001A\u00020\u00112\u0006\u00101\u001A\u00020\u00112\u0006\u00102\u001A\u00020\u0011\u00A2\u0006\u0004\b3\u00104J\u000F\u00107\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b5\u00106J\u0013\u00109\u001A\u00020\r*\u000208H\u0016\u00A2\u0006\u0004\b9\u0010:J(\u0010D\u001A\u00020A2\u0006\u0010<\u001A\u00020;2\u0006\u0010>\u001A\u00020=2\u0006\u0010@\u001A\u00020?\u00F8\u0001\u0000\u00A2\u0006\u0004\bB\u0010CJ&\u0010F\u001A\u00020A*\u00020;2\u0006\u0010>\u001A\u00020=2\u0006\u0010@\u001A\u00020?H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bE\u0010CJ%\u0010K\u001A\u00020\u00132\u0006\u0010H\u001A\u00020G2\u0006\u0010>\u001A\u00020I2\u0006\u0010J\u001A\u00020\u0013\u00A2\u0006\u0004\bK\u0010LJ#\u0010M\u001A\u00020\u0013*\u00020G2\u0006\u0010>\u001A\u00020I2\u0006\u0010J\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\bM\u0010LJ%\u0010O\u001A\u00020\u00132\u0006\u0010H\u001A\u00020G2\u0006\u0010>\u001A\u00020I2\u0006\u0010N\u001A\u00020\u0013\u00A2\u0006\u0004\bO\u0010LJ#\u0010P\u001A\u00020\u0013*\u00020G2\u0006\u0010>\u001A\u00020I2\u0006\u0010N\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\bP\u0010LJ%\u0010Q\u001A\u00020\u00132\u0006\u0010H\u001A\u00020G2\u0006\u0010>\u001A\u00020I2\u0006\u0010J\u001A\u00020\u0013\u00A2\u0006\u0004\bQ\u0010LJ#\u0010R\u001A\u00020\u0013*\u00020G2\u0006\u0010>\u001A\u00020I2\u0006\u0010J\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\bR\u0010LJ%\u0010S\u001A\u00020\u00132\u0006\u0010H\u001A\u00020G2\u0006\u0010>\u001A\u00020I2\u0006\u0010N\u001A\u00020\u0013\u00A2\u0006\u0004\bS\u0010LJ#\u0010T\u001A\u00020\u0013*\u00020G2\u0006\u0010>\u001A\u00020I2\u0006\u0010N\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\bT\u0010LJ\u0015\u0010W\u001A\u00020\r2\u0006\u0010V\u001A\u00020U\u00A2\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001A\u00020\r*\u00020UH\u0016\u00A2\u0006\u0004\bY\u0010XR$\u0010`\u001A\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010c\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006e"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "updateDraw", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "updateText$foundation_release", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "updateText", "updateLayoutRelatedArgs-MPT68mk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "updateCallbacks", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Lkotlin/jvm/functions/Function1;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "doInvalidations", "(ZZZZ)V", "clearSubstitution$foundation_release", "()V", "clearSubstitution", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension", "measure-3p2s80s", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidthNonExtension", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntrinsicWidth", "width", "minIntrinsicHeightNonExtension", "minIntrinsicHeight", "maxIntrinsicWidthNonExtension", "maxIntrinsicWidth", "maxIntrinsicHeightNonExtension", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "contentDrawScope", "drawNonExtension", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "draw", "D", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "getTextSubstitution$foundation_release", "()Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;)V", "textSubstitution", "getShouldClearDescendantSemantics", "()Z", "shouldClearDescendantSemantics", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,589:1\n1#2:590\n26#3:591\n26#3:592\n256#4:593\n696#5:594\n696#5:595\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n436#1:591\n437#1:592\n525#1:593\n554#1:594\n556#1:595\n*E\n"})
public final class TextAnnotatedStringNode extends Node implements DrawModifierNode, LayoutModifierNode, SemanticsModifierNode {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001B\u001A\u00020\u00052\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\fR\"\u0010\u0004\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b \u0010\u001E\u001A\u0004\b!\u0010\f\"\u0004\b\"\u0010#R\"\u0010\u0006\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b$\u0010%\u001A\u0004\b\u0006\u0010\u000F\"\u0004\b&\u0010\'R$\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0011\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "Landroidx/compose/ui/text/AnnotatedString;", "original", "substitution", "", "isShowingSubstitution", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "layoutCache", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "component1", "()Landroidx/compose/ui/text/AnnotatedString;", "component2", "component3", "()Z", "component4", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "copy", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginal", "b", "getSubstitution", "setSubstitution", "(Landroidx/compose/ui/text/AnnotatedString;)V", "c", "Z", "setShowingSubstitution", "(Z)V", "d", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "getLayoutCache", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        public final AnnotatedString a;
        public AnnotatedString b;
        public boolean c;
        public MultiParagraphLayoutCache d;

        public TextSubstitutionValue(@NotNull AnnotatedString annotatedString0, @NotNull AnnotatedString annotatedString1, boolean z, @Nullable MultiParagraphLayoutCache multiParagraphLayoutCache0) {
            this.a = annotatedString0;
            this.b = annotatedString1;
            this.c = z;
            this.d = multiParagraphLayoutCache0;
        }

        public TextSubstitutionValue(AnnotatedString annotatedString0, AnnotatedString annotatedString1, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 4) != 0) {
                z = false;
            }
            if((v & 8) != 0) {
                multiParagraphLayoutCache0 = null;
            }
            this(annotatedString0, annotatedString1, z, multiParagraphLayoutCache0);
        }

        @NotNull
        public final AnnotatedString component1() {
            return this.a;
        }

        @NotNull
        public final AnnotatedString component2() {
            return this.b;
        }

        public final boolean component3() {
            return this.c;
        }

        @Nullable
        public final MultiParagraphLayoutCache component4() {
            return this.d;
        }

        @NotNull
        public final TextSubstitutionValue copy(@NotNull AnnotatedString annotatedString0, @NotNull AnnotatedString annotatedString1, boolean z, @Nullable MultiParagraphLayoutCache multiParagraphLayoutCache0) {
            return new TextSubstitutionValue(annotatedString0, annotatedString1, z, multiParagraphLayoutCache0);
        }

        public static TextSubstitutionValue copy$default(TextSubstitutionValue textAnnotatedStringNode$TextSubstitutionValue0, AnnotatedString annotatedString0, AnnotatedString annotatedString1, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache0, int v, Object object0) {
            if((v & 1) != 0) {
                annotatedString0 = textAnnotatedStringNode$TextSubstitutionValue0.a;
            }
            if((v & 2) != 0) {
                annotatedString1 = textAnnotatedStringNode$TextSubstitutionValue0.b;
            }
            if((v & 4) != 0) {
                z = textAnnotatedStringNode$TextSubstitutionValue0.c;
            }
            if((v & 8) != 0) {
                multiParagraphLayoutCache0 = textAnnotatedStringNode$TextSubstitutionValue0.d;
            }
            return textAnnotatedStringNode$TextSubstitutionValue0.copy(annotatedString0, annotatedString1, z, multiParagraphLayoutCache0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TextSubstitutionValue)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((TextSubstitutionValue)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((TextSubstitutionValue)object0).b)) {
                return false;
            }
            return this.c == ((TextSubstitutionValue)object0).c ? Intrinsics.areEqual(this.d, ((TextSubstitutionValue)object0).d) : false;
        }

        @Nullable
        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.d;
        }

        @NotNull
        public final AnnotatedString getOriginal() {
            return this.a;
        }

        @NotNull
        public final AnnotatedString getSubstitution() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = a.e((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c);
            return this.d == null ? v : v + this.d.hashCode();
        }

        public final boolean isShowingSubstitution() {
            return this.c;
        }

        public final void setLayoutCache(@Nullable MultiParagraphLayoutCache multiParagraphLayoutCache0) {
            this.d = multiParagraphLayoutCache0;
        }

        public final void setShowingSubstitution(boolean z) {
            this.c = z;
        }

        public final void setSubstitution(@NotNull AnnotatedString annotatedString0) {
            this.b = annotatedString0;
        }

        @Override
        @NotNull
        public String toString() {
            return "TextSubstitutionValue(original=" + this.a + ", substitution=" + this.b + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }
    }

    public static final int $stable = 8;
    public Map A;
    public MultiParagraphLayoutCache B;
    public b C;
    public TextSubstitutionValue D;
    public AnnotatedString n;
    public TextStyle o;
    public Resolver p;
    public Function1 q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public List v;
    public Function1 w;
    public SelectionController x;
    public ColorProducer y;
    public Function1 z;

    public TextAnnotatedStringNode(AnnotatedString annotatedString0, TextStyle textStyle0, Resolver fontFamily$Resolver0, Function1 function10, int v, boolean z, int v1, int v2, List list0, Function1 function11, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function12, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, fontFamily$Resolver0, ((v3 & 8) == 0 ? function10 : null), ((v3 & 16) == 0 ? v : 1), ((v3 & 0x20) == 0 ? z : true), ((v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF), ((v3 & 0x80) == 0 ? v2 : 1), ((v3 & 0x100) == 0 ? list0 : null), ((v3 & 0x200) == 0 ? function11 : null), ((v3 & 0x400) == 0 ? selectionController0 : null), ((v3 & 0x800) == 0 ? colorProducer0 : null), ((v3 & 0x1000) == 0 ? function12 : null), null);
    }

    public TextAnnotatedStringNode(AnnotatedString annotatedString0, TextStyle textStyle0, Resolver fontFamily$Resolver0, Function1 function10, int v, boolean z, int v1, int v2, List list0, Function1 function11, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function12, DefaultConstructorMarker defaultConstructorMarker0) {
        this.n = annotatedString0;
        this.o = textStyle0;
        this.p = fontFamily$Resolver0;
        this.q = function10;
        this.r = v;
        this.s = z;
        this.t = v1;
        this.u = v2;
        this.v = list0;
        this.w = function11;
        this.x = selectionController0;
        this.y = colorProducer0;
        this.z = function12;
    }

    public static final void access$invalidateForTranslate(TextAnnotatedStringNode textAnnotatedStringNode0) {
        textAnnotatedStringNode0.getClass();
        SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode0);
        LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode0);
        DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode0);
    }

    public static final boolean access$setSubstitution(TextAnnotatedStringNode textAnnotatedStringNode0, AnnotatedString annotatedString0) {
        TextSubstitutionValue textAnnotatedStringNode$TextSubstitutionValue0 = textAnnotatedStringNode0.D;
        if(textAnnotatedStringNode$TextSubstitutionValue0 != null) {
            if(!Intrinsics.areEqual(annotatedString0, textAnnotatedStringNode$TextSubstitutionValue0.getSubstitution())) {
                textAnnotatedStringNode$TextSubstitutionValue0.setSubstitution(annotatedString0);
                MultiParagraphLayoutCache multiParagraphLayoutCache0 = textAnnotatedStringNode$TextSubstitutionValue0.getLayoutCache();
                if(multiParagraphLayoutCache0 != null) {
                    multiParagraphLayoutCache0.update-ZNqEYIc(annotatedString0, textAnnotatedStringNode0.o, textAnnotatedStringNode0.p, textAnnotatedStringNode0.r, textAnnotatedStringNode0.s, textAnnotatedStringNode0.t, textAnnotatedStringNode0.u, textAnnotatedStringNode0.v);
                    return Unit.INSTANCE != null;
                }
                return false;
            }
            return false;
        }
        TextSubstitutionValue textAnnotatedStringNode$TextSubstitutionValue1 = new TextSubstitutionValue(textAnnotatedStringNode0.n, annotatedString0, false, null, 12, null);
        MultiParagraphLayoutCache multiParagraphLayoutCache1 = new MultiParagraphLayoutCache(annotatedString0, textAnnotatedStringNode0.o, textAnnotatedStringNode0.p, textAnnotatedStringNode0.r, textAnnotatedStringNode0.s, textAnnotatedStringNode0.t, textAnnotatedStringNode0.u, textAnnotatedStringNode0.v, null);
        multiParagraphLayoutCache1.setDensity$foundation_release(textAnnotatedStringNode0.b().getDensity$foundation_release());
        textAnnotatedStringNode$TextSubstitutionValue1.setLayoutCache(multiParagraphLayoutCache1);
        textAnnotatedStringNode0.D = textAnnotatedStringNode$TextSubstitutionValue1;
        return true;
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        b b0 = this.C;
        if(b0 == null) {
            b0 = new b(this);
            this.C = b0;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver0, this.n);
        TextSubstitutionValue textAnnotatedStringNode$TextSubstitutionValue0 = this.D;
        if(textAnnotatedStringNode$TextSubstitutionValue0 != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver0, textAnnotatedStringNode$TextSubstitutionValue0.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver0, textAnnotatedStringNode$TextSubstitutionValue0.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver0, null, new b0(this, 9), 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver0, null, new androidx.compose.foundation.text.modifiers.a(this), 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver0, null, new j(this, 29), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver0, null, b0, 1, null);
    }

    public final MultiParagraphLayoutCache b() {
        if(this.B == null) {
            this.B = new MultiParagraphLayoutCache(this.n, this.o, this.p, this.r, this.s, this.t, this.u, this.v, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache0 = this.B;
        Intrinsics.checkNotNull(multiParagraphLayoutCache0);
        return multiParagraphLayoutCache0;
    }

    public final MultiParagraphLayoutCache c(Density density0) {
        TextSubstitutionValue textAnnotatedStringNode$TextSubstitutionValue0 = this.D;
        if(textAnnotatedStringNode$TextSubstitutionValue0 != null && textAnnotatedStringNode$TextSubstitutionValue0.isShowingSubstitution()) {
            MultiParagraphLayoutCache multiParagraphLayoutCache0 = textAnnotatedStringNode$TextSubstitutionValue0.getLayoutCache();
            if(multiParagraphLayoutCache0 != null) {
                multiParagraphLayoutCache0.setDensity$foundation_release(density0);
                return multiParagraphLayoutCache0;
            }
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache1 = this.b();
        multiParagraphLayoutCache1.setDensity$foundation_release(density0);
        return multiParagraphLayoutCache1;
    }

    public final void clearSubstitution$foundation_release() {
        this.D = null;
    }

    public final void doInvalidations(boolean z, boolean z1, boolean z2, boolean z3) {
        if(z1 || z2 || z3) {
            this.b().update-ZNqEYIc(this.n, this.o, this.p, this.r, this.s, this.t, this.u, this.v);
        }
        if(!this.isAttached()) {
            return;
        }
        if(z1 || z && this.C != null) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if(z1 || z2 || z3) {
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if(z) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        if(!this.isAttached()) {
            return;
        }
        SelectionController selectionController0 = this.x;
        if(selectionController0 != null) {
            selectionController0.draw(contentDrawScope0);
        }
        Canvas canvas0 = contentDrawScope0.getDrawContext().getCanvas();
        TextLayoutResult textLayoutResult0 = this.c(contentDrawScope0).getTextLayoutResult();
        MultiParagraph multiParagraph0 = textLayoutResult0.getMultiParagraph();
        boolean z = textLayoutResult0.getHasVisualOverflow() && !TextOverflow.equals-impl0(this.r, 3);
        if(z) {
            Rect rect0 = RectKt.Rect-tz77jQw(0L, SizeKt.Size(IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g())));
            canvas0.save();
            Canvas.clipRect-mtrdD-E$default(canvas0, rect0, 0, 2, null);
        }
        try {
            TextDecoration textDecoration0 = this.o.getTextDecoration();
            if(textDecoration0 == null) {
                textDecoration0 = TextDecoration.Companion.getNone();
            }
            Shadow shadow0 = this.o.getShadow();
            if(shadow0 == null) {
                shadow0 = Shadow.Companion.getNone();
            }
            DrawStyle drawStyle0 = this.o.getDrawStyle();
            if(drawStyle0 == null) {
                drawStyle0 = Fill.INSTANCE;
            }
            Brush brush0 = this.o.getBrush();
            if(brush0 == null) {
                long v1 = this.y == null ? 0L : this.y.invoke-0d7_KjU();
                if(v1 == 16L) {
                    v1 = this.o.getColor-0d7_KjU() == 16L ? 0xFF00000000000000L : this.o.getColor-0d7_KjU();
                }
                MultiParagraph.paint-LG529CI$default(multiParagraph0, canvas0, v1, shadow0, textDecoration0, drawStyle0, 0, 0x20, null);
            }
            else {
                MultiParagraph.paint-hn5TExg$default(multiParagraph0, canvas0, brush0, this.o.getAlpha(), shadow0, textDecoration0, drawStyle0, 0, 0x40, null);
            }
        }
        finally {
            if(z) {
                canvas0.restore();
            }
        }
        if((this.D == null || !this.D.isShowingSubstitution() ? TextAnnotatedStringNodeKt.hasLinks(this.n) : false) || this.v != null && !this.v.isEmpty()) {
            contentDrawScope0.drawContent();
        }
    }

    public final void drawNonExtension(@NotNull ContentDrawScope contentDrawScope0) {
        this.draw(contentDrawScope0);
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return true;
    }

    @Nullable
    public final TextSubstitutionValue getTextSubstitution$foundation_release() {
        return this.D;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.c(intrinsicMeasureScope0).intrinsicHeight(v, intrinsicMeasureScope0.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.maxIntrinsicHeight(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.c(intrinsicMeasureScope0).maxIntrinsicWidth(intrinsicMeasureScope0.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.maxIntrinsicWidth(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        MultiParagraphLayoutCache multiParagraphLayoutCache0 = this.c(measureScope0);
        boolean z = multiParagraphLayoutCache0.layoutWithConstraints-K40F9xA(v, measureScope0.getLayoutDirection());
        TextLayoutResult textLayoutResult0 = multiParagraphLayoutCache0.getTextLayoutResult();
        textLayoutResult0.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if(z) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Function1 function10 = this.q;
            if(function10 != null) {
                function10.invoke(textLayoutResult0);
            }
            SelectionController selectionController0 = this.x;
            if(selectionController0 != null) {
                selectionController0.updateTextLayout(textLayoutResult0);
            }
            Map map0 = this.A;
            if(map0 == null) {
                map0 = new LinkedHashMap(2);
            }
            map0.put(AlignmentLineKt.getFirstBaseline(), Math.round(textLayoutResult0.getFirstBaseline()));
            map0.put(AlignmentLineKt.getLastBaseline(), Math.round(textLayoutResult0.getLastBaseline()));
            this.A = map0;
        }
        Function1 function11 = this.w;
        if(function11 != null) {
            function11.invoke(textLayoutResult0.getPlaceholderRects());
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g())));
        Map map1 = this.A;
        Intrinsics.checkNotNull(map1);
        return measureScope0.layout(IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g()), map1, new c(placeable0));
    }

    @NotNull
    public final MeasureResult measureNonExtension-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        return this.measure-3p2s80s(measureScope0, measurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.c(intrinsicMeasureScope0).intrinsicHeight(v, intrinsicMeasureScope0.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.minIntrinsicHeight(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.c(intrinsicMeasureScope0).minIntrinsicWidth(intrinsicMeasureScope0.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.minIntrinsicWidth(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    public final void setTextSubstitution$foundation_release(@Nullable TextSubstitutionValue textAnnotatedStringNode$TextSubstitutionValue0) {
        this.D = textAnnotatedStringNode$TextSubstitutionValue0;
    }

    public final boolean updateCallbacks(@Nullable Function1 function10, @Nullable Function1 function11, @Nullable SelectionController selectionController0, @Nullable Function1 function12) {
        boolean z;
        if(this.q == function10) {
            z = false;
        }
        else {
            this.q = function10;
            z = true;
        }
        if(this.w != function11) {
            this.w = function11;
            z = true;
        }
        if(!Intrinsics.areEqual(this.x, selectionController0)) {
            this.x = selectionController0;
            z = true;
        }
        if(this.z != function12) {
            this.z = function12;
            return true;
        }
        return z;
    }

    public final boolean updateDraw(@Nullable ColorProducer colorProducer0, @NotNull TextStyle textStyle0) {
        boolean z = Intrinsics.areEqual(colorProducer0, this.y);
        this.y = colorProducer0;
        return !z || !textStyle0.hasSameDrawAffectingAttributes(this.o);
    }

    public final boolean updateLayoutRelatedArgs-MPT68mk(@NotNull TextStyle textStyle0, @Nullable List list0, int v, int v1, boolean z, @NotNull Resolver fontFamily$Resolver0, int v2) {
        int v3 = !this.o.hasSameLayoutAffectingAttributes(textStyle0);
        this.o = textStyle0;
        if(!Intrinsics.areEqual(this.v, list0)) {
            this.v = list0;
            v3 = 1;
        }
        if(this.u != v) {
            this.u = v;
            v3 = 1;
        }
        if(this.t != v1) {
            this.t = v1;
            v3 = 1;
        }
        if(this.s != z) {
            this.s = z;
            v3 = 1;
        }
        if(!Intrinsics.areEqual(this.p, fontFamily$Resolver0)) {
            this.p = fontFamily$Resolver0;
            v3 = 1;
        }
        if(!TextOverflow.equals-impl0(this.r, v2)) {
            this.r = v2;
            return true;
        }
        return v3;
    }

    public final boolean updateText$foundation_release(@NotNull AnnotatedString annotatedString0) {
        boolean z = Intrinsics.areEqual(this.n.getText(), annotatedString0.getText());
        boolean z1 = !z || !Intrinsics.areEqual(this.n.getSpanStyles(), annotatedString0.getSpanStyles()) || !Intrinsics.areEqual(this.n.getParagraphStyles(), annotatedString0.getParagraphStyles()) || !this.n.hasEqualAnnotations(annotatedString0);
        if(z1) {
            this.n = annotatedString0;
        }
        if(!z) {
            this.clearSubstitution$foundation_release();
        }
        return z1;
    }
}

