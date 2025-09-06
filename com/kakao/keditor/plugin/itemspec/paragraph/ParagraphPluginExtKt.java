package com.kakao.keditor.plugin.itemspec.paragraph;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Text;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.text.spans.KeBackgroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeBoldSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeFontSizeSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeForegroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeItalicSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeStrikethroughSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeTypefaceSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeUnderlineSpan;
import com.kakao.keditor.plugin.itemspec.paragraph.request.NextAlignment;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetFont;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetStyle;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextBackgroundColor;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextColor;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextLink;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextSize;
import com.kakao.keditor.request.RenderingRequest;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.widget.KeditorEditText;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004\u001A\f\u0010\u0005\u001A\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"handleCommonTextRenderingRequest", "", "Lcom/kakao/keditor/widget/KeditorEditText;", "request", "Lcom/kakao/keditor/request/RenderingRequest;", "span", "Landroid/text/style/CharacterStyle;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/request/SetStyle;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nParagraphPluginExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphPluginExt.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/ParagraphPluginExtKt\n+ 2 RenderingRequest.kt\ncom/kakao/keditor/request/RenderingRequestKt\n*L\n1#1,52:1\n18#2:53\n*S KotlinDebug\n*F\n+ 1 ParagraphPluginExt.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/ParagraphPluginExtKt\n*L\n23#1:53\n*E\n"})
public final class ParagraphPluginExtKt {
    public static final void handleCommonTextRenderingRequest(@NotNull KeditorEditText keditorEditText0, @NotNull RenderingRequest renderingRequest0) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "<this>");
        Intrinsics.checkNotNullParameter(renderingRequest0, "request");
        TextItem textItem0 = null;
        if(renderingRequest0 instanceof SetStyle) {
            KeditorEditText.requestSetStyleSpan$default(keditorEditText0, ParagraphPluginExtKt.span(((SetStyle)renderingRequest0)), null, null, 6, null);
        }
        else if(renderingRequest0 instanceof SetFont) {
            KeditorEditText.requestSetStyleSpan$default(keditorEditText0, new KeTypefaceSpan(((SetFont)renderingRequest0).getFamilyName(), ((SetFont)renderingRequest0).getTypeFace()), null, null, 6, null);
        }
        else if(renderingRequest0 instanceof NextAlignment) {
            KeditorItem keditorItem0 = renderingRequest0.getFocusedItem();
            if(!(keditorItem0 instanceof TextItem)) {
                keditorItem0 = null;
            }
            if(((TextItem)keditorItem0) == null) {
                KeditorItem keditorItem1 = renderingRequest0.getFocusedItem();
                Aligned aligned0 = keditorItem1 instanceof Aligned ? ((Aligned)keditorItem1) : null;
                if(aligned0 != null) {
                    Alignment alignment0 = aligned0.getAlignment().next(Text.INSTANCE);
                    aligned0.setAlignment(alignment0);
                    alignment0.into(keditorEditText0);
                }
            }
            else {
                ((TextItem)keditorItem0).setAlignment(((TextItem)keditorItem0).getAlignment().next(Text.INSTANCE));
                EditTextStandardKt.applyAlignment(keditorEditText0, ((TextItem)keditorItem0));
            }
        }
        else if(renderingRequest0 instanceof SetTextSize) {
            KeditorEditText.requestSetStyleSpan$default(keditorEditText0, new KeFontSizeSpan(((SetTextSize)renderingRequest0).getSize()), null, null, 6, null);
        }
        else if(renderingRequest0 instanceof SetTextColor) {
            Context context0 = keditorEditText0.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
            KeditorEditText.requestSetStyleSpan$default(keditorEditText0, new KeForegroundColorSpan(context0, ((SetTextColor)renderingRequest0).getColor()), null, null, 6, null);
        }
        else if(renderingRequest0 instanceof SetTextBackgroundColor) {
            Context context1 = keditorEditText0.getContext();
            Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
            KeditorEditText.requestSetStyleSpan$default(keditorEditText0, new KeBackgroundColorSpan(context1, ((SetTextBackgroundColor)renderingRequest0).getColor()), null, null, 6, null);
        }
        else if(renderingRequest0 instanceof SetTextLink) {
            EditTextStandardKt.openLinkDialog(keditorEditText0, new Function3(keditorEditText0) {
                final KeditorEditText $this_handleCommonTextRenderingRequest;

                {
                    this.$this_handleCommonTextRenderingRequest = keditorEditText0;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((CharacterStyle)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull CharacterStyle characterStyle0, int v, int v1) {
                    Intrinsics.checkNotNullParameter(characterStyle0, "span");
                    KeditorEditText.removeColorSpanFromSelectedRange$default(this.$this_handleCommonTextRenderingRequest, null, null, 3, null);
                    this.$this_handleCommonTextRenderingRequest.requestSetStyleSpan(characterStyle0, v, v1);
                }
            });
        }
        KeditorItem keditorItem2 = renderingRequest0.getFocusedItem();
        if(keditorItem2 instanceof TextItem) {
            textItem0 = (TextItem)keditorItem2;
        }
        if(textItem0 != null) {
            Editable editable0 = keditorEditText0.getText();
            Intrinsics.checkNotNull(editable0, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
            textItem0.setText(((SpannableStringBuilder)editable0));
        }
    }

    private static final CharacterStyle span(SetStyle setStyle0) {
        CommonTextStyle commonTextStyle0 = setStyle0.getStyle();
        if(Intrinsics.areEqual(commonTextStyle0, Strikethrough.INSTANCE)) {
            return new KeStrikethroughSpan();
        }
        if(Intrinsics.areEqual(commonTextStyle0, Bold.INSTANCE)) {
            return new KeBoldSpan();
        }
        if(Intrinsics.areEqual(commonTextStyle0, Italic.INSTANCE)) {
            return new KeItalicSpan();
        }
        if(!Intrinsics.areEqual(commonTextStyle0, Underline.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return new KeUnderlineSpan();
    }
}

