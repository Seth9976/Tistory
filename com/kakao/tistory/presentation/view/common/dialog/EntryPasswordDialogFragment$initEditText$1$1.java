package com.kakao.tistory.presentation.view.common.dialog;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import com.kakao.tistory.presentation.viewmodel.ProtectedEntryDialogViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001A\u00020\b2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001A\u00020\b2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000E\u001A\u00020\b2\b\u0010\u0003\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"com/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment$initEditText$1$1", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryPasswordDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryPasswordDialogFragment.kt\ncom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment$initEditText$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public final class EntryPasswordDialogFragment.initEditText.1.1 implements TextWatcher {
    public final EntryPasswordDialogFragment a;
    public final TextInputEditText b;

    public EntryPasswordDialogFragment.initEditText.1.1(EntryPasswordDialogFragment entryPasswordDialogFragment0, TextInputEditText textInputEditText0) {
        this.a = entryPasswordDialogFragment0;
        this.b = textInputEditText0;
        super();
    }

    @Override  // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable0) {
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel0 = null;
        if(editable0 != null && (editable0.length() <= this.a.g ? null : editable0) != null) {
            editable0.delete(this.a.g, editable0.length());
            Context context0 = this.b.getContext();
            String s = this.a.getString(string.label_editor_password_exceed_80_length);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            ToastUtils.show$default(ToastUtils.INSTANCE, context0, s, 0, 0, 12, null);
        }
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel1 = this.a.q;
        if(protectedEntryDialogViewModel1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        else {
            protectedEntryDialogViewModel0 = protectedEntryDialogViewModel1;
        }
        protectedEntryDialogViewModel0.afterTextChanged();
    }

    @Override  // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel0 = EntryPasswordDialogFragment.access$getViewModel$p(this.a);
        if(protectedEntryDialogViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            protectedEntryDialogViewModel0 = null;
        }
        protectedEntryDialogViewModel0.onTextChanged();
    }
}

