package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemContentSearchBindingImpl extends KeItemContentSearchBinding {
    private long mDirtyFlags;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        IncludedLayouts viewDataBinding$IncludedLayouts0 = new IncludedLayouts(12);
        KeItemContentSearchBindingImpl.sIncludes = viewDataBinding$IncludedLayouts0;
        viewDataBinding$IncludedLayouts0.setIncludes(0, new String[]{"ke_item_content_search_music", "ke_item_content_search_movie", "ke_item_content_search_tv", "ke_item_content_search_book", "ke_item_content_search_person", "ke_item_content_search_play", "ke_item_content_search_exhibition"}, new int[]{3, 4, 5, 6, 7, 8, 9}, new int[]{layout.ke_item_content_search_music, layout.ke_item_content_search_movie, layout.ke_item_content_search_tv, layout.ke_item_content_search_book, layout.ke_item_content_search_person, layout.ke_item_content_search_play, layout.ke_item_content_search_exhibition});
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemContentSearchBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_content_search_top_barrier, 10);
        sparseIntArray0.put(id.ke_item_content_search_bottom_barrier, 11);
    }

    public KeItemContentSearchBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 12, KeItemContentSearchBindingImpl.sIncludes, KeItemContentSearchBindingImpl.sViewsWithIds));
    }

    private KeItemContentSearchBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 7, ((View)arr_object[2]), ((KeItemContentSearchBookBinding)arr_object[6]), ((View)arr_object[1]), ((Barrier)arr_object[11]), ((KeItemContentSearchExhibitionBinding)arr_object[9]), ((KeItemContentSearchMovieBinding)arr_object[4]), ((KeItemContentSearchMusicBinding)arr_object[3]), ((ConstraintLayout)arr_object[0]), ((KeItemContentSearchPersonBinding)arr_object[7]), ((KeItemContentSearchPlayBinding)arr_object[8]), ((Barrier)arr_object[10]), ((KeItemContentSearchTvBinding)arr_object[5]));
        this.mDirtyFlags = -1L;
        this.keItemBorderView.setTag(null);
        this.setContainedBinding(this.keItemContentSearchBook);
        this.keItemContentSearchBorderView.setTag(null);
        this.setContainedBinding(this.keItemContentSearchExhibition);
        this.setContainedBinding(this.keItemContentSearchMovie);
        this.setContainedBinding(this.keItemContentSearchMusic);
        this.keItemContentSearchParentLayout.setTag(null);
        this.setContainedBinding(this.keItemContentSearchPerson);
        this.setContainedBinding(this.keItemContentSearchPlay);
        this.setContainedBinding(this.keItemContentSearchTv);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        ContentItem contentItem0 = this.mContentItem;
        int v1 = Long.compare(640L & v, 0L);
        int v2 = v1 == 0 ? 0 : !z;
        int v3 = Long.compare(v & 0x300L, 0L);
        if(v1 != 0) {
            BindingAdapters.goneUnless(this.keItemBorderView, Boolean.valueOf(z));
            BindingAdapters.goneUnless(this.keItemContentSearchBorderView, Boolean.valueOf(((boolean)v2)));
        }
        if(v3 != 0) {
            this.keItemContentSearchBook.setItem(contentItem0);
            this.keItemContentSearchExhibition.setItem(contentItem0);
            this.keItemContentSearchMovie.setItem(contentItem0);
            this.keItemContentSearchMusic.setItem(contentItem0);
            this.keItemContentSearchPerson.setItem(contentItem0);
            this.keItemContentSearchPlay.setItem(contentItem0);
            this.keItemContentSearchTv.setItem(contentItem0);
        }
        ViewDataBinding.executeBindingsOn(this.keItemContentSearchMusic);
        ViewDataBinding.executeBindingsOn(this.keItemContentSearchMovie);
        ViewDataBinding.executeBindingsOn(this.keItemContentSearchTv);
        ViewDataBinding.executeBindingsOn(this.keItemContentSearchBook);
        ViewDataBinding.executeBindingsOn(this.keItemContentSearchPerson);
        ViewDataBinding.executeBindingsOn(this.keItemContentSearchPlay);
        ViewDataBinding.executeBindingsOn(this.keItemContentSearchExhibition);
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(Long.compare(this.mDirtyFlags, 0L) != 0) {
                return true;
            }
        }
        if(this.keItemContentSearchMusic.hasPendingBindings()) {
            return true;
        }
        if(this.keItemContentSearchMovie.hasPendingBindings()) {
            return true;
        }
        if(this.keItemContentSearchTv.hasPendingBindings()) {
            return true;
        }
        if(this.keItemContentSearchBook.hasPendingBindings()) {
            return true;
        }
        if(this.keItemContentSearchPerson.hasPendingBindings()) {
            return true;
        }
        return this.keItemContentSearchPlay.hasPendingBindings() ? true : this.keItemContentSearchExhibition.hasPendingBindings();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.mDirtyFlags = 0x200L;
        }
        this.keItemContentSearchMusic.invalidateAll();
        this.keItemContentSearchMovie.invalidateAll();
        this.keItemContentSearchTv.invalidateAll();
        this.keItemContentSearchBook.invalidateAll();
        this.keItemContentSearchPerson.invalidateAll();
        this.keItemContentSearchPlay.invalidateAll();
        this.keItemContentSearchExhibition.invalidateAll();
        this.requestRebind();
    }

    private boolean onChangeKeItemContentSearchBook(KeItemContentSearchBookBinding keItemContentSearchBookBinding0, int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.mDirtyFlags |= 8L;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeKeItemContentSearchExhibition(KeItemContentSearchExhibitionBinding keItemContentSearchExhibitionBinding0, int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeKeItemContentSearchMovie(KeItemContentSearchMovieBinding keItemContentSearchMovieBinding0, int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.mDirtyFlags |= 4L;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeKeItemContentSearchMusic(KeItemContentSearchMusicBinding keItemContentSearchMusicBinding0, int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.mDirtyFlags |= 2L;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeKeItemContentSearchPerson(KeItemContentSearchPersonBinding keItemContentSearchPersonBinding0, int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.mDirtyFlags |= 16L;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeKeItemContentSearchPlay(KeItemContentSearchPlayBinding keItemContentSearchPlayBinding0, int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeKeItemContentSearchTv(KeItemContentSearchTvBinding keItemContentSearchTvBinding0, int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.mDirtyFlags |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        switch(v) {
            case 0: {
                return this.onChangeKeItemContentSearchTv(((KeItemContentSearchTvBinding)object0), v1);
            }
            case 1: {
                return this.onChangeKeItemContentSearchMusic(((KeItemContentSearchMusicBinding)object0), v1);
            }
            case 2: {
                return this.onChangeKeItemContentSearchMovie(((KeItemContentSearchMovieBinding)object0), v1);
            }
            case 3: {
                return this.onChangeKeItemContentSearchBook(((KeItemContentSearchBookBinding)object0), v1);
            }
            case 4: {
                return this.onChangeKeItemContentSearchPerson(((KeItemContentSearchPersonBinding)object0), v1);
            }
            case 5: {
                return this.onChangeKeItemContentSearchPlay(((KeItemContentSearchPlayBinding)object0), v1);
            }
            case 6: {
                return this.onChangeKeItemContentSearchExhibition(((KeItemContentSearchExhibitionBinding)object0), v1);
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.kakao.keditor.databinding.KeItemContentSearchBinding
    public void setContentItem(@Nullable ContentItem contentItem0) {
        this.mContentItem = contentItem0;
        synchronized(this) {
            this.mDirtyFlags |= 0x100L;
        }
        this.notifyPropertyChanged(BR.contentItem);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemContentSearchBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x80L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner0) {
        super.setLifecycleOwner(lifecycleOwner0);
        this.keItemContentSearchMusic.setLifecycleOwner(lifecycleOwner0);
        this.keItemContentSearchMovie.setLifecycleOwner(lifecycleOwner0);
        this.keItemContentSearchTv.setLifecycleOwner(lifecycleOwner0);
        this.keItemContentSearchBook.setLifecycleOwner(lifecycleOwner0);
        this.keItemContentSearchPerson.setLifecycleOwner(lifecycleOwner0);
        this.keItemContentSearchPlay.setLifecycleOwner(lifecycleOwner0);
        this.keItemContentSearchExhibition.setLifecycleOwner(lifecycleOwner0);
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.contentItem == v) {
            this.setContentItem(((ContentItem)object0));
            return true;
        }
        return false;
    }
}

