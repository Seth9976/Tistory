package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.tistory.presentation.R.layout;

public abstract class FragmentBottomSheetBlogCategoryBinding extends ViewDataBinding {
    @NonNull
    public final RecyclerView blogCategoryDialogRecyclerView;
    @NonNull
    public final TextView blogCategoryDialogTitleText;
    @NonNull
    public final RelativeLayout blogCategoryLoadingView;
    @NonNull
    public final ProgressBar loadingPaogressBar;

    public FragmentBottomSheetBlogCategoryBinding(Object object0, View view0, int v, RecyclerView recyclerView0, TextView textView0, RelativeLayout relativeLayout0, ProgressBar progressBar0) {
        super(object0, view0, v);
        this.blogCategoryDialogRecyclerView = recyclerView0;
        this.blogCategoryDialogTitleText = textView0;
        this.blogCategoryLoadingView = relativeLayout0;
        this.loadingPaogressBar = progressBar0;
    }

    public static FragmentBottomSheetBlogCategoryBinding bind(@NonNull View view0) {
        return FragmentBottomSheetBlogCategoryBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBottomSheetBlogCategoryBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (FragmentBottomSheetBlogCategoryBinding)ViewDataBinding.bind(object0, view0, layout.fragment_bottom_sheet_blog_category);
    }

    @NonNull
    public static FragmentBottomSheetBlogCategoryBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return FragmentBottomSheetBlogCategoryBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentBottomSheetBlogCategoryBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return FragmentBottomSheetBlogCategoryBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentBottomSheetBlogCategoryBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (FragmentBottomSheetBlogCategoryBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_bottom_sheet_blog_category, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static FragmentBottomSheetBlogCategoryBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (FragmentBottomSheetBlogCategoryBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_bottom_sheet_blog_category, null, false, object0);
    }
}

