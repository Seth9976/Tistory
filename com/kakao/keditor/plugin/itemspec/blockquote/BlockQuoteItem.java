package com.kakao.keditor.plugin.itemspec.blockquote;

import android.text.SpannableStringBuilder;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.itemspec.paragraph.SingleTextItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "blockquote")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010!\u001A\u00020\u0012H\u0016R\u001A\u0010\u0002\u001A\u00020\u0003X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001A\u0010\b\u001A\u00020\tX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u00020\tX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u000B\"\u0004\b\u0010\u0010\rR$\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0012@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0018\u001A\u00020\u0019X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\u0006\"\u0004\b \u0010\u0004¨\u0006\""}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteItem;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/SingleTextItem;", "hasPendingFocus", "", "(Z)V", "getHasPendingFocus", "()Z", "setHasPendingFocus", "selectionEnd", "", "getSelectionEnd", "()I", "setSelectionEnd", "(I)V", "selectionStart", "getSelectionStart", "setSelectionStart", "value", "", "style", "getStyle", "()Ljava/lang/String;", "setStyle", "(Ljava/lang/String;)V", "text", "Landroid/text/SpannableStringBuilder;", "getText", "()Landroid/text/SpannableStringBuilder;", "setText", "(Landroid/text/SpannableStringBuilder;)V", "useDefaultStyle", "getUseDefaultStyle", "setUseDefaultStyle", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlockQuoteItem extends SingleTextItem {
    private boolean hasPendingFocus;
    private int selectionEnd;
    private int selectionStart;
    @NotNull
    private String style;
    @NotNull
    private SpannableStringBuilder text;
    private boolean useDefaultStyle;

    public BlockQuoteItem() {
        this(false, 1, null);
    }

    public BlockQuoteItem(boolean z) {
        super(z);
        this.hasPendingFocus = z;
        this.style = "style1";
        this.text = new SpannableStringBuilder("");
        this.selectionStart = -1;
        this.selectionEnd = -1;
    }

    public BlockQuoteItem(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem
    public boolean getHasPendingFocus() {
        return this.hasPendingFocus;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public int getSelectionEnd() {
        return this.selectionEnd;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public int getSelectionStart() {
        return this.selectionStart;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    @NotNull
    public SpannableStringBuilder getText() {
        return this.text;
    }

    public final boolean getUseDefaultStyle() {
        return this.useDefaultStyle;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem
    public void setHasPendingFocus(boolean z) {
        this.hasPendingFocus = z;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setSelectionEnd(int v) {
        this.selectionEnd = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setSelectionStart(int v) {
        this.selectionStart = v;
    }

    public final void setStyle(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.removeBypass("style");
        this.style = s;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setText(@NotNull SpannableStringBuilder spannableStringBuilder0) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "<set-?>");
        this.text = spannableStringBuilder0;
    }

    public final void setUseDefaultStyle(boolean z) {
        this.useDefaultStyle = z;
    }

    @Override
    @NotNull
    public String toString() {
        return "BlockQuoteItem(hasPendingFocus=" + this.getHasPendingFocus() + ", style=\'" + this.style + "\', text=" + this.getText() + ", selectionStart=" + this.getSelectionStart() + ", selectionEnd=" + this.getSelectionEnd() + ", useDefaultStyle=" + this.useDefaultStyle + ")";
    }
}

