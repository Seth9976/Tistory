package com.kakao.keditor.plugin.itemspec.table;

import android.content.Context;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.attrs.text.SelectableItem.DefaultImpls;
import com.kakao.keditor.plugin.attrs.text.SelectableItem;
import com.kakao.keditor.plugin.itemspec.EnumList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002-.B\'\b\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ-\u0010\u000F\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0006¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u0017H\u0016J(\u0010\u0018\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0006J\b\u0010\u001A\u001A\u00020\u0006H\u0016J(\u0010\u001B\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0006R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u000E\u0010\u0007\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001A\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000Ej\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001Ej\u0002\b\u001Fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006/"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableStyle;", "", "Lcom/kakao/keditor/plugin/attrs/text/SelectableItem;", "styleName", "", "selectorRes", "", "styleNameRes", "styleType", "Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "(Ljava/lang/String;ILjava/lang/String;IILcom/kakao/keditor/plugin/itemspec/table/StyleType;)V", "getStyleName", "()Ljava/lang/String;", "getStyleType$keditor_release", "()Lcom/kakao/keditor/plugin/itemspec/table/StyleType;", "getCellColorRes", "rowIndex", "colIndex", "totalRow", "totalCol", "(IIII)Ljava/lang/Integer;", "getDescription", "context", "Landroid/content/Context;", "getHorizontalLineStyle", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$LineStyle;", "getImage", "getVerticalLineStyle", "STYLE0", "STYLE1", "STYLE2", "STYLE3", "STYLE4", "STYLE5", "STYLE6", "STYLE7", "STYLE8", "STYLE9", "STYLE10", "STYLE11", "STYLE12", "STYLE13", "STYLE14", "STYLE15", "STYLE16", "Companion", "LineStyle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum TableStyle implements SelectableItem {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u0006\u001A\u00020\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\bJ\u000E\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\nH\u0016¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$Companion;", "Lcom/kakao/keditor/plugin/itemspec/EnumList;", "()V", "getAllList", "", "Lcom/kakao/keditor/plugin/itemspec/table/TableStyle;", "getByName", "name", "", "typeSet", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTableStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableStyle.kt\ncom/kakao/keditor/plugin/itemspec/table/TableStyle$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1282#2,2:115\n1549#3:117\n1620#3,3:118\n*S KotlinDebug\n*F\n+ 1 TableStyle.kt\ncom/kakao/keditor/plugin/itemspec/table/TableStyle$Companion\n*L\n50#1:115,2\n54#1:117\n54#1:118,3\n*E\n"})
    public static final class Companion implements EnumList {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List getAllList() {
            return ArraysKt___ArraysKt.toList(TableStyle.values());
        }

        @NotNull
        public final TableStyle getByName(@Nullable String s) {
            TableStyle[] arr_tableStyle = TableStyle.values();
            for(int v = 0; v < arr_tableStyle.length; ++v) {
                TableStyle tableStyle0 = arr_tableStyle[v];
                if(p.equals(tableStyle0.getStyleName(), s, true)) {
                    return tableStyle0 == null ? TableStyle.STYLE0 : tableStyle0;
                }
            }
            return TableStyle.STYLE0;
        }

        @Override  // com.kakao.keditor.plugin.itemspec.EnumList
        @NotNull
        public Set typeSet() {
            Iterable iterable0 = this.getAllList();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(((TableStyle)object0).getStyleName());
            }
            return CollectionsKt___CollectionsKt.toSet(arrayList0);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableStyle$LineStyle;", "", "colorRes", "", "width", "", "(IF)V", "getColorRes", "()I", "getWidth", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LineStyle {
        private final int colorRes;
        private final float width;

        public LineStyle(int v, float f) {
            this.colorRes = v;
            this.width = f;
        }

        public final int component1() {
            return this.colorRes;
        }

        public final float component2() {
            return this.width;
        }

        @NotNull
        public final LineStyle copy(int v, float f) {
            return new LineStyle(v, f);
        }

        public static LineStyle copy$default(LineStyle tableStyle$LineStyle0, int v, float f, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = tableStyle$LineStyle0.colorRes;
            }
            if((v1 & 2) != 0) {
                f = tableStyle$LineStyle0.width;
            }
            return tableStyle$LineStyle0.copy(v, f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LineStyle)) {
                return false;
            }
            return this.colorRes == ((LineStyle)object0).colorRes ? Float.compare(this.width, ((LineStyle)object0).width) == 0 : false;
        }

        public final int getColorRes() {
            return this.colorRes;
        }

        public final float getWidth() {
            return this.width;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.width) + this.colorRes * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "LineStyle(colorRes=" + this.colorRes + ", width=" + this.width + ")";
        }
    }

    STYLE0("style0", drawable.ke_ic_table_style_00, string.cd_table_normal_style_1, NoStyle.INSTANCE),
    STYLE1("style1", drawable.ke_ic_table_style_01, string.cd_table_normal_style_1, new SingleLineStyle(color.ke_table_fill_skyblue)),
    STYLE2("style2", drawable.ke_ic_table_style_02, string.cd_table_normal_style_2, new SingleLineStyle(color.ke_table_fill_green)),
    STYLE3("style3", drawable.ke_ic_table_style_03, string.cd_table_normal_style_3, new SingleLineStyle(color.ke_table_fill_blue)),
    STYLE4("style4", drawable.ke_ic_table_style_04, string.cd_table_bright_style_1, new ColoredStyle(color.ke_table_fill_light_gray, color.ke_table_thin_line_gray)),
    STYLE5("style5", drawable.ke_ic_table_style_05, string.cd_table_bright_style_2, new ColoredStyle(color.ke_table_fill_light_skyblue, color.ke_table_thin_line_light_skyblue)),
    STYLE6("style6", drawable.ke_ic_table_style_06, string.cd_table_bright_style_3, new ColoredStyle(color.ke_table_fill_light_green, color.ke_table_thin_line_light_green)),
    STYLE7("style7", drawable.ke_ic_table_style_07, string.cd_table_bright_style_4, new ColoredStyle(color.ke_table_fill_light_blue, color.ke_table_thin_line_light_blue)),
    STYLE8("style8", drawable.ke_ic_table_style_08, string.cd_table_no_vertical_border_style_1, new NoVerticalLineStyle(color.ke_table_fill_gray)),
    STYLE9("style9", drawable.ke_ic_table_style_09, string.cd_table_no_vertical_border_style_2, new NoVerticalLineStyle(color.ke_table_fill_skyblue)),
    STYLE10("style10", drawable.ke_ic_table_style_10, string.cd_table_no_vertical_border_style_3, new NoVerticalLineStyle(color.ke_table_fill_green)),
    STYLE11("style11", drawable.ke_ic_table_style_11, string.cd_table_no_vertical_border_style_4, new NoVerticalLineStyle(color.ke_table_fill_blue)),
    STYLE12("style12", drawable.ke_ic_table_style_12, string.cd_table_dark_style_1, new ComplexStyle(color.ke_table_fill_gray)),
    STYLE13("style13", drawable.ke_ic_table_style_13, string.cd_table_dark_style_1, new ComplexStyle(color.ke_table_fill_skyblue)),
    STYLE14("style14", drawable.ke_ic_table_style_14, string.cd_table_dark_style_1, new ComplexStyle(color.ke_table_fill_green)),
    STYLE15("style15", drawable.ke_ic_table_style_15, string.cd_table_dark_style_1, new ComplexStyle(color.ke_table_fill_blue)),
    STYLE16("style16", drawable.ke_ic_table_style_16, string.cd_table_no_border_style_1, NoLineStyle.INSTANCE);

    private static final EnumEntries $ENTRIES;
    private static final TableStyle[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int selectorRes;
    @NotNull
    private final String styleName;
    private final int styleNameRes;
    @NotNull
    private final StyleType styleType;

    private static final TableStyle[] $values() [...] // Inlined contents

    static {
        TableStyle.$VALUES = arr_tableStyle;
        Intrinsics.checkNotNullParameter(arr_tableStyle, "entries");
        TableStyle.$ENTRIES = new a(arr_tableStyle);
        TableStyle.Companion = new Companion(null);
    }

    private TableStyle(String s1, int v1, int v2, StyleType styleType0) {
        this.styleName = s1;
        this.selectorRes = v1;
        this.styleNameRes = v2;
        this.styleType = styleType0;
    }

    @Nullable
    public final Integer getCellColorRes(int v, int v1, int v2, int v3) {
        return this.styleType.getCellColorRes(v, v1, v2, v3);
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @NotNull
    public String getDescription(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(this.styleNameRes);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return TableStyle.$ENTRIES;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @Nullable
    public String getHintText(@NotNull Context context0) {
        return DefaultImpls.getHintText(this, context0);
    }

    @Nullable
    public final LineStyle getHorizontalLineStyle(int v, int v1, int v2, int v3) {
        return this.styleType.getHorizontalLineStyle(v, v1, v2, v3);
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    public int getImage() {
        return this.selectorRes;
    }

    @NotNull
    public final String getStyleName() {
        return this.styleName;
    }

    @NotNull
    public final StyleType getStyleType$keditor_release() {
        return this.styleType;
    }

    @Nullable
    public final LineStyle getVerticalLineStyle(int v, int v1, int v2, int v3) {
        return this.styleType.getVerticalLineStyle(v, v1, v2, v3);
    }
}

