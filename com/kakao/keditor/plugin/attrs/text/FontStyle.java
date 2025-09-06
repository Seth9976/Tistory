package com.kakao.keditor.plugin.attrs.text;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.font;
import com.kakao.keditor.R.string;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u001D2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001DB/\b\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0013H\u0016J\u0010\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0013H\u0016J\b\u0010\u0015\u001A\u00020\u0006H\u0016J\u000E\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u0013R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\t\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000Ej\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001Aj\u0002\b\u001Bj\u0002\b\u001C¨\u0006\u001E"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/FontStyle;", "", "Lcom/kakao/keditor/plugin/attrs/text/SelectableItem;", "familyName", "", "descFamilyNameRes", "", "fontResId", "toolbarResId", "selectorResId", "(Ljava/lang/String;ILjava/lang/String;IIII)V", "getFamilyName", "()Ljava/lang/String;", "getFontResId", "()I", "getSelectorResId", "getToolbarResId", "getDescription", "context", "Landroid/content/Context;", "getHintText", "getImage", "getTypeface", "Landroid/graphics/Typeface;", "SYSTEM", "BON_GOTHIC_R", "BON_GOTHIC_L", "BARUN_GOTHIC", "BON_MYUNGJO", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum FontStyle implements SelectableItem {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000E\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\b¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/FontStyle$Companion;", "", "()V", "getAllList", "", "Lcom/kakao/keditor/plugin/attrs/text/FontStyle;", "getResIdByName", "name", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List getAllList() {
            return CollectionsKt__CollectionsKt.mutableListOf(new FontStyle[]{FontStyle.SYSTEM, FontStyle.BON_GOTHIC_R, FontStyle.BON_GOTHIC_L, FontStyle.BARUN_GOTHIC, FontStyle.BON_MYUNGJO});
        }

        @NotNull
        public final FontStyle getResIdByName(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            FontStyle[] arr_fontStyle = FontStyle.values();
            for(int v = 0; v < arr_fontStyle.length; ++v) {
                FontStyle fontStyle0 = arr_fontStyle[v];
                if(Intrinsics.areEqual(fontStyle0.getFamilyName(), s)) {
                    return fontStyle0;
                }
            }
            return FontStyle.SYSTEM;
        }
    }

    SYSTEM("default", string.cd_font_system, 0, drawable.ke_btn_toolbar_font_style_1, drawable.ke_ic_font_style_1),
    BON_GOTHIC_R("notoSans", string.cd_font_bon_gothic_r, font.bon_gothic_r, drawable.ke_btn_toolbar_font_style_2, drawable.ke_ic_font_style_2),
    BON_GOTHIC_L("notoSansLight", string.cd_font_bon_gothic_l, font.bon_gothic_l, drawable.ke_btn_toolbar_font_style_3, drawable.ke_ic_font_style_3),
    BARUN_GOTHIC("nanumGothic", string.cd_font_nanum_gothic, font.nanum_gothic, drawable.ke_btn_toolbar_font_style_4, drawable.ke_ic_font_style_4),
    BON_MYUNGJO("notoSerif", string.cd_font_bon_myungjo, font.bon_myungjo, drawable.ke_btn_toolbar_font_style_5, drawable.ke_ic_font_style_5);

    private static final EnumEntries $ENTRIES;
    private static final FontStyle[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int descFamilyNameRes;
    @NotNull
    private final String familyName;
    private final int fontResId;
    private final int selectorResId;
    private final int toolbarResId;

    private static final FontStyle[] $values() [...] // Inlined contents

    static {
        FontStyle.$VALUES = arr_fontStyle;
        Intrinsics.checkNotNullParameter(arr_fontStyle, "entries");
        FontStyle.$ENTRIES = new a(arr_fontStyle);
        FontStyle.Companion = new Companion(null);
    }

    private FontStyle(String s1, int v1, int v2, int v3, int v4) {
        this.familyName = s1;
        this.descFamilyNameRes = v1;
        this.fontResId = v2;
        this.toolbarResId = v3;
        this.selectorResId = v4;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @NotNull
    public String getDescription(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(this.descFamilyNameRes);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return FontStyle.$ENTRIES;
    }

    @NotNull
    public final String getFamilyName() {
        return this.familyName;
    }

    public final int getFontResId() {
        return this.fontResId;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @NotNull
    public String getHintText(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(string.cd_text_style_select_font_hint);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    public int getImage() {
        return this.selectorResId;
    }

    public final int getSelectorResId() {
        return this.selectorResId;
    }

    public final int getToolbarResId() {
        return this.toolbarResId;
    }

    @NotNull
    public final Typeface getTypeface(@NotNull Context context0) {
        Typeface typeface0;
        Intrinsics.checkNotNullParameter(context0, "context");
        if(context0.isRestricted()) {
            typeface0 = Typeface.DEFAULT;
            Intrinsics.checkNotNull(typeface0);
            return typeface0;
        }
        if(FontStyle.SYSTEM == this) {
            typeface0 = Keditor.INSTANCE.getCustomFont();
            Intrinsics.checkNotNull(typeface0);
            return typeface0;
        }
        typeface0 = ResourcesCompat.getFont(context0, this.fontResId);
        Intrinsics.checkNotNull(typeface0);
        Intrinsics.checkNotNull(typeface0);
        return typeface0;
    }
}

