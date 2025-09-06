package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarEditBottomView;

public abstract class KeActivityGrammarCheckBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keClose;
    @NonNull
    public final FrameLayout keGrammarCheckerTop;
    @NonNull
    public final GrammarEditBottomView keGrammarEditWindow;
    @NonNull
    public final KeditorView keGrammarEditorView;
    @NonNull
    public final LinearLayout keGrammarIndex;
    @Bindable
    protected int mCurrentIndex;
    @Bindable
    protected int mTotalCount;

    public KeActivityGrammarCheckBinding(Object object0, View view0, int v, ImageView imageView0, FrameLayout frameLayout0, GrammarEditBottomView grammarEditBottomView0, KeditorView keditorView0, LinearLayout linearLayout0) {
        super(object0, view0, v);
        this.keClose = imageView0;
        this.keGrammarCheckerTop = frameLayout0;
        this.keGrammarEditWindow = grammarEditBottomView0;
        this.keGrammarEditorView = keditorView0;
        this.keGrammarIndex = linearLayout0;
    }

    public static KeActivityGrammarCheckBinding bind(@NonNull View view0) {
        return KeActivityGrammarCheckBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeActivityGrammarCheckBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeActivityGrammarCheckBinding)ViewDataBinding.bind(object0, view0, layout.ke_activity_grammar_check);
    }

    public int getCurrentIndex() {
        return this.mCurrentIndex;
    }

    public int getTotalCount() {
        return this.mTotalCount;
    }

    @NonNull
    public static KeActivityGrammarCheckBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeActivityGrammarCheckBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeActivityGrammarCheckBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeActivityGrammarCheckBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeActivityGrammarCheckBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeActivityGrammarCheckBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_grammar_check, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeActivityGrammarCheckBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeActivityGrammarCheckBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_grammar_check, null, false, object0);
    }

    public abstract void setCurrentIndex(int arg1);

    public abstract void setTotalCount(int arg1);
}

