package com.kakao.tistory.presentation.view.comment.guestbook;

public abstract class Hilt_PinGuestbookActivity extends GuestbookActivity {
    public boolean n;

    public Hilt_PinGuestbookActivity() {
        this.n = false;
        this.addOnContextAvailableListener(new o(this));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.Hilt_GuestbookActivity
    public void inject() {
        if(!this.n) {
            this.n = true;
            ((PinGuestbookActivity_GeneratedInjector)this.generatedComponent()).injectPinGuestbookActivity(((PinGuestbookActivity)this));
        }
    }
}

