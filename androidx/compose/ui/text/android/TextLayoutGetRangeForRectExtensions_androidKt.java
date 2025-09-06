package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u001AO\u0010\r\u001A\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "Landroid/text/Layout;", "layout", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "getRangeForRect", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/Layout;Landroidx/compose/ui/text/android/LayoutHelper;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    public static final float a(float[] arr_f, int v, int v1) {
        return arr_f[(v - v1) * 2 + 1];
    }

    public static final int b(TextLayout textLayout0, Layout layout0, LayoutHelper layoutHelper0, int v, RectF rectF0, SegmentFinder segmentFinder0, Function2 function20, boolean z) {
        int v15;
        BidiRun[] arr_layoutHelper$BidiRun1;
        int v13;
        int v8;
        int v1 = layout0.getLineTop(v);
        int v2 = layout0.getLineBottom(v);
        int v3 = layout0.getLineStart(v);
        int v4 = layout0.getLineEnd(v);
        if(v3 == v4) {
            return -1;
        }
        float[] arr_f = new float[(v4 - v3) * 2];
        textLayout0.fillLineHorizontalBounds$ui_text_release(v, arr_f);
        BidiRun[] arr_layoutHelper$BidiRun = layoutHelper0.getLineBidiRuns$ui_text_release(v);
        IntProgression intProgression0 = z ? ArraysKt___ArraysKt.getIndices(arr_layoutHelper$BidiRun) : c.downTo(ArraysKt___ArraysKt.getLastIndex(arr_layoutHelper$BidiRun), 0);
        int v5 = intProgression0.getFirst();
        int v6 = intProgression0.getLast();
        int v7 = intProgression0.getStep();
        if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
            while(true) {
                BidiRun layoutHelper$BidiRun0 = arr_layoutHelper$BidiRun[v5];
                float f = layoutHelper$BidiRun0.isRtl() ? arr_f[(layoutHelper$BidiRun0.getEnd() - 1 - v3) * 2] : arr_f[(layoutHelper$BidiRun0.getStart() - v3) * 2];
                float f1 = layoutHelper$BidiRun0.isRtl() ? TextLayoutGetRangeForRectExtensions_androidKt.a(arr_f, layoutHelper$BidiRun0.getStart(), v3) : TextLayoutGetRangeForRectExtensions_androidKt.a(arr_f, layoutHelper$BidiRun0.getEnd() - 1, v3);
                if(z) {
                    if(f1 >= rectF0.left && f <= rectF0.right) {
                        if((layoutHelper$BidiRun0.isRtl() || rectF0.left > f) && (!layoutHelper$BidiRun0.isRtl() || rectF0.right < f1)) {
                            v8 = layoutHelper$BidiRun0.getStart();
                            int v9 = layoutHelper$BidiRun0.getEnd();
                            while(v9 - v8 > 1) {
                                int v10 = (v9 + v8) / 2;
                                float f2 = arr_f[(v10 - v3) * 2];
                                if(!layoutHelper$BidiRun0.isRtl() && f2 > rectF0.left || layoutHelper$BidiRun0.isRtl() && f2 < rectF0.right) {
                                    v9 = v10;
                                }
                                else {
                                    v8 = v10;
                                }
                            }
                            if(layoutHelper$BidiRun0.isRtl()) {
                                v8 = v9;
                            }
                        }
                        else {
                            v8 = layoutHelper$BidiRun0.getStart();
                        }
                        int v11 = segmentFinder0.nextEndBoundary(v8);
                        if(v11 != -1) {
                            int v12 = segmentFinder0.previousStartBoundary(v11);
                            if(v12 < layoutHelper$BidiRun0.getEnd()) {
                                v13 = c.coerceAtLeast(v12, layoutHelper$BidiRun0.getStart());
                                arr_layoutHelper$BidiRun1 = arr_layoutHelper$BidiRun;
                                RectF rectF1 = new RectF(0.0f, ((float)v1), 0.0f, ((float)v2));
                                int v14 = c.coerceAtMost(v11, layoutHelper$BidiRun0.getEnd());
                                while(true) {
                                    rectF1.left = layoutHelper$BidiRun0.isRtl() ? arr_f[(v14 - 1 - v3) * 2] : arr_f[(v13 - v3) * 2];
                                    rectF1.right = layoutHelper$BidiRun0.isRtl() ? TextLayoutGetRangeForRectExtensions_androidKt.a(arr_f, v13, v3) : TextLayoutGetRangeForRectExtensions_androidKt.a(arr_f, v14 - 1, v3);
                                    if(((Boolean)function20.invoke(rectF1, rectF0)).booleanValue()) {
                                        goto label_88;
                                    }
                                    v13 = segmentFinder0.nextStartBoundary(v13);
                                    if(v13 == -1 || v13 >= layoutHelper$BidiRun0.getEnd()) {
                                        goto label_87;
                                    }
                                    v14 = c.coerceAtMost(segmentFinder0.nextEndBoundary(v13), layoutHelper$BidiRun0.getEnd());
                                }
                            }
                        }
                    }
                    arr_layoutHelper$BidiRun1 = arr_layoutHelper$BidiRun;
                }
                else {
                    arr_layoutHelper$BidiRun1 = arr_layoutHelper$BidiRun;
                    if(f1 >= rectF0.left && f <= rectF0.right) {
                        if((layoutHelper$BidiRun0.isRtl() || rectF0.right < f1) && (!layoutHelper$BidiRun0.isRtl() || rectF0.left > f)) {
                            v15 = layoutHelper$BidiRun0.getStart();
                            int v16 = layoutHelper$BidiRun0.getEnd();
                            while(v16 - v15 > 1) {
                                int v17 = (v16 + v15) / 2;
                                float f3 = arr_f[(v17 - v3) * 2];
                                if(!layoutHelper$BidiRun0.isRtl() && f3 > rectF0.right || layoutHelper$BidiRun0.isRtl() && f3 < rectF0.left) {
                                    v16 = v17;
                                }
                                else {
                                    v15 = v17;
                                }
                            }
                            if(layoutHelper$BidiRun0.isRtl()) {
                                v15 = v16;
                            }
                        }
                        else {
                            v15 = layoutHelper$BidiRun0.getEnd() - 1;
                        }
                        int v18 = segmentFinder0.previousStartBoundary(v15 + 1);
                        if(v18 != -1) {
                            int v19 = segmentFinder0.nextEndBoundary(v18);
                            if(v19 > layoutHelper$BidiRun0.getStart()) {
                                int v20 = c.coerceAtMost(v19, layoutHelper$BidiRun0.getEnd());
                                RectF rectF2 = new RectF(0.0f, ((float)v1), 0.0f, ((float)v2));
                                int v21 = c.coerceAtLeast(v18, layoutHelper$BidiRun0.getStart());
                                while(true) {
                                    rectF2.left = layoutHelper$BidiRun0.isRtl() ? arr_f[(v20 - 1 - v3) * 2] : arr_f[(v21 - v3) * 2];
                                    rectF2.right = layoutHelper$BidiRun0.isRtl() ? TextLayoutGetRangeForRectExtensions_androidKt.a(arr_f, v21, v3) : TextLayoutGetRangeForRectExtensions_androidKt.a(arr_f, v20 - 1, v3);
                                    if(((Boolean)function20.invoke(rectF2, rectF0)).booleanValue()) {
                                        v13 = v20;
                                        goto label_88;
                                    }
                                    v20 = segmentFinder0.previousEndBoundary(v20);
                                    if(v20 == -1 || v20 <= layoutHelper$BidiRun0.getStart()) {
                                        break;
                                    }
                                    v21 = c.coerceAtLeast(segmentFinder0.previousStartBoundary(v20), layoutHelper$BidiRun0.getStart());
                                }
                            }
                        }
                    }
                }
            label_87:
                v13 = -1;
            label_88:
                if(v13 >= 0) {
                    return v13;
                }
                if(v5 == v6) {
                    break;
                }
                v5 += v7;
                arr_layoutHelper$BidiRun = arr_layoutHelper$BidiRun1;
            }
        }
        return -1;
    }

    @Nullable
    public static final int[] getRangeForRect(@NotNull TextLayout textLayout0, @NotNull Layout layout0, @NotNull LayoutHelper layoutHelper0, @NotNull RectF rectF0, int v, @NotNull Function2 function20) {
        SegmentFinder segmentFinder0 = v == 1 ? new WordSegmentFinder(textLayout0.getText(), textLayout0.getWordIterator()) : SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout0.getText(), textLayout0.getTextPaint());
        int v1 = layout0.getLineForVertical(((int)rectF0.top));
        if(Float.compare(rectF0.top, textLayout0.getLineBottom(v1)) > 0) {
            ++v1;
            if(v1 >= textLayout0.getLineCount()) {
                return null;
            }
        }
        int v2 = v1;
        int v3 = layout0.getLineForVertical(((int)rectF0.bottom));
        if(v3 == 0 && rectF0.bottom < textLayout0.getLineTop(0)) {
            return null;
        }
        int v4;
        for(v4 = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout0, layout0, layoutHelper0, v2, rectF0, segmentFinder0, function20, true); v4 == -1 && v2 < v3; v4 = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout0, layout0, layoutHelper0, v2, rectF0, segmentFinder0, function20, true)) {
            ++v2;
        }
        if(v4 == -1) {
            return null;
        }
        int v5;
        for(v5 = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout0, layout0, layoutHelper0, v3, rectF0, segmentFinder0, function20, false); v5 == -1 && v2 < v3; v5 = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout0, layout0, layoutHelper0, v3, rectF0, segmentFinder0, function20, false)) {
            --v3;
        }
        return v5 == -1 ? null : new int[]{segmentFinder0.previousStartBoundary(v4 + 1), segmentFinder0.nextEndBoundary(v5 - 1)};
    }
}

