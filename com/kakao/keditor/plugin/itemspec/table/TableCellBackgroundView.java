package com.kakao.keditor.plugin.itemspec.table;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\'\u001A\u00020(2\u0006\u0010)\u001A\u00020*H\u0014R\u001A\u0010\u000B\u001A\u00020\tX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\tX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000FR\u000E\u0010\u0013\u001A\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\u0015\u001A\u00020\tX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000FR\u001A\u0010\u0018\u001A\u00020\tX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\r\"\u0004\b\u001A\u0010\u000FR\u001A\u0010\u001B\u001A\u00020\u001CX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001A\u0010!\u001A\u00020\tX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000FR\u001A\u0010$\u001A\u00020\tX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b%\u0010\r\"\u0004\b&\u0010\u000F¨\u0006+"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableCellBackgroundView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colSpan", "getColSpan", "()I", "setColSpan", "(I)V", "colStartIdx", "getColStartIdx", "setColStartIdx", "paint", "Landroid/graphics/Paint;", "rowSpan", "getRowSpan", "setRowSpan", "rowStartIdx", "getRowStartIdx", "setRowStartIdx", "style", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle;", "getStyle", "()Lcom/kakao/keditor/plugin/itemspec/table/TableStyle;", "setStyle", "(Lcom/kakao/keditor/plugin/itemspec/table/TableStyle;)V", "totalCol", "getTotalCol", "setTotalCol", "totalRow", "getTotalRow", "setTotalRow", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TableCellBackgroundView extends FrameLayout {
    private int colSpan;
    private int colStartIdx;
    @NotNull
    private final Paint paint;
    private int rowSpan;
    private int rowStartIdx;
    @NotNull
    private TableStyle style;
    private int totalCol;
    private int totalRow;

    public TableCellBackgroundView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.colSpan = 1;
        this.rowSpan = 1;
        this.style = TableStyle.STYLE0;
        this.paint = new Paint();
    }

    public TableCellBackgroundView(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0);
        this.colSpan = 1;
        this.rowSpan = 1;
        this.style = TableStyle.STYLE0;
        this.paint = new Paint();
    }

    public TableCellBackgroundView(@NotNull Context context0, @NotNull AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0, v);
        this.colSpan = 1;
        this.rowSpan = 1;
        this.style = TableStyle.STYLE0;
        this.paint = new Paint();
    }

    public final int getColSpan() {
        return this.colSpan;
    }

    public final int getColStartIdx() {
        return this.colStartIdx;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }

    public final int getRowStartIdx() {
        return this.rowStartIdx;
    }

    @NotNull
    public final TableStyle getStyle() {
        return this.style;
    }

    public final int getTotalCol() {
        return this.totalCol;
    }

    public final int getTotalRow() {
        return this.totalRow;
    }

    @Override  // android.view.View
    public void onDraw(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        super.onDraw(canvas0);
        LineStyle tableStyle$LineStyle0 = this.style.getVerticalLineStyle(this.rowStartIdx, this.colStartIdx, this.totalRow, this.totalCol);
        LineStyle tableStyle$LineStyle1 = this.style.getVerticalLineStyle(this.rowStartIdx, this.colStartIdx + this.colSpan, this.totalRow, this.totalCol);
        LineStyle tableStyle$LineStyle2 = this.style.getHorizontalLineStyle(this.rowStartIdx, this.colStartIdx, this.totalRow, this.totalCol);
        LineStyle tableStyle$LineStyle3 = this.style.getHorizontalLineStyle(this.rowStartIdx + this.rowSpan, this.colStartIdx, this.totalRow, this.totalCol);
        Integer integer0 = this.style.getCellColorRes(this.rowStartIdx, this.colStartIdx, this.totalRow, this.totalCol);
        if(integer0 != null) {
            int v = ContextCompat.getColor(this.getContext(), integer0.intValue());
            this.paint.setColor(v);
            this.paint.setStyle(Paint.Style.FILL);
            canvas0.drawPaint(this.paint);
        }
        this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
        int v1 = this.colStartIdx + this.colSpan;
        int v2 = this.rowStartIdx + this.rowSpan;
        if(tableStyle$LineStyle0 != null) {
            int v3 = ContextCompat.getColor(this.getContext(), tableStyle$LineStyle0.getColorRes());
            this.paint.setColor(v3);
            this.paint.setStrokeWidth(tableStyle$LineStyle0.getWidth());
            canvas0.drawLine(0.0f, 0.0f, 0.0f, ((float)this.getHeight()), this.paint);
        }
        if(v1 == this.totalCol && tableStyle$LineStyle1 != null) {
            int v4 = ContextCompat.getColor(this.getContext(), tableStyle$LineStyle1.getColorRes());
            this.paint.setColor(v4);
            this.paint.setStrokeWidth(tableStyle$LineStyle1.getWidth());
            canvas0.drawLine(((float)this.getWidth()), 0.0f, ((float)this.getWidth()), ((float)this.getHeight()), this.paint);
        }
        if(tableStyle$LineStyle2 != null) {
            int v5 = ContextCompat.getColor(this.getContext(), tableStyle$LineStyle2.getColorRes());
            this.paint.setColor(v5);
            this.paint.setStrokeWidth(tableStyle$LineStyle2.getWidth());
            canvas0.drawLine(0.0f, 0.0f, ((float)this.getWidth()), 0.0f, this.paint);
        }
        if(v2 == this.totalRow && tableStyle$LineStyle3 != null) {
            int v6 = ContextCompat.getColor(this.getContext(), tableStyle$LineStyle3.getColorRes());
            this.paint.setColor(v6);
            this.paint.setStrokeWidth(tableStyle$LineStyle3.getWidth());
            canvas0.drawLine(0.0f, ((float)this.getHeight()), ((float)this.getWidth()), ((float)this.getHeight()), this.paint);
        }
    }

    public final void setColSpan(int v) {
        this.colSpan = v;
    }

    public final void setColStartIdx(int v) {
        this.colStartIdx = v;
    }

    public final void setRowSpan(int v) {
        this.rowSpan = v;
    }

    public final void setRowStartIdx(int v) {
        this.rowStartIdx = v;
    }

    public final void setStyle(@NotNull TableStyle tableStyle0) {
        Intrinsics.checkNotNullParameter(tableStyle0, "<set-?>");
        this.style = tableStyle0;
    }

    public final void setTotalCol(int v) {
        this.totalCol = v;
    }

    public final void setTotalRow(int v) {
        this.totalRow = v;
    }
}

