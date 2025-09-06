package com.kakao.keditor.plugin.pluginspec.codeblock.editor;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation.Callback;
import android.view.WindowInsetsAnimation;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.common.view.SoftInputKt;
import com.kakao.common.view.SoftInputWindowFrameDetector;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.integer;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.base.KeditorBaseAppCompatActivity;
import com.kakao.keditor.databinding.KeActivityCodeBlockEditorBinding;
import com.kakao.keditor.databinding.KeViewCodeBlockLanguageOverlayBinding;
import com.kakao.keditor.plugin.itemspec.codeblock.CodeBlockItem;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.actions.Action;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.actions.OnChangeLanguageClicked;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.actions.OnCloseClicked;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.actions.OnConfirmClicked;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.CodeEditScrollView;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.LanguageOverlay;
import com.kakao.keditor.standard.EditTextStandardKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003*\u00019\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\b\u0010<\u001A\u00020\u0016H\u0003J\b\u0010=\u001A\u00020\u0016H\u0003J\b\u0010>\u001A\u00020\u0016H\u0016J\b\u0010?\u001A\u00020\u0016H\u0002J\b\u0010@\u001A\u00020\u0016H\u0002J\b\u0010A\u001A\u00020\u0016H\u0002J\u0012\u0010B\u001A\u00020\u00162\b\u0010C\u001A\u0004\u0018\u00010DH\u0014J\u0010\u0010E\u001A\u00020\u00162\u0006\u0010F\u001A\u00020DH\u0014J\u0012\u0010G\u001A\u00020\u00162\b\b\u0002\u0010H\u001A\u00020IH\u0002J\b\u0010J\u001A\u00020\u0016H\u0002J\b\u0010K\u001A\u00020\u0016H\u0002R\u001A\u0010\u0003\u001A\u00020\u0004X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u00C1\u0001\u0010\t\u001A\u00B4\u0001\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000F\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\nj\u0002`\u0017X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0018\u001A\u00020\u0019X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u001A\u001A\u00020\u001BX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u001A\u0010 \u001A\u00020!X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001C\u0010&\u001A\u0004\u0018\u00010\'X\u0094\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001A\u0010,\u001A\u00020-X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\u001B\u00102\u001A\u0002038BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b4\u00105R\u0014\u00108\u001A\u0002098CX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b:\u0010;\u00A8\u0006L"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockEditorActivity;", "Lcom/kakao/keditor/base/KeditorBaseAppCompatActivity;", "()V", "binding", "Lcom/kakao/keditor/databinding/KeActivityCodeBlockEditorBinding;", "getBinding", "()Lcom/kakao/keditor/databinding/KeActivityCodeBlockEditorBinding;", "setBinding", "(Lcom/kakao/keditor/databinding/KeActivityCodeBlockEditorBinding;)V", "frameChangeListener", "Lkotlin/Function8;", "", "Lkotlin/ParameterName;", "name", "oldLeft", "oldTop", "oldRight", "oldBottom", "newLeft", "newTop", "newRight", "newBottom", "", "Lcom/kakao/keditor/delegate/FrameChangedListener;", "languageAdapter", "Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/LanguageAdapter;", "languageOverlay", "Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/view/LanguageOverlay;", "getLanguageOverlay", "()Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/view/LanguageOverlay;", "setLanguageOverlay", "(Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/view/LanguageOverlay;)V", "languageOverlayContentBinding", "Lcom/kakao/keditor/databinding/KeViewCodeBlockLanguageOverlayBinding;", "getLanguageOverlayContentBinding", "()Lcom/kakao/keditor/databinding/KeViewCodeBlockLanguageOverlayBinding;", "setLanguageOverlayContentBinding", "(Lcom/kakao/keditor/databinding/KeViewCodeBlockLanguageOverlayBinding;)V", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "setOnBackPressedCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "softInputDetector", "Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "getSoftInputDetector", "()Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "setSoftInputDetector", "(Lcom/kakao/common/view/SoftInputWindowFrameDetector;)V", "vm", "Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockViewModel;", "getVm", "()Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockViewModel;", "vm$delegate", "Lkotlin/Lazy;", "windowInsetsAnimationListener", "com/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockEditorActivity$windowInsetsAnimationListener$1", "getWindowInsetsAnimationListener", "()Lcom/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockEditorActivity$windowInsetsAnimationListener$1;", "doOnPrepareSoftInputHidden", "doOnPrepareSoftInputShown", "finish", "initSoftInputOverlay", "initView", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "requestCloseLanguageSelector", "showSoftInput", "", "requestOpenLanguageSelector", "saveCurrentState", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCodeBlockEditorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeBlockEditorActivity.kt\ncom/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockEditorActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,250:1\n75#2,13:251\n136#3,12:264\n136#3,12:276\n*S KotlinDebug\n*F\n+ 1 CodeBlockEditorActivity.kt\ncom/kakao/keditor/plugin/pluginspec/codeblock/editor/CodeBlockEditorActivity\n*L\n47#1:251,13\n112#1:264,12\n116#1:276,12\n*E\n"})
public final class CodeBlockEditorActivity extends KeditorBaseAppCompatActivity {
    public KeActivityCodeBlockEditorBinding binding;
    @NotNull
    private final Function8 frameChangeListener;
    @NotNull
    private final LanguageAdapter languageAdapter;
    public LanguageOverlay languageOverlay;
    public KeViewCodeBlockLanguageOverlayBinding languageOverlayContentBinding;
    @Nullable
    private OnBackPressedCallback onBackPressedCallback;
    public SoftInputWindowFrameDetector softInputDetector;
    @NotNull
    private final Lazy vm$delegate;

    public CodeBlockEditorActivity() {
        com.kakao.keditor.plugin.pluginspec.codeblock.editor.CodeBlockEditorActivity.special..inlined.viewModels.default.1 codeBlockEditorActivity$special$$inlined$viewModels$default$10 = new Function0() {
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
        this.vm$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CodeBlockViewModel.class), new Function0() {
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
        }, codeBlockEditorActivity$special$$inlined$viewModels$default$10, new Function0(this) {
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
        this.languageAdapter = new LanguageAdapter(new Function1() {
            {
                CodeBlockEditorActivity.this = codeBlockEditorActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((String)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "language");
                CodeBlockEditorActivity.access$getVm(CodeBlockEditorActivity.this).setLanguage(s);
                CodeBlockEditorActivity.requestCloseLanguageSelector$default(CodeBlockEditorActivity.this, false, 1, null);
            }
        });
        this.frameChangeListener = new Function8() {
            {
                CodeBlockEditorActivity.this = codeBlockEditorActivity0;
                super(8);
            }

            @Override  // kotlin.jvm.functions.Function8
            public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
                this.invoke(((Number)object0).intValue(), ((Number)object1).intValue(), ((Number)object2).intValue(), ((Number)object3).intValue(), ((Number)object4).intValue(), ((Number)object5).intValue(), ((Number)object6).intValue(), ((Number)object7).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                if((v3 >= v7 ? 0 : 1) != (v7 >= v3 ? 0 : 1)) {
                    CodeBlockEditorActivity.requestCloseLanguageSelector$default(CodeBlockEditorActivity.this, false, 1, null);
                }
            }
        };
        this.onBackPressedCallback = new OnBackPressedCallback() {
            {
                CodeBlockEditorActivity.this = codeBlockEditorActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                if(CodeBlockEditorActivity.this.getLanguageOverlay().isShowing()) {
                    CodeBlockEditorActivity.access$requestCloseLanguageSelector(CodeBlockEditorActivity.this, false);
                    return;
                }
                CodeBlockEditorActivity.this.finish();
            }
        };
    }

    public static final void access$requestCloseLanguageSelector(CodeBlockEditorActivity codeBlockEditorActivity0, boolean z) {
        codeBlockEditorActivity0.requestCloseLanguageSelector(z);
    }

    @RequiresApi(30)
    private final void doOnPrepareSoftInputHidden() {
        if(this.getLanguageOverlay().isShowing()) {
            this.getBinding().overlay.setVisibility(0);
        }
    }

    @RequiresApi(30)
    private final void doOnPrepareSoftInputShown() {
        this.getBinding().setIsOverlayOpen(false);
        LanguageOverlay.dismiss$default(this.getLanguageOverlay(), null, 1, null);
        this.getBinding().overlay.setVisibility(8);
    }

    @Override  // android.app.Activity
    public void finish() {
        SoftInputKt.hideSoftInput(this);
        super.finish();
    }

    @NotNull
    public final KeActivityCodeBlockEditorBinding getBinding() {
        KeActivityCodeBlockEditorBinding keActivityCodeBlockEditorBinding0 = this.binding;
        if(keActivityCodeBlockEditorBinding0 != null) {
            return keActivityCodeBlockEditorBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final LanguageOverlay getLanguageOverlay() {
        LanguageOverlay languageOverlay0 = this.languageOverlay;
        if(languageOverlay0 != null) {
            return languageOverlay0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageOverlay");
        return null;
    }

    @NotNull
    public final KeViewCodeBlockLanguageOverlayBinding getLanguageOverlayContentBinding() {
        KeViewCodeBlockLanguageOverlayBinding keViewCodeBlockLanguageOverlayBinding0 = this.languageOverlayContentBinding;
        if(keViewCodeBlockLanguageOverlayBinding0 != null) {
            return keViewCodeBlockLanguageOverlayBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageOverlayContentBinding");
        return null;
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    @Nullable
    public OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    @NotNull
    public final SoftInputWindowFrameDetector getSoftInputDetector() {
        SoftInputWindowFrameDetector softInputWindowFrameDetector0 = this.softInputDetector;
        if(softInputWindowFrameDetector0 != null) {
            return softInputWindowFrameDetector0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("softInputDetector");
        return null;
    }

    private final CodeBlockViewModel getVm() {
        return (CodeBlockViewModel)this.vm$delegate.getValue();
    }

    @RequiresApi(30)
    private final com.kakao.keditor.plugin.pluginspec.codeblock.editor.CodeBlockEditorActivity.windowInsetsAnimationListener.1 getWindowInsetsAnimationListener() {
        return new WindowInsetsAnimation.Callback() {
            {
                CodeBlockEditorActivity.this = codeBlockEditorActivity0;
                super(1);
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public void onPrepare(@NotNull WindowInsetsAnimation windowInsetsAnimation0) {
                Intrinsics.checkNotNullParameter(windowInsetsAnimation0, "animation");
                if(windowInsetsAnimation0.getTypeMask() != 8) {
                    return;
                }
                View view0 = CodeBlockEditorActivity.this.getBinding().getRoot();
                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                if(!SoftInputKt.imeVisible(view0)) {
                    CodeBlockEditorActivity.this.doOnPrepareSoftInputShown();
                    return;
                }
                CodeBlockEditorActivity.this.doOnPrepareSoftInputHidden();
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            @NotNull
            public WindowInsets onProgress(@NotNull WindowInsets windowInsets0, @NotNull List list0) {
                Intrinsics.checkNotNullParameter(windowInsets0, "insets");
                Intrinsics.checkNotNullParameter(list0, "runningAnimations");
                return windowInsets0;
            }
        };
    }

    // 检测为 Lambda 实现
    public static void i(CodeBlockEditorActivity codeBlockEditorActivity0, View view0) [...]

    private final void initSoftInputOverlay() {
        View view0 = this.getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setSoftInputDetector(SoftInputWindowFrameDetector.Companion.withRootViewOf(view0));
        KeViewCodeBlockLanguageOverlayBinding keViewCodeBlockLanguageOverlayBinding0 = KeViewCodeBlockLanguageOverlayBinding.inflate(LayoutInflater.from(this));
        Intrinsics.checkNotNullExpressionValue(keViewCodeBlockLanguageOverlayBinding0, "inflate(...)");
        RecyclerView recyclerView0 = keViewCodeBlockLanguageOverlayBinding0.list;
        recyclerView0.setAdapter(this.languageAdapter);
        recyclerView0.setLayoutManager(new GridLayoutManager(this, 3));
        Drawable drawable0 = ContextCompat.getDrawable(this, drawable.ke_divider_horizontal_divide_2);
        if(drawable0 != null) {
            DividerItemDecoration dividerItemDecoration0 = new DividerItemDecoration(this, 1);
            dividerItemDecoration0.setDrawable(drawable0);
            recyclerView0.addItemDecoration(dividerItemDecoration0);
        }
        this.setLanguageOverlayContentBinding(keViewCodeBlockLanguageOverlayBinding0);
        SoftInputWindowFrameDetector softInputWindowFrameDetector0 = this.getSoftInputDetector();
        View view1 = this.getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view1, "getRoot(...)");
        KeActivityCodeBlockEditorBinding keActivityCodeBlockEditorBinding0 = this.getBinding();
        Intrinsics.checkNotNullExpressionValue(keActivityCodeBlockEditorBinding0.overlay, "overlay");
        View view2 = this.getLanguageOverlayContentBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
        this.setLanguageOverlay(new LanguageOverlay(softInputWindowFrameDetector0, view1, keActivityCodeBlockEditorBinding0.overlay, view2));
        this.getBinding().getRoot().getRootView().setWindowInsetsAnimationCallback(this.getWindowInsetsAnimationListener());
    }

    private final void initView() {
        CodeEditScrollView codeEditScrollView0 = this.getBinding().keCodeBlockCode;
        codeEditScrollView0.setOnClickListener((View view0) -> CodeBlockEditorActivity.initView$lambda$2$lambda$0(this, view0));
        codeEditScrollView0.setLineNumberPaddingLeft(codeEditScrollView0.getResources().getDimensionPixelSize(dimen.ke_code_block_line_padding_left));
        codeEditScrollView0.setLineNumberPaddingRight(codeEditScrollView0.getResources().getDimensionPixelSize(dimen.ke_code_block_line_padding_right));
        codeEditScrollView0.setTextColor(ContextCompat.getColor(this, color.ke_color_text));
        Double double0 = null;
        if(Build.VERSION.SDK_INT >= 28) {
            Object object0 = Keditor.INSTANCE.getConfig().get("code_extra_line_spacing");
            if(!(object0 instanceof Double)) {
                object0 = null;
            }
            Double double1 = (Double)object0;
            if(double1 == null) {
                double1 = null;
            }
            codeEditScrollView0.setLineSpacingExtra((double1 == null ? UnitConversionKt.dp2px(codeEditScrollView0.getResources().getInteger(integer.ke_code_block_extra_line_spacing)) : UnitConversionKt.dp2px(((float)(((double)double1))))));
        }
        Object object1 = Keditor.INSTANCE.getConfig().get("code_text_size");
        if(!(object1 instanceof Double)) {
            object1 = null;
        }
        if(((Double)object1) != null) {
            double0 = (Double)object1;
        }
        if(double0 != null) {
            codeEditScrollView0.setTextSize(((float)double0.doubleValue()));
        }
        EditTextStandardKt.onTextChanged(codeEditScrollView0.getEditText(), new Function4() {
            {
                CodeBlockEditorActivity.this = codeBlockEditorActivity0;
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
                        CodeBlockEditorActivity.this = codeBlockEditorActivity0;
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
                        CodeBlockEditorActivity.this.getBinding().setIsAttachable(!p.isBlank(this.$text));
                    }
                };
            }
        });
    }

    private static final void initView$lambda$2$lambda$0(CodeBlockEditorActivity codeBlockEditorActivity0, View view0) {
        Intrinsics.checkNotNullParameter(codeBlockEditorActivity0, "this$0");
        if(codeBlockEditorActivity0.getLanguageOverlay().isShowing()) {
            CodeBlockEditorActivity.requestCloseLanguageSelector$default(codeBlockEditorActivity0, false, 1, null);
        }
    }

    private final void initViewModel() {
        this.getVm().getSupportedLanguages().observe(this, new b(this, 0));
        this.getVm().getCurrentLanguage().observe(this, new b(this, 1));
        this.getVm().getCodeBlockItem().observe(this, new CodeBlockEditorActivity.sam.androidx_lifecycle_Observer.0(new Function1() {
            {
                CodeBlockEditorActivity.this = codeBlockEditorActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((CodeBlockItem)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(CodeBlockItem codeBlockItem0) {
                EditText editText0 = CodeBlockEditorActivity.this.getBinding().keCodeBlockCode.getEditText();
                editText0.setText(codeBlockItem0.getCode());
                editText0.requestFocus();
                editText0.setSelection(0);
                editText0.postDelayed(() -> {
                    Intrinsics.checkNotNullParameter(CodeBlockEditorActivity.this, "this$0");
                    if(!CodeBlockEditorActivity.this.getSoftInputDetector().isKeyboardOpen()) {
                        SoftInputKt.showSoftInput(CodeBlockEditorActivity.this, true);
                    }
                }, 200L);
            }

            // 检测为 Lambda 实现
            private static final void invoke$lambda$1$lambda$0(CodeBlockEditorActivity codeBlockEditorActivity0) [...]
        }));
        this.getVm().getAction().observe(this, new CodeBlockEditorActivity.sam.androidx_lifecycle_Observer.0(new Function1() {
            {
                CodeBlockEditorActivity.this = codeBlockEditorActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Action)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Action action0) {
                if(Intrinsics.areEqual(action0, OnCloseClicked.INSTANCE)) {
                    Keditor.clickEvent$default(Keditor.INSTANCE, "kCodeblock", "close", null, 4, null);
                    CodeBlockEditorActivity.this.finish();
                    return;
                }
                if(Intrinsics.areEqual(action0, OnConfirmClicked.INSTANCE)) {
                    Keditor.clickEvent$default(Keditor.INSTANCE, "kCodeblock", "confirm", null, 4, null);
                    Intent intent0 = CodeBlockEditorActivity.this.getIntent();
                    CodeBlockEditorActivity.this.setResult(-1, intent0);
                    CodeBlockEditorActivity.this.saveCurrentState();
                    Intent intent1 = CodeBlockEditorActivity.this.getIntent();
                    intent1.putExtra("data", ((Serializable)CodeBlockEditorActivity.this.getVm().getCodeBlockItem().getValue()));
                    intent1.putExtra("is_edit_flag", ((Serializable)CodeBlockEditorActivity.this.getVm().isEditMode().getValue()));
                    CodeBlockEditorActivity.this.finish();
                    return;
                }
                if(Intrinsics.areEqual(action0, OnChangeLanguageClicked.INSTANCE)) {
                    Keditor.clickEvent$default(Keditor.INSTANCE, "kCodeblock", "changeLanguage", null, 4, null);
                    if(!CodeBlockEditorActivity.this.getLanguageOverlay().isShowing()) {
                        CodeBlockEditorActivity.this.getBinding().setIsOverlayOpen(true);
                        CodeBlockEditorActivity.this.requestOpenLanguageSelector();
                        return;
                    }
                    CodeBlockEditorActivity.this.getBinding().setIsOverlayOpen(false);
                    CodeBlockEditorActivity.requestCloseLanguageSelector$default(CodeBlockEditorActivity.this, false, 1, null);
                }
            }
        }));
    }

    private static final void initViewModel$lambda$6(CodeBlockEditorActivity codeBlockEditorActivity0, ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(codeBlockEditorActivity0, "this$0");
        Intrinsics.checkNotNull(arrayList0);
        codeBlockEditorActivity0.languageAdapter.setSupportedLanguages(arrayList0);
        codeBlockEditorActivity0.languageAdapter.notifyDataSetChanged();
    }

    private static final void initViewModel$lambda$7(CodeBlockEditorActivity codeBlockEditorActivity0, String s) {
        Intrinsics.checkNotNullParameter(codeBlockEditorActivity0, "this$0");
        codeBlockEditorActivity0.getBinding().setLanguage(s);
        codeBlockEditorActivity0.languageAdapter.setSelectedLanguage(s);
        codeBlockEditorActivity0.languageAdapter.notifyDataSetChanged();
        CodeBlockEditorActivity.requestCloseLanguageSelector$default(codeBlockEditorActivity0, false, 1, null);
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.setContentView(this, layout.ke_activity_code_block_editor);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "setContentView(...)");
        this.setBinding(((KeActivityCodeBlockEditorBinding)viewDataBinding0));
        this.getBinding().setVm(this.getVm());
        this.initView();
        this.initSoftInputOverlay();
        this.initViewModel();
    }

    @Override  // androidx.activity.ComponentActivity
    public void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        this.saveCurrentState();
    }

    private final void requestCloseLanguageSelector(boolean z) {
        if(!(z ? SoftInputKt.showSoftInput$default(this, false, 1, null) : false)) {
            this.doOnPrepareSoftInputShown();
        }
    }

    public static void requestCloseLanguageSelector$default(CodeBlockEditorActivity codeBlockEditorActivity0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        codeBlockEditorActivity0.requestCloseLanguageSelector(z);
    }

    private final void requestOpenLanguageSelector() {
        this.getBinding().setIsOverlayOpen(true);
        this.getLanguageOverlay().show();
        this.getLanguageOverlayContentBinding().list.scrollToPosition(0);
        if(!SoftInputKt.hideSoftInput(this)) {
            this.doOnPrepareSoftInputHidden();
        }
    }

    private final void saveCurrentState() {
        this.getVm().setCode(this.getBinding().keCodeBlockCode.getEditText().getText().toString());
    }

    public final void setBinding(@NotNull KeActivityCodeBlockEditorBinding keActivityCodeBlockEditorBinding0) {
        Intrinsics.checkNotNullParameter(keActivityCodeBlockEditorBinding0, "<set-?>");
        this.binding = keActivityCodeBlockEditorBinding0;
    }

    public final void setLanguageOverlay(@NotNull LanguageOverlay languageOverlay0) {
        Intrinsics.checkNotNullParameter(languageOverlay0, "<set-?>");
        this.languageOverlay = languageOverlay0;
    }

    public final void setLanguageOverlayContentBinding(@NotNull KeViewCodeBlockLanguageOverlayBinding keViewCodeBlockLanguageOverlayBinding0) {
        Intrinsics.checkNotNullParameter(keViewCodeBlockLanguageOverlayBinding0, "<set-?>");
        this.languageOverlayContentBinding = keViewCodeBlockLanguageOverlayBinding0;
    }

    @Override  // com.kakao.keditor.base.KeditorBaseAppCompatActivity
    public void setOnBackPressedCallback(@Nullable OnBackPressedCallback onBackPressedCallback0) {
        this.onBackPressedCallback = onBackPressedCallback0;
    }

    public final void setSoftInputDetector(@NotNull SoftInputWindowFrameDetector softInputWindowFrameDetector0) {
        Intrinsics.checkNotNullParameter(softInputWindowFrameDetector0, "<set-?>");
        this.softInputDetector = softInputWindowFrameDetector0;
    }
}

