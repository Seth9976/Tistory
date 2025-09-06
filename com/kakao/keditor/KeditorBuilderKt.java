package com.kakao.keditor;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"keditor", "", "Landroidx/appcompat/app/AppCompatActivity;", "init", "Lkotlin/Function1;", "Lcom/kakao/keditor/KeditorBuilder;", "Lkotlin/ExtensionFunctionType;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorBuilderKt {
    public static final void keditor(@NotNull AppCompatActivity appCompatActivity0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(appCompatActivity0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "init");
        KeditorBuilder keditorBuilder0 = new KeditorBuilder();
        function10.invoke(keditorBuilder0);
        keditorBuilder0.context(new Function0(appCompatActivity0) {
            final AppCompatActivity $this_keditor;

            {
                this.$this_keditor = appCompatActivity0;
                super(0);
            }

            @NotNull
            public final Context invoke() {
                return this.$this_keditor;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }).build();
    }
}

