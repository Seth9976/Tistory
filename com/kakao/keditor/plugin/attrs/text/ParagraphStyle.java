package com.kakao.keditor.plugin.attrs.text;

import android.content.Context;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.itemspec.EnumList;
import com.kakao.keditor.standard.IntStandardKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0086\u0081\u0002\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002)*BG\b\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\f\u0012\u0006\u0010\r\u001A\u00020\t¢\u0006\u0002\u0010\u000EJ\u0010\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u001CH\u0016J\u0010\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u001CH\u0016J\b\u0010\u001E\u001A\u00020\u0004H\u0016J\u0006\u0010\u001F\u001A\u00020 J\u0006\u0010!\u001A\u00020 J\u0006\u0010\"\u001A\u00020\u0004R\u0011\u0010\u000B\u001A\u00020\f¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0007\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0006\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0012j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(¨\u0006+"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;", "", "Lcom/kakao/keditor/plugin/attrs/text/SelectableItem;", "fontSize", "", "descRes", "toolbarResId", "selectorResId", "lineHeight", "", "paddingTopBottom", "attrType", "Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle$Type;", "letterSpacing", "(Ljava/lang/String;IIIIIFFLcom/kakao/keditor/plugin/attrs/text/ParagraphStyle$Type;F)V", "getAttrType", "()Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle$Type;", "getFontSize", "()I", "getLetterSpacing", "()F", "getLineHeight", "getPaddingTopBottom", "getSelectorResId", "getToolbarResId", "getDescription", "", "context", "Landroid/content/Context;", "getHintText", "getImage", "isHead", "", "isParagraph", "sp", "ParagraphStyle1", "ParagraphStyle2", "ParagraphStyle3", "ParagraphStyle4", "ParagraphStyle5", "ParagraphStyle6", "Companion", "Type", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ParagraphStyle implements SelectableItem {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000E\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\bJ\u000E\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u000BJ\u000E\u0010\f\u001A\b\u0012\u0004\u0012\u00020\b0\rH\u0016¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle$Companion;", "Lcom/kakao/keditor/plugin/itemspec/EnumList;", "()V", "getAllList", "", "Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;", "getByName", "name", "", "getTypeBySizeDP", "size", "", "typeSet", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\ncom/kakao/keditor/plugin/attrs/text/ParagraphStyle$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1549#2:81\n1620#2,3:82\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\ncom/kakao/keditor/plugin/attrs/text/ParagraphStyle$Companion\n*L\n73#1:81\n73#1:82,3\n*E\n"})
    public static final class Companion implements EnumList {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List getAllList() {
            return CollectionsKt__CollectionsKt.mutableListOf(new ParagraphStyle[]{ParagraphStyle.ParagraphStyle1, ParagraphStyle.ParagraphStyle2, ParagraphStyle.ParagraphStyle3, ParagraphStyle.ParagraphStyle4, ParagraphStyle.ParagraphStyle5, ParagraphStyle.ParagraphStyle6});
        }

        @NotNull
        public final ParagraphStyle getByName(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            ParagraphStyle[] arr_paragraphStyle = ParagraphStyle.values();
            for(int v = 0; v < arr_paragraphStyle.length; ++v) {
                ParagraphStyle paragraphStyle0 = arr_paragraphStyle[v];
                String s1 = paragraphStyle0.name().toUpperCase();
                Intrinsics.checkNotNullExpressionValue(s1, "toUpperCase(...)");
                String s2 = s.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(s2, "toUpperCase(...)");
                if(Intrinsics.areEqual(s1, s2)) {
                    return paragraphStyle0;
                }
            }
            return ParagraphStyle.ParagraphStyle5;
        }

        @NotNull
        public final ParagraphStyle getTypeBySizeDP(int v) {
            ParagraphStyle[] arr_paragraphStyle = ParagraphStyle.values();
            for(int v1 = 0; v1 < arr_paragraphStyle.length; ++v1) {
                ParagraphStyle paragraphStyle0 = arr_paragraphStyle[v1];
                if(paragraphStyle0.getFontSize() == v) {
                    return paragraphStyle0;
                }
            }
            return ParagraphStyle.ParagraphStyle5;
        }

        @Override  // com.kakao.keditor.plugin.itemspec.EnumList
        @NotNull
        public Set typeSet() {
            Iterable iterable0 = this.getAllList();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add("size" + ((ParagraphStyle)object0).getFontSize());
            }
            return CollectionsKt___CollectionsKt.toSet(arrayList0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle$Type;", "", "(Ljava/lang/String;I)V", "PARAGRAPH", "HEAD", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Type {
        PARAGRAPH,
        HEAD;

        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;

        private static final Type[] $values() [...] // Inlined contents

        static {
            Type.$VALUES = arr_paragraphStyle$Type;
            Intrinsics.checkNotNullParameter(arr_paragraphStyle$Type, "entries");
            Type.$ENTRIES = new a(arr_paragraphStyle$Type);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Type.$ENTRIES;
        }
    }

    ParagraphStyle1(26, string.cd_paragraph_style_title_1, drawable.ke_btn_toolbar_paragraph_size_1, drawable.ke_ic_overlay_paragraph_size_1, 2.0f, 8.0f, Type.HEAD, -0.03f),
    ParagraphStyle2(23, string.cd_paragraph_style_title_2, drawable.ke_btn_toolbar_paragraph_size_2, drawable.ke_ic_overlay_paragraph_size_2, 2.0f, 7.0f, Type.HEAD, -0.01f),
    ParagraphStyle3(20, string.cd_paragraph_style_title_3, drawable.ke_btn_toolbar_paragraph_size_3, drawable.ke_ic_overlay_paragraph_size_3, 2.0f, 6.0f, Type.HEAD, -0.01f),
    ParagraphStyle4(18, string.cd_paragraph_style_content_1, drawable.ke_btn_toolbar_paragraph_size_4, drawable.ke_ic_overlay_paragraph_size_4, 8.0f, 5.0f, Type.PARAGRAPH, -0.015f),
    ParagraphStyle5(16, string.cd_paragraph_style_content_2, drawable.ke_btn_toolbar_paragraph_size_5, drawable.ke_ic_overlay_paragraph_size_5, 8.0f, 5.0f, Type.PARAGRAPH, -0.015f),
    ParagraphStyle6(14, string.cd_paragraph_style_content_3, drawable.ke_btn_toolbar_paragraph_size_6, drawable.ke_ic_overlay_paragraph_size_6, 8.0f, 4.0f, Type.PARAGRAPH, -0.015f);

    private static final EnumEntries $ENTRIES;
    private static final ParagraphStyle[] $VALUES;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Type attrType;
    private final int descRes;
    private final int fontSize;
    private final float letterSpacing;
    private final float lineHeight;
    private final float paddingTopBottom;
    private final int selectorResId;
    private final int toolbarResId;

    private static final ParagraphStyle[] $values() [...] // Inlined contents

    static {
        ParagraphStyle.$VALUES = arr_paragraphStyle;
        Intrinsics.checkNotNullParameter(arr_paragraphStyle, "entries");
        ParagraphStyle.$ENTRIES = new a(arr_paragraphStyle);
        ParagraphStyle.Companion = new Companion(null);
    }

    private ParagraphStyle(int v1, int v2, int v3, int v4, float f, float f1, Type paragraphStyle$Type0, float f2) {
        this.fontSize = v1;
        this.descRes = v2;
        this.toolbarResId = v3;
        this.selectorResId = v4;
        this.lineHeight = f;
        this.paddingTopBottom = f1;
        this.attrType = paragraphStyle$Type0;
        this.letterSpacing = f2;
    }

    @NotNull
    public final Type getAttrType() {
        return this.attrType;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @NotNull
    public String getDescription(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(this.descRes);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ParagraphStyle.$ENTRIES;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    @Override  // com.kakao.keditor.plugin.attrs.text.SelectableItem
    @NotNull
    public String getHintText(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(string.cd_text_style_paragraph_size_hint);
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

    public final boolean isHead() {
        return this.attrType == Type.HEAD;
    }

    public final boolean isParagraph() {
        return this.attrType == Type.PARAGRAPH;
    }

    public final int sp() {
        return IntStandardKt.dpToSp(this.fontSize);
    }
}

