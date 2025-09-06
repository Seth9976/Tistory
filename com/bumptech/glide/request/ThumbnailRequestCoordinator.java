package com.bumptech.glide.request;

import androidx.annotation.Nullable;

public class ThumbnailRequestCoordinator implements Request, RequestCoordinator {
    public final RequestCoordinator a;
    public final Object b;
    public volatile Request c;
    public volatile Request d;
    public RequestState e;
    public RequestState f;
    public boolean g;

    public ThumbnailRequestCoordinator(Object object0, @Nullable RequestCoordinator requestCoordinator0) {
        this.e = RequestState.CLEARED;
        this.f = RequestState.CLEARED;
        this.b = object0;
        this.a = requestCoordinator0;
    }

    @Override  // com.bumptech.glide.request.Request
    public void begin() {
        synchronized(this.b) {
            this.g = true;
            try {
                if(this.e != RequestState.SUCCESS) {
                    RequestState requestCoordinator$RequestState0 = RequestState.RUNNING;
                    if(this.f != requestCoordinator$RequestState0) {
                        this.f = requestCoordinator$RequestState0;
                        this.d.begin();
                    }
                }
                if(this.g) {
                    RequestState requestCoordinator$RequestState1 = RequestState.RUNNING;
                    if(this.e != requestCoordinator$RequestState1) {
                        this.e = requestCoordinator$RequestState1;
                        this.c.begin();
                    }
                }
            }
            finally {
                this.g = false;
            }
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request0) {
        boolean z = true;
        synchronized(this.b) {
            if(this.a != null && !this.a.canNotifyCleared(this) || !request0.equals(this.c) || this.e == RequestState.PAUSED) {
                z = false;
            }
            return z;
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(Request request0) {
        boolean z = true;
        synchronized(this.b) {
            if(this.a != null && !this.a.canNotifyStatusChanged(this) || !request0.equals(this.c) || this.isAnyResourceSet()) {
                z = false;
            }
            return z;
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(Request request0) {
        boolean z = true;
        synchronized(this.b) {
            if(this.a != null && !this.a.canSetImage(this) || !request0.equals(this.c) && this.e == RequestState.SUCCESS) {
                z = false;
            }
            return z;
        }
    }

    @Override  // com.bumptech.glide.request.Request
    public void clear() {
        synchronized(this.b) {
            this.g = false;
            this.e = RequestState.CLEARED;
            this.f = RequestState.CLEARED;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        synchronized(this.b) {
            RequestCoordinator requestCoordinator0 = this.a;
            return requestCoordinator0 == null ? this : requestCoordinator0.getRoot();
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        synchronized(this.b) {
            return this.d.isAnyResourceSet() || this.c.isAnyResourceSet();
        }
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isCleared() {
        synchronized(this.b) {
        }
        return this.e == RequestState.CLEARED;
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isComplete() {
        synchronized(this.b) {
        }
        return this.e == RequestState.SUCCESS;
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request0) {
        if(request0 instanceof ThumbnailRequestCoordinator) {
            if(this.c == null) {
                if(((ThumbnailRequestCoordinator)request0).c == null) {
                    return this.d == null ? ((ThumbnailRequestCoordinator)request0).d == null : this.d.isEquivalentTo(((ThumbnailRequestCoordinator)request0).d);
                }
            }
            else if(this.c.isEquivalentTo(((ThumbnailRequestCoordinator)request0).c)) {
                return this.d == null ? ((ThumbnailRequestCoordinator)request0).d == null : this.d.isEquivalentTo(((ThumbnailRequestCoordinator)request0).d);
            }
        }
        return false;
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isRunning() {
        synchronized(this.b) {
        }
        return this.e == RequestState.RUNNING;
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request0) {
        synchronized(this.b) {
            if(!request0.equals(this.c)) {
                this.f = RequestState.FAILED;
                return;
            }
            this.e = RequestState.FAILED;
            RequestCoordinator requestCoordinator0 = this.a;
            if(requestCoordinator0 != null) {
                requestCoordinator0.onRequestFailed(this);
            }
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(Request request0) {
        synchronized(this.b) {
            if(request0.equals(this.d)) {
                this.f = RequestState.SUCCESS;
                return;
            }
            this.e = RequestState.SUCCESS;
            RequestCoordinator requestCoordinator0 = this.a;
            if(requestCoordinator0 != null) {
                requestCoordinator0.onRequestSuccess(this);
            }
            if(!this.f.a) {
                this.d.clear();
            }
        }
    }

    @Override  // com.bumptech.glide.request.Request
    public void pause() {
        synchronized(this.b) {
            if(!this.f.a) {
                this.f = RequestState.PAUSED;
                this.d.pause();
            }
            if(!this.e.a) {
                this.e = RequestState.PAUSED;
                this.c.pause();
            }
        }
    }

    public void setRequests(Request request0, Request request1) {
        this.c = request0;
        this.d = request1;
    }
}

