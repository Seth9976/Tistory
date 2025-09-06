package com.kakao.keditor.plugin.pluginspec.contentsearch;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.common.util.ResourcesUtilKt;
import com.kakao.common.view.SoftInputKt;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.databinding.KeActivityContentSearchBinding;
import com.kakao.keditor.plugin.extension.IntentKt;
import com.kakao.keditor.plugin.itemspec.contentsearch.util.ViewKt;
import com.kakao.keditor.plugin.pluginspec.contentsearch.webview.ContentSearchWebView;
import com.kakao.keditor.plugin.pluginspec.contentsearch.webview.ContentSearchWebViewJavascriptInterface.OnActionListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0005\u001A\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001A\u00020\tH\u0016J\b\u0010\n\u001A\u00020\u000BH\u0002J\u0010\u0010\f\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u000EH\u0016J\u0012\u0010\u000F\u001A\u00020\t2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011H\u0014R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/kakao/keditor/databinding/KeActivityContentSearchBinding;", "createOnActionListener", "com/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchActivity$createOnActionListener$1", "()Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchActivity$createOnActionListener$1;", "finish", "", "isConfigurationChangeableNightMode", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContentSearchActivity extends AppCompatActivity {
    private KeActivityContentSearchBinding binding;

    private final com.kakao.keditor.plugin.pluginspec.contentsearch.ContentSearchActivity.createOnActionListener.1 createOnActionListener() {
        return new OnActionListener() {
            @Override  // com.kakao.keditor.plugin.pluginspec.contentsearch.webview.ContentSearchWebViewJavascriptInterface$OnActionListener
            public void close() {
                ContentSearchActivity.this.finish();
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.contentsearch.webview.ContentSearchWebViewJavascriptInterface$OnActionListener
            public void onInsertContent(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "cdmItemJson");
                Intent intent0 = new Intent();
                intent0.putExtra("cdmItemJson", s);
                ContentSearchActivity.this.setResult(-1, intent0);
                ContentSearchActivity.this.finish();
            }
        };
    }

    @Override  // android.app.Activity
    public void finish() {
        SoftInputKt.hideSoftInput(this);
        super.finish();
    }

    // 去混淆评级： 低(40)
    private final boolean isConfigurationChangeableNightMode() [...] // 潜在的解密器

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onConfigurationChanged(@NotNull Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        boolean z = ResourcesUtilKt.isUseNightMode(configuration0);
        KeActivityContentSearchBinding keActivityContentSearchBinding0 = this.binding;
        KeActivityContentSearchBinding keActivityContentSearchBinding1 = null;
        if(keActivityContentSearchBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keActivityContentSearchBinding0 = null;
        }
        Intrinsics.checkNotNullExpressionValue(keActivityContentSearchBinding0.keContentSearchWebView, "keContentSearchWebView");
        ViewKt.setKePrimaryBackgroundColorBy(keActivityContentSearchBinding0.keContentSearchWebView, z);
        KeActivityContentSearchBinding keActivityContentSearchBinding2 = this.binding;
        if(keActivityContentSearchBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        else {
            keActivityContentSearchBinding1 = keActivityContentSearchBinding2;
        }
        Intrinsics.checkNotNullExpressionValue(keActivityContentSearchBinding1.keContentSearchWebViewLoadingView, "keContentSearchWebViewLoadingView");
        ViewKt.setKePrimaryBackgroundColorBy(keActivityContentSearchBinding1.keContentSearchWebViewLoadingView, z);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.setContentView(this, layout.ke_activity_content_search);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "setContentView(...)");
        KeActivityContentSearchBinding keActivityContentSearchBinding0 = (KeActivityContentSearchBinding)viewDataBinding0;
        this.binding = keActivityContentSearchBinding0;
        if(keActivityContentSearchBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            keActivityContentSearchBinding0 = null;
        }
        ContentSearchWebView contentSearchWebView0 = keActivityContentSearchBinding0.keContentSearchWebView;
        Intent intent0 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent0, "getIntent(...)");
        ContentSearchPhase contentSearchPhase0 = (ContentSearchPhase)IntentKt.getSerializableExtraCompat(intent0, "phase", ContentSearchPhase.class);
        if(contentSearchPhase0 == null) {
            contentSearchPhase0 = ContentSearchPhase.PRODUCTION;
        }
        contentSearchWebView0.setPhase(contentSearchPhase0);
        contentSearchWebView0.setOnLoadingListener(new Function1() {
            {
                ContentSearchActivity.this = contentSearchActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                KeActivityContentSearchBinding keActivityContentSearchBinding0 = ContentSearchActivity.this.binding;
                if(keActivityContentSearchBinding0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    keActivityContentSearchBinding0 = null;
                }
                Intrinsics.checkNotNullExpressionValue(keActivityContentSearchBinding0.keContentSearchWebViewLoadingView, "keContentSearchWebViewLoadingView");
                keActivityContentSearchBinding0.keContentSearchWebViewLoadingView.setVisibility((z ? 0 : 8));
            }
        });
        contentSearchWebView0.initOnActionListener(this.createOnActionListener());
        String s = this.getIntent().getStringExtra("serviceType");
        String s1 = "";
        if(s == null) {
            s = "";
        }
        Intrinsics.checkNotNull(s);
        String s2 = this.getIntent().getStringExtra("contentType");
        if(s2 != null) {
            s1 = s2;
        }
        Intrinsics.checkNotNull(s1);
        contentSearchWebView0.loadUrlWith(s, s1);
    }
}

