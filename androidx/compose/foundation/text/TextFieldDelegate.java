package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldDelegate {
    @Metadata(d1 = {"\u0000\u00B4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001JH\u0010\u000E\u001A\u0014\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\bH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJR\u0010 \u001A\u00020\u001D2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\b2\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001BH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJG\u0010)\u001A\u00020\u001D2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\b2\u0006\u0010\"\u001A\u00020!2\u0006\u0010$\u001A\u00020#2\u0006\u0010&\u001A\u00020%2\u0006\u0010\u0017\u001A\u00020\u0016H\u0001\u00A2\u0006\u0004\b\'\u0010(J/\u0010.\u001A\u00020\u001D2\u0006\u0010$\u001A\u00020#2\u0006\u0010*\u001A\u00020\u00112\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020+H\u0001\u00A2\u0006\u0004\b,\u0010-JC\u00109\u001A\u00020\u001D2\f\u00101\u001A\b\u0012\u0004\u0012\u0002000/2\u0006\u00103\u001A\u0002022\u0012\u00105\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001D042\b\u00106\u001A\u0004\u0018\u00010#H\u0001\u00A2\u0006\u0004\b7\u00108JF\u0010>\u001A\u00020\u001D2\u0006\u0010;\u001A\u00020:2\u0006\u0010\u0018\u001A\u00020+2\u0006\u00103\u001A\u0002022\u0006\u0010\u0017\u001A\u00020\u00162\u0012\u00105\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001D04H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b<\u0010=JW\u0010G\u001A\u00020#2\u0006\u0010@\u001A\u00020?2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u00103\u001A\u0002022\u0006\u0010B\u001A\u00020A2\u0012\u00105\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001D042\u0012\u0010D\u001A\u000E\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u001D04H\u0001\u00A2\u0006\u0004\bE\u0010FJW\u0010I\u001A\u00020#2\u0006\u0010@\u001A\u00020?2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u00103\u001A\u0002022\u0006\u0010B\u001A\u00020A2\u0012\u00105\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001D042\u0012\u0010D\u001A\u000E\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u001D04H\u0001\u00A2\u0006\u0004\bH\u0010FJ3\u0010L\u001A\u00020\u001D2\u0006\u0010$\u001A\u00020#2\u0006\u00103\u001A\u0002022\u0012\u00105\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001D04H\u0001\u00A2\u0006\u0004\bJ\u0010KJ \u0010R\u001A\u00020N2\u0006\u0010M\u001A\u00020\u00132\u0006\u0010O\u001A\u00020N\u00F8\u0001\u0000\u00A2\u0006\u0004\bP\u0010Q\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006S"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResultText", "Lkotlin/Triple;", "", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", "layout", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/TextRange;", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "textLayoutResult", "Landroidx/compose/ui/graphics/Paint;", "highlightPaint", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "", "draw-Q1vqE60$foundation_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;JJLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;J)V", "draw", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "hasFocus", "notifyFocusedRect$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V", "notifyFocusedRect", "textFieldValue", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "updateTextLayoutResult$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "updateTextLayoutResult", "", "Landroidx/compose/ui/text/input/EditCommand;", "ops", "Landroidx/compose/ui/text/input/EditProcessor;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "onEditCommand$foundation_release", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextInputSession;)V", "onEditCommand", "Landroidx/compose/ui/geometry/Offset;", "position", "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/jvm/functions/Function1;)V", "setCursorOffset", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "restartInput$foundation_release", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;", "restartInput", "onFocus$foundation_release", "onFocus", "onBlur$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;)V", "onBlur", "compositionRange", "Landroidx/compose/ui/text/input/TransformedText;", "transformed", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "applyCompositionDecoration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTextFieldDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,436:1\n1#2:437\n702#3:438\n*S KotlinDebug\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n*L\n148#1:438\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void a(Canvas canvas0, long v, OffsetMapping offsetMapping0, TextLayoutResult textLayoutResult0, Paint paint0) {
            int v1 = offsetMapping0.originalToTransformed(TextRange.getMin-impl(v));
            int v2 = offsetMapping0.originalToTransformed(TextRange.getMax-impl(v));
            if(v1 != v2) {
                canvas0.drawPath(textLayoutResult0.getPathForRange(v1, v2), paint0);
            }
        }

        @NotNull
        public final TransformedText applyCompositionDecoration-72CqOWE(long v, @NotNull TransformedText transformedText0) {
            int v1 = transformedText0.getOffsetMapping().originalToTransformed(TextRange.getStart-impl(v));
            int v2 = transformedText0.getOffsetMapping().originalToTransformed(TextRange.getEnd-impl(v));
            Builder annotatedString$Builder0 = new Builder(transformedText0.getText());
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 0xEFFF, null), Math.min(v1, v2), Math.max(v1, v2));
            return new TransformedText(annotatedString$Builder0.toAnnotatedString(), transformedText0.getOffsetMapping());
        }

        @JvmStatic
        public final void draw-Q1vqE60$foundation_release(@NotNull Canvas canvas0, @NotNull TextFieldValue textFieldValue0, long v, long v1, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Paint paint0, long v2) {
            if(!TextRange.getCollapsed-impl(v)) {
                paint0.setColor-8_81llA(v2);
                Companion.a(canvas0, v, offsetMapping0, textLayoutResult0, paint0);
            }
            else if(!TextRange.getCollapsed-impl(v1)) {
                Color color0 = Color.box-impl(textLayoutResult0.getLayoutInput().getStyle().getColor-0d7_KjU());
                if(color0.unbox-impl() == 16L) {
                    color0 = null;
                }
                long v3 = color0 == null ? Color.Companion.getBlack-0d7_KjU() : color0.unbox-impl();
                paint0.setColor-8_81llA(Color.copy-wmQWz5c$default(v3, Color.getAlpha-impl(v3) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                Companion.a(canvas0, v1, offsetMapping0, textLayoutResult0, paint0);
            }
            else if(!TextRange.getCollapsed-impl(textFieldValue0.getSelection-d9O1mEE())) {
                paint0.setColor-8_81llA(v2);
                Companion.a(canvas0, textFieldValue0.getSelection-d9O1mEE(), offsetMapping0, textLayoutResult0, paint0);
            }
            TextPainter.INSTANCE.paint(canvas0, textLayoutResult0);
        }

        @JvmStatic
        @NotNull
        public final Triple layout-_EkL_-Y$foundation_release(@NotNull TextDelegate textDelegate0, long v, @NotNull LayoutDirection layoutDirection0, @Nullable TextLayoutResult textLayoutResult0) {
            TextLayoutResult textLayoutResult1 = textDelegate0.layout-NN6Ew-U(v, layoutDirection0, textLayoutResult0);
            return new Triple(IntSize.getWidth-impl(textLayoutResult1.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult1.getSize-YbymL2g()), textLayoutResult1);
        }

        public static Triple layout-_EkL_-Y$foundation_release$default(Companion textFieldDelegate$Companion0, TextDelegate textDelegate0, long v, LayoutDirection layoutDirection0, TextLayoutResult textLayoutResult0, int v1, Object object0) {
            if((v1 & 8) != 0) {
                textLayoutResult0 = null;
            }
            return textFieldDelegate$Companion0.layout-_EkL_-Y$foundation_release(textDelegate0, v, layoutDirection0, textLayoutResult0);
        }

        @JvmStatic
        public final void notifyFocusedRect$foundation_release(@NotNull TextFieldValue textFieldValue0, @NotNull TextDelegate textDelegate0, @NotNull TextLayoutResult textLayoutResult0, @NotNull LayoutCoordinates layoutCoordinates0, @NotNull TextInputSession textInputSession0, boolean z, @NotNull OffsetMapping offsetMapping0) {
            Rect rect0;
            if(!z) {
                return;
            }
            int v = offsetMapping0.originalToTransformed(TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()));
            if(v < textLayoutResult0.getLayoutInput().getText().length()) {
                rect0 = textLayoutResult0.getBoundingBox(v);
            }
            else {
                rect0 = v == 0 ? new Rect(0.0f, 0.0f, 1.0f, ((float)IntSize.getHeight-impl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate0.getStyle(), textDelegate0.getDensity(), textDelegate0.getFontFamilyResolver(), null, 0, 24, null)))) : textLayoutResult0.getBoundingBox(v - 1);
            }
            long v1 = layoutCoordinates0.localToRoot-MK-Hz9U(OffsetKt.Offset(rect0.getLeft(), rect0.getTop()));
            textInputSession0.notifyFocusedRect(RectKt.Rect-tz77jQw(OffsetKt.Offset(Offset.getX-impl(v1), Offset.getY-impl(v1)), SizeKt.Size(rect0.getWidth(), rect0.getHeight())));
        }

        @JvmStatic
        public final void onBlur$foundation_release(@NotNull TextInputSession textInputSession0, @NotNull EditProcessor editProcessor0, @NotNull Function1 function10) {
            function10.invoke(TextFieldValue.copy-3r_uNRQ$default(editProcessor0.toTextFieldValue(), null, 0L, null, 3, null));
            textInputSession0.dispose();
        }

        @JvmStatic
        public final void onEditCommand$foundation_release(@NotNull List list0, @NotNull EditProcessor editProcessor0, @NotNull Function1 function10, @Nullable TextInputSession textInputSession0) {
            TextFieldValue textFieldValue0 = editProcessor0.apply(list0);
            if(textInputSession0 != null) {
                textInputSession0.updateState(null, textFieldValue0);
            }
            function10.invoke(textFieldValue0);
        }

        @JvmStatic
        @NotNull
        public final TextInputSession onFocus$foundation_release(@NotNull TextInputService textInputService0, @NotNull TextFieldValue textFieldValue0, @NotNull EditProcessor editProcessor0, @NotNull ImeOptions imeOptions0, @NotNull Function1 function10, @NotNull Function1 function11) {
            return this.restartInput$foundation_release(textInputService0, textFieldValue0, editProcessor0, imeOptions0, function10, function11);
        }

        @JvmStatic
        @NotNull
        public final TextInputSession restartInput$foundation_release(@NotNull TextInputService textInputService0, @NotNull TextFieldValue textFieldValue0, @NotNull EditProcessor editProcessor0, @NotNull ImeOptions imeOptions0, @NotNull Function1 function10, @NotNull Function1 function11) {
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            TextInputSession textInputSession0 = textInputService0.startInput(textFieldValue0, imeOptions0, new g(editProcessor0, function10, ref$ObjectRef0), function11);
            ref$ObjectRef0.element = textInputSession0;
            return textInputSession0;
        }

        @JvmStatic
        public final void setCursorOffset-ULxng0E$foundation_release(long v, @NotNull TextLayoutResultProxy textLayoutResultProxy0, @NotNull EditProcessor editProcessor0, @NotNull OffsetMapping offsetMapping0, @NotNull Function1 function10) {
            function10.invoke(TextFieldValue.copy-3r_uNRQ$default(editProcessor0.toTextFieldValue(), null, TextRangeKt.TextRange(offsetMapping0.transformedToOriginal(TextLayoutResultProxy.getOffsetForPosition-3MmeM6k$default(textLayoutResultProxy0, v, false, 2, null))), null, 5, null));
        }

        @JvmStatic
        public final void updateTextLayoutResult$foundation_release(@NotNull TextInputSession textInputSession0, @NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResultProxy textLayoutResultProxy0) {
            LayoutCoordinates layoutCoordinates0 = textLayoutResultProxy0.getInnerTextFieldCoordinates();
            if(layoutCoordinates0 == null || !layoutCoordinates0.isAttached()) {
                return;
            }
            LayoutCoordinates layoutCoordinates1 = textLayoutResultProxy0.getDecorationBoxCoordinates();
            if(layoutCoordinates1 != null) {
                textInputSession0.updateTextLayoutResult(textFieldValue0, offsetMapping0, textLayoutResultProxy0.getValue(), new h(layoutCoordinates0), SelectionManagerKt.visibleBounds(layoutCoordinates0), layoutCoordinates0.localBoundingBoxOf(layoutCoordinates1, false));
            }
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;

    static {
        TextFieldDelegate.Companion = new Companion(null);
    }

    @JvmStatic
    public static final void draw-Q1vqE60$foundation_release(@NotNull Canvas canvas0, @NotNull TextFieldValue textFieldValue0, long v, long v1, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Paint paint0, long v2) {
        TextFieldDelegate.Companion.draw-Q1vqE60$foundation_release(canvas0, textFieldValue0, v, v1, offsetMapping0, textLayoutResult0, paint0, v2);
    }

    @JvmStatic
    @NotNull
    public static final Triple layout-_EkL_-Y$foundation_release(@NotNull TextDelegate textDelegate0, long v, @NotNull LayoutDirection layoutDirection0, @Nullable TextLayoutResult textLayoutResult0) {
        return TextFieldDelegate.Companion.layout-_EkL_-Y$foundation_release(textDelegate0, v, layoutDirection0, textLayoutResult0);
    }

    @JvmStatic
    public static final void notifyFocusedRect$foundation_release(@NotNull TextFieldValue textFieldValue0, @NotNull TextDelegate textDelegate0, @NotNull TextLayoutResult textLayoutResult0, @NotNull LayoutCoordinates layoutCoordinates0, @NotNull TextInputSession textInputSession0, boolean z, @NotNull OffsetMapping offsetMapping0) {
        TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue0, textDelegate0, textLayoutResult0, layoutCoordinates0, textInputSession0, z, offsetMapping0);
    }

    @JvmStatic
    public static final void onBlur$foundation_release(@NotNull TextInputSession textInputSession0, @NotNull EditProcessor editProcessor0, @NotNull Function1 function10) {
        TextFieldDelegate.Companion.onBlur$foundation_release(textInputSession0, editProcessor0, function10);
    }

    @JvmStatic
    public static final void onEditCommand$foundation_release(@NotNull List list0, @NotNull EditProcessor editProcessor0, @NotNull Function1 function10, @Nullable TextInputSession textInputSession0) {
        TextFieldDelegate.Companion.onEditCommand$foundation_release(list0, editProcessor0, function10, textInputSession0);
    }

    @JvmStatic
    @NotNull
    public static final TextInputSession onFocus$foundation_release(@NotNull TextInputService textInputService0, @NotNull TextFieldValue textFieldValue0, @NotNull EditProcessor editProcessor0, @NotNull ImeOptions imeOptions0, @NotNull Function1 function10, @NotNull Function1 function11) {
        return TextFieldDelegate.Companion.onFocus$foundation_release(textInputService0, textFieldValue0, editProcessor0, imeOptions0, function10, function11);
    }

    @JvmStatic
    @NotNull
    public static final TextInputSession restartInput$foundation_release(@NotNull TextInputService textInputService0, @NotNull TextFieldValue textFieldValue0, @NotNull EditProcessor editProcessor0, @NotNull ImeOptions imeOptions0, @NotNull Function1 function10, @NotNull Function1 function11) {
        return TextFieldDelegate.Companion.restartInput$foundation_release(textInputService0, textFieldValue0, editProcessor0, imeOptions0, function10, function11);
    }

    @JvmStatic
    public static final void setCursorOffset-ULxng0E$foundation_release(long v, @NotNull TextLayoutResultProxy textLayoutResultProxy0, @NotNull EditProcessor editProcessor0, @NotNull OffsetMapping offsetMapping0, @NotNull Function1 function10) {
        TextFieldDelegate.Companion.setCursorOffset-ULxng0E$foundation_release(v, textLayoutResultProxy0, editProcessor0, offsetMapping0, function10);
    }

    @JvmStatic
    public static final void updateTextLayoutResult$foundation_release(@NotNull TextInputSession textInputSession0, @NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResultProxy textLayoutResultProxy0) {
        TextFieldDelegate.Companion.updateTextLayoutResult$foundation_release(textInputSession0, textFieldValue0, offsetMapping0, textLayoutResultProxy0);
    }
}

