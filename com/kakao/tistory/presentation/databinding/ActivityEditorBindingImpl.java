package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;
import com.kakao.tistory.presentation.generated.callback.OnClickListener.Listener;
import com.kakao.tistory.presentation.generated.callback.OnClickListener;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel.ButtonMode;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel.EditorMode;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;

public class ActivityEditorBindingImpl extends ActivityEditorBinding implements Listener {
    public final OnClickListener a;
    public final OnClickListener b;
    public final OnClickListener c;
    public final OnClickListener d;
    public long e;
    public static final SparseIntArray f;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        ActivityEditorBindingImpl.f = sparseIntArray0;
        sparseIntArray0.put(id.editor_toolbar, 7);
        sparseIntArray0.put(id.editor_toolbar_draft_bar, 8);
        sparseIntArray0.put(id.editor_setting_fragment_container, 9);
        sparseIntArray0.put(id.editor_draft_dialog, 10);
    }

    public ActivityEditorBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 11, null, ActivityEditorBindingImpl.f);
        super(dataBindingComponent0, view0, 3, ((ComposeView)arr_object[10]), ((FrameLayout)arr_object[9]), ((Toolbar)arr_object[7]), ((AppCompatButton)arr_object[6]), ((View)arr_object[8]), ((AppCompatButton)arr_object[4]), ((AppCompatButton)arr_object[5]), ((ConstraintLayout)arr_object[3]), ((ImageButton)arr_object[1]), ((TextView)arr_object[2]));
        this.e = -1L;
        this.editorToolbarCompleteButton.setTag(null);
        this.editorToolbarDraftButton.setTag(null);
        this.editorToolbarDraftCountButton.setTag(null);
        this.editorToolbarDraftLayout.setTag(null);
        this.editorToolbarHomeAsCloseButton.setTag(null);
        this.editorToolbarTitle.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.a = new OnClickListener(this, 3);
        this.b = new OnClickListener(this, 1);
        this.c = new OnClickListener(this, 4);
        this.d = new OnClickListener(this, 2);
        this.invalidateAll();
    }

    @Override  // com.kakao.tistory.presentation.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                EditorViewModel editorViewModel0 = this.mViewModel;
                if(editorViewModel0 != null) {
                    editorViewModel0.onClosedClicked();
                    return;
                }
                break;
            }
            case 2: {
                EditorViewModel editorViewModel1 = this.mViewModel;
                if(editorViewModel1 != null) {
                    editorViewModel1.onClickDraftButton();
                    return;
                }
                break;
            }
            case 3: {
                DraftViewModel draftViewModel0 = this.mDraftViewModel;
                if(draftViewModel0 != null) {
                    draftViewModel0.onClickShowDraftList();
                    return;
                }
                break;
            }
            case 4: {
                EditorViewModel editorViewModel2 = this.mViewModel;
                if(editorViewModel2 != null) {
                    editorViewModel2.onClickToolbarRightButton();
                    return;
                }
                break;
            }
        }
    }

    public final boolean a(int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.e |= 2L;
            }
            return true;
        }
        return false;
    }

    public final boolean b(int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.e |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v5;
        CharSequence charSequence0;
        Integer integer2;
        int v4;
        Integer integer1;
        int v3;
        int v2;
        int v1;
        String s2;
        Integer integer0;
        ButtonMode editorViewModel$ButtonMode0;
        String s1;
        String s;
        synchronized(this) {
            v = this.e;
            this.e = 0L;
        }
        DraftViewModel draftViewModel0 = this.mDraftViewModel;
        EditorViewModel editorViewModel0 = this.mViewModel;
        if((v & 42L) == 0L) {
            s1 = null;
            s = null;
        }
        else {
            MutableLiveData mutableLiveData0 = draftViewModel0 == null ? null : draftViewModel0.getDraftCount();
            this.updateLiveDataRegistration(1, mutableLiveData0);
            Long long0 = mutableLiveData0 == null ? null : ((Long)mutableLiveData0.getValue());
            s = String.format(this.editorToolbarDraftCountButton.getResources().getString(string.content_desc_draft_count), long0);
            s1 = long0 == null ? null : long0.toString();
        }
        if(Long.compare(53L & v, 0L) == 0) {
            integer2 = null;
            v5 = 0;
            integer0 = null;
            charSequence0 = null;
            v4 = 0;
            v1 = 0;
            v3 = 0;
        }
        else {
            if((v & 49L) == 0L) {
                v1 = 0;
                v2 = 0;
                v3 = 0;
                integer0 = null;
                integer1 = null;
                s2 = null;
            }
            else {
                MutableLiveData mutableLiveData1 = editorViewModel0 == null ? null : editorViewModel0.getEditorMode();
                this.updateLiveDataRegistration(0, mutableLiveData1);
                EditorMode editorViewModel$EditorMode0 = mutableLiveData1 == null ? null : ((EditorMode)mutableLiveData1.getValue());
                if(editorViewModel$EditorMode0 == null) {
                    integer0 = null;
                    editorViewModel$ButtonMode0 = null;
                }
                else {
                    editorViewModel$ButtonMode0 = editorViewModel$EditorMode0.getButtonMode();
                    integer0 = editorViewModel$EditorMode0.getTitleStringId();
                }
                if(editorViewModel$ButtonMode0 == null) {
                    v1 = 0;
                    v2 = 0;
                    v3 = 0;
                    integer1 = null;
                    s2 = null;
                }
                else {
                    s2 = editorViewModel$ButtonMode0.getContentDescription();
                    v1 = editorViewModel$ButtonMode0.getTextColor();
                    v2 = editorViewModel$ButtonMode0.getButtonBackground();
                    v3 = editorViewModel$ButtonMode0.getBackButtonImage();
                    integer1 = editorViewModel$ButtonMode0.getTitleStringId();
                }
            }
            if(Long.compare(v & 52L, 0L) == 0) {
            label_59:
                integer2 = integer1;
                charSequence0 = s2;
                v5 = v2;
                v4 = 0;
            }
            else {
                MutableLiveData mutableLiveData2 = editorViewModel0 == null ? null : editorViewModel0.getDraftEnable();
                this.updateLiveDataRegistration(2, mutableLiveData2);
                boolean z = ViewDataBinding.safeUnbox((mutableLiveData2 == null ? null : ((Boolean)mutableLiveData2.getValue())));
                v |= (z ? 0x80L : 0x40L);
                if(!z) {
                    v4 = 8;
                    integer2 = integer1;
                    charSequence0 = s2;
                    v5 = v2;
                    goto label_71;
                }
                goto label_59;
            }
        }
    label_71:
        if((v & 0x20L) != 0L) {
            this.editorToolbarCompleteButton.setOnClickListener(this.c);
            this.editorToolbarDraftButton.setOnClickListener(this.d);
            this.editorToolbarDraftCountButton.setOnClickListener(this.a);
            this.editorToolbarHomeAsCloseButton.setOnClickListener(this.b);
        }
        if(Long.compare(v & 49L, 0L) != 0) {
            CommonBindingAdapter.bindBackgroundResourceId(this.editorToolbarCompleteButton, v5);
            CommonBindingAdapter.bindStringResourceId(this.editorToolbarCompleteButton, integer2);
            CommonBindingAdapter.bindTextColorResourceId(this.editorToolbarCompleteButton, v1);
            CommonBindingAdapter.bindSrcResourceId(this.editorToolbarHomeAsCloseButton, v3);
            CommonBindingAdapter.bindStringResourceId(this.editorToolbarTitle, integer0);
            this.editorToolbarHomeAsCloseButton.setContentDescription(charSequence0);
        }
        if((42L & v) != 0L) {
            this.editorToolbarDraftCountButton.setContentDescription(s);
            TextViewBindingAdapter.setText(this.editorToolbarDraftCountButton, s1);
        }
        if((v & 52L) != 0L) {
            this.editorToolbarDraftLayout.setVisibility(v4);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.e != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.e = 0x20L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        switch(v) {
            case 0: {
                MutableLiveData mutableLiveData0 = (MutableLiveData)object0;
                return this.b(v1);
            }
            case 1: {
                MutableLiveData mutableLiveData1 = (MutableLiveData)object0;
                return this.a(v1);
            }
            case 2: {
                MutableLiveData mutableLiveData2 = (MutableLiveData)object0;
                if(v1 == BR._all) {
                    synchronized(this) {
                        this.e |= 4L;
                    }
                    return true;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.kakao.tistory.presentation.databinding.ActivityEditorBinding
    public void setDraftViewModel(@Nullable DraftViewModel draftViewModel0) {
        this.mDraftViewModel = draftViewModel0;
        synchronized(this) {
            this.e |= 8L;
        }
        this.notifyPropertyChanged(BR.draftViewModel);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.draftViewModel == v) {
            this.setDraftViewModel(((DraftViewModel)object0));
            return true;
        }
        if(BR.viewModel == v) {
            this.setViewModel(((EditorViewModel)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.ActivityEditorBinding
    public void setViewModel(@Nullable EditorViewModel editorViewModel0) {
        this.mViewModel = editorViewModel0;
        synchronized(this) {
            this.e |= 16L;
        }
        this.notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
}

