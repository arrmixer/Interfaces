package com.AE;

/**
 * Created by Angel on 12/11/16.
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber); //don't need public but can put it
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();


}
