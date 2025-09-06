package com.kakao.tistory.presentation.databinding;

import androidx.databinding.InverseBindingListener;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.tistory.presentation.viewmodel.ReportViewModel;

public final class b implements InverseBindingListener {
    public final FragmentBottomSheetReportBindingImpl a;

    public b(FragmentBottomSheetReportBindingImpl fragmentBottomSheetReportBindingImpl0) {
        this.a = fragmentBottomSheetReportBindingImpl0;
        super();
    }

    @Override  // androidx.databinding.InverseBindingListener
    public final void onChange() {
        String s = TextViewBindingAdapter.getTextString(this.a.bottomSheetReportEtcEditText);
        ReportViewModel reportViewModel0 = this.a.mViewModel;
        if(reportViewModel0 != null) {
            reportViewModel0.setReportMessage(s);
        }
    }
}

