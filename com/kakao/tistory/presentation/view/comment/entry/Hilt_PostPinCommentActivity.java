package com.kakao.tistory.presentation.view.comment.entry;

public abstract class Hilt_PostPinCommentActivity extends PostCommentActivity {
    public boolean n;

    public Hilt_PostPinCommentActivity() {
        this.n = false;
        this.addOnContextAvailableListener(new b(this));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.Hilt_PostCommentActivity
    public void inject() {
        if(!this.n) {
            this.n = true;
            ((PostPinCommentActivity_GeneratedInjector)this.generatedComponent()).injectPostPinCommentActivity(((PostPinCommentActivity)this));
        }
    }
}

