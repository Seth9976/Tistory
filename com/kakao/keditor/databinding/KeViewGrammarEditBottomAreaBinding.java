package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.grammarcheck.SingleGrammarCheck;

public abstract class KeViewGrammarEditBottomAreaBinding extends ViewDataBinding {
    @NonNull
    public final TextView keGrammarBtnEdit;
    @NonNull
    public final TextView keGrammarBtnPass;
    @NonNull
    public final EditText keGrammarEditText;
    @NonNull
    public final TextView keGrammarErrorMessage;
    @NonNull
    public final LinearLayout keGrammarIterateButtons;
    @Bindable
    protected SingleGrammarCheck mCurrentGrammarError;

    public KeViewGrammarEditBottomAreaBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, EditText editText0, TextView textView2, LinearLayout linearLayout0) {
        super(object0, view0, v);
        this.keGrammarBtnEdit = textView0;
        this.keGrammarBtnPass = textView1;
        this.keGrammarEditText = editText0;
        this.keGrammarErrorMessage = textView2;
        this.keGrammarIterateButtons = linearLayout0;
    }

    public static KeViewGrammarEditBottomAreaBinding bind(@NonNull View view0) {
        return KeViewGrammarEditBottomAreaBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeViewGrammarEditBottomAreaBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeViewGrammarEditBottomAreaBinding)ViewDataBinding.bind(object0, view0, layout.ke_view_grammar_edit_bottom_area);
    }

    @Nullable
    public SingleGrammarCheck getCurrentGrammarError() {
        return this.mCurrentGrammarError;
    }

    @NonNull
    public static KeViewGrammarEditBottomAreaBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeViewGrammarEditBottomAreaBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeViewGrammarEditBottomAreaBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeViewGrammarEditBottomAreaBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeViewGrammarEditBottomAreaBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeViewGrammarEditBottomAreaBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_view_grammar_edit_bottom_area, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeViewGrammarEditBottomAreaBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeViewGrammarEditBottomAreaBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_view_grammar_edit_bottom_area, null, false, object0);
    }

    public abstract void setCurrentGrammarError(@Nullable SingleGrammarCheck arg1);
}

