package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A%\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001A\"\u0010\t\u001A\u00020\n2\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u0014\u0010\u000F\u001A\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001A\u00020\u0003H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "isSelectionHandleInVisibleBound", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n1223#2,6:1100\n1223#2,6:1106\n1223#2,6:1112\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n1002#1:1100,6\n1007#1:1106,6\n1011#1:1112,6\n*E\n"})
public final class TextFieldSelectionManagerKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Handle.values().length];
            try {
                arr_v[Handle.Cursor.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.SelectionStart.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.SelectionEnd.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextFieldSelectionHandle(boolean z, @NotNull ResolvedTextDirection resolvedTextDirection0, @NotNull TextFieldSelectionManager textFieldSelectionManager0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAFDBA8B8);
        int v1 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(resolvedTextDirection0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(textFieldSelectionManager0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAFDBA8B8, v1, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            boolean z1 = false;
            boolean z2 = composer1.changed(textFieldSelectionManager0);
            TextDragObserver textDragObserver0 = composer1.rememberedValue();
            if((v1 & 14) == 4 || z2 || textDragObserver0 == Composer.Companion.getEmpty()) {
                textDragObserver0 = textFieldSelectionManager0.handleDragObserver$foundation_release(z);
                composer1.updateRememberedValue(textDragObserver0);
            }
            boolean z3 = composer1.changedInstance(textFieldSelectionManager0);
            if((v1 & 14) == 4) {
                z1 = true;
            }
            u1 u10 = composer1.rememberedValue();
            if(z3 || z1 || u10 == Composer.Companion.getEmpty()) {
                u10 = new u1(textFieldSelectionManager0, z);
                composer1.updateRememberedValue(u10);
            }
            boolean z4 = TextRange.getReversed-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE());
            Companion modifier$Companion0 = Modifier.Companion;
            boolean z5 = composer1.changedInstance(textDragObserver0);
            v1 v10 = composer1.rememberedValue();
            if(z5 || v10 == Composer.Companion.getEmpty()) {
                v10 = new v1(textDragObserver0, null);
                composer1.updateRememberedValue(v10);
            }
            AndroidSelectionHandles_androidKt.SelectionHandle-pzduO1o(u10, z, resolvedTextDirection0, z4, 0L, SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, textDragObserver0, v10), composer1, v1 << 3 & 0x3F0, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(z, resolvedTextDirection0, textFieldSelectionManager0, v, 1));
        }
    }

    public static final long calculateSelectionMagnifierCenterAndroid-O0kMr_c(@NotNull TextFieldSelectionManager textFieldSelectionManager0, long v) {
        int v3;
        Offset offset0 = textFieldSelectionManager0.getCurrentDragPosition-_m7T9-E();
        if(offset0 != null) {
            long v1 = offset0.unbox-impl();
            AnnotatedString annotatedString0 = textFieldSelectionManager0.getTransformedText$foundation_release();
            if(annotatedString0 != null && annotatedString0.length() != 0) {
                Handle handle0 = textFieldSelectionManager0.getDraggingHandle();
                int v2 = handle0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[handle0.ordinal()];
                if(v2 != -1) {
                    if(v2 == 1 || v2 == 2) {
                        v3 = TextRange.getStart-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE());
                    }
                    else {
                        if(v2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        v3 = TextRange.getEnd-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE());
                    }
                    LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                    if(legacyTextFieldState0 != null) {
                        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                        if(textLayoutResultProxy0 != null) {
                            LegacyTextFieldState legacyTextFieldState1 = textFieldSelectionManager0.getState$foundation_release();
                            if(legacyTextFieldState1 != null) {
                                TextDelegate textDelegate0 = legacyTextFieldState1.getTextDelegate();
                                if(textDelegate0 != null) {
                                    AnnotatedString annotatedString1 = textDelegate0.getText();
                                    if(annotatedString1 != null) {
                                        int v4 = c.coerceIn(textFieldSelectionManager0.getOffsetMapping$foundation_release().originalToTransformed(v3), 0, annotatedString1.length());
                                        float f = Offset.getX-impl(textLayoutResultProxy0.translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release(v1));
                                        TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
                                        int v5 = textLayoutResult0.getLineForOffset(v4);
                                        float f1 = textLayoutResult0.getLineLeft(v5);
                                        float f2 = textLayoutResult0.getLineRight(v5);
                                        float f3 = c.coerceIn(f, Math.min(f1, f2), Math.max(f1, f2));
                                        if(!IntSize.equals-impl0(v, 0L) && Math.abs(f - f3) > ((float)(IntSize.getWidth-impl(v) / 2))) {
                                            return 0x7FC000007FC00000L;
                                        }
                                        float f4 = textLayoutResult0.getLineTop(v5);
                                        return OffsetKt.Offset(f3, (textLayoutResult0.getLineBottom(v5) - f4) / 2.0f + f4);
                                    }
                                }
                            }
                            return 0x7FC000007FC00000L;
                        }
                    }
                    return 0x7FC000007FC00000L;
                }
                return 0x7FC000007FC00000L;
            }
            return 0x7FC000007FC00000L;
        }
        return 0x7FC000007FC00000L;
    }

    public static final boolean isSelectionHandleInVisibleBound(@NotNull TextFieldSelectionManager textFieldSelectionManager0, boolean z) {
        LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
        if(legacyTextFieldState0 != null) {
            LayoutCoordinates layoutCoordinates0 = legacyTextFieldState0.getLayoutCoordinates();
            if(layoutCoordinates0 != null) {
                Rect rect0 = SelectionManagerKt.visibleBounds(layoutCoordinates0);
                return rect0 == null ? false : SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, textFieldSelectionManager0.getHandlePosition-tuRUvjQ$foundation_release(z));
            }
        }
        return false;
    }
}

