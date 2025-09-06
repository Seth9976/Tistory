package com.kakao.keditor.plugin.itemspec.textlist;

import android.text.SpannableStringBuilder;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "listItem")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001A\u00020\u0014J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001DHÖ\u0003J\t\u0010\u001E\u001A\u00020\u0005HÖ\u0001J\t\u0010\u001F\u001A\u00020 HÖ\u0001R\u001E\u0010\u0006\u001A\u0004\u0018\u00010\u0005X\u0086\u000E¢\u0006\u0010\n\u0002\u0010\f\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001E\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0086\u000E¢\u0006\u0010\n\u0002\u0010\f\u001A\u0004\b\r\u0010\t\"\u0004\b\u000E\u0010\u000BR\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItemContent;", "Lcom/kakao/keditor/KeditorItem;", "text", "Landroid/text/SpannableStringBuilder;", "selectionStart", "", "selectionEnd", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSelectionEnd", "()Ljava/lang/Integer;", "setSelectionEnd", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSelectionStart", "setSelectionStart", "getText", "()Landroid/text/SpannableStringBuilder;", "setText", "(Landroid/text/SpannableStringBuilder;)V", "clearSelection", "", "component1", "component2", "component3", "copy", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItemContent;", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TextListItemContent extends KeditorItem {
    @Nullable
    private Integer selectionEnd;
    @Nullable
    private Integer selectionStart;
    @NotNull
    private SpannableStringBuilder text;

    public TextListItemContent() {
        this(null, null, null, 7, null);
    }

    public TextListItemContent(@NotNull SpannableStringBuilder spannableStringBuilder0, @Nullable Integer integer0, @Nullable Integer integer1) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "text");
        super();
        this.text = spannableStringBuilder0;
        this.selectionStart = integer0;
        this.selectionEnd = integer1;
    }

    public TextListItemContent(SpannableStringBuilder spannableStringBuilder0, Integer integer0, Integer integer1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            spannableStringBuilder0 = new SpannableStringBuilder("");
        }
        if((v & 2) != 0) {
            integer0 = null;
        }
        if((v & 4) != 0) {
            integer1 = null;
        }
        this(spannableStringBuilder0, integer0, integer1);
    }

    public final void clearSelection() {
        this.selectionStart = null;
        this.selectionEnd = null;
    }

    @NotNull
    public final SpannableStringBuilder component1() {
        return this.text;
    }

    @Nullable
    public final Integer component2() {
        return this.selectionStart;
    }

    @Nullable
    public final Integer component3() {
        return this.selectionEnd;
    }

    @NotNull
    public final TextListItemContent copy(@NotNull SpannableStringBuilder spannableStringBuilder0, @Nullable Integer integer0, @Nullable Integer integer1) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "text");
        return new TextListItemContent(spannableStringBuilder0, integer0, integer1);
    }

    public static TextListItemContent copy$default(TextListItemContent textListItemContent0, SpannableStringBuilder spannableStringBuilder0, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            spannableStringBuilder0 = textListItemContent0.text;
        }
        if((v & 2) != 0) {
            integer0 = textListItemContent0.selectionStart;
        }
        if((v & 4) != 0) {
            integer1 = textListItemContent0.selectionEnd;
        }
        return textListItemContent0.copy(spannableStringBuilder0, integer0, integer1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextListItemContent)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.text, ((TextListItemContent)object0).text)) {
            return false;
        }
        return Intrinsics.areEqual(this.selectionStart, ((TextListItemContent)object0).selectionStart) ? Intrinsics.areEqual(this.selectionEnd, ((TextListItemContent)object0).selectionEnd) : false;
    }

    @Nullable
    public final Integer getSelectionEnd() {
        return this.selectionEnd;
    }

    @Nullable
    public final Integer getSelectionStart() {
        return this.selectionStart;
    }

    @NotNull
    public final SpannableStringBuilder getText() {
        return this.text;
    }

    @Override
    public int hashCode() {
        int v = this.text.hashCode();
        int v1 = 0;
        int v2 = this.selectionStart == null ? 0 : this.selectionStart.hashCode();
        Integer integer0 = this.selectionEnd;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    public final void setSelectionEnd(@Nullable Integer integer0) {
        this.selectionEnd = integer0;
    }

    public final void setSelectionStart(@Nullable Integer integer0) {
        this.selectionStart = integer0;
    }

    public final void setText(@NotNull SpannableStringBuilder spannableStringBuilder0) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "<set-?>");
        this.text = spannableStringBuilder0;
    }

    @Override
    @NotNull
    public String toString() {
        return "TextListItemContent(text=" + this.text + ", selectionStart=" + this.selectionStart + ", selectionEnd=" + this.selectionEnd + ")";
    }
}

