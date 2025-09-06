package com.kakao.kemoticon;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import ib.a;
import ib.b;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray b;

    static {
        DataBinderMapperImpl.b = new SparseIntArray(0);
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
        if(DataBinderMapperImpl.b.get(v) > 0 && view0.getTag() == null) {
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
        Integer integer0 = (Integer)b.a.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }
}

