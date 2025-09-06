package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.viewmodel.ReportViewModel;

public abstract class FragmentBottomSheetReportBinding extends ViewDataBinding {
    @NonNull
    public final AppCompatButton bottomSheetReportButton;
    @NonNull
    public final TextView bottomSheetReportDescriptionText;
    @NonNull
    public final ConstraintLayout bottomSheetReportEtcContainer;
    @NonNull
    public final EditText bottomSheetReportEtcEditText;
    @NonNull
    public final ImageButton bottomSheetReportImageButton1;
    @NonNull
    public final ImageButton bottomSheetReportImageButton2;
    @NonNull
    public final ImageButton bottomSheetReportImageButton3;
    @NonNull
    public final ImageButton bottomSheetReportImageButton4;
    @NonNull
    public final ImageButton bottomSheetReportImageButton5;
    @NonNull
    public final ImageButton bottomSheetReportImageButton6;
    @NonNull
    public final ImageButton bottomSheetReportImageButton7;
    @NonNull
    public final ImageButton bottomSheetReportImageButton8;
    @NonNull
    public final TextView bottomSheetReportLengthText;
    @NonNull
    public final TextView bottomSheetReportText1;
    @NonNull
    public final TextView bottomSheetReportText2;
    @NonNull
    public final TextView bottomSheetReportText3;
    @NonNull
    public final TextView bottomSheetReportText4;
    @NonNull
    public final TextView bottomSheetReportText5;
    @NonNull
    public final TextView bottomSheetReportText6;
    @NonNull
    public final TextView bottomSheetReportText7;
    @NonNull
    public final TextView bottomSheetReportText8;
    @NonNull
    public final TextView bottomSheetReportTitleText;
    @NonNull
    public final TextView bottomSheetReportUsurpation;
    @Bindable
    protected ReportViewModel mViewModel;

    public FragmentBottomSheetReportBinding(Object object0, View view0, int v, AppCompatButton appCompatButton0, TextView textView0, ConstraintLayout constraintLayout0, EditText editText0, ImageButton imageButton0, ImageButton imageButton1, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, ImageButton imageButton7, TextView textView1, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        super(object0, view0, v);
        this.bottomSheetReportButton = appCompatButton0;
        this.bottomSheetReportDescriptionText = textView0;
        this.bottomSheetReportEtcContainer = constraintLayout0;
        this.bottomSheetReportEtcEditText = editText0;
        this.bottomSheetReportImageButton1 = imageButton0;
        this.bottomSheetReportImageButton2 = imageButton1;
        this.bottomSheetReportImageButton3 = imageButton2;
        this.bottomSheetReportImageButton4 = imageButton3;
        this.bottomSheetReportImageButton5 = imageButton4;
        this.bottomSheetReportImageButton6 = imageButton5;
        this.bottomSheetReportImageButton7 = imageButton6;
        this.bottomSheetReportImageButton8 = imageButton7;
        this.bottomSheetReportLengthText = textView1;
        this.bottomSheetReportText1 = textView2;
        this.bottomSheetReportText2 = textView3;
        this.bottomSheetReportText3 = textView4;
        this.bottomSheetReportText4 = textView5;
        this.bottomSheetReportText5 = textView6;
        this.bottomSheetReportText6 = textView7;
        this.bottomSheetReportText7 = textView8;
        this.bottomSheetReportText8 = textView9;
        this.bottomSheetReportTitleText = textView10;
        this.bottomSheetReportUsurpation = textView11;
    }

    public static FragmentBottomSheetReportBinding bind(@NonNull View view0) {
        return FragmentBottomSheetReportBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBottomSheetReportBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (FragmentBottomSheetReportBinding)ViewDataBinding.bind(object0, view0, layout.fragment_bottom_sheet_report);
    }

    @Nullable
    public ReportViewModel getViewModel() {
        return this.mViewModel;
    }

    @NonNull
    public static FragmentBottomSheetReportBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return FragmentBottomSheetReportBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentBottomSheetReportBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return FragmentBottomSheetReportBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentBottomSheetReportBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (FragmentBottomSheetReportBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_bottom_sheet_report, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static FragmentBottomSheetReportBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (FragmentBottomSheetReportBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_bottom_sheet_report, null, false, object0);
    }

    public abstract void setViewModel(@Nullable ReportViewModel arg1);
}

