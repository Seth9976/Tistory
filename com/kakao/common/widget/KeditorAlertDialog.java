package com.kakao.common.widget;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import com.kakao.keditor.R.string;
import com.kakao.keditor.R.style;
import com.kakao.keditor.databinding.KeDialogAlertBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import l9.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ!\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\r2\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/kakao/common/widget/KeditorAlertDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onActivityCreated", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorAlertDialog extends DialogFragment {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JQ\u0010\r\u001A\u00020\f2\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/common/widget/KeditorAlertDialog$Companion;", "", "", "titleRes", "contentRes", "confirmTextRes", "cancelTextRes", "", "isCancelable", "Lkotlin/Function0;", "", "confirmListener", "Lcom/kakao/common/widget/KeditorAlertDialog;", "newInstance", "(Ljava/lang/Integer;Ljava/lang/Integer;IIZLkotlin/jvm/functions/Function0;)Lcom/kakao/common/widget/KeditorAlertDialog;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nKeditorAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeditorAlertDialog.kt\ncom/kakao/common/widget/KeditorAlertDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KeditorAlertDialog newInstance(@Nullable Integer integer0, @Nullable Integer integer1, int v, int v1, boolean z, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(function00, "confirmListener");
            KeditorAlertDialog keditorAlertDialog0 = new KeditorAlertDialog();
            Bundle bundle0 = new Bundle();
            if(integer0 != null) {
                bundle0.putInt("titleRes", integer0.intValue());
            }
            if(integer1 != null) {
                bundle0.putInt("contentRes", integer1.intValue());
            }
            bundle0.putInt("confirmTextRes", v);
            bundle0.putInt("cancelTextRes", v1);
            bundle0.putBoolean("isCancelable", z);
            keditorAlertDialog0.setArguments(bundle0);
            keditorAlertDialog0.A = function00;
            return keditorAlertDialog0;
        }

        public static KeditorAlertDialog newInstance$default(Companion keditorAlertDialog$Companion0, Integer integer0, Integer integer1, int v, int v1, boolean z, Function0 function00, int v2, Object object0) {
            Integer integer2 = (v2 & 1) == 0 ? integer0 : null;
            Integer integer3 = (v2 & 2) == 0 ? integer1 : null;
            int v3 = (v2 & 4) == 0 ? v : string.common_dialog_confirm;
            int v4 = (v2 & 8) == 0 ? v1 : string.common_dialog_cancel;
            return (v2 & 16) == 0 ? keditorAlertDialog$Companion0.newInstance(integer2, integer3, v3, v4, z, function00) : keditorAlertDialog$Companion0.newInstance(integer2, integer3, v3, v4, true, function00);
        }
    }

    public Function0 A;
    @NotNull
    public static final Companion Companion;
    public KeDialogAlertBinding z;

    static {
        KeditorAlertDialog.Companion = new Companion(null);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onActivityCreated(@Nullable Bundle bundle0) {
        super.onActivityCreated(bundle0);
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            dialog0.setCanceledOnTouchOutside(true);
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window0 = dialog1.getWindow();
            if(window0 != null) {
                window0.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(1, style.KeditorDialog);
    }

    @Override  // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        KeDialogAlertBinding keDialogAlertBinding0 = KeDialogAlertBinding.inflate(LayoutInflater.from(this.getContext()), viewGroup0, true);
        Intrinsics.checkNotNullExpressionValue(keDialogAlertBinding0, "inflate(...)");
        this.z = keDialogAlertBinding0;
        if(keDialogAlertBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keDialogAlertBinding0 = null;
        }
        View view0 = keDialogAlertBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        int v = bundle1 == null ? -1 : bundle1.getInt("titleRes", -1);
        Bundle bundle2 = this.getArguments();
        int v1 = bundle2 == null ? -1 : bundle2.getInt("contentRes", -1);
        Bundle bundle3 = this.getArguments();
        int v2 = bundle3 == null ? -1 : bundle3.getInt("confirmTextRes");
        Bundle bundle4 = this.getArguments();
        int v3 = bundle4 == null ? -1 : bundle4.getInt("cancelTextRes");
        Bundle bundle5 = this.getArguments();
        boolean z = true;
        boolean z1 = bundle5 == null ? true : bundle5.getBoolean("isCancelable");
        KeDialogAlertBinding keDialogAlertBinding0 = this.z;
        KeDialogAlertBinding keDialogAlertBinding1 = null;
        if(keDialogAlertBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keDialogAlertBinding0 = null;
        }
        if(v1 != -1) {
            z = false;
        }
        keDialogAlertBinding0.setIsTitleOnly(z);
        if(v != -1) {
            KeDialogAlertBinding keDialogAlertBinding2 = this.z;
            if(keDialogAlertBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                keDialogAlertBinding2 = null;
            }
            keDialogAlertBinding2.keDialogTitleTextView.setText(v);
        }
        if(v1 != -1) {
            KeDialogAlertBinding keDialogAlertBinding3 = this.z;
            if(keDialogAlertBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                keDialogAlertBinding3 = null;
            }
            keDialogAlertBinding3.keDialogContentTextView.setText(v1);
        }
        if(v2 != -1) {
            KeDialogAlertBinding keDialogAlertBinding4 = this.z;
            if(keDialogAlertBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                keDialogAlertBinding4 = null;
            }
            keDialogAlertBinding4.keDialogConfirm.setText(v2);
        }
        if(v3 != -1) {
            KeDialogAlertBinding keDialogAlertBinding5 = this.z;
            if(keDialogAlertBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                keDialogAlertBinding5 = null;
            }
            keDialogAlertBinding5.keDialogCancel.setText(v3);
        }
        KeDialogAlertBinding keDialogAlertBinding6 = this.z;
        if(keDialogAlertBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keDialogAlertBinding6 = null;
        }
        keDialogAlertBinding6.setIsCancelable(z1);
        KeDialogAlertBinding keDialogAlertBinding7 = this.z;
        if(keDialogAlertBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keDialogAlertBinding7 = null;
        }
        Intrinsics.checkNotNullExpressionValue(keDialogAlertBinding7.keDialogCancel, "keDialogCancel");
        Class class0 = Button.class;
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        ContentDescriptionKt.applyAccessibilityInfo$default(keDialogAlertBinding7.keDialogCancel, kClass0, null, null, null, null, 30, null);
        KeDialogAlertBinding keDialogAlertBinding8 = this.z;
        if(keDialogAlertBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keDialogAlertBinding8 = null;
        }
        Intrinsics.checkNotNullExpressionValue(keDialogAlertBinding8.keDialogConfirm, "keDialogConfirm");
        KClass kClass1 = Reflection.getOrCreateKotlinClass(class0);
        ContentDescriptionKt.applyAccessibilityInfo$default(keDialogAlertBinding8.keDialogConfirm, kClass1, null, null, null, null, 30, null);
        KeDialogAlertBinding keDialogAlertBinding9 = this.z;
        if(keDialogAlertBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keDialogAlertBinding9 = null;
        }
        a a0 = new a(this, 0);
        keDialogAlertBinding9.keDialogCancel.setOnClickListener(a0);
        KeDialogAlertBinding keDialogAlertBinding10 = this.z;
        if(keDialogAlertBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keDialogAlertBinding10 = null;
        }
        a a1 = new a(this, 1);
        keDialogAlertBinding10.keDialogConfirm.setOnClickListener(a1);
        KeDialogAlertBinding keDialogAlertBinding11 = this.z;
        if(keDialogAlertBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        else {
            keDialogAlertBinding1 = keDialogAlertBinding11;
        }
        a a2 = new a(this, 2);
        keDialogAlertBinding1.keDialogOutsideClickArea.setOnClickListener(a2);
    }
}

