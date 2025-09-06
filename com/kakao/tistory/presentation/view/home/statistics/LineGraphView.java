package com.kakao.tistory.presentation.view.home.statistics;

import android.content.Context;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.kakao.android.base.utils.DateUtils;
import com.kakao.tistory.domain.entity.TrendItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.font;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000E\u001A\u00020\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0014R6\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u000FR\u001B\u0010\"\u001A\u00020\u000B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u001B\u0010%\u001A\u00020\u000B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001F\u001A\u0004\b$\u0010!R\u001B\u0010(\u001A\u00020\u000B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001F\u001A\u0004\b\'\u0010!R\u001B\u0010+\u001A\u00020\u000B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001F\u001A\u0004\b*\u0010!R\u001B\u0010.\u001A\u00020\u000B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001F\u001A\u0004\b-\u0010!¨\u0006/"}, d2 = {"Lcom/kakao/tistory/presentation/view/home/statistics/LineGraphView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "newGraphPoints", "", "setGraphData", "(Ljava/util/List;)V", "", "getMax", "()J", "Content", "(Landroidx/compose/runtime/Composer;I)V", "", "Lcom/kakao/tistory/domain/entity/TrendItem;", "value", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "items", "c", "Lkotlin/Lazy;", "getLineWidth", "()F", "lineWidth", "d", "getOuterCircleSize", "outerCircleSize", "g", "getDayTextSize", "dayTextSize", "j", "getBgLineWidth", "bgLineWidth", "k", "getBackgroundLineStartY", "backgroundLineStartY", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLineGraphView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineGraphView.kt\ncom/kakao/tistory/presentation/view/home/statistics/LineGraphView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,307:1\n1#2:308\n1855#3,2:309\n1855#3,2:311\n1549#3:313\n1620#3,3:314\n256#4:317\n*S KotlinDebug\n*F\n+ 1 LineGraphView.kt\ncom/kakao/tistory/presentation/view/home/statistics/LineGraphView\n*L\n42#1:309,2\n55#1:311,2\n68#1:313\n68#1:314,3\n183#1:317\n*E\n"})
public final class LineGraphView extends AbstractComposeView {
    public static final int $stable = 8;
    public List a;
    public final SnapshotStateList b;
    public final Lazy c;
    public final Lazy d;
    public final float e;
    public final float f;
    public final Lazy g;
    public final int h;
    public final int i;
    public final Lazy j;
    public final Lazy k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final Paint r;
    public float s;
    public float t;
    public float u;
    public float v;

    @JvmOverloads
    public LineGraphView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public LineGraphView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public LineGraphView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        this.b = SnapshotStateKt.mutableStateListOf();
        this.c = c.lazy(new g(context0));
        this.d = c.lazy(new h(context0));
        float f = this.getOuterCircleSize();
        this.e = f * 2.0f;
        this.f = this.getOuterCircleSize() - this.getLineWidth();
        this.g = c.lazy(new f(context0));
        this.h = ContextCompat.getColor(context0, color.color_9d9d9d);
        this.i = ContextCompat.getColor(context0, color.gray5);
        this.j = c.lazy(new e(context0));
        this.k = c.lazy(new d(context0));
        this.l = ColorKt.Color(ContextCompat.getColor(context0, color.color_f5f5f5));
        this.m = ColorKt.Color(ContextCompat.getColor(context0, color.color_ededed));
        long v1 = ColorKt.Color(ContextCompat.getColor(context0, color.point1));
        this.n = v1;
        this.o = ColorKt.Color(ContextCompat.getColor(context0, color.point1_50));
        this.p = v1;
        this.q = ColorKt.Color(ContextCompat.getColor(context0, color.white));
        Paint paint0 = new Paint(1);
        paint0.setStyle(Paint.Style.FILL);
        paint0.setTextSize(this.getDayTextSize());
        paint0.setTypeface(ResourcesCompat.getFont(context0, font.font_pretendard_light));
        this.r = paint0;
        this.v = f * 2.0f;
    }

    public LineGraphView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-667498036);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-667498036, v, -1, "com.kakao.tistory.presentation.view.home.statistics.LineGraphView.Content (LineGraphView.kt:116)");
        }
        if(!this.b.isEmpty() && !this.a.isEmpty()) {
            this.s = ((float)(this.getWidth() - this.getPaddingLeft() - this.getPaddingRight())) - this.getBgLineWidth() * 2.0f;
            this.t = ((float)(this.getHeight() - this.getPaddingTop() - this.getPaddingBottom())) - this.e;
            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), new b(this), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.view.home.statistics.c(this, v));
            }
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new a(this, v));
        }
    }

    public static float a(LineGraphView lineGraphView0, float f) {
        float f1 = lineGraphView0.t - lineGraphView0.v;
        long v = lineGraphView0.getMax();
        return v == 0L ? f1 - 0.0f + lineGraphView0.v + ((float)lineGraphView0.getPaddingTop()) : f1 - f / ((float)v) * f1 + lineGraphView0.v + ((float)lineGraphView0.getPaddingTop());
    }

    public final float a(float f, boolean z) {
        float f1 = f / ((float)(this.a.size() - 1)) * this.s;
        if(z) {
            if(f == 1.0f) {
                this.u = f1 / 2.0f;
            }
            f1 -= this.u;
        }
        return f1 + ((float)this.getPaddingLeft()) + this.getBgLineWidth();
    }

    public static final void access$drawBackground(LineGraphView lineGraphView0, DrawScope drawScope0) {
        int v = lineGraphView0.b.size();
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                float f = lineGraphView0.a(((float)v1), false);
                long v2 = OffsetKt.Offset(f, lineGraphView0.getBackgroundLineStartY());
                long v3 = OffsetKt.Offset(f, lineGraphView0.t);
                float f1 = lineGraphView0.getBgLineWidth();
                DrawScope.drawLine-NGM6Ib0$default(drawScope0, lineGraphView0.l, v2, v3, f1, 0, null, 0.0f, null, 0, 0x1F0, null);
                if(v1 == v) {
                    break;
                }
            }
        }
        long v4 = OffsetKt.Offset(lineGraphView0.a(0.0f, false), lineGraphView0.t);
        long v5 = OffsetKt.Offset(lineGraphView0.s + lineGraphView0.getBgLineWidth(), lineGraphView0.t);
        float f2 = lineGraphView0.getBgLineWidth();
        DrawScope.drawLine-NGM6Ib0$default(drawScope0, lineGraphView0.m, v4, v5, f2, 0, null, 0.0f, null, 0, 0x1F0, null);
    }

    public static final void access$drawCircle(LineGraphView lineGraphView0, DrawScope drawScope0) {
        int v = lineGraphView0.b.size();
        for(int v1 = 1; v1 < v; ++v1) {
            if(v1 == lineGraphView0.b.size() - 1) {
                long v2 = OffsetKt.Offset(lineGraphView0.a(((float)v1), true), LineGraphView.a(lineGraphView0, ((GraphItem)lineGraphView0.b.get(v1)).getPosition()));
                DrawScope.drawCircle-VaOC9Bg$default(drawScope0, lineGraphView0.o, lineGraphView0.e, v2, 0.0f, null, null, 0, 120, null);
            }
            long v3 = OffsetKt.Offset(lineGraphView0.a(((float)v1), true), LineGraphView.a(lineGraphView0, ((GraphItem)lineGraphView0.b.get(v1)).getPosition()));
            float f = lineGraphView0.getOuterCircleSize();
            DrawScope.drawCircle-VaOC9Bg$default(drawScope0, lineGraphView0.p, f, v3, 0.0f, null, null, 0, 120, null);
            long v4 = OffsetKt.Offset(lineGraphView0.a(((float)v1), true), LineGraphView.a(lineGraphView0, ((GraphItem)lineGraphView0.b.get(v1)).getPosition()));
            DrawScope.drawCircle-VaOC9Bg$default(drawScope0, (v1 >= lineGraphView0.b.size() - 1 ? lineGraphView0.o : lineGraphView0.q), lineGraphView0.f, v4, 0.0f, null, null, 0, 120, null);
        }
    }

    public static final void access$drawDay(LineGraphView lineGraphView0, DrawScope drawScope0) {
        int v = lineGraphView0.a.size();
        float f = 0.0f;
        for(int v1 = 1; v1 < v; ++v1) {
            String s = DateUtils.getCompareDateTime$default(DateUtils.INSTANCE, "", null, null, 6, null) == 0 ? lineGraphView0.getContext().getString(string.label_date_time_today) : DateUtils.INSTANCE.getDateTimeFormatFromISO8601("", "EEE");
            Intrinsics.checkNotNull(s);
            Rect rect0 = new Rect();
            lineGraphView0.r.getTextBounds(s, 0, s.length(), rect0);
            int v2 = rect0.width();
            if(v1 == 1) {
                f = ((float)rect0.height()) + lineGraphView0.getBgLineWidth();
                float f1 = lineGraphView0.v;
                Context context0 = lineGraphView0.getContext();
                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                lineGraphView0.v = ((float)ScaleUtilsKt.dp2px(context0, 8.0f)) + f + f1;
            }
            lineGraphView0.r.setColor((v1 == lineGraphView0.a.size() - 1 ? lineGraphView0.i : lineGraphView0.h));
            AndroidCanvas_androidKt.getNativeCanvas(drawScope0.getDrawContext().getCanvas()).drawText(s, lineGraphView0.a(((float)v1), true) - ((float)(v2 / 2)), f, lineGraphView0.r);
        }
    }

    public static final void access$drawLineChart(LineGraphView lineGraphView0, DrawScope drawScope0) {
        lineGraphView0.getClass();
        Path path0 = AndroidPath_androidKt.Path();
        path0.moveTo(lineGraphView0.a(0.0f, false), LineGraphView.a(lineGraphView0, ((GraphItem)lineGraphView0.b.get(0)).getPosition()));
        int v = lineGraphView0.b.size();
        for(int v1 = 1; v1 < v; ++v1) {
            path0.lineTo(lineGraphView0.a(((float)v1), true), LineGraphView.a(lineGraphView0, ((GraphItem)lineGraphView0.b.get(v1)).getPosition()));
        }
        Stroke stroke0 = new Stroke(lineGraphView0.getLineWidth(), 0.0f, 0, 0, null, 30, null);
        DrawScope.drawPath-LG529CI$default(drawScope0, path0, lineGraphView0.n, 0.0f, stroke0, null, 0, 52, null);
    }

    private final float getBackgroundLineStartY() {
        return ((Number)this.k.getValue()).floatValue();
    }

    private final float getBgLineWidth() {
        return ((Number)this.j.getValue()).floatValue();
    }

    private final float getDayTextSize() {
        return ((Number)this.g.getValue()).floatValue();
    }

    @NotNull
    public final List getItems() {
        return this.a;
    }

    private final float getLineWidth() {
        return ((Number)this.c.getValue()).floatValue();
    }

    private final long getMax() {
        Long long0 = ((TrendItem)this.a.get(0)).getCount();
        long v = long0 == null ? 0L : ((long)long0);
        int v1 = this.a.size();
        for(int v2 = 1; v2 < v1; ++v2) {
            Long long1 = ((TrendItem)this.a.get(v2)).getCount();
            long v3 = long1 == null ? 0L : ((long)long1);
            if(v3 > v) {
                v = v3;
            }
        }
        return v;
    }

    private final float getOuterCircleSize() {
        return ((Number)this.d.getValue()).floatValue();
    }

    private final void setGraphData(List list0) {
        long v = AnimationUtils.currentAnimationTimeMillis();
        if(this.b.size() != list0.size()) {
            this.b.clear();
            for(Object object0: list0) {
                float f = ((Number)object0).floatValue();
                GraphItem graphItem0 = new GraphItem(100.0f, 1.0f);
                graphItem0.setPosition(f, v);
                graphItem0.setTargetPosition(f, v);
                this.b.add(graphItem0);
            }
            this.invalidate();
            return;
        }
        int v1 = 0;
        for(Object object1: list0) {
            ((GraphItem)this.b.get(v1)).setTargetPosition(((Number)object1).floatValue(), v);
            ++v1;
        }
    }

    public final void setItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "value");
        List list1 = list0.isEmpty() ? null : list0;
        if(list1 != null) {
            q.reverse(list1);
        }
        if(list0.isEmpty()) {
            Iterator iterator1 = new IntRange(0, 7).iterator();
            while(iterator1.hasNext()) {
                int v1 = Math.abs(((IntIterator)iterator1).nextInt());
                list0.add(new TrendItem(DateUtils.getDayAgoDateTime$default(DateUtils.INSTANCE, v1, null, null, "yyyy-MM-dd\'T\'HH:mm:ssXXX", 6, null), null, null, null, null, 30, null));
            }
        }
        else {
            Iterator iterator0 = new IntRange(list0.size() + 1, 7).iterator();
            while(iterator0.hasNext()) {
                int v = ((IntIterator)iterator0).nextInt();
                DateUtils dateUtils0 = DateUtils.INSTANCE;
                if(list0.size() == 1) {
                    list0.get(0);
                }
                else {
                    list0.get(v - 1);
                }
                list0.add(new TrendItem(dateUtils0.getDayAgoDateTime(1, "", "yyyy-MM-dd\'T\'HH:mm:ssXXX", "yyyy-MM-dd\'T\'HH:mm:ssXXX"), null, null, null, null, 30, null));
            }
        }
        this.a = list0;
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            Long long0 = ((TrendItem)object0).getCount();
            arrayList0.add(((float)(long0 == null ? 0.0f : ((float)(((long)long0))))));
        }
        this.setGraphData(arrayList0);
    }
}

