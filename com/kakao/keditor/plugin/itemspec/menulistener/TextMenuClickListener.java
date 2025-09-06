package com.kakao.keditor.plugin.itemspec.menulistener;

import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016J\b\u0010\u0006\u001A\u00020\u0003H\u0016J\b\u0010\u0007\u001A\u00020\u0003H\u0016J\u0010\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\nH\u0016J\b\u0010\u000B\u001A\u00020\u0003H\u0016J\u001A\u0010\f\u001A\u00020\u00032\b\u0010\r\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0016J\u0010\u0010\u0011\u001A\u00020\u00032\u0006\u0010\u0012\u001A\u00020\u0013H\u0016J\b\u0010\u0014\u001A\u00020\u0003H\u0016J\b\u0010\u0015\u001A\u00020\u0003H\u0016J\b\u0010\u0016\u001A\u00020\u0003H\u0016J\u0010\u0010\u0017\u001A\u00020\u00032\u0006\u0010\u0018\u001A\u00020\nH\u0016J\u0010\u0010\u0019\u001A\u00020\u00032\u0006\u0010\u001A\u001A\u00020\u001BH\u0016J\b\u0010\u001C\u001A\u00020\u0003H\u0016J\b\u0010\u001D\u001A\u00020\u0003H\u0016J\u0010\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u001F\u001A\u00020\nH\u0016J\u0010\u0010 \u001A\u00020\u00032\u0006\u0010!\u001A\u00020\"H\u0016J\b\u0010#\u001A\u00020\u0003H\u0016¨\u0006$"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/menulistener/TextMenuClickListener;", "", "onAlignmentClicked", "", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "onBackMenuClicked", "onBlockQuoteClicked", "onBlockQuoteTypeClicked", "blockQuoteType", "", "onBoldClicked", "onColorPickerClicked", "color", "Lcom/kakao/keditor/plugin/attrs/text/ColorType;", "target", "", "onFontStyleClicked", "fontStyle", "Lcom/kakao/keditor/plugin/attrs/text/FontStyle;", "onItalicClicked", "onLinkTextClicked", "onListClicked", "onListTypeClicked", "listType", "onParagraphSizeClicked", "inputStyle", "Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;", "onRemoveMenuClicked", "onStrikeClicked", "onTableStylePickerClicked", "styleName", "onTextSizeClicked", "charactorSize", "Lcom/kakao/keditor/plugin/attrs/text/CharacterSize;", "onUnderlineClicked", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface TextMenuClickListener {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void onAlignmentClicked(@NotNull TextMenuClickListener textMenuClickListener0, @NotNull Alignment alignment0) {
            Intrinsics.checkNotNullParameter(alignment0, "alignment");
        }

        public static void onBackMenuClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }

        public static void onBlockQuoteClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }

        public static void onBlockQuoteTypeClicked(@NotNull TextMenuClickListener textMenuClickListener0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blockQuoteType");
        }

        public static void onBoldClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }

        public static void onColorPickerClicked(@NotNull TextMenuClickListener textMenuClickListener0, @Nullable ColorType colorType0, int v) {
        }

        public static void onFontStyleClicked(@NotNull TextMenuClickListener textMenuClickListener0, @NotNull FontStyle fontStyle0) {
            Intrinsics.checkNotNullParameter(fontStyle0, "fontStyle");
        }

        public static void onItalicClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }

        public static void onLinkTextClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }

        public static void onListClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }

        public static void onListTypeClicked(@NotNull TextMenuClickListener textMenuClickListener0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "listType");
        }

        public static void onParagraphSizeClicked(@NotNull TextMenuClickListener textMenuClickListener0, @NotNull ParagraphStyle paragraphStyle0) {
            Intrinsics.checkNotNullParameter(paragraphStyle0, "inputStyle");
        }

        public static void onRemoveMenuClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }

        public static void onStrikeClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }

        public static void onTableStylePickerClicked(@NotNull TextMenuClickListener textMenuClickListener0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "styleName");
        }

        public static void onTextSizeClicked(@NotNull TextMenuClickListener textMenuClickListener0, @NotNull CharacterSize characterSize0) {
            Intrinsics.checkNotNullParameter(characterSize0, "charactorSize");
        }

        public static void onUnderlineClicked(@NotNull TextMenuClickListener textMenuClickListener0) {
        }
    }

    void onAlignmentClicked(@NotNull Alignment arg1);

    void onBackMenuClicked();

    void onBlockQuoteClicked();

    void onBlockQuoteTypeClicked(@NotNull String arg1);

    void onBoldClicked();

    void onColorPickerClicked(@Nullable ColorType arg1, int arg2);

    void onFontStyleClicked(@NotNull FontStyle arg1);

    void onItalicClicked();

    void onLinkTextClicked();

    void onListClicked();

    void onListTypeClicked(@NotNull String arg1);

    void onParagraphSizeClicked(@NotNull ParagraphStyle arg1);

    void onRemoveMenuClicked();

    void onStrikeClicked();

    void onTableStylePickerClicked(@NotNull String arg1);

    void onTextSizeClicked(@NotNull CharacterSize arg1);

    void onUnderlineClicked();
}

