package com.kakao.keditor.plugin.attrs.text.spans;

import android.widget.EditText;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001A\u00020\u0013H\u0016R\u001A\u0010\u0007\u001A\u00020\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u0011\u0010\r\u001A\u00020\u000E8F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000FR\u001A\u0010\u0005\u001A\u00020\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/spans/Selection;", "Ljava/io/Serializable;", "editor", "Landroid/widget/EditText;", "(Landroid/widget/EditText;)V", "start", "", "end", "(II)V", "getEnd", "()I", "setEnd", "(I)V", "isEmpty", "", "()Z", "getStart", "setStart", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Selection implements Serializable {
    private int end;
    private int start;

    public Selection(int v, int v1) {
        this.start = v;
        this.end = v1;
        if(v > v1) {
            this.end = v;
            this.start = v1;
        }
    }

    public Selection(@NotNull EditText editText0) {
        Intrinsics.checkNotNullParameter(editText0, "editor");
        this(editText0.getSelectionStart(), editText0.getSelectionEnd());
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final boolean isEmpty() {
        return this.start == this.end;
    }

    public final void setEnd(int v) {
        this.end = v;
    }

    public final void setStart(int v) {
        this.start = v;
    }

    @Override
    @NotNull
    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ")";
    }
}

