package com.kakao.keditor.plugin.itemspec.paragraph.span;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import androidx.core.content.ContextCompat;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.color;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.cdm.ImageAttribute;
import com.kakao.keditor.cdm.TextAttribute;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.attrs.text.spans.KeBackgroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeBoldSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeFontSizeSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeForegroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeImageSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeItalicSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeStrikethroughSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeTypefaceSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeURLSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeUnderlineSpan;
import com.kakao.keditor.plugin.attrs.text.spans.Selection;
import com.kakao.keditor.plugin.attrs.text.spans.SpanUtil;
import com.kakao.keditor.standard.KeditorStandardKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00C6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0002J\"\u0010\t\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\bH\u0002J\u001E\u0010\r\u001A\u00020\u000E2\u0014\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000FH\u0002J\b\u0010\u0010\u001A\u00020\u0011H\u0002J\u001E\u0010\u0012\u001A\u00020\u000B2\u0014\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000FH\u0002J\u0010\u0010\u0013\u001A\u00020\u00142\u0006\u0010\f\u001A\u00020\bH\u0002J \u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001AH\u0002J\u0016\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u0018J\u0010\u0010\u001C\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001AH\u0002J\u0018\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\bH\u0002J\u0010\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020\u0016H\u0002J\u0010\u0010\"\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\bH\u0002J\u0012\u0010$\u001A\u0004\u0018\u00010\u00042\u0006\u0010%\u001A\u00020\bH\u0002J)\u0010&\u001A\u00020\u00042\u0006\u0010\'\u001A\u00020\b2\b\u0010(\u001A\u0004\u0018\u00010\u00142\b\u0010)\u001A\u0004\u0018\u00010\bH\u0002\u00A2\u0006\u0002\u0010*J$\u0010+\u001A\u00020,*\u00020\u001A2\u0006\u0010-\u001A\u00020\u00042\u0006\u0010.\u001A\u00020\u00162\u0006\u0010/\u001A\u00020\u0016H\u0002\u00A8\u00060"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/span/SpannableParser;", "", "()V", "backgroundColorSpan", "Landroid/text/style/CharacterStyle;", "context", "Landroid/content/Context;", "backgroundColor", "", "getCharacterStyle", "attribute", "Lcom/kakao/keditor/cdm/TextAttribute;", "type", "getImageAttribute", "Lcom/kakao/keditor/cdm/ImageAttribute;", "", "getLoadFailureDrawable", "Landroid/graphics/drawable/ColorDrawable;", "getTextAttribute", "isNotParagraph", "", "parseChildItem", "", "item", "Lcom/kakao/keditor/cdm/CDM$Item;", "spannableStringBuilder", "Landroid/text/SpannableStringBuilder;", "parseTextModel", "revertSpans", "originalSsb", "textColorSpan", "textColor", "textSizeSpan", "size", "textStyleSpan", "textStyle", "typefaceSpan", "fontFamily", "urlSpan", "url", "isLinkNewWindow", "linkTitle", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Landroid/text/style/CharacterStyle;", "setStyleSpan", "", "requestSpan", "startIndex", "endIndex", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpannableParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableParser.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/span/SpannableParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,324:1\n766#2:325\n857#2,2:326\n766#2:328\n857#2,2:329\n1855#2,2:331\n*S KotlinDebug\n*F\n+ 1 SpannableParser.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/span/SpannableParser\n*L\n289#1:325\n289#1:326,2\n293#1:328\n293#1:329,2\n295#1:331,2\n*E\n"})
public final class SpannableParser {
    @NotNull
    public static final SpannableParser INSTANCE;

    static {
        SpannableParser.INSTANCE = new SpannableParser();
    }

    private final CharacterStyle backgroundColorSpan(Context context0, String s) {
        return new KeBackgroundColorSpan(context0, KeditorStandardKt.toColorInt$default(s, null, 1, null));
    }

    private final CharacterStyle getCharacterStyle(Context context0, TextAttribute textAttribute0, String s) {
        if(textAttribute0.getTextStyle() != null) {
            return this.textStyleSpan(textAttribute0.getTextStyle());
        }
        if(textAttribute0.getTextColor() != null) {
            return this.textColorSpan(context0, textAttribute0.getTextColor());
        }
        if(textAttribute0.getBackgroundColor() != null) {
            return this.backgroundColorSpan(context0, textAttribute0.getBackgroundColor());
        }
        if(textAttribute0.getLink() != null) {
            return this.urlSpan(textAttribute0.getLink(), textAttribute0.isLinkNewWindow(), textAttribute0.getLinkTitle());
        }
        if(this.isNotParagraph(s) && textAttribute0.getSize() != null) {
            return this.textSizeSpan(CharacterSize.Companion.getByName(textAttribute0.getSize()).sp());
        }
        return textAttribute0.getFontFamily() == null ? null : this.typefaceSpan(textAttribute0.getFontFamily());
    }

    private final ImageAttribute getImageAttribute(Map map0) {
        Boolean boolean0;
        int v1;
        Integer integer1;
        Integer integer0;
        String s = null;
        String s1 = (map0 == null ? null : map0.get("src")) == null ? null : String.valueOf(map0.get("src"));
        if((map0 == null ? null : map0.get("width")) == null) {
            integer0 = null;
        }
        else {
            Object object0 = map0.get("width");
            Double double0 = object0 instanceof Double ? ((Double)object0) : null;
            integer0 = double0 == null ? null : ((int)(((double)double0)));
        }
        if((map0 == null ? null : map0.get("height")) == null) {
            integer1 = null;
        }
        else {
            Object object1 = map0.get("height");
            Double double1 = object1 instanceof Double ? ((Double)object1) : null;
            integer1 = double1 == null ? null : ((int)(((double)double1)));
        }
        int v = 0;
        if((map0 == null ? null : map0.get("originWidth")) == null) {
            v1 = 0;
        }
        else {
            Object object2 = map0.get("originWidth");
            Double double2 = object2 instanceof Double ? ((Double)object2) : null;
            v1 = double2 == null ? 0 : ((int)(((double)double2)));
        }
        if((map0 == null ? null : map0.get("originHeight")) != null) {
            Object object3 = map0.get("originHeight");
            Double double3 = object3 instanceof Double ? ((Double)object3) : null;
            if(double3 != null) {
                v = (int)(((double)double3));
            }
        }
        String s2 = (map0 == null ? null : map0.get("style")) == null ? null : String.valueOf(map0.get("style"));
        String s3 = (map0 == null ? null : map0.get("mobileStyle")) == null ? null : String.valueOf(map0.get("mobileStyle"));
        String s4 = (map0 == null ? null : map0.get("link")) == null ? null : String.valueOf(map0.get("link"));
        if((map0 == null ? null : map0.get("isLinkNewWindow")) == null) {
            boolean0 = null;
        }
        else {
            Object object4 = map0.get("isLinkNewWindow");
            boolean0 = object4 instanceof Boolean ? ((Boolean)object4) : null;
        }
        String s5 = (map0 == null ? null : map0.get("title")) == null ? null : String.valueOf(map0.get("title"));
        String s6 = (map0 == null ? null : map0.get("alt")) == null ? null : String.valueOf(map0.get("alt"));
        String s7 = (map0 == null ? null : map0.get("caption")) == null ? null : String.valueOf(map0.get("caption"));
        if((map0 == null ? null : map0.get("mimeType")) != null) {
            s = String.valueOf(map0.get("mimeType"));
        }
        return new ImageAttribute(s1, integer0, integer1, v1, v, s2, s3, s4, boolean0, s5, s6, s7, s);
    }

    private final ColorDrawable getLoadFailureDrawable() {
        return new ColorDrawable(ContextCompat.getColor(Keditor.INSTANCE.getContext(), color.ke_gray_box_bg));
    }

    private final TextAttribute getTextAttribute(Map map0) {
        String s = null;
        String s1 = (map0 == null ? null : map0.get("text")) == null ? null : String.valueOf(map0.get("text"));
        String s2 = (map0 == null ? null : map0.get("size")) == null ? null : String.valueOf(map0.get("size"));
        String s3 = (map0 == null ? null : map0.get("textColor")) == null ? null : String.valueOf(map0.get("textColor"));
        String s4 = (map0 == null ? null : map0.get("textStyle")) == null ? null : String.valueOf(map0.get("textStyle"));
        String s5 = (map0 == null ? null : map0.get("backgroundColor")) == null ? null : String.valueOf(map0.get("backgroundColor"));
        String s6 = (map0 == null ? null : map0.get("link")) == null ? null : String.valueOf(map0.get("link"));
        Boolean boolean0 = (map0 == null ? null : map0.get("isLinkNewWindow")) == null ? null : Boolean.valueOf(Intrinsics.areEqual(String.valueOf(map0.get("isLinkNewWindow")), "true"));
        String s7 = (map0 == null ? null : map0.get("title")) == null ? null : String.valueOf(map0.get("title"));
        if((map0 == null ? null : map0.get("fontFamily")) != null) {
            s = String.valueOf(map0.get("fontFamily"));
        }
        return new TextAttribute(s1, s2, s3, s4, s5, s6, boolean0, s7, s);
    }

    // 去混淆评级： 低(20)
    private final boolean isNotParagraph(String s) {
        return !Intrinsics.areEqual(s, "paragraph") && !Intrinsics.areEqual(s, "heading");
    }

    private final int parseChildItem(Context context0, Item cDM$Item0, SpannableStringBuilder spannableStringBuilder0) {
        int v1;
        if(Intrinsics.areEqual(cDM$Item0.getType(), "break")) {
            spannableStringBuilder0.insert(0, "\n");
            return 1;
        }
        if(Intrinsics.areEqual(cDM$Item0.getType(), "image")) {
            ImageAttribute imageAttribute0 = this.getImageAttribute(cDM$Item0.getAttribute());
            if(imageAttribute0.getSrc() != null) {
                String s = "<img attribute:" + imageAttribute0 + "/>";
                spannableStringBuilder0.insert(0, s);
                int v = s.length();
                spannableStringBuilder0.setSpan(new KeImageSpan(this.getLoadFailureDrawable(), imageAttribute0), 0, v, 33);
                return v;
            }
            return 0;
        }
        TextAttribute textAttribute0 = this.getTextAttribute(cDM$Item0.getAttribute());
        CharacterStyle characterStyle0 = this.getCharacterStyle(context0, textAttribute0, cDM$Item0.getType());
        if(textAttribute0.getText() == null) {
            v1 = 0;
        }
        else {
            spannableStringBuilder0.insert(0, textAttribute0.getText());
            v1 = textAttribute0.getText().length();
        }
        List list0 = cDM$Item0.getChildren();
        if(list0 != null) {
            for(Object object0: CollectionsKt___CollectionsKt.reversed(list0)) {
                v1 += SpannableParser.INSTANCE.parseChildItem(context0, ((Item)object0), spannableStringBuilder0);
            }
        }
        if(characterStyle0 != null && v1 != 0) {
            if(characterStyle0 instanceof KeURLSpan) {
                spannableStringBuilder0.setSpan(characterStyle0, 0, v1, 33);
                return v1;
            }
            spannableStringBuilder0.setSpan(characterStyle0, 0, v1, 34);
        }
        return v1;
    }

    @NotNull
    public final SpannableStringBuilder parseTextModel(@NotNull Context context0, @NotNull Item cDM$Item0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        this.parseChildItem(context0, cDM$Item0, spannableStringBuilder0);
        SpanUtil.INSTANCE.updateFirstCharacterFlags(spannableStringBuilder0);
        return this.revertSpans(spannableStringBuilder0);
    }

    private final SpannableStringBuilder revertSpans(SpannableStringBuilder spannableStringBuilder0) {
        SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder(spannableStringBuilder0.toString());
        CharacterStyle[] arr_characterStyle = (CharacterStyle[])spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), CharacterStyle.class);
        if(arr_characterStyle != null && arr_characterStyle.length != 0) {
            List list0 = ArraysKt___ArraysKt.reversed(arr_characterStyle);
            int v1 = list0.size();
            for(int v = 0; v < v1; ++v) {
                CharacterStyle characterStyle0 = (CharacterStyle)list0.get(v);
                int v2 = spannableStringBuilder0.getSpanStart(characterStyle0);
                int v3 = spannableStringBuilder0.getSpanEnd(characterStyle0);
                Intrinsics.checkNotNull(characterStyle0);
                this.setStyleSpan(spannableStringBuilder1, characterStyle0, v2, v3);
            }
        }
        return spannableStringBuilder1;
    }

    private final void setStyleSpan(SpannableStringBuilder spannableStringBuilder0, CharacterStyle characterStyle0, int v, int v1) {
        if(v >= 0 && v1 >= 0 && v <= spannableStringBuilder0.length() && v1 <= spannableStringBuilder0.length()) {
            Selection selection0 = new Selection(v, v1);
            Class class0 = characterStyle0.getClass();
            List list0 = SpanUtil.INSTANCE.getSpans(spannableStringBuilder0, selection0, class0);
            if(characterStyle0 instanceof StyleSpan) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    Intrinsics.checkNotNull(((CharacterStyle)object0), "null cannot be cast to non-null type android.text.style.StyleSpan");
                    if(((StyleSpan)(((CharacterStyle)object0))).getStyle() == ((StyleSpan)characterStyle0).getStyle()) {
                        arrayList0.add(object0);
                    }
                }
                list0 = TypeIntrinsics.asMutableList(arrayList0);
            }
            if(!list0.isEmpty()) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: list0) {
                    if(SpanUtil.INSTANCE.isSameSpan(((CharacterStyle)object1), characterStyle0)) {
                        arrayList1.add(object1);
                    }
                }
                for(Object object2: arrayList1) {
                    CharacterStyle characterStyle1 = (CharacterStyle)object2;
                    int v2 = spannableStringBuilder0.getSpanStart(characterStyle1);
                    int v3 = spannableStringBuilder0.getSpanEnd(characterStyle1);
                    spannableStringBuilder0.removeSpan(characterStyle1);
                    if(v2 != v3) {
                        if(v2 < selection0.getStart()) {
                            spannableStringBuilder0.setSpan(SpanUtil.INSTANCE.newSpan(characterStyle1), v2, selection0.getStart(), SpanUtil.INSTANCE.getInEx(characterStyle1, v2));
                        }
                        if(v3 > selection0.getEnd()) {
                            spannableStringBuilder0.setSpan(SpanUtil.INSTANCE.newSpan(characterStyle1), selection0.getEnd(), v3, SpanUtil.INSTANCE.getInEx(characterStyle1, v2));
                        }
                    }
                }
            }
            spannableStringBuilder0.setSpan(characterStyle0, selection0.getStart(), selection0.getEnd(), SpanUtil.INSTANCE.getInEx(characterStyle0, selection0.getStart()));
        }
    }

    private final CharacterStyle textColorSpan(Context context0, String s) {
        return new KeForegroundColorSpan(context0, KeditorStandardKt.toColorInt$default(s, null, 1, null));
    }

    private final CharacterStyle textSizeSpan(int v) {
        return new KeFontSizeSpan(v);
    }

    private final CharacterStyle textStyleSpan(String s) {
        switch(s) {
            case "bold": {
                return new KeBoldSpan();
            }
            case "italic": {
                return new KeItalicSpan();
            }
            case "lineThrough": {
                return new KeStrikethroughSpan();
            }
            case "underline": {
                return new KeUnderlineSpan();
            }
            default: {
                return new StyleSpan(0);
            }
        }
    }

    private final CharacterStyle typefaceSpan(String s) {
        FontStyle fontStyle0 = FontStyle.Companion.getResIdByName(s);
        Typeface typeface0 = fontStyle0.getTypeface(Keditor.INSTANCE.getContext());
        return fontStyle0 != FontStyle.SYSTEM ? new KeTypefaceSpan(fontStyle0.getFamilyName(), typeface0) : null;
    }

    private final CharacterStyle urlSpan(String s, Boolean boolean0, String s1) {
        return new KeURLSpan(s, boolean0, s1);
    }
}

