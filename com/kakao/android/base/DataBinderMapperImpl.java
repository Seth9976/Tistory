package com.kakao.android.base;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import b9.a;
import com.kakao.android.base.databinding.FragmentBaseBottomRecyclerDialogBindingImpl;
import com.kakao.android.base.databinding.FragmentRecyclerViewBindingImpl;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray(2);
        DataBinderMapperImpl.b = sparseIntArray0;
        sparseIntArray0.put(layout.fragment_base_bottom_recycler_dialog, 1);
        sparseIntArray0.put(layout.fragment_recycler_view, 2);
    }

    @Override  // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        List list0 = new ArrayList(1);
        ((ArrayList)list0).add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return list0;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int v) {
        return (String)a.a.get(v);
    }

    @Override  // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent0, View view0, int v) {
        int v1 = DataBinderMapperImpl.b.get(v);
        if(v1 > 0) {
            Object object0 = view0.getTag();
            if(object0 != null) {
                switch(v1) {
                    case 1: {
                        if(!"layout/fragment_base_bottom_recycler_dialog_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for fragment_base_bottom_recycler_dialog is invalid. Received: " + object0);
                        }
                        return new FragmentBaseBottomRecyclerDialogBindingImpl(dataBindingComponent0, view0);
                    }
                    case 2: {
                        if(!"layout/fragment_recycler_view_0".equals(object0)) {
                            throw new IllegalArgumentException("The tag for fragment_recycler_view is invalid. Received: " + object0);
                        }
                        return new FragmentRecyclerViewBindingImpl(dataBindingComponent0, view0);
                    }
                    default: {
                        return null;
                    }
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent0, View[] arr_view, int v) {
        if(arr_view != null && arr_view.length != 0 && DataBinderMapperImpl.b.get(v) > 0 && arr_view[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public int getLayoutId(String s) {
        if(s == null) {
            return 0;
        }
        Integer integer0 = (Integer)com.kakao.android.base.a.a.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }
}

