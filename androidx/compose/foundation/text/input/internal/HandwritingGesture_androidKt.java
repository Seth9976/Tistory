package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class HandwritingGesture_androidKt {
    public static final int a(MultiParagraph multiParagraph0, long v, ViewConfiguration viewConfiguration0) {
        float f = viewConfiguration0 == null ? 0.0f : viewConfiguration0.getHandwritingGestureLineMargin();
        int v1 = multiParagraph0.getLineForVerticalPosition(Offset.getY-impl(v));
        return Float.compare(Offset.getY-impl(v), multiParagraph0.getLineTop(v1) - f) < 0 || Offset.getY-impl(v) > multiParagraph0.getLineBottom(v1) + f || Offset.getX-impl(v) < -f || Offset.getX-impl(v) > multiParagraph0.getWidth() + f ? -1 : v1;
    }

    public static final long access$adjustHandwritingDeleteGestureRange-72CqOWE(long v, CharSequence charSequence0) {
        int v1 = TextRange.getStart-impl(v);
        int v2 = TextRange.getEnd-impl(v);
        int v3 = 10;
        int v4 = v1 <= 0 ? 10 : Character.codePointBefore(charSequence0, v1);
        if(v2 < charSequence0.length()) {
            v3 = Character.codePointAt(charSequence0, v2);
        }
        if(HandwritingGesture_androidKt.g(v4) && (HandwritingGesture_androidKt.f(v3) || HandwritingGesture_androidKt.e(v3))) {
            do {
                v1 -= Character.charCount(v4);
                if(v1 == 0) {
                    break;
                }
                v4 = Character.codePointBefore(charSequence0, v1);
            }
            while(HandwritingGesture_androidKt.g(v4));
            return TextRangeKt.TextRange(v1, v2);
        }
        if(HandwritingGesture_androidKt.g(v3) && (HandwritingGesture_androidKt.f(v4) || HandwritingGesture_androidKt.e(v4))) {
            do {
                v2 += Character.charCount(v3);
                if(v2 == charSequence0.length()) {
                    break;
                }
                v3 = Character.codePointAt(charSequence0, v2);
            }
            while(HandwritingGesture_androidKt.g(v3));
            return TextRangeKt.TextRange(v1, v2);
        }
        return v;
    }

    public static final EditCommand access$compoundEditCommand(EditCommand[] arr_editCommand) {
        return new HandwritingGesture_androidKt.compoundEditCommand.1(arr_editCommand);
    }

    public static final int access$getOffsetForHandwritingGesture-d-4ec7I(LegacyTextFieldState legacyTextFieldState0, long v, ViewConfiguration viewConfiguration0) {
        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
        if(textLayoutResultProxy0 != null) {
            TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
            if(textLayoutResult0 != null) {
                MultiParagraph multiParagraph0 = textLayoutResult0.getMultiParagraph();
                return multiParagraph0 == null ? -1 : HandwritingGesture_androidKt.b(multiParagraph0, v, legacyTextFieldState0.getLayoutCoordinates(), viewConfiguration0);
            }
        }
        return -1;
    }

    public static final int access$getOffsetForHandwritingGesture-d-4ec7I(TextLayoutState textLayoutState0, long v, ViewConfiguration viewConfiguration0) {
        TextLayoutResult textLayoutResult0 = textLayoutState0.getLayoutResult();
        if(textLayoutResult0 != null) {
            MultiParagraph multiParagraph0 = textLayoutResult0.getMultiParagraph();
            return multiParagraph0 == null ? -1 : HandwritingGesture_androidKt.b(multiParagraph0, v, textLayoutState0.getTextLayoutNodeCoordinates(), viewConfiguration0);
        }
        return -1;
    }

    public static final long access$getRangeForRemoveSpaceGesture-5iVPX68(TextLayoutResult textLayoutResult0, long v, long v1, LayoutCoordinates layoutCoordinates0, ViewConfiguration viewConfiguration0) {
        if(textLayoutResult0 != null && layoutCoordinates0 != null) {
            long v2 = layoutCoordinates0.screenToLocal-MK-Hz9U(v);
            long v3 = layoutCoordinates0.screenToLocal-MK-Hz9U(v1);
            int v4 = HandwritingGesture_androidKt.a(textLayoutResult0.getMultiParagraph(), v2, viewConfiguration0);
            int v5 = HandwritingGesture_androidKt.a(textLayoutResult0.getMultiParagraph(), v3, viewConfiguration0);
            if(v4 != -1) {
                if(v5 != -1) {
                    v4 = Math.min(v4, v5);
                }
                v5 = v4;
            }
            else if(v5 == -1) {
                return 0L;
            }
            float f = textLayoutResult0.getLineTop(v5);
            float f1 = (textLayoutResult0.getLineBottom(v5) + f) / 2.0f;
            return textLayoutResult0.getMultiParagraph().getRangeForRect-8-6BmAI(new Rect(Math.min(Offset.getX-impl(v2), Offset.getX-impl(v3)), f1 - 0.1f, Math.max(Offset.getX-impl(v2), Offset.getX-impl(v3)), f1 + 0.1f), 0, TextInclusionStrategy.Companion.getAnyOverlap());
        }
        return 0L;
    }

    public static final long access$getRangeForScreenRects-O048IG0(LegacyTextFieldState legacyTextFieldState0, Rect rect0, Rect rect1, int v, TextInclusionStrategy textInclusionStrategy0) {
        long v1 = HandwritingGesture_androidKt.c(legacyTextFieldState0, rect0, v, textInclusionStrategy0);
        if(TextRange.getCollapsed-impl(v1)) {
            return 0L;
        }
        long v2 = HandwritingGesture_androidKt.c(legacyTextFieldState0, rect1, v, textInclusionStrategy0);
        return TextRange.getCollapsed-impl(v2) ? 0L : TextRangeKt.TextRange(Math.min(TextRange.getStart-impl(v1), TextRange.getStart-impl(v1)), Math.max(TextRange.getEnd-impl(v2), TextRange.getEnd-impl(v2)));
    }

    public static final long access$getRangeForScreenRects-O048IG0(TextLayoutState textLayoutState0, Rect rect0, Rect rect1, int v, TextInclusionStrategy textInclusionStrategy0) {
        long v1 = HandwritingGesture_androidKt.d(textLayoutState0, rect0, v, textInclusionStrategy0);
        if(TextRange.getCollapsed-impl(v1)) {
            return 0L;
        }
        long v2 = HandwritingGesture_androidKt.d(textLayoutState0, rect1, v, textInclusionStrategy0);
        return TextRange.getCollapsed-impl(v2) ? 0L : TextRangeKt.TextRange(Math.min(TextRange.getStart-impl(v1), TextRange.getStart-impl(v1)), Math.max(TextRange.getEnd-impl(v2), TextRange.getEnd-impl(v2)));
    }

    public static final boolean access$isBiDiBoundary(TextLayoutResult textLayoutResult0, int v) {
        int v1 = textLayoutResult0.getLineForOffset(v);
        return v == textLayoutResult0.getLineStart(v1) || v == TextLayoutResult.getLineEnd$default(textLayoutResult0, v1, false, 2, null) ? textLayoutResult0.getParagraphDirection(v) != textLayoutResult0.getBidiRunDirection(v) : textLayoutResult0.getBidiRunDirection(v) != textLayoutResult0.getBidiRunDirection(v - 1);
    }

    public static final long access$rangeOfWhitespaces(CharSequence charSequence0, int v) {
        int v1;
        for(v1 = v; v1 > 0; v1 -= Character.charCount(v2)) {
            int v2 = CodepointHelpers_jvmKt.codePointBefore(charSequence0, v1);
            if(!HandwritingGesture_androidKt.f(v2)) {
                break;
            }
        }
        while(v < charSequence0.length()) {
            int v3 = CodepointHelpers_jvmKt.codePointAt(charSequence0, v);
            if(!HandwritingGesture_androidKt.f(v3)) {
                break;
            }
            v += CodepointHelpers_jvmKt.charCount(v3);
        }
        return TextRangeKt.TextRange(v1, v);
    }

    public static final long access$toOffset(PointF pointF0) {
        return OffsetKt.Offset(pointF0.x, pointF0.y);
    }

    public static final int b(MultiParagraph multiParagraph0, long v, LayoutCoordinates layoutCoordinates0, ViewConfiguration viewConfiguration0) {
        if(layoutCoordinates0 != null) {
            long v1 = layoutCoordinates0.screenToLocal-MK-Hz9U(v);
            int v2 = HandwritingGesture_androidKt.a(multiParagraph0, v1, viewConfiguration0);
            if(v2 == -1) {
                return -1;
            }
            float f = multiParagraph0.getLineTop(v2);
            return multiParagraph0.getOffsetForPosition-k-4lQ0M(Offset.copy-dBAh8RU$default(v1, 0.0f, (multiParagraph0.getLineBottom(v2) + f) / 2.0f, 1, null));
        }
        return -1;
    }

    public static final long c(LegacyTextFieldState legacyTextFieldState0, Rect rect0, int v, TextInclusionStrategy textInclusionStrategy0) {
        MultiParagraph multiParagraph0;
        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
        if(textLayoutResultProxy0 == null) {
            multiParagraph0 = null;
        }
        else {
            TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
            multiParagraph0 = textLayoutResult0 == null ? null : textLayoutResult0.getMultiParagraph();
        }
        LayoutCoordinates layoutCoordinates0 = legacyTextFieldState0.getLayoutCoordinates();
        return multiParagraph0 == null || layoutCoordinates0 == null ? 0L : multiParagraph0.getRangeForRect-8-6BmAI(rect0.translate-k-4lQ0M(layoutCoordinates0.screenToLocal-MK-Hz9U(0L)), v, textInclusionStrategy0);
    }

    public static final long d(TextLayoutState textLayoutState0, Rect rect0, int v, TextInclusionStrategy textInclusionStrategy0) {
        TextLayoutResult textLayoutResult0 = textLayoutState0.getLayoutResult();
        MultiParagraph multiParagraph0 = textLayoutResult0 == null ? null : textLayoutResult0.getMultiParagraph();
        LayoutCoordinates layoutCoordinates0 = textLayoutState0.getTextLayoutNodeCoordinates();
        return multiParagraph0 == null || layoutCoordinates0 == null ? 0L : multiParagraph0.getRangeForRect-8-6BmAI(rect0.translate-k-4lQ0M(layoutCoordinates0.screenToLocal-MK-Hz9U(0L)), v, textInclusionStrategy0);
    }

    public static final boolean e(int v) {
        switch(Character.getType(v)) {
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final boolean f(int v) {
        return Character.isWhitespace(v) || v == 0xA0;
    }

    public static final boolean g(int v) {
        return HandwritingGesture_androidKt.f(v) && (Character.getType(v) != 13 && Character.getType(v) != 14) && v != 10;
    }
}

