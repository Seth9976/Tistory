package com.kakao.keditor.base;

import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fH\u0014R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0094\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/base/KeditorBaseAppCompatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "setOnBackPressedCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class KeditorBaseAppCompatActivity extends AppCompatActivity {
    @Nullable
    private OnBackPressedCallback onBackPressedCallback;

    @Nullable
    public OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        OnBackPressedCallback onBackPressedCallback0 = this.getOnBackPressedCallback();
        if(onBackPressedCallback0 != null) {
            this.getOnBackPressedDispatcher().addCallback(this, onBackPressedCallback0);
        }
    }

    public void setOnBackPressedCallback(@Nullable OnBackPressedCallback onBackPressedCallback0) {
        this.onBackPressedCallback = onBackPressedCallback0;
    }
}

