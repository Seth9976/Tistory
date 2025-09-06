package com.kakao.tistory.presentation;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.databinding.ActivityAccountMigrationBindingImpl;
import com.kakao.tistory.presentation.databinding.ActivityCommonWebViewBindingImpl;
import com.kakao.tistory.presentation.databinding.ActivityEditorBindingImpl;
import com.kakao.tistory.presentation.databinding.ActivityFragmentContainerBindingImpl;
import com.kakao.tistory.presentation.databinding.ActivityTistoryToolbarBindingImpl;
import com.kakao.tistory.presentation.databinding.ComposeContainerBindingImpl;
import com.kakao.tistory.presentation.databinding.DialogCommonBindingImpl;
import com.kakao.tistory.presentation.databinding.DialogCommonDatePickerBindingImpl;
import com.kakao.tistory.presentation.databinding.DialogCommonTimePickerBindingImpl;
import com.kakao.tistory.presentation.databinding.DialogEntryPasswordBindingImpl;
import com.kakao.tistory.presentation.databinding.FragmentBottomSheetBlogCategoryBindingImpl;
import com.kakao.tistory.presentation.databinding.FragmentBottomSheetReportBindingImpl;
import com.kakao.tistory.presentation.databinding.FragmentEditorBindingImpl;
import com.kakao.tistory.presentation.databinding.ItemAccessibilityBottomDialogBindingImpl;
import com.kakao.tistory.presentation.databinding.ItemCommonBottomDialogBindingImpl;
import com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogChildBindingImpl;
import com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogSelectNothingBindingImpl;
import com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogSubjectBindingImpl;
import com.kakao.tistory.presentation.databinding.ItemToastBindingImpl;
import com.kakao.tistory.presentation.databinding.LayoutEditorTitleBindingImpl;
import com.kakao.tistory.presentation.databinding.LayoutTistoryToolbarBindingImpl;
import com.kakao.tistory.presentation.databinding.ViewCommonExceptionBindingImpl;
import com.kakao.tistory.presentation.databinding.WidgetTimeBindingImpl;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray(23);
        DataBinderMapperImpl.a = sparseIntArray0;
        sparseIntArray0.put(layout.activity_account_migration, 1);
        sparseIntArray0.put(layout.activity_common_web_view, 2);
        sparseIntArray0.put(layout.activity_editor, 3);
        sparseIntArray0.put(layout.activity_fragment_container, 4);
        sparseIntArray0.put(layout.activity_tistory_toolbar, 5);
        sparseIntArray0.put(layout.compose_container, 6);
        sparseIntArray0.put(layout.dialog_common, 7);
        sparseIntArray0.put(layout.dialog_common_date_picker, 8);
        sparseIntArray0.put(layout.dialog_common_time_picker, 9);
        sparseIntArray0.put(layout.dialog_entry_password, 10);
        sparseIntArray0.put(layout.fragment_bottom_sheet_blog_category, 11);
        sparseIntArray0.put(layout.fragment_bottom_sheet_report, 12);
        sparseIntArray0.put(layout.fragment_editor, 13);
        sparseIntArray0.put(layout.item_accessibility_bottom_dialog, 14);
        sparseIntArray0.put(layout.item_common_bottom_dialog, 15);
        sparseIntArray0.put(layout.item_daum_category_dialog_child, 16);
        sparseIntArray0.put(layout.item_daum_category_dialog_select_nothing, 17);
        sparseIntArray0.put(layout.item_daum_category_dialog_subject, 18);
        sparseIntArray0.put(layout.item_toast, 19);
        sparseIntArray0.put(layout.layout_editor_title, 20);
        sparseIntArray0.put(layout.layout_tistory_toolbar, 21);
        sparseIntArray0.put(layout.view_common_exception, 22);
        sparseIntArray0.put(layout.widget_time, 23);
    }

    @Override  // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        List list0 = new ArrayList(4);
        ((ArrayList)list0).add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        ((ArrayList)list0).add(new com.kakao.android.base.DataBinderMapperImpl());
        ((ArrayList)list0).add(new com.kakao.keditor.DataBinderMapperImpl());
        ((ArrayList)list0).add(new com.kakao.kemoticon.DataBinderMapperImpl());
        return list0;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int v) {
        return (String)f.a.get(v);
    }

    @Override  // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent0, View view0, int v) {
        int v1 = DataBinderMapperImpl.a.get(v);
        if(v1 > 0) {
            Object object0 = view0.getTag();
            if(object0 != null) {
                switch(v1) {
                    case 1: {
                        if(!"layout/activity_account_migration_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for activity_account_migration is invalid. Received: ", object0));
                        }
                        return new ActivityAccountMigrationBindingImpl(dataBindingComponent0, view0);
                    }
                    case 2: {
                        if(!"layout/activity_common_web_view_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for activity_common_web_view is invalid. Received: ", object0));
                        }
                        return new ActivityCommonWebViewBindingImpl(dataBindingComponent0, view0);
                    }
                    case 3: {
                        if(!"layout/activity_editor_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for activity_editor is invalid. Received: ", object0));
                        }
                        return new ActivityEditorBindingImpl(dataBindingComponent0, view0);
                    }
                    case 4: {
                        if(!"layout/activity_fragment_container_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for activity_fragment_container is invalid. Received: ", object0));
                        }
                        return new ActivityFragmentContainerBindingImpl(dataBindingComponent0, view0);
                    }
                    case 5: {
                        if(!"layout/activity_tistory_toolbar_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for activity_tistory_toolbar is invalid. Received: ", object0));
                        }
                        return new ActivityTistoryToolbarBindingImpl(dataBindingComponent0, view0);
                    }
                    case 6: {
                        if(!"layout/compose_container_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for compose_container is invalid. Received: ", object0));
                        }
                        return new ComposeContainerBindingImpl(dataBindingComponent0, view0);
                    }
                    case 7: {
                        if(!"layout/dialog_common_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for dialog_common is invalid. Received: ", object0));
                        }
                        return new DialogCommonBindingImpl(dataBindingComponent0, view0);
                    }
                    case 8: {
                        if(!"layout/dialog_common_date_picker_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for dialog_common_date_picker is invalid. Received: ", object0));
                        }
                        return new DialogCommonDatePickerBindingImpl(dataBindingComponent0, view0);
                    }
                    case 9: {
                        if(!"layout/dialog_common_time_picker_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for dialog_common_time_picker is invalid. Received: ", object0));
                        }
                        return new DialogCommonTimePickerBindingImpl(dataBindingComponent0, view0);
                    }
                    case 10: {
                        if(!"layout/dialog_entry_password_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for dialog_entry_password is invalid. Received: ", object0));
                        }
                        return new DialogEntryPasswordBindingImpl(dataBindingComponent0, view0);
                    }
                    case 11: {
                        if(!"layout/fragment_bottom_sheet_blog_category_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for fragment_bottom_sheet_blog_category is invalid. Received: ", object0));
                        }
                        return new FragmentBottomSheetBlogCategoryBindingImpl(dataBindingComponent0, view0);
                    }
                    case 12: {
                        if(!"layout/fragment_bottom_sheet_report_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for fragment_bottom_sheet_report is invalid. Received: ", object0));
                        }
                        return new FragmentBottomSheetReportBindingImpl(dataBindingComponent0, view0);
                    }
                    case 13: {
                        if(!"layout/fragment_editor_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for fragment_editor is invalid. Received: ", object0));
                        }
                        return new FragmentEditorBindingImpl(dataBindingComponent0, view0);
                    }
                    case 14: {
                        if(!"layout/item_accessibility_bottom_dialog_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for item_accessibility_bottom_dialog is invalid. Received: ", object0));
                        }
                        return new ItemAccessibilityBottomDialogBindingImpl(dataBindingComponent0, view0);
                    }
                    case 15: {
                        if(!"layout/item_common_bottom_dialog_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for item_common_bottom_dialog is invalid. Received: ", object0));
                        }
                        return new ItemCommonBottomDialogBindingImpl(dataBindingComponent0, view0);
                    }
                    case 16: {
                        if(!"layout/item_daum_category_dialog_child_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for item_daum_category_dialog_child is invalid. Received: ", object0));
                        }
                        return new ItemDaumCategoryDialogChildBindingImpl(dataBindingComponent0, view0);
                    }
                    case 17: {
                        if(!"layout/item_daum_category_dialog_select_nothing_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for item_daum_category_dialog_select_nothing is invalid. Received: ", object0));
                        }
                        return new ItemDaumCategoryDialogSelectNothingBindingImpl(dataBindingComponent0, view0);
                    }
                    case 18: {
                        if(!"layout/item_daum_category_dialog_subject_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for item_daum_category_dialog_subject is invalid. Received: ", object0));
                        }
                        return new ItemDaumCategoryDialogSubjectBindingImpl(dataBindingComponent0, view0);
                    }
                    case 19: {
                        if(!"layout/item_toast_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for item_toast is invalid. Received: ", object0));
                        }
                        return new ItemToastBindingImpl(dataBindingComponent0, view0);
                    }
                    case 20: {
                        if(!"layout/layout_editor_title_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for layout_editor_title is invalid. Received: ", object0));
                        }
                        return new LayoutEditorTitleBindingImpl(dataBindingComponent0, view0);
                    }
                    case 21: {
                        if(!"layout/layout_tistory_toolbar_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for layout_tistory_toolbar is invalid. Received: ", object0));
                        }
                        return new LayoutTistoryToolbarBindingImpl(dataBindingComponent0, view0);
                    }
                    case 22: {
                        if(!"layout/view_common_exception_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for view_common_exception is invalid. Received: ", object0));
                        }
                        return new ViewCommonExceptionBindingImpl(dataBindingComponent0, view0);
                    }
                    case 23: {
                        if(!"layout/widget_time_0".equals(object0)) {
                            throw new IllegalArgumentException(e.a("The tag for widget_time is invalid. Received: ", object0));
                        }
                        return new WidgetTimeBindingImpl(dataBindingComponent0, view0);
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
        if(arr_view != null && arr_view.length != 0 && DataBinderMapperImpl.a.get(v) > 0 && arr_view[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public int getLayoutId(String s) {
        if(s == null) {
            return 0;
        }
        Integer integer0 = (Integer)g.a.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }
}

