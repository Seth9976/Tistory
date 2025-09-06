package com.kakao.keditor.plugin.itemspec.unsupport;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u001C\b\u0086\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B#\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001Aj\u0002\b\u001Bj\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001Ej\u0002\b\u001F¨\u0006!"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/unsupport/UnSupportedType;", "", "type", "", "strResId", "", "imgResId", "(Ljava/lang/String;ILjava/lang/String;II)V", "getImgResId", "()I", "getStrResId", "getType", "()Ljava/lang/String;", "HorizontalRule", "BlockQuote", "OpenGraph", "List", "Image", "Video", "Emoticon", "File", "Poll", "Table", "ImageGrid", "CodeBlock", "Html", "ContentSearch", "Source", "ImageSlide", "MoreLess", "Map", "Unknown", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum UnSupportedType {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/unsupport/UnSupportedType$Companion;", "", "()V", "byType", "Lcom/kakao/keditor/plugin/itemspec/unsupport/UnSupportedType;", "type", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nUnSupportedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnSupportedType.kt\ncom/kakao/keditor/plugin/itemspec/unsupport/UnSupportedType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final UnSupportedType byType(@Nullable String s) {
            UnSupportedType[] arr_unSupportedType = UnSupportedType.values();
            for(int v = 0; v < arr_unSupportedType.length; ++v) {
                UnSupportedType unSupportedType0 = arr_unSupportedType[v];
                if(Intrinsics.areEqual(unSupportedType0.getType(), s)) {
                    return unSupportedType0 == null ? UnSupportedType.Unknown : unSupportedType0;
                }
            }
            return UnSupportedType.Unknown;
        }
    }

    HorizontalRule("horizontalRule", string.gray_box_horizontal_rule, drawable.ke_ic_ke_item_horizontal_line),
    BlockQuote("blockquote", string.gray_box_blockquote, drawable.ke_ic_ke_item_block_quote),
    OpenGraph("opengraph", string.gray_box_opengraph, drawable.ke_ic_ke_item_opengraph),
    List("list", string.gray_box_list, drawable.ke_ic_ke_item_list),
    Image("image", string.gray_box_image, drawable.ke_ic_ke_item_image),
    Video("video", string.gray_box_video, drawable.ke_ic_ke_item_video),
    Emoticon("emoticon", string.gray_box_emoticon, drawable.ke_ic_ke_item_emoticon),
    File("file", string.gray_box_file, drawable.ke_ic_ke_item_file),
    Poll("poll", string.gray_box_poll, drawable.ke_ic_ke_item_poll),
    Table("table", string.gray_box_table, drawable.ke_ic_ke_item_table),
    ImageGrid("imageGrid", string.gray_box_group_image, drawable.ke_ic_ke_item_image_grid),
    CodeBlock("codeblock", string.gray_box_code, drawable.ke_ic_ke_item_code_block),
    Html("html", string.gray_box_html, drawable.ke_ic_ke_item_html),
    ContentSearch("contentSearch", string.gray_box_content_search, drawable.ke_ic_ke_item_content_search),
    Source("source", string.gray_box_html, drawable.ke_ic_ke_item_html),
    ImageSlide("imageSlide", string.gray_box_slideshow, drawable.ke_ic_ke_item_image_slide),
    MoreLess("moreLess", string.gray_box_fold, drawable.ke_ic_ke_item_fold),
    Map("map", string.gray_box_map, drawable.ke_ic_unsupported_map),
    Unknown("", string.gray_box_etc, drawable.ke_ic_ke_item_unknown_question_mark);

    private static final EnumEntries $ENTRIES;
    private static final UnSupportedType[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int imgResId;
    private final int strResId;
    @NotNull
    private final String type;

    private static final UnSupportedType[] $values() [...] // Inlined contents

    static {
        UnSupportedType.$VALUES = arr_unSupportedType;
        Intrinsics.checkNotNullParameter(arr_unSupportedType, "entries");
        UnSupportedType.$ENTRIES = new a(arr_unSupportedType);
        UnSupportedType.Companion = new Companion(null);
    }

    private UnSupportedType(String s1, @StringRes int v1, @DrawableRes int v2) {
        this.type = s1;
        this.strResId = v1;
        this.imgResId = v2;
    }

    @JvmStatic
    @NotNull
    public static final UnSupportedType byType(@Nullable String s) {
        return UnSupportedType.Companion.byType(s);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return UnSupportedType.$ENTRIES;
    }

    public final int getImgResId() {
        return this.imgResId;
    }

    public final int getStrResId() {
        return this.strResId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}

