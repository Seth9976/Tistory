package com.kakao.kandinsky.launcher;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.kakao.kandinsky.KandinskyActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0002H\u0016J\u001A\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000E"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/kakao/kandinsky/launcher/KandinskyInput;", "Lcom/kakao/kandinsky/launcher/KandinskyOutput;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KandinskyContract extends ActivityResultContract {
    public static final int $stable;

    public Intent createIntent(Context context0, KandinskyInput kandinskyInput0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(kandinskyInput0, "input");
        Intent intent0 = new Intent(context0, KandinskyActivity.class);
        Json.Default.getSerializersModule();
        intent0.putExtra("INPUT", Json.Default.encodeToString(KandinskyInput.Companion.serializer(), kandinskyInput0));
        return intent0;
    }

    @Override  // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context0, Object object0) {
        return this.createIntent(context0, ((KandinskyInput)object0));
    }

    public KandinskyOutput parseResult(int v, Intent intent0) {
        if(v == -1) {
            try {
                if(intent0 != null) {
                    String s = intent0.getStringExtra("EDITED_ITEMS");
                    if(s != null) {
                        KandinskyOutput kandinskyOutput0 = (KandinskyOutput)Json.Default.decodeFromString(KandinskyOutput.Companion.serializer(), s);
                        return kandinskyOutput0 == null ? new KandinskyOutput(null, 1, null) : kandinskyOutput0;
                    }
                }
                return new KandinskyOutput(null, 1, null);
            }
            catch(Exception unused_ex) {
                return new KandinskyOutput(null, 1, null);
            }
        }
        return new KandinskyOutput(null, 1, null);
    }

    @Override  // androidx.activity.result.contract.ActivityResultContract
    public Object parseResult(int v, Intent intent0) {
        return this.parseResult(v, intent0);
    }
}

