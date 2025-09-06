package com.kakao.keditor.plugin.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.datepicker.t;
import com.kakao.common.view.SoftInputKt;
import com.kakao.common.widget.ContentDescriptionKt;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.string;
import com.kakao.keditor.R.style;
import com.kakao.keditor.util.SimpleTextWatcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\fH\u0002J\u0010\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u0007H\u0002J\u0010\u0010\u0013\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u0007H\u0002J(\u0010\u0014\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\fH\u0002J\u0010\u0010\u0015\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u0007H\u0002J\u0012\u0010\u0016\u001A\u00020\n2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001A\u00020\n2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018H\u0016J&\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018H\u0016J\u001A\u0010 \u001A\u00020\n2\u0006\u0010!\u001A\u00020\u001B2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018H\u0016R\u0016\u0010\u0003\u001A\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R$\u0010\b\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/kakao/keditor/plugin/common/LinkFormDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "ALLOWED_TYPE_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DEFAULT_SCHEME", "", "confirmListener", "Lkotlin/Function2;", "", "isEnableConfirm", "", "url", "title", "isImageLink", "isModifyMode", "isNeedHttpProtocolBelowText", "text", "isNotEmptyText", "isValidData", "isValidUrl", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LinkFormDialog extends DialogFragment {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001A\u00020\u00042\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\t2\u001A\u0010\n\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/common/LinkFormDialog$Companion;", "", "()V", "newInstance", "Lcom/kakao/keditor/plugin/common/LinkFormDialog;", "linkTitle", "", "url", "isImageLink", "", "confirmListener", "Lkotlin/Function2;", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final LinkFormDialog newInstance(@Nullable CharSequence charSequence0, @Nullable CharSequence charSequence1, boolean z, @NotNull Function2 function20) {
            Intrinsics.checkNotNullParameter(function20, "confirmListener");
            LinkFormDialog linkFormDialog0 = new LinkFormDialog();
            Bundle bundle0 = new Bundle();
            bundle0.putCharSequence("linkTitle", charSequence0);
            bundle0.putCharSequence("url", charSequence1);
            bundle0.putBoolean("isImageLink", z);
            linkFormDialog0.setArguments(bundle0);
            linkFormDialog0.confirmListener = function20;
            return linkFormDialog0;
        }

        public static LinkFormDialog newInstance$default(Companion linkFormDialog$Companion0, CharSequence charSequence0, CharSequence charSequence1, boolean z, Function2 function20, int v, Object object0) {
            if((v & 1) != 0) {
                charSequence0 = "";
            }
            if((v & 2) != 0) {
                charSequence1 = "";
            }
            if((v & 4) != 0) {
                z = false;
            }
            return linkFormDialog$Companion0.newInstance(charSequence0, charSequence1, z, function20);
        }
    }

    private final Pattern ALLOWED_TYPE_PATTERN;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String DEFAULT_SCHEME;
    @Nullable
    private Function2 confirmListener;

    static {
        LinkFormDialog.Companion = new Companion(null);
    }

    public LinkFormDialog() {
        this.DEFAULT_SCHEME = "http";
        this.ALLOWED_TYPE_PATTERN = Pattern.compile("(^https?:\\/\\/.+\\..+|[^@]+@[^@]+\\.[^@]+|mailto:[^@]+@[^@]+\\.[^@]+|^tel:\\d{2,5}(-\\d{2,5}){0,3})");
    }

    // 去混淆评级： 中等(50)
    private final boolean isEnableConfirm(String s, String s1, boolean z, boolean z1) {
        return (z1 && s.length() == 0 || this.isValidUrl(s) || this.isValidUrl(this.DEFAULT_SCHEME + "://" + s)) && (z || !p.isBlank(StringsKt__StringsKt.trim(s1).toString()));
    }

    // 去混淆评级： 低(20)
    private final boolean isNeedHttpProtocolBelowText(String s) {
        return !this.ALLOWED_TYPE_PATTERN.matcher(s).matches() && this.ALLOWED_TYPE_PATTERN.matcher(this.DEFAULT_SCHEME + "://" + s).matches();
    }

    private final boolean isNotEmptyText(String s) {
        return p.replace$default(s, ".", "", false, 4, null).length() > 0 && s.length() > 0;
    }

    // 去混淆评级： 中等(60)
    private final boolean isValidData(boolean z, String s, String s1, boolean z1) {
        return z ? s.length() > 0 || z1 : s1.length() > 0 && (s.length() > 0 || z1);
    }

    private final boolean isValidUrl(String s) {
        return this.ALLOWED_TYPE_PATTERN.matcher(s).matches();
    }

    public static void k(LinkFormDialog linkFormDialog0, View view0) {
        LinkFormDialog.onViewCreated$lambda$3(linkFormDialog0, view0);
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
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setSoftInputMode(20);
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            dialog1.setOnShowListener((DialogInterface dialogInterface0) -> {
                Intrinsics.checkNotNullParameter(this, "this$0");
                View view0 = this.getView();
                if(view0 != null) {
                    view0.announceForAccessibility(this.getString(string.cd_alert_link_opened));
                }
                Context context0 = this.getContext();
                if(context0 != null) {
                    SoftInputKt.showSoftInput$default(context0, false, 1, null);
                }
            });
        }
        return layoutInflater0.inflate(layout.ke_dialog_link_form, viewGroup0);
    }

    // 检测为 Lambda 实现
    private static final void onCreateView$lambda$0(LinkFormDialog linkFormDialog0, DialogInterface dialogInterface0) [...]

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        View view1 = view0.findViewById(id.ke_edit_link_url);
        Intrinsics.checkNotNullExpressionValue(view1, "findViewById(...)");
        View view2 = view0.findViewById(id.ke_edit_link_title);
        Intrinsics.checkNotNullExpressionValue(view2, "findViewById(...)");
        View view3 = view0.findViewById(id.ke_edit_link_title_layout);
        Intrinsics.checkNotNullExpressionValue(view3, "findViewById(...)");
        View view4 = view0.findViewById(id.ke_dialog_cancel);
        Intrinsics.checkNotNullExpressionValue(view4, "findViewById(...)");
        View view5 = view0.findViewById(id.ke_dialog_confirm);
        Intrinsics.checkNotNullExpressionValue(view5, "findViewById(...)");
        Bundle bundle1 = this.getArguments();
        CharSequence charSequence0 = null;
        CharSequence charSequence1 = bundle1 == null ? null : bundle1.getCharSequence("url");
        Bundle bundle2 = this.getArguments();
        boolean z = bundle2 == null ? false : bundle2.getBoolean("isImageLink");
        boolean z1 = charSequence1 != null && charSequence1.length() > 0;
        Bundle bundle3 = this.getArguments();
        if(bundle3 != null) {
            charSequence0 = bundle3.getCharSequence("linkTitle");
        }
        ((EditText)view2).setText(charSequence0);
        ((EditText)view1).setText(charSequence1);
        view5.setEnabled(this.isEnableConfirm(((EditText)view1).getText().toString(), ((EditText)view2).getText().toString(), z, z1));
        ((EditText)view1).addTextChangedListener(new SimpleTextWatcher() {
            @Override  // com.kakao.keditor.util.SimpleTextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(charSequence0, "s");
                String s = z.getText().toString();
                boolean z = ((EditText)view2).isEnableConfirm(charSequence0.toString(), s, z1, this.$isModifyMode);
                this.setEnabled(z);
            }
        });
        ((EditText)view2).addTextChangedListener(new SimpleTextWatcher() {
            @Override  // com.kakao.keditor.util.SimpleTextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(charSequence0, "s");
                String s = z.getText().toString();
                boolean z = ((EditText)view1).isEnableConfirm(s, charSequence0.toString(), z1, this.$isModifyMode);
                this.setEnabled(z);
            }
        });
        if(z) {
            ((LinearLayout)view3).setVisibility(8);
        }
        else {
            ((LinearLayout)view3).setVisibility(0);
            Editable editable0 = ((EditText)view2).getText();
            Intrinsics.checkNotNullExpressionValue(editable0, "getText(...)");
            if(editable0.length() == 0) {
                ((EditText)view2).setEnabled(true);
                Context context0 = this.getContext();
                if(context0 != null) {
                    ((EditText)view2).setTextColor(context0.getResources().getColor(color.ke_color_text));
                }
            }
            else {
                ((EditText)view2).setEnabled(false);
                Context context1 = this.getContext();
                if(context1 != null) {
                    ((EditText)view2).setTextColor(context1.getResources().getColor(color.ke_color_text_disabled));
                }
            }
        }
        ContentDescriptionKt.applyAccessibilityInfo$default(view4, Reflection.getOrCreateKotlinClass(Button.class), null, null, null, null, 30, null);
        ContentDescriptionKt.applyAccessibilityInfo$default(view5, Reflection.getOrCreateKotlinClass(Button.class), null, null, null, null, 30, null);
        view4.setOnClickListener(new t(this, 2));
        view5.setOnClickListener((View view0) -> {
            Intrinsics.checkNotNullParameter(((EditText)view1), "$editUrl");
            Intrinsics.checkNotNullParameter(((EditText)view2), "$editTitle");
            Intrinsics.checkNotNullParameter(this, "this$0");
            String s = ((EditText)view1).getText().toString();
            String s1 = ((EditText)view2).getText().toString();
            if(this.isValidData(z, s, s1, z1)) {
                if((s == null || p.isBlank(s)) && z1) {
                    Function2 function20 = this.confirmListener;
                    if(function20 != null) {
                        function20.invoke(null, s1);
                    }
                }
                else if(this.isNeedHttpProtocolBelowText(s)) {
                    Function2 function21 = this.confirmListener;
                    if(function21 != null) {
                        function21.invoke(this.DEFAULT_SCHEME + "://" + s, s1);
                    }
                }
                else {
                    Function2 function22 = this.confirmListener;
                    if(function22 != null) {
                        function22.invoke(s, s1);
                    }
                }
                Dialog dialog0 = this.getDialog();
                if(dialog0 != null) {
                    dialog0.dismiss();
                }
            }
        });
    }

    private static final void onViewCreated$lambda$3(LinkFormDialog linkFormDialog0, View view0) {
        Intrinsics.checkNotNullParameter(linkFormDialog0, "this$0");
        Dialog dialog0 = linkFormDialog0.getDialog();
        if(dialog0 != null) {
            dialog0.dismiss();
        }
    }

    // 检测为 Lambda 实现
    private static final void onViewCreated$lambda$4(EditText editText0, EditText editText1, LinkFormDialog linkFormDialog0, boolean z, boolean z1, View view0) [...]
}

