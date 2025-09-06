package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Succeed;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemContentSearchMovieBindingImpl extends KeItemContentSearchMovieBinding {
    private long mDirtyFlags;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemContentSearchMovieBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_content_search_image, 8);
        sparseIntArray0.put(id.ke_item_content_search_rating, 9);
        sparseIntArray0.put(id.ke_item_content_search_directors, 10);
        sparseIntArray0.put(id.ke_item_content_search_actors, 11);
        sparseIntArray0.put(id.ke_item_content_search_text_barrier, 12);
    }

    public KeItemContentSearchMovieBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 13, KeItemContentSearchMovieBindingImpl.sIncludes, KeItemContentSearchMovieBindingImpl.sViewsWithIds));
    }

    private KeItemContentSearchMovieBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[11]), ((TextView)arr_object[7]), ((TextView)arr_object[10]), ((TextView)arr_object[6]), ((ImageView)arr_object[8]), ((ImageView)arr_object[1]), ((ConstraintLayout)arr_object[0]), ((TextView)arr_object[9]), ((TextView)arr_object[4]), ((TextView)arr_object[5]), ((ImageView)arr_object[3]), ((Barrier)arr_object[12]), ((TextView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keItemContentSearchActorsDesc.setTag(null);
        this.keItemContentSearchDirectorsDesc.setTag(null);
        this.keItemContentSearchImagePlaceholder.setTag(null);
        this.keItemContentSearchLayout.setTag(null);
        this.keItemContentSearchRatingDesc.setTag(null);
        this.keItemContentSearchRatingEmpty.setTag(null);
        this.keItemContentSearchRatingIcon.setTag(null);
        this.keItemContentSearchTitle.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s7;
        int v2;
        boolean z3;
        String s6;
        String s5;
        boolean z2;
        int v1;
        LoadingStatus loadingStatus0;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ContentItem contentItem0 = this.mItem;
        if(Long.compare(v & 3L, 0L) == 0) {
            s4 = null;
            z2 = false;
            v2 = 0;
            s7 = null;
            s = null;
            z3 = false;
            v1 = 0;
            s5 = null;
            s6 = null;
        }
        else {
            if(contentItem0 == null) {
                s4 = null;
                loadingStatus0 = null;
                s = null;
                s1 = null;
                s2 = null;
                s3 = null;
            }
            else {
                s = contentItem0.getReleaseDate();
                s1 = contentItem0.getTitle();
                s2 = contentItem0.getActors();
                s3 = contentItem0.getDirectors();
                s4 = contentItem0.getRating();
                loadingStatus0 = contentItem0.getLoadingStatus();
            }
            boolean z = s == null ? false : s.isEmpty();
            boolean z1 = s4 == null ? false : s4.isEmpty();
            v1 = !z1;
            v = z ? v | 4L : v | 8L;
            z2 = z1;
            s5 = s2;
            s6 = s3;
            z3 = loadingStatus0 != Succeed.INSTANCE;
            v2 = !z;
            s7 = s1;
        }
        String s8 = (4L & v) == 0L ? null : this.keItemContentSearchRatingDesc.getResources().getString(string.ke_content_search_rating_only_desc, new Object[]{s4});
        String s9 = (v & 8L) == 0L ? null : this.keItemContentSearchRatingDesc.getResources().getString(string.ke_content_search_rating_desc, new Object[]{s4, s});
        int v3 = Long.compare(v & 3L, 0L);
        if(v3 == 0) {
            s9 = null;
        }
        else if(v2 == 0) {
            s9 = s8;
        }
        if(v3 != 0) {
            TextViewBindingAdapter.setText(this.keItemContentSearchActorsDesc, s5);
            TextViewBindingAdapter.setText(this.keItemContentSearchDirectorsDesc, s6);
            BindingAdapters.goneUnless(this.keItemContentSearchImagePlaceholder, Boolean.valueOf(z3));
            BindingAdapters.goneUnless(this.keItemContentSearchRatingDesc, Boolean.valueOf(((boolean)v1)));
            TextViewBindingAdapter.setText(this.keItemContentSearchRatingDesc, s9);
            BindingAdapters.goneUnless(this.keItemContentSearchRatingEmpty, Boolean.valueOf(z2));
            BindingAdapters.goneUnless(this.keItemContentSearchRatingIcon, Boolean.valueOf(((boolean)v1)));
            TextViewBindingAdapter.setText(this.keItemContentSearchTitle, s7);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.mDirtyFlags != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.mDirtyFlags = 2L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemContentSearchMovieBinding
    public void setItem(@Nullable ContentItem contentItem0) {
        this.mItem = contentItem0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.item == v) {
            this.setItem(((ContentItem)object0));
            return true;
        }
        return false;
    }
}

