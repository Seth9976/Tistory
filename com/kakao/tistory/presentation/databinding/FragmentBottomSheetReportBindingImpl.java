package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.generated.callback.OnClickListener.Listener;
import com.kakao.tistory.presentation.generated.callback.OnClickListener;
import com.kakao.tistory.presentation.viewmodel.ReportViewModel;

public class FragmentBottomSheetReportBindingImpl extends FragmentBottomSheetReportBinding implements Listener {
    public final OnClickListener a;
    public final OnClickListener b;
    public final b c;
    public long d;
    public static final SparseIntArray e;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        FragmentBottomSheetReportBindingImpl.e = sparseIntArray0;
        sparseIntArray0.put(id.bottom_sheet_report_title_text, 5);
        sparseIntArray0.put(id.bottom_sheet_report_image_button_1, 6);
        sparseIntArray0.put(id.bottom_sheet_report_text_1, 7);
        sparseIntArray0.put(id.bottom_sheet_report_image_button_2, 8);
        sparseIntArray0.put(id.bottom_sheet_report_text_2, 9);
        sparseIntArray0.put(id.bottom_sheet_report_image_button_3, 10);
        sparseIntArray0.put(id.bottom_sheet_report_text_3, 11);
        sparseIntArray0.put(id.bottom_sheet_report_image_button_4, 12);
        sparseIntArray0.put(id.bottom_sheet_report_text_4, 13);
        sparseIntArray0.put(id.bottom_sheet_report_image_button_5, 14);
        sparseIntArray0.put(id.bottom_sheet_report_text_5, 15);
        sparseIntArray0.put(id.bottom_sheet_report_image_button_6, 16);
        sparseIntArray0.put(id.bottom_sheet_report_text_6, 17);
        sparseIntArray0.put(id.bottom_sheet_report_image_button_7, 18);
        sparseIntArray0.put(id.bottom_sheet_report_text_7, 19);
        sparseIntArray0.put(id.bottom_sheet_report_image_button_8, 20);
        sparseIntArray0.put(id.bottom_sheet_report_text_8, 21);
        sparseIntArray0.put(id.bottom_sheet_report_etc_container, 22);
        sparseIntArray0.put(id.bottom_sheet_report_description_text, 23);
    }

    public FragmentBottomSheetReportBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 24, null, FragmentBottomSheetReportBindingImpl.e);
        super(dataBindingComponent0, view0, 4, ((AppCompatButton)arr_object[4]), ((TextView)arr_object[23]), ((ConstraintLayout)arr_object[22]), ((EditText)arr_object[1]), ((ImageButton)arr_object[6]), ((ImageButton)arr_object[8]), ((ImageButton)arr_object[10]), ((ImageButton)arr_object[12]), ((ImageButton)arr_object[14]), ((ImageButton)arr_object[16]), ((ImageButton)arr_object[18]), ((ImageButton)arr_object[20]), ((TextView)arr_object[2]), ((TextView)arr_object[7]), ((TextView)arr_object[9]), ((TextView)arr_object[11]), ((TextView)arr_object[13]), ((TextView)arr_object[15]), ((TextView)arr_object[17]), ((TextView)arr_object[19]), ((TextView)arr_object[21]), ((TextView)arr_object[5]), ((TextView)arr_object[3]));
        this.c = new b(this);
        this.d = -1L;
        this.bottomSheetReportButton.setTag(null);
        this.bottomSheetReportEtcEditText.setTag(null);
        this.bottomSheetReportLengthText.setTag(null);
        this.bottomSheetReportUsurpation.setTag(null);
        ((LinearLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.a = new OnClickListener(this, 2);
        this.b = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.tistory.presentation.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                ReportViewModel reportViewModel0 = this.mViewModel;
                if(reportViewModel0 != null) {
                    reportViewModel0.onClickUsurpation();
                    return;
                }
                break;
            }
            case 2: {
                ReportViewModel reportViewModel1 = this.mViewModel;
                if(reportViewModel1 != null) {
                    reportViewModel1.onClickReport();
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
                this.d |= 4L;
            }
            return true;
        }
        return false;
    }

    public final boolean c(int v) {
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
        boolean z1;
        int v1;
        CharSequence charSequence0;
        MutableLiveData mutableLiveData1;
        MutableLiveData mutableLiveData0;
        String s;
        synchronized(this) {
            v = this.d;
            this.d = 0L;
        }
        ReportViewModel reportViewModel0 = this.mViewModel;
        if(Long.compare(0x3FL & v, 0L) == 0) {
            s = null;
            charSequence0 = null;
            v1 = 0;
            z1 = false;
        }
        else {
            s = (v & 0x30L) == 0L || reportViewModel0 == null ? null : reportViewModel0.getReportMessage();
            if((v & 57L) == 0L) {
                charSequence0 = null;
            }
            else {
                if(reportViewModel0 == null) {
                    mutableLiveData0 = null;
                    mutableLiveData1 = null;
                }
                else {
                    mutableLiveData0 = reportViewModel0.getEtcMessageMaxLength();
                    mutableLiveData1 = reportViewModel0.getEtcMessageLength();
                }
                this.updateLiveDataRegistration(0, mutableLiveData0);
                this.updateLiveDataRegistration(3, mutableLiveData1);
                Integer integer0 = mutableLiveData0 == null ? null : ((Integer)mutableLiveData0.getValue());
                Integer integer1 = mutableLiveData1 == null ? null : ((Integer)mutableLiveData1.getValue());
                charSequence0 = String.format(this.bottomSheetReportLengthText.getResources().getString(string.label_entry_view_report_etc_text_length), integer1, integer0);
            }
            if(Long.compare(v & 50L, 0L) == 0) {
                v1 = 0;
            }
            else {
                LiveData liveData0 = reportViewModel0 == null ? null : reportViewModel0.getTextCountEnable();
                this.updateLiveDataRegistration(1, liveData0);
                boolean z = ViewDataBinding.safeUnbox((liveData0 == null ? null : ((Boolean)liveData0.getValue())));
                v |= (z ? 0x80L : 0x40L);
                v1 = z ? 0 : 8;
            }
            if((v & 52L) == 0L) {
                z1 = false;
            }
            else {
                LiveData liveData1 = reportViewModel0 == null ? null : reportViewModel0.getReportButtonEnabled();
                this.updateLiveDataRegistration(2, liveData1);
                z1 = ViewDataBinding.safeUnbox((liveData1 == null ? null : ((Boolean)liveData1.getValue())));
            }
        }
        if((v & 52L) != 0L) {
            this.bottomSheetReportButton.setEnabled(z1);
        }
        if((0x20L & v) != 0L) {
            this.bottomSheetReportButton.setOnClickListener(this.a);
            TextViewBindingAdapter.setTextWatcher(this.bottomSheetReportEtcEditText, null, null, null, this.c);
            this.bottomSheetReportUsurpation.setOnClickListener(this.b);
        }
        if((v & 0x30L) != 0L) {
            TextViewBindingAdapter.setText(this.bottomSheetReportEtcEditText, s);
        }
        if((57L & v) != 0L) {
            TextViewBindingAdapter.setText(this.bottomSheetReportLengthText, charSequence0);
        }
        if((v & 50L) != 0L) {
            this.bottomSheetReportLengthText.setVisibility(v1);
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
            this.d = 0x20L;
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
                LiveData liveData0 = (LiveData)object0;
                return this.c(v1);
            }
            case 2: {
                LiveData liveData1 = (LiveData)object0;
                return this.b(v1);
            }
            case 3: {
                MutableLiveData mutableLiveData1 = (MutableLiveData)object0;
                if(v1 == BR._all) {
                    synchronized(this) {
                        this.d |= 8L;
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
            this.setViewModel(((ReportViewModel)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.FragmentBottomSheetReportBinding
    public void setViewModel(@Nullable ReportViewModel reportViewModel0) {
        this.mViewModel = reportViewModel0;
        synchronized(this) {
            this.d |= 16L;
        }
        this.notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
}

