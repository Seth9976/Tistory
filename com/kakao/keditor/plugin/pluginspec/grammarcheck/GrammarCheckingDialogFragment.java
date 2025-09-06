package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.datepicker.t;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0016J&\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\f2\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckingDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GrammarCheckingDialogFragment extends DialogFragment {
    public static void i(GrammarCheckingDialogFragment grammarCheckingDialogFragment0, View view0) {
        GrammarCheckingDialogFragment.onCreateView$lambda$0(grammarCheckingDialogFragment0, view0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(1, style.KeditorDialog);
    }

    @Override  // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        View view0 = layoutInflater0.inflate(layout.ke_dialog_grammar_checking, viewGroup0, false);
        view0.findViewById(id.ke_dialog_outside_click_area).setOnClickListener(new t(this, 6));
        return view0;
    }

    private static final void onCreateView$lambda$0(GrammarCheckingDialogFragment grammarCheckingDialogFragment0, View view0) {
        Intrinsics.checkNotNullParameter(grammarCheckingDialogFragment0, "this$0");
        Dialog dialog0 = grammarCheckingDialogFragment0.getDialog();
        if(dialog0 != null) {
            dialog0.dismiss();
        }
    }
}

