package com.kakao.keditor.plugin.pluginspec.html.editor;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.common.view.SoftInputKt;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.R.integer;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.databinding.KeActivityHtmlEditorBinding;
import com.kakao.keditor.plugin.itemspec.html.HtmlItem;
import com.kakao.keditor.plugin.pluginspec.html.editor.actions.Action;
import com.kakao.keditor.plugin.pluginspec.html.editor.actions.OnCloseClicked;
import com.kakao.keditor.plugin.pluginspec.html.editor.actions.OnConfirmClicked;
import com.kakao.keditor.plugin.pluginspec.html.editor.view.HtmlEditScrollView;
import com.kakao.keditor.standard.EditTextStandardKt;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000F\u001A\u00020\u0010H\u0016J\b\u0010\u0011\u001A\u00020\u0010H\u0002J\b\u0010\u0012\u001A\u00020\u0010H\u0002J\u0012\u0010\u0013\u001A\u00020\u00102\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u0015H\u0014J\b\u0010\u0018\u001A\u00020\u0010H\u0002R\u001A\u0010\u0003\u001A\u00020\u0004X\u0086.¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001B\u0010\t\u001A\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000B\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/html/editor/HtmlEditorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/kakao/keditor/databinding/KeActivityHtmlEditorBinding;", "getBinding", "()Lcom/kakao/keditor/databinding/KeActivityHtmlEditorBinding;", "setBinding", "(Lcom/kakao/keditor/databinding/KeActivityHtmlEditorBinding;)V", "vm", "Lcom/kakao/keditor/plugin/pluginspec/html/editor/HtmlViewModel;", "getVm", "()Lcom/kakao/keditor/plugin/pluginspec/html/editor/HtmlViewModel;", "vm$delegate", "Lkotlin/Lazy;", "finish", "", "initView", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "saveCurrentState", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHtmlEditorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HtmlEditorActivity.kt\ncom/kakao/keditor/plugin/pluginspec/html/editor/HtmlEditorActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,105:1\n75#2,13:106\n136#3,12:119\n136#3,12:131\n*S KotlinDebug\n*F\n+ 1 HtmlEditorActivity.kt\ncom/kakao/keditor/plugin/pluginspec/html/editor/HtmlEditorActivity\n*L\n29#1:106,13\n53#1:119,12\n57#1:131,12\n*E\n"})
public final class HtmlEditorActivity extends AppCompatActivity {
    public KeActivityHtmlEditorBinding binding;
    @NotNull
    private final Lazy vm$delegate;

    public HtmlEditorActivity() {
        com.kakao.keditor.plugin.pluginspec.html.editor.HtmlEditorActivity.special..inlined.viewModels.default.1 htmlEditorActivity$special$$inlined$viewModels$default$10 = new Function0() {
            final ComponentActivity $this_viewModels;

            {
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.$this_viewModels.getDefaultViewModelProviderFactory();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.vm$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HtmlViewModel.class), new Function0() {
            final ComponentActivity $this_viewModels;

            {
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return this.$this_viewModels.getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, htmlEditorActivity$special$$inlined$viewModels$default$10, new Function0(this) {
            final Function0 $extrasProducer;
            final ComponentActivity $this_viewModels;

            {
                this.$extrasProducer = function00;
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.$extrasProducer;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    return creationExtras0 == null ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.$this_viewModels.getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
    }

    @Override  // android.app.Activity
    public void finish() {
        SoftInputKt.hideSoftInput(this);
        super.finish();
    }

    @NotNull
    public final KeActivityHtmlEditorBinding getBinding() {
        KeActivityHtmlEditorBinding keActivityHtmlEditorBinding0 = this.binding;
        if(keActivityHtmlEditorBinding0 != null) {
            return keActivityHtmlEditorBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    private final HtmlViewModel getVm() {
        return (HtmlViewModel)this.vm$delegate.getValue();
    }

    private final void initView() {
        HtmlEditScrollView htmlEditScrollView0 = this.getBinding().keHtmlCode;
        htmlEditScrollView0.setLineNumberPaddingLeft(htmlEditScrollView0.getResources().getDimensionPixelSize(dimen.ke_html_line_padding_left));
        htmlEditScrollView0.setLineNumberPaddingRight(htmlEditScrollView0.getResources().getDimensionPixelSize(dimen.ke_html_line_padding_right));
        htmlEditScrollView0.setTextColor(ContextCompat.getColor(this, color.ke_color_text));
        Double double0 = null;
        if(Build.VERSION.SDK_INT >= 28) {
            Object object0 = Keditor.INSTANCE.getConfig().get("html_extra_line_spacing");
            if(!(object0 instanceof Double)) {
                object0 = null;
            }
            Double double1 = (Double)object0;
            if(double1 == null) {
                double1 = null;
            }
            htmlEditScrollView0.setLineSpacingExtra((double1 == null ? UnitConversionKt.dp2px(htmlEditScrollView0.getResources().getInteger(integer.ke_html_extra_line_spacing)) : UnitConversionKt.dp2px(((float)(((double)double1))))));
        }
        Object object1 = Keditor.INSTANCE.getConfig().get("html_text_size");
        if(!(object1 instanceof Double)) {
            object1 = null;
        }
        if(((Double)object1) != null) {
            double0 = (Double)object1;
        }
        if(double0 != null) {
            htmlEditScrollView0.setTextSize(((float)double0.doubleValue()));
        }
        EditTextStandardKt.onTextChanged(htmlEditScrollView0.getEditText(), new Function4() {
            {
                HtmlEditorActivity.this = htmlEditorActivity0;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                return this.invoke(((CharSequence)object0), ((Number)object1).intValue(), ((Number)object2).intValue(), ((Number)object3).intValue());
            }

            @Nullable
            public final Function1 invoke(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(charSequence0, "text");
                return new Function1(charSequence0) {
                    final CharSequence $text;

                    {
                        HtmlEditorActivity.this = htmlEditorActivity0;
                        this.$text = charSequence0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Editable)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Editable editable0) {
                        Intrinsics.checkNotNullParameter(editable0, "it");
                        HtmlEditorActivity.this.getBinding().setIsAttachable(!p.isBlank(this.$text));
                    }
                };
            }
        });
    }

    private final void initViewModel() {
        this.getVm().getHtmlItem().observe(this, new a(this, 0));
        this.getVm().getAction().observe(this, new a(this, 1));
    }

    private static final void initViewModel$lambda$3(HtmlEditorActivity htmlEditorActivity0, HtmlItem htmlItem0) {
        Intrinsics.checkNotNullParameter(htmlEditorActivity0, "this$0");
        EditText editText0 = htmlEditorActivity0.getBinding().keHtmlCode.getEditText();
        editText0.setText(htmlItem0.getSource());
        editText0.requestFocus();
        editText0.setSelection(0);
    }

    private static final void initViewModel$lambda$5(HtmlEditorActivity htmlEditorActivity0, Action action0) {
        Intrinsics.checkNotNullParameter(htmlEditorActivity0, "this$0");
        if(Intrinsics.areEqual(action0, OnCloseClicked.INSTANCE)) {
            Keditor.clickEvent$default(Keditor.INSTANCE, "kHtml", "close", null, 4, null);
            htmlEditorActivity0.finish();
            return;
        }
        if(Intrinsics.areEqual(action0, OnConfirmClicked.INSTANCE)) {
            Keditor.clickEvent$default(Keditor.INSTANCE, "kHtml", "confirm", null, 4, null);
            htmlEditorActivity0.setResult(-1, htmlEditorActivity0.getIntent());
            htmlEditorActivity0.saveCurrentState();
            Intent intent0 = htmlEditorActivity0.getIntent();
            intent0.putExtra("data", ((Serializable)htmlEditorActivity0.getVm().getHtmlItem().getValue()));
            intent0.putExtra("is_edit_flag", ((Serializable)htmlEditorActivity0.getVm().isEditMode().getValue()));
            htmlEditorActivity0.finish();
        }
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.setContentView(this, layout.ke_activity_html_editor);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "setContentView(...)");
        this.setBinding(((KeActivityHtmlEditorBinding)viewDataBinding0));
        this.getBinding().setVm(this.getVm());
        this.initView();
        this.initViewModel();
    }

    @Override  // androidx.activity.ComponentActivity
    public void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        this.saveCurrentState();
    }

    private final void saveCurrentState() {
        this.getVm().setCode(this.getBinding().keHtmlCode.getEditText().getText().toString());
    }

    public final void setBinding(@NotNull KeActivityHtmlEditorBinding keActivityHtmlEditorBinding0) {
        Intrinsics.checkNotNullParameter(keActivityHtmlEditorBinding0, "<set-?>");
        this.binding = keActivityHtmlEditorBinding0;
    }
}

