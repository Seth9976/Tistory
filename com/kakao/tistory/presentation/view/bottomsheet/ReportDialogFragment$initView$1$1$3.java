package com.kakao.tistory.presentation.view.bottomsheet;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u00072\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000F\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u00072\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"com/kakao/tistory/presentation/view/bottomsheet/ReportDialogFragment$initView$1$1$3", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ReportDialogFragment.initView.1.1.3 implements TextWatcher {
    public final ReportDialogFragment a;

    public ReportDialogFragment.initView.1.1.3(ReportDialogFragment reportDialogFragment0) {
        this.a = reportDialogFragment0;
        super();
    }

    @Override  // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable0) {
        ReportDialogFragment.access$getReportViewModel(this.a).afterTextChangedEtc();
    }

    @Override  // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
    }
}

