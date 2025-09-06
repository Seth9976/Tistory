package com.kakao.keditor.plugin.attrs.text;

import android.content.Context;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.integer;
import com.kakao.keditor.R.string;
import com.kakao.keditor.standard.IntStandardKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\"B?\b\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0018H\u0016J\u0010\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0018H\u0016J\b\u0010\u001A\u001A\u00020\u0004H\u0016J\u0006\u0010\u001B\u001A\u00020\u0004R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u000B\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000Ej\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001Ej\u0002\b\u001Fj\u0002\b j\u0002\b!¨\u0006#"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/CharacterSize;", "", "Lcom/kakao/keditor/plugin/attrs/text/SelectableItem;", "fontSize", "", "descFontSizeResId", "toolbarResId", "selectorResId", "lineHeight", "", "paddingTopBottom", "letterSpacing", "(Ljava/lang/String;IIIIIFFF)V", "getFontSize", "()I", "getLetterSpacing", "()F", "getLineHeight", "getPaddingTopBottom", "getSelectorResId", "getToolbarResId", "getDescription", "", "context", "Landroid/content/Context;", "getHintText", "getImage", "sp", "size26", "size23", "size20", "size18", "size16", "size14", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum CharacterSize implements SelectableItem {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000E\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\bJ\u000E\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/CharacterSize$Companion;", "", "()V", "getAllList", "", "Lcom/kakao/keditor/plugin/attrs/text/CharacterSize;", "getByName", "name", "", "getTypeBySizeDP", "size", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List getAllList() {
            return CollectionsKt__CollectionsKt.mutableListOf(new CharacterSize[]{CharacterSize.size26, CharacterSize.size23, CharacterSize.size20, CharacterSize.size18, CharacterSize.size16, CharacterSize.size14});
        }

        @NotNull
        public final CharacterSize getByName(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            CharacterSize[] arr_characterSize = CharacterSize.values();
            for(int v = 0; v < arr_characterSize.length; ++v) {
                CharacterSize characterSize0 = arr_characterSize[v];
                String s1 = characterSize0.name().toUpperCase();
                Intrinsics.checkNotNullExpressionValue(s1, "toUpperCase(...)");
                String s2 = s.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(s2, "toUpperCase(...)");
                if(Intrinsics.areEqual(s1, s2)) {
                    return characterSize0;
                }
            }
            return CharacterSize.size16;
        }

        @NotNull
        public final CharacterSize getTypeBySizeDP(int v) {
            CharacterSize[] arr_characterSize = CharacterSize.values();
            for(int v1 = 0; v1 < arr_characterSize.length; ++v1) {
                CharacterSize characterSize0 = arr_characterSize[v1];
                if(IntStandardKt.dpToSp(characterSize0.getFontSize()) == v) {
                    return characterSize0;
                }
            }
            return CharacterSize.size16;
        }
    }

    size26(26, integer.displayed_fontsize_1, drawable.ke_btn_toolbar_character_size_1, drawable.ke_ic_overlay_character_size_1, 2.0f, 8.0f, -0.03f),
    size23(23, integer.displayed_fontsize_2, drawable.ke_btn_toolbar_character_size_2, drawable.ke_ic_overlay_character_size_2, 2.0f, 7.0f, -0.01f),
    size20(20, integer.displayed_fontsize_3, drawable.ke_btn_toolbar_character_size_3, drawable.ke_ic_overlay_character_size_3, 2.0f, 6.0f, -0.01f),
    size18(18, integer.displayed_fontsize_4, drawable.ke_btn_toolbar_character_size_4, drawable.ke_ic_overlay_character_size_4, 8.0f, 5.0f, -0.015f),
    size16(16, integer.displayed_fontsize_5, drawable.ke_btn_toolbar_character_size_5, drawable.ke_ic_overlay_character_size_5, 8.0f, 5.0f, -0.015f),
    size14(14, integer.displayed_fontsize_6, drawable.ke_btn_toolbar_character_size_6, drawable.ke_ic_overlay_character_size_6, 8.0f, 4.0f, -0.015f);

    private static final EnumEntries $ENTRIES;
    private static final CharacterSize[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int descFontSizeResId;
    private final int fontSize;
    private final float letterSpacing;
    private final float lineHeight;
    private final float paddingTopBottom;
    private final int selectorResId;
    private final int toolbarResId;

    private static final CharacterSize[] $values() [...] // Inlined contents

    static {
        CharacterSize.$VALUES = arr_characterSize;
        Intrinsics.checkNotNullParameter(arr_characterSize, "entries");
        CharacterSize.$ENTRIES = new a(arr_characterSize);
        CharacterSize.Companion = new Companion(null);
    }

    private CharacterSize(int v1, int v2, int v3, int v4, float f, float f1, float f2) {
        this.fontSize = v1;
        this.descFontSizeResId = v2;
        this.toolbarResId = v3;
        this.selectorResId = v4;
        this.lineHeight = f;
        this.paddingTopBottom = f1;
        this.letterSpacing = f2;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @NotNull
    public String getDescription(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(string.cd_text_style_character_size, new Object[]{context0.getString(this.descFontSizeResId)});
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CharacterSize.$ENTRIES;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @NotNull
    public String getHintText(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(string.cd_text_style_character_size_hint);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    public int getImage() {
        return this.selectorResId;
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final float getPaddingTopBottom() {
        return this.paddingTopBottom;
    }

    public final int getSelectorResId() {
        return this.selectorResId;
    }

    public final int getToolbarResId() {
        return this.toolbarResId;
    }

    public final int sp() {
        return IntStandardKt.dpToSp(this.fontSize);
    }
}

