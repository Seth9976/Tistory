package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kakao.keditor.delegate.JsonConverterKt;
import com.kakao.keditor.exception.MissingJsonConverterException;
import com.kakao.keditor.plugin.itemspec.grammarcheck.GrammarCheckResponse;
import com.squareup.moshi.Moshi.Builder;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001A\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0002J\b\u0010\b\u001A\u0004\u0018\u00010\tJ\b\u0010\n\u001A\u00020\u000BH\u0002J\b\u0010\f\u001A\u0004\u0018\u00010\rJ\u000E\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\tJ\u000E\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\rR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getEditor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "getGrammarCheckResult", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarCheckResponse;", "getPreference", "Landroid/content/SharedPreferences;", "getSavedCDMJson", "", "putGrammarCheckResult", "", "grammarCheckResponse", "putSavedCDMJson", "cdmJson", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGrammarCheckRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrammarCheckRepository.kt\ncom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository\n+ 2 JsonConverter.kt\ncom/kakao/keditor/delegate/JsonConverterKt\n*L\n1#1,25:1\n13#2,12:26\n26#2,14:38\n*S KotlinDebug\n*F\n+ 1 GrammarCheckRepository.kt\ncom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarCheckRepository\n*L\n18#1:26,12\n21#1:38,14\n*E\n"})
public final class GrammarCheckRepository {
    @NotNull
    private final Context context;

    public GrammarCheckRepository(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.context = context0;
    }

    private final SharedPreferences.Editor getEditor() {
        return this.getPreference().edit();
    }

    @Nullable
    public final GrammarCheckResponse getGrammarCheckResult() {
        GrammarCheckResponse grammarCheckResponse0 = null;
        String s = this.getPreference().getString("grammar_check_result", null);
        if(s != null) {
            Class class0 = JsonConverterKt.jsonConverterClass();
            boolean z = Intrinsics.areEqual(class0, Moshi.class);
            Class class1 = GrammarCheckResponse.class;
            if(z) {
                grammarCheckResponse0 = (GrammarCheckResponse)new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(class1).fromJson(s);
            }
            else {
                if(!Intrinsics.areEqual(class0, Gson.class)) {
                    throw new MissingJsonConverterException();
                }
                grammarCheckResponse0 = (GrammarCheckResponse)new GsonBuilder().create().fromJson(s, class1);
            }
        }
        this.getEditor().remove("grammar_check_result").apply();
        return grammarCheckResponse0;
    }

    private final SharedPreferences getPreference() {
        SharedPreferences sharedPreferences0 = this.context.getSharedPreferences("editor_cdm_data", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences0, "getSharedPreferences(...)");
        return sharedPreferences0;
    }

    @Nullable
    public final String getSavedCDMJson() {
        String s = this.getPreference().getString("cdm_json", null);
        this.getEditor().remove("cdm_json").apply();
        return s;
    }

    public final void putGrammarCheckResult(@NotNull GrammarCheckResponse grammarCheckResponse0) {
        String s;
        Intrinsics.checkNotNullParameter(grammarCheckResponse0, "grammarCheckResponse");
        SharedPreferences.Editor sharedPreferences$Editor0 = this.getEditor();
        Class class0 = JsonConverterKt.jsonConverterClass();
        if(Intrinsics.areEqual(class0, Gson.class)) {
            s = new GsonBuilder().create().toJson(grammarCheckResponse0);
            Intrinsics.checkNotNull(s);
        }
        else if(Intrinsics.areEqual(class0, Moshi.class)) {
            s = new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(GrammarCheckResponse.class).toJson(grammarCheckResponse0);
            Intrinsics.checkNotNull(s);
        }
        else {
            throw new MissingJsonConverterException();
        }
        sharedPreferences$Editor0.putString("grammar_check_result", s).apply();
    }

    public final void putSavedCDMJson(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "cdmJson");
        this.getEditor().putString("cdm_json", s).apply();
    }
}

