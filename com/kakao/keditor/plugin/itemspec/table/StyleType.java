package com.kakao.keditor.plugin.itemspec.table;

import com.kakao.keditor.R.color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u000F\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004H\u0016¢\u0006\u0002\u0010\tJ\u001F\u0010\n\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0002\u0010\u000BJ*\u0010\f\u001A\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004H\u0016J*\u0010\u000E\u001A\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004H\u0016\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001A¨\u0006\u001B"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "", "()V", "getCellColorRes", "", "rowIndex", "colIndex", "totalRow", "totalCol", "(IIII)Ljava/lang/Integer;", "getFontColorRes", "(II)Ljava/lang/Integer;", "getHorizontalLineStyle", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$LineStyle;", "getVerticalLineStyle", "ColoredStyle", "ComplexStyle", "NoLineStyle", "NoStyle", "NoVerticalLineStyle", "SingleLineStyle", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType$ColoredStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType$ComplexStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType$NoLineStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType$NoStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType$NoVerticalLineStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType$SingleLineStyle;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class StyleType {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J/\u0010\u0006\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000BJ(\u0010\f\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003H\u0016J(\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003H\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/StyleType$ColoredStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "cellColorRes", "", "lineColorRes", "(II)V", "getCellColorRes", "rowIndex", "colIndex", "totalRow", "totalCol", "(IIII)Ljava/lang/Integer;", "getHorizontalLineStyle", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$LineStyle;", "getVerticalLineStyle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ColoredStyle extends StyleType {
        private final int cellColorRes;
        private final int lineColorRes;

        public ColoredStyle(int v, int v1) {
            super(null);
            this.cellColorRes = v;
            this.lineColorRes = v1;
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public Integer getCellColorRes(int v, int v1, int v2, int v3) {
            return v % 2 == 1 ? this.cellColorRes : super.getCellColorRes(v, v1, v2, v3);
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @NotNull
        public LineStyle getHorizontalLineStyle(int v, int v1, int v2, int v3) {
            return new LineStyle(this.lineColorRes, TableStyleKt.access$getTHIN_LINE_WIDTH$p());
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @NotNull
        public LineStyle getVerticalLineStyle(int v, int v1, int v2, int v3) {
            return new LineStyle(this.lineColorRes, TableStyleKt.access$getTHIN_LINE_WIDTH$p());
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0003H\u0016¢\u0006\u0002\u0010\nJ\u001F\u0010\u000B\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0003H\u0016¢\u0006\u0002\u0010\fJ*\u0010\r\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0003H\u0016J*\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0003H\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/StyleType$ComplexStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "cellColorRes", "", "(I)V", "getCellColorRes", "rowIndex", "colIndex", "totalRow", "totalCol", "(IIII)Ljava/lang/Integer;", "getFontColorRes", "(II)Ljava/lang/Integer;", "getHorizontalLineStyle", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$LineStyle;", "getVerticalLineStyle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ComplexStyle extends StyleType {
        private final int cellColorRes;

        public ComplexStyle(int v) {
            super(null);
            this.cellColorRes = v;
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public Integer getCellColorRes(int v, int v1, int v2, int v3) {
            if(v == 0) {
                return this.cellColorRes;
            }
            if(v1 == 0) {
                return color.ke_table_fill_medium_gray;
            }
            return v % 2 == 0 ? color.ke_table_fill_light_gray : super.getCellColorRes(v, v1, v2, v3);
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public Integer getFontColorRes(int v, int v1) {
            return v == 0 ? color.ke_color_text_invert : null;
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public LineStyle getHorizontalLineStyle(int v, int v1, int v2, int v3) {
            return v == 0 || v == 1 ? null : super.getHorizontalLineStyle(v, v1, v2, v3);
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public LineStyle getVerticalLineStyle(int v, int v1, int v2, int v3) {
            return v == 0 ? null : super.getHorizontalLineStyle(v, v1, v2, v3);
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u0016J*\u0010\n\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u0016¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/StyleType$NoLineStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "()V", "getHorizontalLineStyle", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$LineStyle;", "rowIndex", "", "colIndex", "totalRow", "totalCol", "getVerticalLineStyle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class NoLineStyle extends StyleType {
        @NotNull
        public static final NoLineStyle INSTANCE;

        static {
            NoLineStyle.INSTANCE = new NoLineStyle();
        }

        private NoLineStyle() {
            super(null);
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public LineStyle getHorizontalLineStyle(int v, int v1, int v2, int v3) {
            return null;
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public LineStyle getVerticalLineStyle(int v, int v1, int v2, int v3) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/StyleType$NoStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class NoStyle extends StyleType {
        @NotNull
        public static final NoStyle INSTANCE;

        static {
            NoStyle.INSTANCE = new NoStyle();
        }

        private NoStyle() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003H\u0016J*\u0010\u000B\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003H\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/StyleType$NoVerticalLineStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "lineColorRes", "", "(I)V", "getHorizontalLineStyle", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$LineStyle;", "rowIndex", "colIndex", "totalRow", "totalCol", "getVerticalLineStyle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class NoVerticalLineStyle extends StyleType {
        private final int lineColorRes;

        public NoVerticalLineStyle(int v) {
            super(null);
            this.lineColorRes = v;
        }

        // 去混淆评级： 低(30)
        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public LineStyle getHorizontalLineStyle(int v, int v1, int v2, int v3) {
            return v == 1 ? new LineStyle(this.lineColorRes, 0.0f) : super.getHorizontalLineStyle(v, v1, v2, v3);
        }

        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public LineStyle getVerticalLineStyle(int v, int v1, int v2, int v3) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003H\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/StyleType$SingleLineStyle;", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "lineColorRes", "", "(I)V", "getHorizontalLineStyle", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$LineStyle;", "rowIndex", "colIndex", "totalRow", "totalCol", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SingleLineStyle extends StyleType {
        private final int lineColorRes;

        public SingleLineStyle(int v) {
            super(null);
            this.lineColorRes = v;
        }

        // 去混淆评级： 低(30)
        @Override  // com.kakao.keditor.plugin.itemspec.table.StyleType
        @Nullable
        public LineStyle getHorizontalLineStyle(int v, int v1, int v2, int v3) {
            return v == 1 ? new LineStyle(this.lineColorRes, 0.0f) : super.getHorizontalLineStyle(v, v1, v2, v3);
        }
    }

    private StyleType() {
    }

    public StyleType(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Nullable
    public Integer getCellColorRes(int v, int v1, int v2, int v3) {
        return null;
    }

    @Nullable
    public Integer getFontColorRes(int v, int v1) {
        return null;
    }

    @Nullable
    public LineStyle getHorizontalLineStyle(int v, int v1, int v2, int v3) {
        return new LineStyle(color.ke_table_thin_line_gray, TableStyleKt.access$getTHIN_LINE_WIDTH$p());
    }

    @Nullable
    public LineStyle getVerticalLineStyle(int v, int v1, int v2, int v3) {
        return new LineStyle(color.ke_table_thin_line_gray, TableStyleKt.access$getTHIN_LINE_WIDTH$p());
    }
}

