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
import com.kakao.keditor.plugin.attrs.LoadingStatus.Succeed;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemContentSearchMusicBindingImpl extends KeItemContentSearchMusicBinding {
    private long mDirtyFlags;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemContentSearchMusicBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_content_search_image, 5);
        sparseIntArray0.put(id.ke_item_content_search_artist, 6);
        sparseIntArray0.put(id.ke_item_content_search_album, 7);
        sparseIntArray0.put(id.ke_item_content_search_text_barrier, 8);
    }

    public KeItemContentSearchMusicBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 9, KeItemContentSearchMusicBindingImpl.sIncludes, KeItemContentSearchMusicBindingImpl.sViewsWithIds));
    }

    private KeItemContentSearchMusicBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[7]), ((TextView)arr_object[4]), ((TextView)arr_object[6]), ((TextView)arr_object[3]), ((ImageView)arr_object[5]), ((ImageView)arr_object[1]), ((ConstraintLayout)arr_object[0]), ((Barrier)arr_object[8]), ((TextView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keItemContentSearchAlbumDesc.setTag(null);
        this.keItemContentSearchArtistDesc.setTag(null);
        this.keItemContentSearchImagePlaceholder.setTag(null);
        this.keItemContentSearchLayout.setTag(null);
        this.keItemContentSearchTitle.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s2;
        String s1;
        String s;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ContentItem contentItem0 = this.mItem;
        int v1 = Long.compare(v & 3L, 0L);
        boolean z = false;
        LoadingStatus loadingStatus0 = null;
        if(v1 == 0) {
            s = null;
            s2 = null;
        }
        else {
            if(contentItem0 == null) {
                s = null;
                s2 = null;
                s1 = null;
            }
            else {
                loadingStatus0 = contentItem0.getLoadingStatus();
                s = contentItem0.getTitle();
                s1 = contentItem0.getAlbumTitle();
                s2 = contentItem0.getArtist();
            }
            if(loadingStatus0 != Succeed.INSTANCE) {
                z = true;
            }
            loadingStatus0 = s1;
        }
        if(v1 != 0) {
            TextViewBindingAdapter.setText(this.keItemContentSearchAlbumDesc, ((CharSequence)loadingStatus0));
            TextViewBindingAdapter.setText(this.keItemContentSearchArtistDesc, s2);
            BindingAdapters.goneUnless(this.keItemContentSearchImagePlaceholder, Boolean.valueOf(z));
            TextViewBindingAdapter.setText(this.keItemContentSearchTitle, s);
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

    @Override  // com.kakao.keditor.databinding.KeItemContentSearchMusicBinding
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

