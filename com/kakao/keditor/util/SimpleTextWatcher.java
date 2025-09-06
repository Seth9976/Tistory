package com.kakao.keditor.util;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J(\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\nH\u0016J(\u0010\r\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\nH\u0016¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/util/SimpleTextWatcher;", "Landroid/text/TextWatcher;", "()V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class SimpleTextWatcher implements TextWatcher {
    @Override  // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable editable0) {
        Intrinsics.checkNotNullParameter(editable0, "s");
    }

    @Override  // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(charSequence0, "s");
    }

    @Override  // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(charSequence0, "s");
    }
}

