package com.kakao.tistory.presentation.view.common.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.q;
import com.google.android.material.datepicker.t;
import com.google.android.material.textfield.TextInputEditText;
import com.kakao.android.base.utils.UiUtils;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.R.style;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.databinding.DialogEntryPasswordBinding;
import com.kakao.tistory.presentation.viewmodel.ProtectedEntryCheckViewModel;
import com.kakao.tistory.presentation.viewmodel.ProtectedEntryCreateViewModel;
import com.kakao.tistory.presentation.viewmodel.ProtectedEntryDialogViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kc.d;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000B\u001A\u00020\n2\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000B\u0010\fJ-\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u000E\u001A\u00020\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u00112\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004R*\u0010 \u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u00188\u0014@VX\u0094\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR(\u0010(\u001A\b\u0012\u0004\u0012\u00020\u00070!8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R=\u00104\u001A\u001D\u0012\u0013\u0012\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00070)8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment;", "Lcom/kakao/android/base/ui/BaseDialogFragment;", "Lcom/kakao/tistory/presentation/databinding/DialogEntryPasswordBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "<set-?>", "f", "I", "getLayoutResourceId", "()I", "setLayoutResourceId", "(I)V", "layoutResourceId", "Lkotlin/Function0;", "o", "Lkotlin/jvm/functions/Function0;", "getOnClickCancelCallback", "()Lkotlin/jvm/functions/Function0;", "setOnClickCancelCallback", "(Lkotlin/jvm/functions/Function0;)V", "onClickCancelCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "password", "p", "Lkotlin/jvm/functions/Function1;", "getOnClickOkCallback", "()Lkotlin/jvm/functions/Function1;", "setOnClickOkCallback", "(Lkotlin/jvm/functions/Function1;)V", "onClickOkCallback", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryPasswordDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryPasswordDialogFragment.kt\ncom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,221:1\n14#2,4:222\n14#2,4:242\n1#3:226\n1#3:246\n1#3:262\n106#4,15:227\n106#4,15:247\n*S KotlinDebug\n*F\n+ 1 EntryPasswordDialogFragment.kt\ncom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment\n*L\n62#1:222,4\n63#1:242,4\n62#1:226\n63#1:246\n62#1:227,15\n63#1:247,15\n*E\n"})
public final class EntryPasswordDialogFragment extends Hilt_EntryPasswordDialogFragment {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0005\u0010\nJ\u001D\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\fR\u0014\u0010\r\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u000ER\u0014\u0010\u0010\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000ER\u0014\u0010\u0011\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000E¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment$Companion;", "", "", "password", "Lcom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment;", "newInstance", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment;", "blogName", "", "entryId", "(Ljava/lang/String;J)Lcom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment;", "slogan", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/view/common/dialog/EntryPasswordDialogFragment;", "BUNDLE_BLOG_NAME", "Ljava/lang/String;", "BUNDLE_ENTRY_ID", "BUNDLE_ENTRY_PASSWORD", "BUNDLE_ENTRY_SLOGAN", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final EntryPasswordDialogFragment newInstance(@Nullable String s) {
            EntryPasswordDialogFragment entryPasswordDialogFragment0 = new EntryPasswordDialogFragment();
            Bundle bundle0 = new Bundle();
            if(s != null) {
                bundle0.putString("BUNDLE_PROTECTED_ENTRY_PASSWORD", s);
            }
            entryPasswordDialogFragment0.setArguments(bundle0);
            return entryPasswordDialogFragment0;
        }

        @NotNull
        public final EntryPasswordDialogFragment newInstance(@NotNull String s, long v) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            EntryPasswordDialogFragment entryPasswordDialogFragment0 = new EntryPasswordDialogFragment();
            Bundle bundle0 = new Bundle();
            bundle0.putString("BUNDLE_PROTECTED_ENTRY_BLOG_NAME", s);
            bundle0.putLong("BUNDLE_PROTECTED_ENTRY_ID", v);
            entryPasswordDialogFragment0.setArguments(bundle0);
            return entryPasswordDialogFragment0;
        }

        @NotNull
        public final EntryPasswordDialogFragment newInstance(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "slogan");
            EntryPasswordDialogFragment entryPasswordDialogFragment0 = new EntryPasswordDialogFragment();
            Bundle bundle0 = new Bundle();
            bundle0.putString("BUNDLE_PROTECTED_ENTRY_BLOG_NAME", s);
            bundle0.putString("BUNDLE_PROTECTED_ENTRY_SLOGAN", s1);
            entryPasswordDialogFragment0.setArguments(bundle0);
            return entryPasswordDialogFragment0;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public int f;
    public final int g;
    public final BaseViewModelLazy h;
    public final BaseViewModelLazy i;
    public String j;
    public long k;
    public String l;
    public String m;
    public boolean n;
    public Function0 o;
    public Function1 p;
    public ProtectedEntryDialogViewModel q;

    static {
        EntryPasswordDialogFragment.Companion = new Companion(null);
        EntryPasswordDialogFragment.$stable = 8;
    }

    public EntryPasswordDialogFragment() {
        this.f = layout.dialog_entry_password;
        this.g = 0x20;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.h = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ProtectedEntryCreateViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$41 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy1 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$41);
        this.i = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ProtectedEntryCheckViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy1), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy1), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy1)));
        this.k = -1L;
        this.o = g.a;
        this.p = h.a;
    }

    public static final void a(EntryPasswordDialogFragment entryPasswordDialogFragment0, View view0) {
        Intrinsics.checkNotNullParameter(entryPasswordDialogFragment0, "this$0");
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel0 = entryPasswordDialogFragment0.q;
        if(protectedEntryDialogViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            protectedEntryDialogViewModel0 = null;
        }
        protectedEntryDialogViewModel0.clearPassword();
    }

    public static final void a(EntryPasswordDialogFragment entryPasswordDialogFragment0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(entryPasswordDialogFragment0, "this$0");
        Intrinsics.checkNotNull(boolean0);
        if(boolean0.booleanValue()) {
            ((DialogEntryPasswordBinding)entryPasswordDialogFragment0.getDataBinding()).commonProtectedEntryDialogInputLayout.setError(entryPasswordDialogFragment0.getString(string.label_dialog_protected_entry_error));
        }
    }

    public static final boolean a(EntryPasswordDialogFragment entryPasswordDialogFragment0, TextView textView0, int v, KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(entryPasswordDialogFragment0, "this$0");
        if(v == 6) {
            ProtectedEntryDialogViewModel protectedEntryDialogViewModel0 = entryPasswordDialogFragment0.q;
            if(protectedEntryDialogViewModel0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                protectedEntryDialogViewModel0 = null;
            }
            protectedEntryDialogViewModel0.onClickOK();
            return false;
        }
        return true;
    }

    public final void a() {
        TextInputEditText textInputEditText0 = ((DialogEntryPasswordBinding)this.getDataBinding()).commonProtectedEntryDialogEditText;
        textInputEditText0.requestFocus();
        Intrinsics.checkNotNull(textInputEditText0);
        UiUtils.INSTANCE.showSoftInput(textInputEditText0);
        textInputEditText0.addTextChangedListener(new EntryPasswordDialogFragment.initEditText.1.1(this, textInputEditText0));
        textInputEditText0.setOnEditorActionListener(new d(this));
        if(this.n) {
            ((DialogEntryPasswordBinding)this.getDataBinding()).commonProtectedEntryDialogInputLayout.setEndIconMode(-1);
            ((DialogEntryPasswordBinding)this.getDataBinding()).commonProtectedEntryDialogInputLayout.setEndIconDrawable(drawable.ic_input_setting_delete_a_os);
            ((DialogEntryPasswordBinding)this.getDataBinding()).commonProtectedEntryDialogInputLayout.setEndIconContentDescription(this.getString(string.content_desc_edit_text_clear));
            ((DialogEntryPasswordBinding)this.getDataBinding()).commonProtectedEntryDialogInputLayout.setEndIconOnClickListener(new t(this, 15));
            return;
        }
        ((DialogEntryPasswordBinding)this.getDataBinding()).commonProtectedEntryDialogInputLayout.setEndIconMode(0);
    }

    public static final DialogEntryPasswordBinding access$getDataBinding(EntryPasswordDialogFragment entryPasswordDialogFragment0) {
        return (DialogEntryPasswordBinding)entryPasswordDialogFragment0.getDataBinding();
    }

    public final void b() {
        ProtectedEntryCreateViewModel protectedEntryCreateViewModel0 = this.n ? ((ProtectedEntryCreateViewModel)this.h.getValue()) : ((ProtectedEntryCheckViewModel)this.i.getValue());
        this.q = new ProtectedEntryDialogViewModel(protectedEntryCreateViewModel0);
        DialogEntryPasswordBinding dialogEntryPasswordBinding0 = (DialogEntryPasswordBinding)this.getDataBinding();
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel0 = this.q;
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel1 = null;
        if(protectedEntryDialogViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            protectedEntryDialogViewModel0 = null;
        }
        dialogEntryPasswordBinding0.setViewModel(protectedEntryDialogViewModel0);
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel2 = this.q;
        if(protectedEntryDialogViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        else {
            protectedEntryDialogViewModel1 = protectedEntryDialogViewModel2;
        }
        protectedEntryDialogViewModel1.init(this.j, this.k, this.l, this.m);
        protectedEntryDialogViewModel1.getErrorEnabled().observe(this, new q(this, 5));
        LiveDataExtensionKt.observeEvent(protectedEntryDialogViewModel1.getCancelCallback(), this, new com.kakao.tistory.presentation.view.common.dialog.c(this));
        LiveDataExtensionKt.observeEvent(protectedEntryDialogViewModel1.getOkCallback(), this, new com.kakao.tistory.presentation.view.common.dialog.d(this));
        LiveDataExtensionKt.observeEvent(protectedEntryDialogViewModel1.getShowErrorDialog(), this, new f(this));
    }

    @Override  // com.kakao.android.base.ui.BaseDialogFragment
    public int getLayoutResourceId() {
        return this.f;
    }

    @NotNull
    public final Function0 getOnClickCancelCallback() {
        return this.o;
    }

    @NotNull
    public final Function1 getOnClickOkCallback() {
        return this.p;
    }

    @Override  // com.kakao.android.base.ui.BaseDialogFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(0, style.FullScreenDialog);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            String s = bundle1.getString("BUNDLE_PROTECTED_ENTRY_BLOG_NAME");
            if(s != null) {
                this.j = s;
            }
            long v = bundle1.getLong("BUNDLE_PROTECTED_ENTRY_ID");
            Long long0 = v >= 0L ? v : null;
            if(long0 != null) {
                this.k = long0.longValue();
            }
            String s1 = bundle1.getString("BUNDLE_PROTECTED_ENTRY_SLOGAN");
            if(s1 != null) {
                this.l = s1;
            }
            String s2 = bundle1.getString("BUNDLE_PROTECTED_ENTRY_PASSWORD");
            if(s2 != null) {
                this.m = s2;
            }
        }
        if(this.j == null && this.k <= 0L && this.l == null) {
            this.n = true;
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        Intrinsics.checkNotNullExpressionValue(dialog0, "onCreateDialog(...)");
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setSoftInputMode(5);
        }
        return dialog0;
    }

    @Override  // com.kakao.android.base.ui.BaseDialogFragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.requestFeature(1);
            }
        }
        return super.onCreateView(layoutInflater0, viewGroup0, bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String s = String.valueOf(((DialogEntryPasswordBinding)this.getDataBinding()).commonProtectedEntryDialogEditText.getText());
        if(p.isBlank(s)) {
            s = null;
        }
        if(s != null) {
            ((DialogEntryPasswordBinding)this.getDataBinding()).commonProtectedEntryDialogEditText.setSelection(s.length());
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.b();
        this.a();
    }

    public void setLayoutResourceId(int v) {
        this.f = v;
    }

    public final void setOnClickCancelCallback(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "<set-?>");
        this.o = function00;
    }

    public final void setOnClickOkCallback(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.p = function10;
    }
}

