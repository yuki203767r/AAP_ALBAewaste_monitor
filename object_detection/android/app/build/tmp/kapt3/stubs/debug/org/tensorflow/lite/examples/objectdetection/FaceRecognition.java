package org.tensorflow.lite.examples.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0004J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\"\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0006\u0010\u000b\u001a\u00020\u0019J\u000e\u0010/\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u000e\u00100\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\b\u00101\u001a\u00020\u0019H\u0002J\b\u00102\u001a\u00020\u0019H\u0002J\b\u00103\u001a\u00020\u0019H\u0002J\b\u00104\u001a\u00020\u0019H\u0002J\"\u00105\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00106\u001a\u0002072\u0006\u0010!\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/FaceRecognition;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "countDownTimer", "Landroid/os/CountDownTimer;", "file_path", "", "getFile_path", "()Ljava/lang/String;", "setFile_path", "(Ljava/lang/String;)V", "pickImage", "Landroid/widget/Button;", "timeLeftMilliSeconds", "", "timerRunning", "", "getTimerRunning", "()Ljava/lang/Boolean;", "setTimerRunning", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "tv", "Landroid/widget/TextView;", "UploadFile", "", "captureImage", "displayMessage", "context", "Landroid/content/Context;", "message", "getPhotoFile", "Ljava/io/File;", "fileName", "initDialog", "notRegisteredUser", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "registeredUser", "skipTo", "startStop", "startTimer", "stopTimer", "updateTimer", "uritoFile", "uri", "Landroid/net/Uri;", "UploadTask", "app_debug"})
public final class FaceRecognition extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.Button pickImage;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String file_path;
    private android.os.CountDownTimer countDownTimer;
    private long timeLeftMilliSeconds = 6000L;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean timerRunning;
    private android.widget.TextView tv;
    private java.util.HashMap _$_findViewCache;
    
    public FaceRecognition() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFile_path() {
        return null;
    }
    
    public final void setFile_path(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getTimerRunning() {
        return null;
    }
    
    public final void setTimerRunning(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startStop() {
    }
    
    private final void stopTimer() {
    }
    
    private final void startTimer() {
    }
    
    private final void updateTimer() {
    }
    
    public final void pickImage() {
    }
    
    private final void captureImage() {
    }
    
    private final java.io.File getPhotoFile(java.lang.String fileName) {
        return null;
    }
    
    private final void displayMessage(android.content.Context context, java.lang.String message) {
    }
    
    protected final void initDialog() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void UploadFile() {
    }
    
    public final void skipTo(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void registeredUser(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void notRegisteredUser(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final java.io.File uritoFile(android.content.Context context, android.net.Uri uri, java.lang.String fileName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0019\u001a\u00020\u00022\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0004J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002H\u0014J\b\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020\u001eH\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\f\u00a8\u0006&"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/FaceRecognition$UploadTask;", "Landroid/os/AsyncTask;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "json", "getJson", "()Ljava/lang/String;", "setJson", "(Ljava/lang/String;)V", "objectjson", "Lorg/json/JSONObject;", "getObjectjson", "()Lorg/json/JSONObject;", "setObjectjson", "(Lorg/json/JSONObject;)V", "person", "getPerson", "setPerson", "score", "getScore", "setScore", "doInBackground", "strings", "", "([Ljava/lang/String;)Ljava/lang/String;", "hidepDialog", "", "onPostExecute", "s", "onPreExecute", "showpDialog", "uploadFile", "", "path", "app_debug"})
    public static final class UploadTask extends android.os.AsyncTask<java.lang.String, java.lang.String, java.lang.String> {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String json = "";
        @org.jetbrains.annotations.NotNull()
        private java.lang.String person = "";
        @org.jetbrains.annotations.NotNull()
        private java.lang.String score = "";
        public org.json.JSONObject objectjson;
        
        public UploadTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getJson() {
            return null;
        }
        
        public final void setJson(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPerson() {
            return null;
        }
        
        public final void setPerson(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getScore() {
            return null;
        }
        
        public final void setScore(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.json.JSONObject getObjectjson() {
            return null;
        }
        
        public final void setObjectjson(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject p0) {
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... strings) {
            return null;
        }
        
        protected final void showpDialog() {
        }
        
        protected final void hidepDialog() {
        }
        
        private final boolean uploadFile(java.lang.String path) {
            return false;
        }
    }
}