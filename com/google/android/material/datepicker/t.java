package com.google.android.material.datepicker;

import android.content.res.TypedArray;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import androidx.compose.material3.nq;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import com.google.android.material.sidesheet.b;
import com.kakao.android.base.ui.recyclerview.BaseRecyclerAdapter.BaseRecyclerViewHolder;
import com.kakao.keditor.databinding.KeItemTableCellBinding;
import com.kakao.keditor.plugin.common.LinkFormDialog;
import com.kakao.keditor.plugin.itemspec.table.TableItemSpec;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckActivity;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckingDialogFragment;
import com.kakao.keditor.toolbar.KeditorToolbar;
import com.kakao.kphotopicker.picker.item.CameraItemView;
import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogAdapter.DaumCategorySelectNothingItemViewHolder;
import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogAdapter;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;
import com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment;
import com.kakao.tistory.presentation.view.editor.EditorFragment;
import com.kakao.tistory.presentation.view.editor.UploadProgressDialog;
import com.kakao.tistory.presentation.view.editor.v1;
import f8.c;
import f8.i;
import f8.q;
import kotlin.jvm.internal.Intrinsics;

public final class t implements View.OnClickListener {
    public final int a;
    public final Object b;

    public t(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = 1;
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                ((MaterialDatePicker)object0).Z.setEnabled(((MaterialDatePicker)object0).i().isSelectionComplete());
                ((MaterialDatePicker)object0).X.toggle();
                if(((MaterialDatePicker)object0).M == 1) {
                    v = 0;
                }
                ((MaterialDatePicker)object0).M = v;
                ((MaterialDatePicker)object0).m(((MaterialDatePicker)object0).X);
                ((MaterialDatePicker)object0).l();
                return;
            }
            case 1: {
                if(((b)object0).j && ((b)object0).isShowing()) {
                    if(!((b)object0).l) {
                        TypedArray typedArray0 = ((b)object0).getContext().obtainStyledAttributes(new int[]{0x101035B});
                        ((b)object0).k = typedArray0.getBoolean(0, true);
                        typedArray0.recycle();
                        ((b)object0).l = true;
                    }
                    if(((b)object0).k) {
                        ((b)object0).cancel();
                    }
                }
                return;
            }
            case 2: {
                LinkFormDialog.k(((LinkFormDialog)object0), view0);
                return;
            }
            case 3: {
                TableItemSpec.a(((KeItemTableCellBinding)object0), view0);
                return;
            }
            case 4: {
                DefaultImpls.a(((PluginSpec)object0), view0);
                return;
            }
            case 5: {
                GrammarCheckActivity.g(((GrammarCheckActivity)object0), view0);
                return;
            }
            case 6: {
                GrammarCheckingDialogFragment.i(((GrammarCheckingDialogFragment)object0), view0);
                return;
            }
            case 7: {
                KeditorToolbar.a(((KeditorToolbar)object0), view0);
                return;
            }
            case 8: {
                EditText editText0 = ((c)object0).i;
                if(editText0 != null) {
                    Editable editable0 = editText0.getText();
                    if(editable0 != null) {
                        editable0.clear();
                    }
                    ((c)object0).q();
                }
                return;
            }
            case 9: {
                ((i)object0).u();
                return;
            }
            case 10: {
                EditText editText1 = ((q)object0).f;
                if(editText1 != null) {
                    int v1 = editText1.getSelectionEnd();
                    EditText editText2 = ((q)object0).f;
                    if(editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        ((q)object0).f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    else {
                        ((q)object0).f.setTransformationMethod(null);
                    }
                    if(v1 >= 0) {
                        ((q)object0).f.setSelection(v1);
                    }
                    ((q)object0).q();
                }
                return;
            }
            case 11: {
                Intrinsics.checkNotNullParameter(((BaseRecyclerViewHolder)object0), "this$0");
                Intrinsics.checkNotNull(view0);
                ((BaseRecyclerViewHolder)object0).onItemClick(view0);
                return;
            }
            case 12: {
                DaumCategorySelectNothingItemViewHolder.a(((DaumCategoryDialogAdapter)object0), view0);
                return;
            }
            case 13: {
                ReportDialogFragment.a(((ReportDialogFragment)object0), view0);
                return;
            }
            case 14: {
                Intrinsics.checkNotNullParameter(((nq)object0), "$clickListener");
                ((nq)object0).invoke();
                return;
            }
            case 15: {
                EntryPasswordDialogFragment.a(((EntryPasswordDialogFragment)object0), view0);
                return;
            }
            case 16: {
                UploadProgressDialog.a(((UploadProgressDialog)object0), view0);
                return;
            }
            case 17: {
                v1.a(((EditorFragment)object0), view0);
                return;
            }
            case 18: {
                Intrinsics.checkNotNullParameter(((NavDirections)object0), "$directions");
                Intrinsics.checkNotNullExpressionValue(view0, "view");
                Navigation.findNavController(view0).navigate(((NavDirections)object0));
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(((CameraItemView)object0), "this$0");
                Integer integer0 = view0.getId();
                ((CameraItemView)object0).c.onNext(integer0);
            }
        }
    }
}

