package org.tensorflow.lite.examples.objectdetection.networking;

import com.google.gson.annotations.SerializedName;


public class ServerResponse {

    // variable name should be same as in the json response from php
    String msg;
    String result;
    String person;
    String score;
    String success;

}
