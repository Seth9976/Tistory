package com.kakao.tistory.presentation.view.editor;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u00072\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000F\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u00072\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"com/kakao/tistory/presentation/view/editor/EditorFragment$initView$1$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorFragment.kt\ncom/kakao/tistory/presentation/view/editor/EditorFragment$initView$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
public final class EditorFragment.initView.1.1 implements TextWatcher {
    public final EditText a;
    public final EditorFragment b;

    public EditorFragment.initView.1.1(EditText editText0, EditorFragment editorFragment0) {
        this.a = editText0;
        this.b = editorFragment0;
        super();
    }

    @Override  // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable0) {
        if(editable0 != null) {
            if(editable0.length() <= 80) {
                editable0 = null;
            }
            if(editable0 != null) {
                editable0.delete(80, editable0.length());
                Context context0 = this.a.getContext();
                String s = this.b.getString(string.label_editor_title_exceed_80_length);
                Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                ToastUtils.show$default(ToastUtils.INSTANCE, context0, s, 0, 0, 12, null);
            }
        }
    }

    @Override  // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
    }
}

