package rc;

import android.webkit.DownloadListener;
import com.kakao.tistory.presentation.view.webview.CommonWebViewActivity;

public final class a implements DownloadListener {
    public final CommonWebViewActivity a;

    public a(CommonWebViewActivity commonWebViewActivity0) {
        this.a = commonWebViewActivity0;
    }

    @Override  // android.webkit.DownloadListener
    public final void onDownloadStart(String s, String s1, String s2, String s3, long v) {
        CommonWebViewActivity.a(this.a, s, s1, s2, s3, v);
    }
}

