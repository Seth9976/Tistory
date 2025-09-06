package com.kakao.keditor.plugin.attrs.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001AB/\b\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0006¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001A\u00020\u0013H\u0002J\u0010\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017H\u0002J\u0010\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u0017H\u0016J\u000E\u0010\u0019\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017J\b\u0010\u001A\u001A\u00020\u0006H\u0016J\u0010\u0010\u001B\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001A\u00020\u0017J\b\u0010\u001C\u001A\u00020\u001DH\u0002R\u0011\u0010\b\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\fj\u0002\b\u001Ej\u0002\b\u001Fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006B"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/ColorType;", "", "Lcom/kakao/keditor/plugin/attrs/text/SelectableItem;", "colorCode", "", "colorNameRes", "", "colorRes", "colorBorder", "selectImage", "(Ljava/lang/String;ILjava/lang/String;IIII)V", "getColorBorder", "()I", "getColorCode", "()Ljava/lang/String;", "getColorNameRes", "getColorRes", "getSelectImage", "getBorderWidth", "", "getClearDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "getDescription", "getDrawable", "getImage", "getSelectorDrawable", "isClearType", "", "CLEAR", "BLACK", "LIGHT_BLACK", "DARK_GRAY", "GRAY", "LIGHT_GRAY", "WHITE", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PURPLE", "SLATE_GRAY", "PASTEL_RED", "PASTEL_ORANGE", "PASTEL_YELLOW", "PASTEL_GREEN", "PASTEL_BLUE", "PASTEL_PURPLE", "PASTEL_SLATE_GRAY", "LIGHT_RED", "LIGHT_ORANGE", "LIGHT_YELLOW", "LIGHT_GREEN", "LIGHT_BLUE", "LIGHT_PURPLE", "LIGHT_SLATE_GRAY", "DARK_RED", "DARK_ORANGE", "DARK_YELLOW", "DARK_GREEN", "DARK_BLUE", "DARK_PURPLE", "DARK_SLATE_GRAY", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ColorType implements SelectableItem {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u0006J\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\bJ\u0018\u0010\t\u001A\u0004\u0018\u00010\u00042\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u0006J\u0010\u0010\f\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/ColorType$Companion;", "", "()V", "byLightModeColor", "Lcom/kakao/keditor/plugin/attrs/text/ColorType;", "color", "", "getAllList", "", "getTypeByDisplayColor", "context", "Landroid/content/Context;", "getTypeByString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nColorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorType.kt\ncom/kakao/keditor/plugin/attrs/text/ColorType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n4117#2:128\n4217#2,2:129\n1#3:131\n*S KotlinDebug\n*F\n+ 1 ColorType.kt\ncom/kakao/keditor/plugin/attrs/text/ColorType$Companion\n*L\n123#1:128\n123#1:129,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final ColorType byLightModeColor(int v) {
            ColorType[] arr_colorType = ColorType.values();
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < arr_colorType.length; ++v1) {
                ColorType colorType0 = arr_colorType[v1];
                if(colorType0 != ColorType.CLEAR) {
                    arrayList0.add(colorType0);
                }
            }
            for(Object object0: arrayList0) {
                if(Color.parseColor(((ColorType)object0).getColorCode()) == v) {
                    return (ColorType)object0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        @NotNull
        public final List getAllList() {
            return CollectionsKt__CollectionsKt.mutableListOf(new ColorType[]{ColorType.CLEAR, ColorType.BLACK, ColorType.LIGHT_BLACK, ColorType.DARK_GRAY, ColorType.GRAY, ColorType.LIGHT_GRAY, ColorType.WHITE, ColorType.RED, ColorType.ORANGE, ColorType.YELLOW, ColorType.GREEN, ColorType.BLUE, ColorType.PURPLE, ColorType.SLATE_GRAY, ColorType.PASTEL_RED, ColorType.PASTEL_ORANGE, ColorType.PASTEL_YELLOW, ColorType.PASTEL_GREEN, ColorType.PASTEL_BLUE, ColorType.PASTEL_PURPLE, ColorType.PASTEL_SLATE_GRAY, ColorType.LIGHT_RED, ColorType.LIGHT_ORANGE, ColorType.LIGHT_YELLOW, ColorType.LIGHT_GREEN, ColorType.LIGHT_BLUE, ColorType.LIGHT_PURPLE, ColorType.LIGHT_SLATE_GRAY, ColorType.DARK_RED, ColorType.DARK_ORANGE, ColorType.DARK_YELLOW, ColorType.DARK_GREEN, ColorType.DARK_BLUE, ColorType.DARK_PURPLE, ColorType.DARK_SLATE_GRAY});
        }

        @Nullable
        public final ColorType getTypeByDisplayColor(@NotNull Context context0, int v) {
            Intrinsics.checkNotNullParameter(context0, "context");
            ColorType[] arr_colorType = ColorType.values();
            for(int v1 = 0; v1 < arr_colorType.length; ++v1) {
                ColorType colorType0 = arr_colorType[v1];
                if(context0.getColor(colorType0.getColorRes()) == v) {
                    return colorType0;
                }
            }
            return null;
        }

        @Nullable
        public final ColorType getTypeByString(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "color");
            ColorType[] arr_colorType = ColorType.values();
            for(int v = 0; v < arr_colorType.length; ++v) {
                ColorType colorType0 = arr_colorType[v];
                if(p.equals(colorType0.getColorCode(), s, true)) {
                    return colorType0;
                }
            }
            return null;
        }
    }

    CLEAR("#00000000", string.cd_color_clear, color.ke_zeplin_transparent, color.ke_picker_color_11_border, drawable.ke_ic_selected_check_b_invertable),
    BLACK("#000000", string.cd_color_black, color.ke_zeplin_palette_12, color.ke_picker_color_12_border, drawable.ke_ic_selected_check_w_invertable),
    LIGHT_BLACK("#333333", string.cd_color_dark_gray, color.ke_zeplin_palette_13, color.ke_picker_default_border, drawable.ke_ic_selected_check_w_invertable),
    DARK_GRAY("#666666", string.cd_color_gray, color.ke_zeplin_palette_14, color.ke_picker_default_border, drawable.ke_ic_selected_check_w_invertable),
    GRAY("#9D9D9D", string.cd_color_light_gray, color.ke_zeplin_palette_15, color.ke_picker_default_border, drawable.ke_ic_selected_check_b_invertable),
    LIGHT_GRAY("#DDDDDD", string.cd_color_pastel_gray, color.ke_zeplin_palette_16, color.ke_picker_default_border, drawable.ke_ic_selected_check_b_invertable),
    WHITE("#FFFFFF", string.cd_color_white, color.ke_zeplin_palette_17, color.ke_picker_color_17_border, drawable.ke_ic_selected_check_b_invertable),
    RED("#EE2323", string.cd_color_red, color.ke_zeplin_palette_21, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    ORANGE("#F89009", string.cd_color_orange, color.ke_zeplin_palette_22, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    YELLOW("#F3C000", string.cd_color_yellow, color.ke_zeplin_palette_23, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    GREEN("#0DB4A0", string.cd_color_green, color.ke_zeplin_palette_24, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    BLUE("#006DD7", string.cd_color_blue, color.ke_zeplin_palette_25, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    PURPLE("#8A3DB6", string.cd_color_purple, color.ke_zeplin_palette_26, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    SLATE_GRAY("#7E98B1", string.cd_color_slate_gray, color.ke_zeplin_palette_27, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    PASTEL_RED("#FFC1C8", string.cd_color_pastel_red, color.ke_zeplin_palette_31, color.ke_picker_default_border, drawable.ke_ic_selected_check_b),
    PASTEL_ORANGE("#FFC9AF", string.cd_color_pastel_orange, color.ke_zeplin_palette_31, color.ke_picker_default_border, drawable.ke_ic_selected_check_b),
    PASTEL_YELLOW("#F6E199", string.cd_color_pastel_yellow, color.ke_zeplin_palette_33, color.ke_picker_default_border, drawable.ke_ic_selected_check_b),
    PASTEL_GREEN("#9FEEC3", string.cd_color_pastel_green, color.ke_zeplin_palette_34, color.ke_picker_default_border, drawable.ke_ic_selected_check_b),
    PASTEL_BLUE("#99CEFA", string.cd_color_pastel_blue, color.ke_zeplin_palette_35, color.ke_picker_default_border, drawable.ke_ic_selected_check_b),
    PASTEL_PURPLE("#C1BEF9", string.cd_color_pastel_purple, color.ke_zeplin_palette_36, color.ke_picker_default_border, drawable.ke_ic_selected_check_b),
    PASTEL_SLATE_GRAY("#C0D1E7", string.cd_color_pastel_slate_gray, color.ke_zeplin_palette_37, color.ke_picker_default_border, drawable.ke_ic_selected_check_b),
    LIGHT_RED("#EF5369", string.cd_color_light_red, color.ke_zeplin_palette_41, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    LIGHT_ORANGE("#EF6F53", string.cd_color_light_orange, color.ke_zeplin_palette_42, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    LIGHT_YELLOW("#A6BC00", string.cd_color_light_yellow, color.ke_zeplin_palette_43, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    LIGHT_GREEN("#409D00", string.cd_color_light_green, color.ke_zeplin_palette_44, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    LIGHT_BLUE("#0593D3", string.cd_color_light_blue, color.ke_zeplin_palette_45, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    LIGHT_PURPLE("#6164C6", string.cd_color_light_purple, color.ke_zeplin_palette_46, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    LIGHT_SLATE_GRAY("#8CB3BE", string.cd_color_light_slate_gray, color.ke_zeplin_palette_47, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    DARK_RED("#781B33", string.cd_color_dark_red, color.ke_zeplin_palette_51, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    DARK_ORANGE("#953B34", string.cd_color_dark_orange, color.ke_zeplin_palette_52, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    DARK_YELLOW("#5F6D2B", string.cd_color_dark_yellow, color.ke_zeplin_palette_53, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    DARK_GREEN("#1B711D", string.cd_color_dark_green, color.ke_zeplin_palette_54, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    DARK_BLUE("#1A5490", string.cd_color_dark_blue, color.ke_zeplin_palette_55, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    DARK_PURPLE("#5733B1", string.cd_color_dark_purple, color.ke_zeplin_palette_56, color.ke_picker_default_border, drawable.ke_ic_selected_check_w),
    DARK_SLATE_GRAY("#456771", string.cd_color_light_slate_gray, color.ke_zeplin_palette_57, color.ke_picker_default_border, drawable.ke_ic_selected_check_w);

    private static final EnumEntries $ENTRIES;
    private static final ColorType[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int colorBorder;
    @NotNull
    private final String colorCode;
    private final int colorNameRes;
    private final int colorRes;
    private final int selectImage;

    private static final ColorType[] $values() [...] // Inlined contents

    static {
        ColorType.$VALUES = arr_colorType;
        Intrinsics.checkNotNullParameter(arr_colorType, "entries");
        ColorType.$ENTRIES = new a(arr_colorType);
        ColorType.Companion = new Companion(null);
    }

    private ColorType(String s1, int v1, int v2, int v3, int v4) {
        this.colorCode = s1;
        this.colorNameRes = v1;
        this.colorRes = v2;
        this.colorBorder = v3;
        this.selectImage = v4;
    }

    private final float getBorderWidth() [...] // 潜在的解密器

    private final Drawable getClearDrawable(Context context0) {
        Drawable drawable0 = ContextCompat.getDrawable(context0, drawable.ke_btn_color_clear);
        Intrinsics.checkNotNull(drawable0);
        return drawable0;
    }

    public final int getColorBorder() {
        return this.colorBorder;
    }

    @NotNull
    public final String getColorCode() {
        return this.colorCode;
    }

    public final int getColorNameRes() {
        return this.colorNameRes;
    }

    public final int getColorRes() {
        return this.colorRes;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @NotNull
    public String getDescription(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(this.colorNameRes);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }

    @NotNull
    public final Drawable getDrawable(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Resources resources0 = context0.getResources();
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        if(resources0 != null) {
            gradientDrawable0.setColor(resources0.getColor(this.colorRes));
            gradientDrawable0.setShape(1);
            gradientDrawable0.setStroke(((int)TypedValue.applyDimension(1, 0.5f, resources0.getDisplayMetrics())), resources0.getColor(this.colorBorder));
        }
        return gradientDrawable0;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ColorType.$ENTRIES;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @Nullable
    public String getHintText(@NotNull Context context0) {
        return DefaultImpls.getHintText(this, context0);
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    public int getImage() {
        return this.ordinal();
    }

    public final int getSelectImage() {
        return this.selectImage;
    }

    @Nullable
    public final Drawable getSelectorDrawable(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return ContextCompat.getDrawable(context0, this.selectImage);
    }

    private final boolean isClearType() [...] // 潜在的解密器
}

