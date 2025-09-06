package com.kakao.keditor;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.media.GlideSimpleImageLoader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001A\u00020\u0012J\u0014\u0010\u0003\u001A\u00020\u00122\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00040\fJ\u0014\u0010\u0005\u001A\u00020\u00002\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00060\fJ\u0006\u0010\u0014\u001A\u00020\u0012J\u000E\u0010\u0015\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001A\u00020\nH\u0002J\u0014\u0010\u0007\u001A\u00020\u00122\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\b0\fJ\u001E\u0010\u0018\u001A\u00020\u00122\u0016\u0010\u0013\u001A\u0012\u0012\u000E\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000E0\r0\fJ\u001A\u0010\u0019\u001A\u00020\u00122\u0012\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fR\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\nX\u0082\u000E¢\u0006\u0002\n\u0000R\u001E\u0010\u000B\u001A\u0012\u0012\u000E\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000E0\r0\fX\u0082.¢\u0006\u0002\n\u0000R\u001A\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/KeditorBuilder;", "", "()V", "config", "", "context", "Landroid/content/Context;", "imageLoader", "Lcom/kakao/keditor/delegate/ImageLoader;", "isDebugMode", "", "itemSpecListFunction", "Lkotlin/Function0;", "", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "pluginSpecListFunction", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "build", "", "block", "debugMode", "glideClass", "Ljava/lang/Class;", "hasGlide", "itemSpecList", "pluginSpecs", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorBuilder {
    @NotNull
    private String config;
    private Context context;
    @Nullable
    private ImageLoader imageLoader;
    private boolean isDebugMode;
    private Function0 itemSpecListFunction;
    private Function0 pluginSpecListFunction;

    public KeditorBuilder() {
        this.config = "keditor/ke_config_internal.json";
    }

    public final void build() {
        Function0 function03;
        Function0 function01;
        Context context1;
        Keditor keditor0 = Keditor.INSTANCE;
        Context context0 = this.context;
        if(context0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context1 = null;
        }
        else {
            context1 = context0;
        }
        String s = this.config;
        ImageLoader imageLoader0 = this.imageLoader;
        Function0 function00 = this.itemSpecListFunction;
        if(function00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemSpecListFunction");
            function01 = null;
        }
        else {
            function01 = function00;
        }
        Function0 function02 = this.pluginSpecListFunction;
        if(function02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginSpecListFunction");
            function03 = null;
        }
        else {
            function03 = function02;
        }
        keditor0.initialize$keditor_release(context1, s, imageLoader0, function01, function03);
        if(this.imageLoader == null) {
            keditor0.setImageLoader(GlideSimpleImageLoader.INSTANCE);
        }
        keditor0.setDebugMode$keditor_release(this.isDebugMode);
    }

    public final void config(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.config = (String)function00.invoke();
    }

    @NotNull
    public final KeditorBuilder context(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.context = (Context)function00.invoke();
        return this;
    }

    public final void debugMode() {
        this.isDebugMode = true;
    }

    private final Class glideClass() {
        return Glide.class;
    }

    private final boolean hasGlide() [...] // 潜在的解密器

    public final void imageLoader(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.imageLoader = (ImageLoader)function00.invoke();
    }

    public final void itemSpecList(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.itemSpecListFunction = function00;
    }

    public final void pluginSpecs(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.pluginSpecListFunction = function00;
    }
}

