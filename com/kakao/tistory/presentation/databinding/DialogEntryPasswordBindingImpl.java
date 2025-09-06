package com.kakao.tistory.presentation.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;
import com.kakao.tistory.presentation.generated.callback.OnClickListener.Listener;
import com.kakao.tistory.presentation.generated.callback.OnClickListener;
import com.kakao.tistory.presentation.viewmodel.ProtectedEntryDialogViewModel;

public class DialogEntryPasswordBindingImpl extends DialogEntryPasswordBinding implements Listener {
    public final OnClickListener a;
    public final OnClickListener b;
    public final a c;
    public long d;
    public static final SparseIntArray e;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        DialogEntryPasswordBindingImpl.e = sparseIntArray0;
        sparseIntArray0.put(id.common_protected_entry_dialog_button_container, 6);
        sparseIntArray0.put(id.common_protected_entry_dialog_divider, 7);
    }

    public DialogEntryPasswordBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 8, null, DialogEntryPasswordBindingImpl.e);
        super(dataBindingComponent0, view0, 3, ((ConstraintLayout)arr_object[6]), ((View)arr_object[7]), ((TextInputEditText)arr_object[3]), ((TextInputLayout)arr_object[2]), ((AppCompatButton)arr_object[4]), ((AppCompatButton)arr_object[5]), ((TextView)arr_object[1]));
        this.c = new a(this);
        this.d = -1L;
        this.commonProtectedEntryDialogEditText.setTag(null);
        this.commonProtectedEntryDialogInputLayout.setTag(null);
        this.commonProtectedEntryDialogLeftButton.setTag(null);
        this.commonProtectedEntryDialogRightButton.setTag(null);
        this.commonProtectedEntryDialogTitleText.setTag(null);
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.a = new OnClickListener(this, 2);
        this.b = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.tistory.presentation.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                ProtectedEntryDialogViewModel protectedEntryDialogViewModel0 = this.mViewModel;
                if(protectedEntryDialogViewModel0 != null) {
                    protectedEntryDialogViewModel0.onClickCancel();
                    return;
                }
                break;
            }
            case 2: {
                ProtectedEntryDialogViewModel protectedEntryDialogViewModel1 = this.mViewModel;
                if(protectedEntryDialogViewModel1 != null) {
                    protectedEntryDialogViewModel1.onClickOK();
                    return;
                }
                break;
            }
        }
    }

    public final boolean a(int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.d |= 1L;
            }
            return true;
        }
        return false;
    }

    public final boolean b(int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.d |= 2L;
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        boolean z3;
        float f5;
        float f4;
        CharSequence charSequence0;
        String s1;
        float f3;
        float f2;
        int v4;
        Resources resources3;
        int v3;
        Resources resources2;
        float f;
        int v2;
        Resources resources1;
        String s;
        int v1;
        Resources resources0;
        boolean z;
        synchronized(this) {
            v = this.d;
            this.d = 0L;
        }
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel0 = this.mViewModel;
        if(Long.compare(0x1FL & v, 0L) == 0) {
            charSequence0 = null;
            s = null;
            s1 = null;
            z = false;
            f2 = 0.0f;
            f5 = 0.0f;
            f4 = 0.0f;
            z3 = false;
        }
        else {
            if((v & 25L) == 0L) {
                z = false;
            }
            else {
                MutableLiveData mutableLiveData0 = protectedEntryDialogViewModel0 == null ? null : protectedEntryDialogViewModel0.getErrorEnabled();
                this.updateLiveDataRegistration(0, mutableLiveData0);
                z = ViewDataBinding.safeUnbox((mutableLiveData0 == null ? null : ((Boolean)mutableLiveData0.getValue())));
            }
            if(Long.compare(v & 26L, 0L) == 0) {
                s = null;
                f2 = 0.0f;
                f = 0.0f;
                f3 = 0.0f;
            }
            else {
                MutableLiveData mutableLiveData1 = protectedEntryDialogViewModel0 == null ? null : protectedEntryDialogViewModel0.isCreateMode();
                this.updateLiveDataRegistration(1, mutableLiveData1);
                boolean z1 = ViewDataBinding.safeUnbox((mutableLiveData1 == null ? null : ((Boolean)mutableLiveData1.getValue())));
                v |= (z1 ? 5440L : 0xAA0L);
                if(z1) {
                    resources0 = this.commonProtectedEntryDialogTitleText.getResources();
                    v1 = string.font_pretended_regular;
                }
                else {
                    resources0 = this.commonProtectedEntryDialogTitleText.getResources();
                    v1 = string.font_pretended_light;
                }
                s = resources0.getString(v1);
                if(z1) {
                    resources1 = this.commonProtectedEntryDialogTitleText.getResources();
                    v2 = dimen.entry_create_password_title_size;
                }
                else {
                    resources1 = this.commonProtectedEntryDialogTitleText.getResources();
                    v2 = dimen.entry_check_password_title_size;
                }
                f = resources1.getDimension(v2);
                if(z1) {
                    resources2 = this.commonProtectedEntryDialogTitleText.getResources();
                    v3 = dimen.entry_create_password_title_bottom_padding;
                }
                else {
                    resources2 = this.commonProtectedEntryDialogTitleText.getResources();
                    v3 = dimen.entry_check_password_title_bottom_padding;
                }
                float f1 = resources2.getDimension(v3);
                if(z1) {
                    resources3 = this.commonProtectedEntryDialogTitleText.getResources();
                    v4 = dimen.entry_create_password_title_top_padding;
                }
                else {
                    resources3 = this.commonProtectedEntryDialogTitleText.getResources();
                    v4 = dimen.entry_check_password_title_top_padding;
                }
                f2 = resources3.getDimension(v4);
                f3 = f1;
            }
            s1 = (v & 24L) == 0L || protectedEntryDialogViewModel0 == null ? null : protectedEntryDialogViewModel0.getTitle();
            if(Long.compare(v & 28L, 0L) == 0) {
                charSequence0 = null;
                f4 = f;
                f5 = f3;
                z3 = false;
            }
            else {
                MutableLiveData mutableLiveData2 = protectedEntryDialogViewModel0 == null ? null : protectedEntryDialogViewModel0.getPassword();
                this.updateLiveDataRegistration(2, mutableLiveData2);
                charSequence0 = mutableLiveData2 == null ? null : ((String)mutableLiveData2.getValue());
                String s2 = charSequence0 == null ? null : ((String)charSequence0).trim();
                boolean z2 = (s2 == null ? 0 : s2.length()) > 0;
                v |= (z2 ? 0x4000L : 0x2000L);
                f4 = f;
                f5 = f3;
                z3 = z2;
            }
        }
        if((v & 28L) != 0L) {
            TextViewBindingAdapter.setText(this.commonProtectedEntryDialogEditText, charSequence0);
            this.commonProtectedEntryDialogRightButton.setEnabled(z3);
        }
        if((16L & v) != 0L) {
            TextViewBindingAdapter.setTextWatcher(this.commonProtectedEntryDialogEditText, null, null, null, this.c);
            this.commonProtectedEntryDialogLeftButton.setOnClickListener(this.b);
            this.commonProtectedEntryDialogRightButton.setOnClickListener(this.a);
        }
        if((25L & v) != 0L) {
            this.commonProtectedEntryDialogInputLayout.setErrorEnabled(z);
        }
        if((26L & v) != 0L) {
            ViewBindingAdapter.setPaddingTop(this.commonProtectedEntryDialogTitleText, f2);
            ViewBindingAdapter.setPaddingBottom(this.commonProtectedEntryDialogTitleText, f5);
            TextViewBindingAdapter.setTextSize(this.commonProtectedEntryDialogTitleText, f4);
            CommonBindingAdapter.bindFontName(this.commonProtectedEntryDialogTitleText, s);
        }
        if((v & 24L) != 0L) {
            TextViewBindingAdapter.setText(this.commonProtectedEntryDialogTitleText, s1);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.d != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.d = 16L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        switch(v) {
            case 0: {
                MutableLiveData mutableLiveData0 = (MutableLiveData)object0;
                return this.a(v1);
            }
            case 1: {
                MutableLiveData mutableLiveData1 = (MutableLiveData)object0;
                return this.b(v1);
            }
            case 2: {
                MutableLiveData mutableLiveData2 = (MutableLiveData)object0;
                if(v1 == BR._all) {
                    synchronized(this) {
                        this.d |= 4L;
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

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.viewModel == v) {
            this.setViewModel(((ProtectedEntryDialogViewModel)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.DialogEntryPasswordBinding
    public void setViewModel(@Nullable ProtectedEntryDialogViewModel protectedEntryDialogViewModel0) {
        this.mViewModel = protectedEntryDialogViewModel0;
        synchronized(this) {
            this.d |= 8L;
        }
        this.notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
}

